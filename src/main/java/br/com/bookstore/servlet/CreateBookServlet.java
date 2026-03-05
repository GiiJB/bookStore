package br.com.bookstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException; 

@WebServlet("/create-book")
public class CreateBookServlet extends HttpServlet {

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String bookTitle = request.getParameter("book-title");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String json = "{\"title\": \"" + bookTitle + "\"}";

        response.getWriter().write(json);
    }
}
