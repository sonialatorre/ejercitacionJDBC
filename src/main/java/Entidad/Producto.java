package Entidad;

public class Producto {


    private int codigo;
    private String nombre;

    private int precio;

    private int codigo_fabricante;
    private Fabricante fabricante;

    public Producto(int codigo, String nombre, int precio, int codigo_fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_fabricante = codigo_fabricante;
    }
public Producto (){

}
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(int codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo_fabricante=" + codigo_fabricante +
                '}';
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}