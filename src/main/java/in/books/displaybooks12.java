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
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class displaybooks12
 */
public class displaybooks12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displaybooks12() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><head>\n"
        		+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
        		+ "<title>Library Management System</title><style>\n"
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
        		+ "width:80%;\n"
        		+ "background-color:gray;\n"
        		+ "border-style:solid;\n"
        		+ "border-color:blue;\n"
        		+ "border-width:5px;\n"
        		+ "border-radius:10px;\n"
        		+ "opacity:;\n"
        		+ "}\n"
        		+ ".fields{\n"
        		+ "background-color:white;\n"
        		+ "width:300px;\n"
        		+ "height:30px;\n"
        		+ "border-radius:25px;\n"
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
        		+ "}\n"
        		+ ".link{\n"
        		+ "font-size:1cm;\n"
        		+ "}\n"
        		+ ".nm{\n"
        		+ "font-size:0.6cm;\n"
        		+ "font-weight:bold;\n"
        		+ "margin:10px;\n"
        		+ "}\n"
        		+ ".table\n"
        		+ "{\n"
        		+ "	border-radius:5px;\n"
        		+ "	padding:0px 5px;\n"
        		+ "	border:1px solid #FF3;\n"
        		+ "	background-color:transparent;\n"
        		+ "	width:70%;\n"
        		+ "	\n"
        		+ "}\n"
        		+ ".Command{\n"
        		+ "font-family:\"Trebuchet MS\";\n"
        		+ "	font-size:16px;\n"
        		+ "	color:#FF3;\n"
        		+ "}\n"
        		+ "a.link:link{font-family:\"Segoe UI\";font-size:16px;color:#FFF;text-decoration:none;}\n"
        		+ "a.link:active{font-family:\"Segoe UI\";font-size:16px;color:#FFF;text-decoration:none;}\n"
        		+ "a.link:visited{font-family:\"Segoe UI\";font-size:16px;color:#FFF;text-decoration:none;}\n"
        		+ "a.link:hover{font-family:\"Segoe UI\";font-size:16px;color:#F6F;text-decoration:none;}\n"
        		+ "\n"
        		+ "a.Command:link{text-decoration:none;font-family:\"Segoe UI\";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:5px;}\n"
        		+ "a.Command:active{text-decoration:none;font-family:\"Segoe UI\";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:5px;}\n"
        		+ "a.Command:visited{text-decoration:none;font-family:\"Segoe UI\";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:0px;}\n"
        		+ "a.Command:hover{text-decoration:none;font-family:\"Segoe UI\";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #F60;border-radius:5px;box-shadow:0px 0px 10px #FFFFFF;}\n"
        		+ "</style>\n"
        		+ "</head><body><div id=\"banner\">\n"
        		+ "<span class=\"head\" style=\"color:white\">Library Management System</span><br />\n"
        		+ "</div>\n"
        		+ "<br />\n"
        		+ "\n"
        		+ "<div align=\"center\">\n"
        		+ "<div id=\"wrapper\">\n"
        		+ "<br />\n"
        		+ "<br />\n"
        		+ "\n"
        		+ "<span class=\"SubHead\">Welcome </span>");  
        try 
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS2", "root", "root");  
            // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from books"); 
            out.println();
            out.println("<table border=\"1\" class=\"table\" cellpadding=\"5px>");  
            out.println("<tr style=\"background-color:skyblue\"><th>S.No</th><th>Book Name</th><th>Author</th></tr><br>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("id");  
                String nm = rs.getString("name");  
                String s = rs.getString("author");   
                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
            }  
            out.println("</table><br />\n"
            		+ "<br />\n"
            		+ "<a href=\"Home.jsp\" class=\"link\">Go Back</a>\n"
            		+ "<br />\n"
            		+ "<br />\n"
            		+ "</div>\n"
            		+ "</div>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
	}

}
