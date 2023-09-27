package by.itacademy.jd2.firstApp.homework1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/home_work_task1req")
public class HomeWorkTask1 extends HttpServlet {

    private static Base base = Base.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        Map<String, String[]> stringStringMap = request.getParameterMap();

        if (base.addToBase(stringStringMap)) {
            response.sendRedirect("/firstApp/home_work_task1resp");
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Нужно ввести три и более жанра");
        }

    }
}
