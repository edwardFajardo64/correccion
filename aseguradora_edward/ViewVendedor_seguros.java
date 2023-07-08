import java.util.List;

public class ViewVendedor_seguros {

    public void verVendedor_seguros(Vendedor_seguros vendedor) {
        System.out.println("Datos del vendedor de seguros:");
        System.out.println("numero del vendedor de seguros: " + vendedor.getnumero());
        System.out.println("cedula del vendedor de seguros: " + vendedor.getcedula());
        System.out.println("apellido del vendedor de seguros: " + vendedor.getapellido());
        System.out.println("oficina del vendedor de seguros: "  + vendedor.getoficina());
        System.out.println("primera reseña hecha al vendedor de seguros: " + vendedor.getprimerareseña());
        System.out.println("segunda reseña hecha al vendedor de seguros: " + vendedor.getsegundareseña());
        System.out.println("tercera reseña hecha al vendedor de seguros: " + vendedor.gettercerareseña());
    }

    public void verVendedor_seguros(List<Vendedor_seguros> vendedores) {
        System.out.println("Datos de los vendedores de seguros:");
        for (Vendedor_seguros vendedor : vendedores) {
            verVendedor_seguros(vendedor);
            System.out.println();
        }
    }
}
