package in.books;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class displaybooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displaybooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * response.setContentType("text/html;charset=UTF-8");
		 * 
		 * try { // JDBC database connection parameters String url =
		 * "jdbc:mysql://localhost:3306/LMS2"; String username = "root"; String password
		 * = "root";
		 * 
		 * // Load JDBC driver Class.forName("com.mysql.cj.jdbc.Driver");
		 * 
		 * // Establish a connection try (Connection connection =
		 * DriverManager.getConnection(url, username, password)) { // SQL query to
		 * select all books from the books table String sql = "SELECT * FROM books";
		 * 
		 * try (PreparedStatement preparedStatement = connection.prepareStatement(sql))
		 * { // Execute the query ResultSet resultSet =
		 * preparedStatement.executeQuery();
		 * 
		 * // Create a list to store books List<Book> bookList = new ArrayList<>();
		 * 
		 * // Process the result set and populate the book list while (resultSet.next())
		 * { int id = resultSet.getInt("id"); String name = resultSet.getString("name");
		 * String author = resultSet.getString("author");
		 * 
		 * // Create a Book object and add it to the list Book book = new Book(id, name,
		 * author); bookList.add(book); }
		 * 
		 * // Set the book list in the request attribute
		 * request.setAttribute("bookList", bookList);
		 * 
		 * // Forward the request to the JSP page
		 * request.getRequestDispatcher("display.jsp").forward(request, response); } } }
		 * catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); //
		 * Handle database connection errors response.getWriter().
		 * println("Error connecting to the database. Please try again later."); }
		 */
		BookDAO bookDAO = new BookDAO();
        List<Book> bookList = bookDAO.getAllBooks();

        // Set the bookList attribute in the request
        request.setAttribute("bookList", bookList);

        // Forward the request to the JSP page
        request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
