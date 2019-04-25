

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
"    <head>\n" +
"        <title>Login</title>\n" +
"        <style>  table,tr,td{\n" +
"                border: 1px solid;\n" +
"                border-collapse: collapse;\n" +
"            }</style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div><center><font color=\"blue\" size=\"5\">Login Page</font></center></div>\n" +
"        <form action=\"LoginDetails\" method=\"post\">\n" +
"            <table>\n" +
"                <tr><td>USERNAME</td><td><input type=\"text\" name=\"USERNAME\" maxlength=\"8\" size=\"15\"></td></tr>\n" +
"                <tr><td>PASSWORD</td><td><input type=\"PASSWORD\" name=\"PASSWORD\" maxlength=\"8\" size=\"15\"></td></tr>\n" +
"                        <tr><td colspan=\"2\" align=\"center\">\n" +
"                                <input type=\"submit\" value=\"Submit\">\n" +
"                    </td></tr>\n" +
"            </table>\n" +
"        </form>\n" +
"    </body>\n" +
"</html>\n" +

"");
        
    }

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String u = request.getParameter("USERNAME");
        String p = request.getParameter("PASSWORD");
        
        int id =0;
        Login obj = new Login();
        id = obj.getID(u, p);
        
        if(id>0)
        {
            out.println("html><body>"
              +"Registration successful = "+id
            +"</body></html>");
            //response.sendRedirect("Menu");
        }
         else
        {
            out.println("html><body>"
              +"Unsuccessful = "+id
            +"</body></html>");
        }
    }

    private int getID(String u, String p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
