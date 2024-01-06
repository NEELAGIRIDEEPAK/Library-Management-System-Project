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

public class studentlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public studentlogin() {
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

        String studentID = request.getParameter("sid");
        String password = request.getParameter("pass");

        // Assuming you have a database connection, replace the following with your actual database details
        String jdbcURL = "jdbc:mysql://localhost:3306/LMS2";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Query to check if the entered student ID and password exist in the database
            String query = "SELECT * FROM students WHERE student_id=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, studentID);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Student ID and password are correct, perform login action
            	HttpSession session = request.getSession(true);
                session.setAttribute("studentID", studentID);
            	response.sendRedirect("Home.jsp");
                // You can redirect to another page or set session attributes as needed
            } else {
                // Incorrect details, show an error message
            	out.println("<script type=\"text/javascript\">");
                out.println("alert('Id and Password didnt match. Please try again.');");
                out.println("window.location.href='index.jsp';"); // Redirect to another page if needed
                out.println("</script>");
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
	}

}
