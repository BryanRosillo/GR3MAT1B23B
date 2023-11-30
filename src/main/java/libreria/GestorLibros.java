package libreria;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class GestorLibros {
    private ArrayList<Libro> libros;
    private Historial historial;


    public GestorLibros() {
        libros = new ArrayList<Libro>();
        historial = new Historial();
        this.agregarLibros();
    }

    public Libro buscarLibro(int id) {
        for(Libro libro : libros){
            if(libro.getId()==id){
                return libro;
            }
        }
        return null;
    }

    public boolean existeLibro(int id){
        if(this.buscarLibro(id)!=null){
            return true;
        }
        return false;
    }

    public boolean verificarDisponibilidad(int id) {
        if(this.buscarLibro(id).getEstado().equalsIgnoreCase("prestado")){
            return false;
        }
        return true;
    }


    public boolean prestarLibro(int id, String usuario) {
        Libro libroPrestado;
        if(this.existeLibro(id)&&this.verificarDisponibilidad(id)){
            libroPrestado = this.buscarLibro(id);
            libroPrestado.setEstado("prestado");
            this.historial.registrarTransaccion(imprimirReciboPrestamo(libroPrestado,usuario));
            return true;
        }
        return false;
    }

    public String imprimirLibrosDisponibles(){
        String libros = "";
        for(Libro libro : this.libros){
            if(libro.getEstado().equalsIgnoreCase("disponible")){
                libros += "- ID del libro: "+ libro.getId() +"<br>- Nombre del libro: "+ libro.getTitulo() + "<br><br>";
            }
        }
        return libros;
    }

    public String imprimirReciboPrestamo(Libro libroPrestado, String usuario){
        Date fechaPrestamo = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaPrestamo);
        calendar.add(Calendar.MONTH,1);
        Date fechaDevolucion = calendar.getTime();
        return "<br><br>*******Prestamo******<br>" +
                "ID Libro: " + libroPrestado.getId() + "<br>" +
                "Título del libro: " + libroPrestado.getTitulo() + "<br>" +
                "Usuario: " + usuario + "<br>" +
                "Fecha de prestamo: " + fechaPrestamo + "<br>" +
                "Fecha de devolución: " + fechaDevolucion + "<br>";
    }


    public void agregarLibros() {
        for (int i = 1; i <= 6; i++) {
            String titulo = "Libro" + i;
            int id = i;
            String estado = (i % 2 == 0) ? "prestado" : "disponible"; // Alterna entre "disponible" y "prestado"

            Libro nuevoLibro = new Libro(id, estado, titulo);
            libros.add(nuevoLibro);
        }
    }


    public boolean devolverLibro(int id, String usuario) {
        Libro libroDevuelto;
        if(this.existeLibro(id)&&!this.verificarDisponibilidad(id)){
            libroDevuelto = this.buscarLibro(id);
            libroDevuelto.setEstado("disponible");
            historial.registrarTransaccion(imprimirReciboDevuelto(libroDevuelto,usuario));
            return true;
        }
        return false;
    }

    public String imprimirReciboDevuelto(Libro libroDevuelto, String usuario){
        Date fechaDevolucion = new Date();
        return "<br><br>*******Devolución******<br>" +
                "ID Libro: " + libroDevuelto.getId() + "<br>" +
                "Título del libro: " + libroDevuelto.getTitulo() + "<br>" +
                "Usuario: " + usuario + "<br>" +
                "Fecha de devolución: " + fechaDevolucion + "<br>";
    }
}
