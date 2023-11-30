package libreria;

import org.junit.Test;

import static org.junit.Assert.*;
public class GestorLibrosTest {


    @Test
    public void pruebaBuscarLibro(){
        GestorLibros gestor = new GestorLibros();
        Libro actual = gestor.buscarLibro(1);
        assertNotNull(actual);
    }

    @Test
    public void pruebaLibroDisponible(){
        GestorLibros gestor = new GestorLibros();
        boolean expected = true;
        boolean actual = gestor.verificarDisponibilidad(1);
        assertEquals(expected, actual);
    }

    @Test
    public void pruebaPrestarLibro(){
        GestorLibros gestor = new GestorLibros();
        boolean expected = true;
        boolean actual = gestor.prestarLibro(1, "Jose");
        assertEquals(expected, actual);
    }

    @Test
    public void pruebaExisteLibro(){
        GestorLibros gestor = new GestorLibros();
        boolean expected = true;
        boolean actual = gestor.existeLibro(1);
        assertEquals(expected, actual);
    }

    @Test
    public void pruebaDevolverLibro(){
        GestorLibros gestor = new GestorLibros();
        boolean expected = true;
        boolean actual = gestor.devolverLibro(2, "Jose");
        assertEquals(expected, actual);
    }

}