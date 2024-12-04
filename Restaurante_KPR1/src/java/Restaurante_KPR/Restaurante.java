/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Restaurante_KPR;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexf
 */
public class Restaurante extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Restaurante KPR</title>");
        out.println("<link rel=\"stylesheet\" href=\"CSS/ESTILOS.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"login-form\">");
        out.println("<img src=\"IMAGES/LOGO.png\" alt=\"LOGO\">");
        out.println("<h1>INGRESO DE USUARIO</h1>");
        out.println("<h3>Bienvenido al restaurante KPR, para acceder digita tu usuario y contraseña</h3>");
        out.println("<form action=\"#\" method=\"post\">");
        out.println("<div class=\"INPUT-GROUP\">");
        out.println("<label for=\"USERNAME\"><h2>Digita tu usuario</h2></label>");
        out.println("<input type=\"text\" id=\"USERNAME\" name=\"USERNAME\" required>*");
        out.println("</div>");
        out.println("<div class=\"INPUT-GROUP\">");
        out.println("<label for=\"PASSWORD\"><h2>Ingresa tu contraseña</h2></label>");
        out.println("<input type=\"password\" id=\"PASSWORD\" name=\"PASSWORD\" required>*<br><br>");
        out.println("<button type=\"submit\">Ingresar</button>");
        out.println("</div>");
        out.println("</form>");
        out.println("<div class=\"new\">");
        out.println("<button class=\"btn-registrarse\">Registrarse</button>");
        out.println("<button class=\"btn-remember\">¿Has olvidado tu usuario y/o contraseña?</button>");
        out.println("</div>");
        out.println("<h3>Ingresar con</h3>");
        out.println("<button class=\"btn-facebook\"><img src=\"IMAGES/LOGO_FACE.png\" alt=\"Facebook Logo\" class=\"logo\"></button>");
        out.println("<button class=\"btn-w\"><img src=\"IMAGES/LOGO_W.png\" alt=\"w Logo\" class=\"logo\"></button>");
        out.println("<button class=\"btn-g\"><img src=\"IMAGES/LOGO_G.png\" alt=\"g Logo\" class=\"logo\"></button>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
