package in.books;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class requestbook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public requestbook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Get form parameters
            String bookName = request.getParameter("name");
            String authorName = request.getParameter("author");

            // Assume you have a logged-in student ID stored in the session
            // For demonstration purposes, let's call it "studentId"
            int studentId = 123; // Replace with your actual logic to get the student ID

            // JDBC database connection parameters
            String url = "jdbc:mysql://localhost:3306/LMS2";
            String username = "root";
            String password = "root";

            try {
                // Load JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // SQL query to insert data into the request table
                    String sql = "INSERT INTO request (id, name, author, sid) VALUES (NULL, ?, ?, ?)";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                        preparedStatement.setString(1, bookName);
                        preparedStatement.setString(2, authorName);
                        preparedStatement.setInt(3, studentId);

                        // Execute the query
                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                        	out.println("<script type=\"text/javascript\">");
                            out.println("alert('Submitted Succesfully');");
                            out.println("window.location.href='request.jsp';"); // Redirect to another page if needed
                            out.println("</script>");
                        } else {
                        	out.println("<script type=\"text/javascript\">");
                            out.println("alert('Not Submitted Succesfully');");
                            out.println("window.location.href='request.jsp';"); 
                            out.println("</script>");
                        }
                    }
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                out.println("<p>Error connecting to the database. Please try again later.</p>");
            }
        }
	}

}
