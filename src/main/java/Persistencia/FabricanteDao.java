package Persistencia;

import Entidad.Fabricante;

import java.util.ArrayList;
import java.util.List;

public class FabricanteDao extends DAO {
    public FabricanteDao() {

    }

    public static List<Fabricante> getFabricante() throws Exception {

        try {

            String sql = "SELECT * FROM  fabricante";
            queryDatabase(sql);

            List<Fabricante> fabricantes = new ArrayList<>();


            while (resultSet.next()) {

                Fabricante fabricante = new Fabricante();

                fabricante.setCodigo(resultSet.getInt("1"));
                fabricante.setNombre(resultSet.getString("2"));

                fabricantes.add(fabricante);
            }
            return fabricantes;
        } catch (Exception e) {

            System.out.println(e.getMessage());
            throw new Exception("fallo al obtener fabricante");


        } finally {

            disconnectDatabase();

        }

    }
}