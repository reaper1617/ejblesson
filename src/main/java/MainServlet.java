import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/test")
public class MainServlet extends HttpServlet {

    @EJB
    private MyEJBean ejBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in doGet");
        req.getSession().setAttribute("msg", ejBean.getMessage());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
