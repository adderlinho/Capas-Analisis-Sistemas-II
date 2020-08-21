package gt.edu.umg.sinay.modelo;

public class Saludo {
    private String titulo;
    private String clase;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Saludos [Nombre=" + titulo + ", Clase=" + clase + "]";
    }
}
