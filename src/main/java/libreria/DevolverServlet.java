package libreria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DevolverServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        int idLibro = Integer.parseInt(request.getParameter("ID"));
        PrintWriter out = response.getWriter();

        GestorLibros gestorLibros = new GestorLibros();

        if(!gestorLibros.devolverLibro(idLibro, nombre)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/libroDevueltoError.jsp");
            dispatcher.forward(request, response);
        }else{
            request.setAttribute("id", idLibro);
            request.setAttribute("usuario", nombre);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/libroDevueltoExito.jsp");
            dispatcher.forward(request, response);
        }


    }

}
