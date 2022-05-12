package com.example.currentconverter;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/current-convert")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        float rate = Float.parseFloat(req.getParameter("value1"));
        float usd = Float.parseFloat(req.getParameter("value2"));

        float vnd = rate * usd;
        pw.write("<html>");
        pw.write("<h1>" + rate+": rate </h1>");
        pw.write("<h1>" + usd + ": USD</h1>");
        pw.write("<h1>" + vnd + ": VND</h1>");
        pw.write("</html>");
    }

    public void destroy() {
    }
}