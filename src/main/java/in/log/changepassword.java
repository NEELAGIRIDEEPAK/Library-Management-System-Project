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

/**
 * Servlet implementation class changepassword
 */
public class changepassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public changepassword() {
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

        // Retrieve inputs from the form
        String oldPassword = request.getParameter("old");
        String newPassword = request.getParameter("p1");
        String retypePassword = request.getParameter("p2");

        // Get the student ID from the session
        HttpSession session = request.getSession();
        String studentID = (String) session.getAttribute("studentID");

        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/LMS2";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish database connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Check if the current password is correct
            String checkPasswordQuery = "SELECT * FROM students WHERE student_id=? AND password=?";
            try (PreparedStatement checkPasswordStmt = connection.prepareStatement(checkPasswordQuery)) {
                checkPasswordStmt.setString(1, studentID);
                checkPasswordStmt.setString(2, oldPassword);
                ResultSet resultSet = checkPasswordStmt.executeQuery();

                if (resultSet.next()) {
                    // Current password is correct, now check and update the new password
                    if (newPassword.equals(retypePassword)) {
                        String updatePasswordQuery = "UPDATE students SET password=? WHERE student_id=?";
                        try (PreparedStatement updatePasswordStmt = connection.prepareStatement(updatePasswordQuery)) {
                            updatePasswordStmt.setString(1, newPassword);
                            updatePasswordStmt.setString(2, studentID);
                            int rowsAffected = updatePasswordStmt.executeUpdate();

                            if (rowsAffected > 0) {
                                // Password updated successfully
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Password changed successfully');");
                                out.println("window.location.href='Home.jsp';");
                                out.println("</script>");
                            } else {
                                // Failed to update password
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Failed to change password. Please try again.');");
                                out.println("window.location.href='changePassword.jsp';");
                                out.println("</script>");
                            }
                        }
                    } else {
                        // New password and retype password do not match
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('New password and retype password do not match. Please try again.');");
                        out.println("window.location.href='changePassword.jsp';");
                        out.println("</script>");
                    }
                } else {
                    // Incorrect current password
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Incorrect current password. Please try again.');");
                    out.println("window.location.href='changePassword.jsp';");
                    out.println("</script>");
                }
            }

            // Close the database connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error: " + e.getMessage());
        }
	}

}
