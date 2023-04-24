package Servicio;

import Entidad.Fabricante;
import Entidad.Producto;
import Persistencia.ProductoDao;

import java.util.List;

public class ProductoServicio {
    private  ProductoDao productoDao= new ProductoDao();

    public ProductoServicio() {

    }




    public void getProducto () throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
            throw new Exception("No existen Productos");

        }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
            for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }

    public void NombreyPrecio () throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existe Nombre y precio");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
    public void  PrecioEntre200_800( ) throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
    public void  impresoras_Registradas( ) throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
    public void  ProductoMasBarato( ) throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
    public void  ProductoMasCaro( ) throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
    public void  nombreYcodigo_fabricantes( ) throws Exception{

        try {

            List<Producto> productos = ProductoDao.getProducto();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos");

            }else{

                System.out.println ("Listado de Productos");
                System.out.printf (" %-10s%-15s% -15s% -15s% \n","codigo","nombre","precio", "codigo_fabricante");
                for (Producto producto:productos){
                    System.out.printf (" %-10s%-15s% \n",producto.getNombre(), producto.getCodigo(), producto.getPrecio(), producto.getCodigo_fabricante());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
}

