import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Vendedor_seguros_DaoImpl implements VendedorDao {

    private static final String INSERT_QUERY = "INSERT INTO vendedor (cedula, apellido, oficina, primerareseña, segundareseña, tercerareseña) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM vendedor ORDER BY numero";
    private static final String UPDATE_QUERY = "UPDATE vendedor SET cedula=?, apellido=?, oficina=?, primerareseña=?, segundareseña=?, tercerareseña=? WHERE numero=?";
    private static final String DELETE_QUERY = "DELETE FROM vendedor WHERE numero=?";
    private static final String SELECT_BY_NUMERO_QUERY = "SELECT * FROM vendedor WHERE numero = ?";

    @Override
    public boolean registrarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor {
        try (Connection con_aseguradora = Conexion_aseguradora.conectarse_aseguradora();
             PreparedStatement pstmt = con_aseguradora.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, vendedor.getcedula());
            pstmt.setString(2, vendedor.getapellido());
            pstmt.setString(3, vendedor.getoficina());
            pstmt.setDouble(4, vendedor.getprimerareseña());
            pstmt.setDouble(5, vendedor.getsegundareseña());
            pstmt.setDouble(6, vendedor.gettercerareseña());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException_vendedor("hubo un Error al registrar al vendedor de seguros", e);
        }
    }

    @Override
    public List<Vendedor_seguros> obtenerVendedores() throws DAOException_vendedor {
        List<Vendedor_seguros> listaVendedor = new ArrayList<>();

        try (Connection con_aseguradora = Conexion_aseguradora.conectarse_aseguradora();
             Statement stmt = con_aseguradora.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Vendedor_seguros vendedor = obtenerVendedorDesdeResultSet(rs);
                listaVendedor.add(vendedor);
            }
        } catch (SQLException e) {
            throw new DAOException_vendedor("Error al obtener a los vendedores", e);
        }

        return listaVendedor;
    }

    @Override
    public boolean actualizarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor {
        try (Connection con_aseguradora = Conexion_aseguradora.conectarse_aseguradora();
             PreparedStatement pstmt = con_aseguradora.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, vendedor.getcedula());
            pstmt.setString(2, vendedor.getapellido());
            pstmt.setString(3, vendedor.getoficina());
            pstmt.setDouble(4, vendedor.getprimerareseña());
            pstmt.setDouble(5, vendedor.getsegundareseña());
            pstmt.setDouble(6, vendedor.gettercerareseña());
            pstmt.setInt(7, vendedor.getnumero());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException_vendedor("hubo un error al actualizar al vendedor", e);
        }
    }

    @Override
    public boolean eliminarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor {
        try (Connection con = Conexion_aseguradora.conectarse_aseguradora();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, vendedor.getnumero());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException_vendedor("hubo un error al eliminar al vendedor", e);
        }
    }

    @Override
    public Vendedor_seguros obtenerVendedorPornumero(int numero) throws DAOException_vendedor {
        try (Connection con_aseguradora = Conexion_aseguradora.conectarse_aseguradora();
             PreparedStatement pstmt = con_aseguradora.prepareStatement(SELECT_BY_NUMERO_QUERY)) {
            pstmt.setInt(1, numero);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerVendedorDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new DAOException_vendedor("hubo un error al obtener el vendedor por su numero", e);
        }
        return null;
    }

    private Vendedor_seguros obtenerVendedorDesdeResultSet(ResultSet rs) throws SQLException {
        int numero = rs.getInt("numero");
        String cedula = rs.getString("cedula");
        String apellido = rs.getString("apellido");
        String oficina = rs.getString("oficina");
        double primerareseña = rs.getDouble("primerareseña");
        double segundareseña = rs.getDouble("segundareseña");
        double tercerareseña = rs.getDouble("tercerareseña");
        return new Vendedor_seguros(numero, cedula, apellido, oficina, primerareseña, segundareseña, tercerareseña);
    }
    
    
}
