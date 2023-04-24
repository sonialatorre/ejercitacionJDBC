package Servicio;

import Entidad.Fabricante;
import Persistencia.FabricanteDao;

import java.util.List;

public class FabricanteServicio {

    private final FabricanteDao fabricanteDao;
    public FabricanteServicio() {
        fabricanteDao=new FabricanteDao();

    }

    public void PrintFabricante () throws Exception{

        try {

            List <Fabricante> fabricantes = FabricanteDao.getFabricante();

            if (((List<?>) fabricantes).isEmpty()) {
                throw new Exception ("No existen Fabricantes");

            }else{

                System.out.println ("Listado de Fabricantes");
                System.out.printf (" %-10s%-15s% \n","codigo","nombre");
                for (Fabricante fabricante : fabricantes){
                    System.out.printf (" %-10s%-15s% \n",fabricante.getNombre(),fabricante.getCodigo());
                }
            }

        }catch (Exception e){
            throw e;
        }
    }
}
