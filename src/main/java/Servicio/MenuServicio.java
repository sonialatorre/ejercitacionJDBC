package Servicio;

import java.util.Scanner;

import static Persistencia.ProductoDao.getProducto;

public class MenuServicio {

    ProductoServicio productoservicio = new ProductoServicio();
    FabricanteServicio fabricanteServicio = new FabricanteServicio();

    Scanner input = new Scanner(System.in);

    public void Menu() throws Exception {

        try {

            System.out.println("\n" + "MENU" + "\n" +
                    "a. Lista de Productos. \n" +
                    "b. Lista de Nombre y Precio de productos.\n" +
                    "c. Lista de Porductos con precio entre 200 y 800.\n" +
                    "d. Lista de impresoras Registradas. \n" +
                    "e. Producto más barato.\n" +
                    "f.Producto más caro.\n" +
                    "g. Lista del Nombre y Código del fabricante.\n" +
                    "h. Salir");

            System.out.println("Seleccione una opción: ");
            String respuesta = input.next();
            OpcionSeleccionada(respuesta);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Selecciona una opción válida");

        }
    }

    public void OpcionSeleccionada(String respuesta) throws Exception {

        try {
            switch (respuesta.toLowerCase()) {

                case "a":
                    productoservicio.getProducto();
                    Menu();
                    break;

                case "b":
                    productoservicio.NombreyPrecio();
                    Menu();
                    break;
                case "c":
                    productoservicio.PrecioEntre200_800();
                    Menu();
                    break;
                case "d":
                    productoservicio.impresoras_Registradas();
                    Menu();
                    break;

                case "e":
                    productoservicio.ProductoMasBarato();
                    Menu();
                    break;
                case "f":
                    productoservicio.ProductoMasCaro();
                    Menu();
                    break;
                case "g":
                    productoservicio.nombreYcodigo_fabricantes();
                    Menu();
                    break;
                case "h":
                    System.out.println("Menú finalizado");
                    break;
                default:

                    System.out.println("Ingrese una opción Válida");
                    Menu();
            }

            }catch(Exception e){
                System.out.println(e.getMessage());
                throw new Exception("No se pueden realizar la consulta");
            }
        }

    }

