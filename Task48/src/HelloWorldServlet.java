import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        ResourceBundle rb = ResourceBundle.getBundle("localStrings");

        String firstName = rb.getString("firstname");
        String lastName = rb.getString("lastname");
        String middleName = rb.getString("middlename");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<p>" + lastName + " " + firstName + " " + middleName + "</p>");
        out.println("<p>" + sdf.format(new Date().getTime()) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
