package in.log;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Retrieve admin credentials from the form
        String adminID = request.getParameter("aid");
        String password = request.getParameter("pass");

        // Assuming you have a database connection, replace the following with your actual database details
        String jdbcURL = "jdbc:mysql://localhost:3306/LMS2";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Query to check if the entered admin ID and password exist in the database
            String query = "SELECT * FROM admin WHERE aid=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, adminID);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Admin ID and password are correct, perform login action
            	HttpSession session = request.getSession(true);
                session.setAttribute("adminID", adminID);
            	response.sendRedirect("adminhome.jsp");
                // You can redirect to another page or set session attributes as needed
            } else {
                // Incorrect details, show an error message
            	out.println("<script type=\"text/javascript\">");
                out.println("alert('Admin Id and Password didnt match. Please try again.');");
                out.println("window.location.href='admin.jsp';"); // Redirect to another page if needed
                out.println("</script>");
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
	}

}
