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
 * Servlet implementation class issuebooks12
 */
public class issuebooks12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public issuebooks12() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><head>\n"
        		+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
        		+ "<title>Library Management System</title>\n"
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
        		+ "color:#FFF;\n"
        		+ "}\n"
        		+ "#banner{\n"
        		+ "background-color:blue;\n"
        		+ "opacity:0.6;\n"
        		+ "width:99.5%;\n"
        		+ "height:100px;\n"
        		+ "border:2px solid #FFF;\n"
        		+ "}\n"
        		+ "#wrapper\n"
        		+ "{\n"
        		+ "width:80%;\n"
        		+ "background-color:gray;\n"
        		+ "border-style:solid;\n"
        		+ "border-color:blue;\n"
        		+ "border-width:5px;\n"
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
        		+ "border:1px solid #FF3;\n"
        		+ "}\n"
        		+ ".but{\n"
        		+ "width:300px;\n"
        		+ "height:50px;\n"
        		+ "border-radius:25px;\n"
        		+ "background-color:skyblue;\n"
        		+ "border:black;\n"
        		+ "font-size:0.5cm;\n"
        		+ "margin-left:50px;\n"
        		+ "}\n"
        		+ ".SubHead{\n"
        		+ "font-size:1cm;\n"
        		+ "font-weight:bold;\n"
        		+ "color:#FFF;\n"
        		+ "}\n"
        		+ ".nm{\n"
        		+ "font-size:0.6cm;\n"
        		+ "font-weight:bold;\n"
        		+ "margin:10px;\n"
        		+ "}\n"
        		+ ".link{\n"
        		+ " color:#FFF;\n"
        		+ " text-decoration:none;\n"
        		+ " }\n"
        		+ "</style>\n"
        		+ "</head><body>\n"
        		+ "<div id=\"banner\">\n"
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
        		+ "<span class=\"SubHead\">Ask for Books</span>\n"
        		+ "<br />\n"
        		+ "<br />\n"
        		+ "<form method=\"post\" action=\"issueBook.php\">\n"
        		+ "<br><br>\n"
        		+ "<span class=\"nm\">Book : </span><select name=\"name\" class=\"fields\" required >\n"
        		+ "<option value=\"\" disabled=\"disabled\" selected=\"selected\"> - - Select Book - - </option>");
        try 
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS2", "root", "root");  
            // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from books"); 
            //out.println();
            //out.println("<table border=\"1\" class=\"table\" cellpadding=\"5px>");  
            //out.println("<tr style=\"background-color:skyblue\"><th>S.No</th><th>Book Name</th><th>Author</th></tr><br>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("id");  
                String nm = rs.getString("name");  
                String s = rs.getString("author");   
                //out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
                out.println("<option value="+nm+"</option>");
                //out.println("<option value=\"<%= rs.getInt() %>\"><%= book.getName() + \" \" + book.getAuthor() %></option>");
            }  
            out.println("</select></td></tr>\n"
            		+ "<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"SUBMIT\" class=\"but\" /></td></tr>\n"
            		+ "</table>\n"
            		+ "</form>\n"
            		+ "<br />\n"
            		+ "<br />\n"
            		+ "<a href=\"Home.jsp\" class=\"link\">Go Back</a>\n"
            		+ "<br />\n"
            		+ "<br />\n"
            		+ "\n"
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
