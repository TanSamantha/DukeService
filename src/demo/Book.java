package demo;

import com.google.gson.Gson;
import org.codehaus.jettison.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name="", urlPatterns = "/book")

public class Book extends HttpServlet {
    String title;
    String description;
    String author;
    int year;


   public Book() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
        Book book = new Book();

        Gson gson = new Gson();
        String json = gson.toJson(book);
    }
}
