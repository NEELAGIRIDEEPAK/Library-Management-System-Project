package in.reg;

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


public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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

        // Retrieve student details from the form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String sem = request.getParameter("sem");
        String branch = request.getParameter("branch");
        String userType = request.getParameter("User Type");
        String studentID = request.getParameter("sid");
        String password = request.getParameter("pass");

        // Assuming you have a database connection, replace the following with your actual database details
        String jdbcURL = "jdbc:mysql://localhost:3306/LMS2";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Insert student details into the database
            String query = "INSERT INTO students (name, email, sem, branch, user_type, student_id, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, sem);
            preparedStatement.setString(4, branch);
            preparedStatement.setString(5, userType);
            preparedStatement.setString(6, studentID);
            preparedStatement.setString(7, password);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // Registration successful
            	
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Registration successful');");
                out.println("window.location.href='index.jsp';"); // Redirect to another page if needed
                out.println("</script>");
            } else {
                // Registration failed
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Registration failed. Please try again.');");
                out.println("window.location.href='register.jsp';"); // Redirect to another page if needed
                out.println("</script>");
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
	}

}
