package by.itacademy.jd2.firstApp.homework1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/home_work_task1resp")
public class HomeWorkTask1resp extends HttpServlet {
    private static Base base = Base.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print(getVotePage());
    }

    private String getVotePage() {
        StringBuilder htmlVote = new StringBuilder();

        Map<String, String[]> stringMap = base.getBaseData();

        htmlVote.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta http-equiv=\"content-type\" content=\"text/html ; charset=utf-8\"/>\n" +
                "    <title>My vote app</title>\n" +
                "<style>\n" +
                "        .button-link {\n" +
                "            display: inline-block;\n" +
                "            padding: 10px 20px;\n" +
                "            background-color: #007BFF;\n" +
                "            color: white;\n" +
                "            text-decoration: none;\n" +
                "            border-radius: 4px;\n" +
                "        }\n" +
                "\n" +
                "        .button-link:hover {\n" +
                "            background-color: #0056b3;\n" +
                "        }\n" +
                "    </style>" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "<br> <a href=\"/firstApp/home_work_task1\" class=\"button-link\">Проголосовать еще раз</a>\n" +
                "</div> <br>" +
                "<form action=\"\" method=\"get\">\n" +
                "    <div>\n" +
                "        <label><b>Лучший исполнитель:</b></label>\n" +
                "        <br>");

        for (Map.Entry<String, String[]> stringEntry : stringMap.entrySet()) {
            if (stringEntry.getKey().equalsIgnoreCase("artist")) {
                for (String s : stringEntry.getValue()) {
                    htmlVote.append("<label>" + s + "</label>\n" +
                            "        <br>");
                }
                htmlVote.append("</div>\n" +
                        "    <br>\n" +
                        "    <div>\n" +
                        "        <label><b>Ваши любимые жанры: (не менее 3-х)</b></label>\n" +
                        "        <br>");
            } else if (stringEntry.getKey().equalsIgnoreCase("genre")) {
                for (String s : stringEntry.getValue()) {
                    htmlVote.append("<label>" + s + "</label>\n" +
                            "        <br>");
                }
                htmlVote.append("</div>\n" +
                        "    <br>\n" +
                        "    <div>\n" +
                        "        <label><b>Краткий текст о вас:</b></label>\n" +
                        "        <br>");
            } else if (stringEntry.getKey().equalsIgnoreCase("about")) {
                for (String s : stringEntry.getValue()) {
                    htmlVote.append("<label>" + s + "</label>\n" +
                            "        <br>");
                }
                htmlVote.append("</div>\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>");
            }
        }

        return htmlVote.toString();
    }

}
