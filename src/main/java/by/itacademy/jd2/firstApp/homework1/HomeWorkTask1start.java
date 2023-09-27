package by.itacademy.jd2.firstApp.homework1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/home_work_task1")
public class HomeWorkTask1start extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        response.getWriter().print(getPageStart());
    }
    private String getPageStart() {
        String htmlCode = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"content-type\" content=\"text/html ; charset=utf-8\"/>\n" +
                "    <title>My vote app</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/firstApp/home_work_task1req\" method=\"get\">\n" +
                "    <div>\n" +
                "        <label><b>Лучший исполнитель:</b></label>\n" +
                "        <br>\n" +
                "        <label for=\"artist1\">Исполнитель 1</label>\n" +
                "        <input type=\"radio\" name=\"artist\" id=\"artist1\" value=\"artist1\">\n" +
                "        <br>\n" +
                "        <label for=\"artist2\">Исполнитель 2</label>\n" +
                "        <input type=\"radio\" name=\"artist\" id=\"artist2\" value=\"artist2\">\n" +
                "        <br>\n" +
                "        <label for=\"artist3\">Исполнитель 3</label>\n" +
                "        <input type=\"radio\" name=\"artist\" id=\"artist3\" value=\"artist3\">\n" +
                "        <br>\n" +
                "        <label for=\"artist4\">Исполнитель 4</label>\n" +
                "        <input type=\"radio\" name=\"artist\" id=\"artist4\" value=\"artist4\">\n" +
                "    </div>\n" +
                "    <br>\n" +
                "    <div>\n" +
                "        <label><b>Ваши любимые жанры: (не менее 3-х)</b></label>\n" +
                "        <br>\n" +
                "        <label for=\"genre1\">Жанр 1</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre1\" value=\"genre1\">\n" +
                "        <br>\n" +
                "        <label for=\"genre2\">Жанр 2</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre2\" value=\"genre2\">\n" +
                "        <br>\n" +
                "        <label for=\"genre3\">Жанр 3</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre3\" value=\"genre3\">\n" +
                "        <br>\n" +
                "        <label for=\"genre4\">Жанр 4</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre4\" value=\"genre4\">\n" +
                "        <br>\n" +
                "        <label for=\"genre5\">Жанр 5</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre5\" value=\"genre5\">\n" +
                "        <br>\n" +
                "        <label for=\"genre6\">Жанр 6</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre6\" value=\"genre6\">\n" +
                "        <br>\n" +
                "        <label for=\"genre7\">Жанр 7</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre7\" value=\"genre7\">\n" +
                "        <br>\n" +
                "        <label for=\"genre8\">Жанр 8</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre8\" value=\"genre8\">\n" +
                "        <br>\n" +
                "        <label for=\"genre9\">Жанр 9</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre9\" value=\"genre9\">\n" +
                "        <br>\n" +
                "        <label for=\"genre10\">Жанр 10</label>\n" +
                "        <input type=\"checkbox\" name=\"genre\" id=\"genre10\" value=\"genre10\">\n" +
                "    </div>\n" +
                "    <br>\n" +
                "    <div>\n" +
                "        <label><b>Краткий текст о вас:</b></label>\n" +
                "        <br>\n" +
                "        <textarea name=\"about\" cols=\"35\" rows=\"5\"></textarea>\n" +
                "    </div>\n" +
                "    <br>\n" +
                "    <div>\n" +
                "        <input type=\"submit\" value=\"Проголосовать\">\n" +
                "    </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";

        return htmlCode;
    }
}
