import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_aseguradora {
    private static final String USUARIO_aseguradora = "root";
    private static final String CONTRASENA_aseguradora = "";
    private static final String URL = "jdbc:mysql://localhost:3306/aseguradora?user=" + USUARIO_aseguradora + "&password=" + CONTRASENA_aseguradora;

    public static Connection conectarse_aseguradora() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar con la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public static void cerrarConexion_aseguradora(Connection con_aseguradora) {
        if (con_aseguradora != null) {
            try {
                con_aseguradora.close();
            } catch (SQLException e) {
                System.out.println("hubo un error al cerrar la conexión");
                e.printStackTrace();
            }
        }
    }
}