import java.util.List;

public interface VendedorDao {
    boolean registrarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor;
    List<Vendedor_seguros> obtenerVendedores() throws DAOException_vendedor;
    boolean actualizarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor;
    boolean eliminarVendedor(Vendedor_seguros vendedor) throws DAOException_vendedor;
    Vendedor_seguros obtenerVendedorPornumero(int numero) throws DAOException_vendedor;
}

