package libreria;

public class Libro {
    private int id;
    private String estado;

    private String titulo;

    public Libro(int id, String estado, String titulo) {
        this.id = id;
        this.estado = estado;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}