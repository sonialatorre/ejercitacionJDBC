package Persistencia;

import java.sql.*;

public class DAO {
    protected static Connection connection;
    protected static Statement statement;
    protected static ResultSet resultSet;

    private static final String User = "root";
    private static final String password = "root";

    private final String Driver = "com.mysql.cj.jdbc.driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tienda?use SSL=false";

    protected static void ConnectDatabase() throws Exception {
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(URL, User, password);

        }catch(ClassNotFoundException | SQLException e) {

            throw new Exception ("error al Conectar");

        }

    }

    protected static void disconnectDatabase() throws Exception {

        try {

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }catch (SQLException e) {

            throw new Exception ("error de desconexión");
        }
    }
    protected static void queryDatabase(String sql) throws Exception {

        try {
            ConnectDatabase ();
            statement=connection.createStatement ();
            resultSet=statement.executeQuery (sql);

        }catch (SQLException e) {
            throw new Exception ("Error al consultar database");
        }
    }
}
