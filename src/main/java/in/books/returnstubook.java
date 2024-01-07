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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class returnstubook
 */
public class returnstubook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public returnstubook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Assuming you have set the studentId attribute in the session when the user logs in
        String studentId = (String) request.getSession().getAttribute("studentID");

        // Assuming you have a database connection, replace the following with your actual database details
        String jdbcURL = "jdbc:mysql://localhost:3306/LMS2";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Query to retrieve books taken by the student
            String query = "SELECT * FROM booklist WHERE sid=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, studentId);

            ResultSet resultSet = preparedStatement.executeQuery();

            // Display the books in a table format
            out.println("<html>\n"
            		+ "<head>\n"
            		+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
            		+ "<title>Library Management System</title>\n"
            		+ "<link href=\"stylesheet.css\" rel=\"stylesheet\" type=\"text/css\" />\n"
            		+ "<style>\n"
            		+ "body{\n"
            		+ "background-image:url(\"images/xy.jpeg\");\n"
            		+ "background-size:cover;\n"
            		+ "}\n"
            		+ ".clg{\n"
            		+ "padding-top:10px;\n"
            		+ "font-size:0.5cm;\n"
            		+ "}\n"
            		+ ".head{\n"
            		+ "padding-left:500px;\n"
            		+ "font-size:1.5cm;\n"
            		+ "opacity:1;\n"
            		+ "}\n"
            		+ "#banner{\n"
            		+ "background-color:blue;\n"
            		+ "opacity:0.6;\n"
            		+ "}\n"
            		+ "#wrapper\n"
            		+ "{\n"
            		+ "background-color:gray;\n"
            		+ "border-style:solid;\n"
            		+ "border-color:blue;\n"
            		+ "border-width:5px;\n"
            		+ "opacity:;\n"
            		+ "}\n"
            		+ ".fields{\n"
            		+ "background-color:white;\n"
            		+ "width:300px;\n"
            		+ "height:50px;\n"
            		+ "border-radius:25px;\n"
            		+ "margin:40px;\n"
            		+ "padding:0px 50px;\n"
            		+ "font-weight:bold;\n"
            		+ "color:black;\n"
            		+ "font-size:0.5cm;\n"
            		+ "\n"
            		+ "}\n"
            		+ ".but{\n"
            		+ "width:300px;\n"
            		+ "height:50px;\n"
            		+ "border-radius:25px;\n"
            		+ "background-color:skyblue;\n"
            		+ "border:black;\n"
            		+ "font-size:0.5cm;\n"
            		+ "}\n"
            		+ ".SubHead{\n"
            		+ "font-size:1cm;\n"
            		+ "font-weight:bold;\n"
            		+ "color:#FFF;\n"
            		+ "}\n"
            		+ ".link{\n"
            		+ "font-size:1cm;\n"
            		+ "text-decoration:none;\n"
            		+ "color:#FFF;\n"
            		+ "}\n"
            		+ ".nm{\n"
            		+ "font-size:0.6cm;\n"
            		+ "font-weight:bold;\n"
            		+ "}\n"
            		+ ".table\n"
            		+ "{\n"
            		+ "	border-radius:5px;\n"
            		+ "	padding:0px 5px;\n"
            		+ "	border:1px solid #FF3;\n"
            		+ "	background-color:transparent;\n"
            		+ "	width:900px;\n"
            		+ "	color:#FF3;\n"
            		+ "}\n"
            		+ ".labels1{\n"
            		+ "	padding:0px 5px;\n"
            		+ "color:#FFF;\n"
            		+ "}\n"
            		+ "</style>\n"
            		+ "</head>\n"
            		+ "\n"
            		+ "<body>");
            out.println("<div id=\"banner\">\n"
            		+ "<span class=\"head\">Library Management System</span><br />\n"
            		+ "<marquee class=\"clg\" direction=\"right\" behavior=\"alternate\" scrollamount=\"1\">LAZY CODERS</marquee>\n"
            		+ "</div>\n"
            		+ "<br />\n"
            		+ "\n"
            		+ "<div align=\"center\">\n"
            		+ "<div id=\"wrapper\">\n"
            		+ "<br />\n"
            		+ "<br />\n"
            		+ "\n"
            		+ "<span class=\"SubHead\">MY BOOKS</span>\n"
            		+ "<br />\n"
            		+ "<br />\n"
            		+ "\n"
            		+ "<table border=\"0\" class=\"table\" cellpadding=\"10\" cellspacing=\"10\">\n"
            		+ "<tr class=\"labels\" style=\"text-decoration:underline;\"><th>Book Name</th><th>Author</th><th>Issued By<br>Student ID</th><th></th></tr>\n"
            		+ "");
            //out.println("<tr><th>Book Name</th><th>Author</th><th>Issued By<br>Student ID</th></tr>");

            while (resultSet.next()) {
                String bookName = resultSet.getString("bookname");
                String authorName = resultSet.getString("authorname");
                String issuedByStudentId = resultSet.getString("sid");

                out.println("<tr class=\"labels1\" style=\"font-size:14px;\"><td>" + bookName + "</td><td>" + authorName + "</td><td>" + issuedByStudentId + "</td></tr>");
            }

            out.println("</table><br />\n"
            		+ "<br />");
            out.println("<br><br><a href='Home.jsp' class=\"link\" >Go Back</a>");
            out.println("<br />\n"
            		+ "<br />\n"
            		+ "\n"
            		+ "</div>\n"
            		+ "</div></body></html>");

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error: " + e.getMessage());
        }
	}

}
