package Persistencia;

import Entidad.Fabricante;
import Entidad.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDao  extends DAO{

    public ProductoDao() {

    }

    public static List<Producto> getProducto()  throws Exception{
try{
    String sql= "SELECT* FROM producto P  JOIN fabricante F ON P.codigo_fabricante= F.codigo";
    queryDatabase(sql);

    List<Producto> productos = new ArrayList<>();
Producto producto;
Fabricante fabricante;
    while (resultSet.next()){
        producto= new Producto();
        fabricante = new Fabricante();

        producto.setCodigo(resultSet.getInt("1"));
        producto.setNombre(resultSet.getString("2"));
        producto.setFabricante(fabricante);
        productos.add(producto);
    }
    return productos;

    }catch (Exception e){

        System.out.println(e.getMessage());
throw new Exception ("fallo al obtener productos");


    }
}

public List <Producto> NombreyPrecio() throws Exception {
try{
    String sql="select nombre,precio from producto";

    queryDatabase(sql);

    List<Producto> productos = new ArrayList<>();
    Producto producto;
    Fabricante fabricante;
    while (resultSet.next()){

        producto= new Producto();
        fabricante = new Fabricante();

        producto.setNombre(resultSet.getString("2"));
        producto.setPrecio((int) resultSet.getDouble("3"));
        producto.setFabricante(fabricante);
        productos.add(producto);
    }
    return productos;

}catch (Exception e){

    System.out.println(e.getMessage());
    throw new Exception ("fallo al obtener nombre y precio");


}finally {

    disconnectDatabase ();
}
}
    public List <Producto> PrecioEntre200_800() throws Exception {
        try {
            String sql = "select *from producto join fabricante on producto.codigo_fabricante =fabricante.codigo WHERE precio >=200 AND precio <800";

            queryDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;
            while (resultSet.next()){

                producto= new Producto();
                fabricante = new Fabricante();


                producto.setNombre(resultSet.getString("2"));
                producto.setPrecio((int) resultSet.getDouble("3"));
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            return productos;

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception ("fallo al obtener nombre y precio");


        }finally {

            disconnectDatabase ();
        }
    }

    public List <Producto> impresoras_Registradas() throws Exception {
        try{
            String sql="select *from producto join fabricante on producto.codigo_fabricante =fabricante.codigo WHERE producto.nombre LIKE 'impresora%";

            queryDatabase(sql);


            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;
            producto= new Producto();
            fabricante = new Fabricante();

            while (resultSet.next()){

                producto.setCodigo(resultSet.getInt("1"));
                producto.setNombre(resultSet.getString("2"));
                producto.setPrecio((int) resultSet.getDouble("3"));
                producto.setCodigo_fabricante (resultSet.getInt("4"));
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            return productos;

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception ("fallo al obtener impresoras registradas");


        }finally {

            disconnectDatabase ();
        }
    }
    public List <Producto> ProductoMasBarato() throws Exception {
        try{
            String sql="SELECT  MIN(producto.precio) FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante;";

            queryDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultSet.next()) {

                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultSet.getInt("1"));
                producto.setNombre(resultSet.getString("2"));
                producto.setPrecio(resultSet.getInt("3"));
                producto.setCodigo_fabricante(resultSet.getInt("4"));
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            return productos;

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception ("fallo al obtener producto mas barato");


        }finally {

            disconnectDatabase ();
        }
    }
    public List <Producto> ProductoMascaro() throws Exception {
        try{
            String sql="SELECT  MAX(producto.precio) FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante";

            queryDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultSet.next()) {

                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultSet.getInt("1"));
                producto.setNombre(resultSet.getString("2"));
                producto.setPrecio(resultSet.getInt("3"));
                producto.setCodigo_fabricante(resultSet.getInt("4"));
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            return productos;

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception ("fallo al obtener producto mas caro");


        }finally {

            disconnectDatabase ();
        }
}
    public List <Producto> nombreYcodigo_fabricantes() throws Exception {
        try{
            String sql="select fabricante.nombre, fabricante.codigo from fabricante join producto on producto.codigo_fabricante= fabricante.codigo;";

            queryDatabase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultSet.next()) {

                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultSet.getInt("1"));
                producto.setNombre(resultSet.getString("2"));
                producto.setPrecio(resultSet.getInt("3"));
                producto.setCodigo_fabricante(resultSet.getInt("4"));
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            return productos;

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception ("fallo al obtener nombre y código del fabricante");


        }finally {

            disconnectDatabase ();
        }
    }
}


