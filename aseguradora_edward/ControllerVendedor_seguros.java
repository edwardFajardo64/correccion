import java.util.List;

public class ControllerVendedor_seguros {
    private final ViewVendedor_seguros vista_vendedor;
    private final VendedorDao dao_vendedor;

    public ControllerVendedor_seguros() throws DAOException_vendedor {
        this.vista_vendedor = new ViewVendedor_seguros();
        this.dao_vendedor = Vendedor_DAOFactory.creaVendedorDAO();
    }

    public void registrar(Vendedor_seguros vendedor) {
        try {
            dao_vendedor.registrarVendedor(vendedor);
        } catch (DAOException_vendedor e) {
            mostrarError("hubo un error al registrar al vendedor", e);
        }
    }

    public void actualizar(Vendedor_seguros vendedor) {
        try {
            dao_vendedor.actualizarVendedor(vendedor);
        } catch (DAOException_vendedor e) {
            mostrarError("hubo un error al actualizar al vendedor", e);
        }
    }

    public void eliminar(Vendedor_seguros vendedor) {
        try {
            dao_vendedor.eliminarVendedor(vendedor);
        } catch (DAOException_vendedor e) {
            mostrarError("hubo un error al eliminar al vendedor", e);
        }
    }
    
    public void verVendedores() {
        try {
            List<Vendedor_seguros> vendedores = dao_vendedor.obtenerVendedores();
            vista_vendedor.verVendedor_seguros(vendedores);
        } catch (DAOException_vendedor e) {
            mostrarError("hubo un error al obtener a los vendedores", e);
        }
    }

    public Vendedor_seguros obtenerVendedorPornumero(int numero) {
        try {
            return dao_vendedor.obtenerVendedorPornumero(numero);
        } catch (DAOException_vendedor e) {
            mostrarError("hubo un error al obtener al vendedor por su numero", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}
