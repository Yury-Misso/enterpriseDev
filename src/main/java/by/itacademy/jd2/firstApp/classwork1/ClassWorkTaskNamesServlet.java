package by.itacademy.jd2.firstApp.classwork1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/class_work_task_names")
public class ClassWorkTaskNamesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        Enumeration<String> parameterNames = req.getParameterNames();
        String regex = "name[0-9]+";

        while (parameterNames.hasMoreElements()) {

            String paramName = parameterNames.nextElement();
            String paramValue = req.getParameter(paramName);

            if (paramName.matches(regex)) {
                System.out.println("Имя параметра: " + paramName);
                System.out.println("Значение параметра: " + paramValue);
            }
        }
    }
}
