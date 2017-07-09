package devcastzone.javaee.serwlety;

import devcastzone.javaee.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = new User();
        user.setId(1);
        user.setImie("Paweł");
        user.setNazwisko("Polak");
        String imie = "pawel";
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
    }
}
