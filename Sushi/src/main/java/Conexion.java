import java.sql.*;

public class Conexion {
    
    Connection conectar = null;

    public Connection conectar()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            //System.out.println("Probando coneccion");
            conectar = DriverManager.getConnection("jdbc:sqlite:sushi.db");
            //System.out.println("Se conecto con exito");
        }
        catch (Exception e)
        {
            System.out.printf(e.getMessage());
            System.out.println("Error");
        }
        
        return conectar;
    }
}
