import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Bonjour extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bonjour Radwan Afiouni</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bonjour Radwan Afiouni</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}