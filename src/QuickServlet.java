import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuickServlet extends HttpServlet {

    /**
     * this life-cycle method is invoked when this servlet is first accessed
     * by the client
     */
    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }

    /**
     * handles HTTP POST request
     */

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter writer = response.getWriter();
        String choice = request.getParameter("choice");
        writer.println("<html><link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"><h2>Hello!!!</h2><br>");
        switch (choice){
            case "1":
                writer.println("<h3>You Selected Choice 1</h3>");
                break;
            case "2":
                writer.println("<h3>You Selected Choice 2</h3>");
                break;
            case "3":
                writer.println("<h3>You Selected Choice 3</h3>");
                break;
            case "4":
                String html_str = anotherFunction();
                writer.println(html_str);
        }
        writer.println("<br><br><a href='index.jsp'><button class='btn btn-primary'>Back Home</button></a>");
        writer.flush();
        anotherFunction();
    }

    public String anotherFunction() {

        return "<br><br><h3>Entered anotherFunction()<h3>";
    }


    /**
     * this life-cycle method is invoked when the application or the server
     * is shutting down
     */
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}