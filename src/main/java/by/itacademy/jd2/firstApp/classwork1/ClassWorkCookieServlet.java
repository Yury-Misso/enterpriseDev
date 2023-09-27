package by.itacademy.jd2.firstApp.classwork1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@WebServlet(urlPatterns = "/class_work_cookie")
public class ClassWorkCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        Cookie myCookieFirstName;
        Cookie myCookieLastName;

        if (firstName != null && lastName != null) {
            myCookieFirstName = new Cookie("firstName", firstName);
            myCookieFirstName.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
            resp.addCookie(myCookieFirstName);
            myCookieLastName = new Cookie("lastName", lastName);
            myCookieLastName.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
            resp.addCookie(myCookieLastName);
        } else if (firstName == null && lastName == null) {
            Cookie[] cookies = req.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equalsIgnoreCase("firstName")) {
                        firstName = cookie.getValue();
                    }
                    if (cookie.getName().equalsIgnoreCase("lastName")) {
                        lastName = cookie.getValue();
                    }
                }
            }
        }

        if (firstName != null && lastName != null) {
            PrintWriter writer = resp.getWriter();
            writer.write("Hello " + firstName + " " + lastName);
        } else {
            System.out.println("Error");
        }

    }
}
