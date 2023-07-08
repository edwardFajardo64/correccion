public class Vendedor_DAOFactory {
    public static VendedorDao creaVendedorDAO() throws DAOException_vendedor {
        return new Vendedor_seguros_DaoImpl();
    }
}
