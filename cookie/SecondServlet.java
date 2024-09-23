import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  

    public void doGet(HttpServletRequest request, HttpServletResponse response) {  
      try {  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
  
        Cookie ck[] = request.getCookies();
        if (ck != null) {
          for (Cookie cookie : ck) {
            out.print("Cookie: " + cookie.getName() + " = " + cookie.getValue() + "<br>");
          }
        } else {
          out.print("No cookies found.");
        }
  
        out.close();  
  
      } catch (Exception e) {
        System.out.println(e);
      }  
    }  
  }
  