package Nivell_3_exercici_1.Moduls;

public abstract class Noticia {

    private String titular;
    private String texto;
    protected int puntuacion;
    protected static int precio;

    public Noticia(String titular, String texto, int puntuacion, int precio) {
        this.titular = titular;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    abstract float calcularPrecioNoticia();
    abstract float calcularPuntosNoticia();

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }
}