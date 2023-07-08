import java.util.InputMismatchException;
import java.util.Scanner;

public class VendedorCRUD {
    private static final ControllerVendedor_seguros controller;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controller = new ControllerVendedor_seguros();
        } catch (DAOException_vendedor e) {
            System.out.println("hubo un error al inicializar el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("[A] listar | [B] consultar por ID | [C] registrar | [D] actualizar | [E] eliminar | [F] salir: ");
            action = scanner.next().toUpperCase();
            try {
                switch (action) {
                    case "A":
                        listarVendedores();
                        break;
                    case "B":
                        consultarVendedorPornumero();
                        break;
                    case "C":
                        registrarVendedor();
                        break;
                    case "D":
                        actualizarVendedor();
                        break;
                    case "E":
                        eliminarVendedor();
                        break;
                    case "F":
                        return;
                    default:
                        System.out.println("Acción inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarVendedor() {
        Vendedor_seguros vendedor = guardarVendedor();
        controller.registrar(vendedor);
        System.out.println("vendedor Ingresado Correctamente");
        System.out.println("Registro exitoso: " + vendedor.getnumero());
    }

    private static void actualizarVendedor() {
        int numero = leernumero();
        Vendedor_seguros vendedor = controller.obtenerVendedorPornumero(numero);
        if (vendedor != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(vendedor);
            System.out.println("Ingrese los nuevos datos");

            String cedula = readString("Ingrese la cedula del vendedor: ");
            String apellido = readString("Ingrese el apellido del vendedor: ");
            String oficina = readString("Ingrese la oficina del vendedor: ");
            double primerareseña = readReseña("Ingrese la primera reseña hecha al vendedor: ");
            double segundareseña = readReseña("Ingrese la segunda reseña hecha al vendedor: ");
            double tercerareseña = readReseña("Ingrese la tercera reseña hecha al vendedor: ");

            vendedor = new Vendedor_seguros(numero, cedula, apellido, oficina, primerareseña, segundareseña, tercerareseña);
            controller.actualizar(vendedor);
            System.out.println("Actualización exitosa");
        } else {
            System.out.println("vendedor no encontrado.");
        }
    }

    private static void eliminarVendedor() {
        int numero = leernumero();
        Vendedor_seguros vendedor = controller.obtenerVendedorPornumero(numero);
        if (vendedor != null) {
            controller.eliminar(vendedor);
            System.out.println("vendedor eliminado: " + vendedor.getnumero());
        } else {
            System.out.println("vendedor no encontrado.");
        }
    }

    private static void listarVendedores() {
        controller.verVendedores();
    }

    private static void consultarVendedorPornumero() {
        int numero = leernumero();
        Vendedor_seguros vendedor = controller.obtenerVendedorPornumero(numero);
        if (vendedor != null) {
            System.out.println("el vendedor fue encontrado:");
            System.out.println(vendedor);
        } else {
            System.out.println("el vendedor no fue encontrado.");
        }
    }

    private static Vendedor_seguros guardarVendedor() {
        String cedula = readString("Ingrese la cedula del vendedor: ");
        String apellido = readString("Ingrese el apellido del vendedor de seguros: ");
        String oficina = readString("Ingrese la oficina del vendedor de seguros: ");
        double primerareseña = readReseña("Ingrese la primera reseña hecha hacia el vendedor: ");
        double segundareseña = readReseña("Ingrese la segunda reseña hecha hacia el vendedor: ");
        double tercerareseña = readReseña("Ingrese la tercera reseña hecha hacia el vendedor: ");

        return new Vendedor_seguros(cedula, apellido, oficina , primerareseña, segundareseña, tercerareseña);
    }

    private static int leernumero() {
        int numero;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el numero del vendedor: ");
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return numero;
    }

    private static double readReseña(String message) {
        double reseña;
        while (true) {
            try {
                System.out.println(message);
                reseña = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return reseña;
    }

    private static String readString(String message) {
        String s;
        while (true) {
            System.out.println(message);
            s = scanner.next().trim();
            if (s.length() <= 2) {
                System.out.println("longitud de cadena debe ser >= 2");
            } else {
                break;
            }
        }
        return s;
    }
}
