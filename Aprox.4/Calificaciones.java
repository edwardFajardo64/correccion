import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        Edificio miEdificio = new Edificio("123456","sede corporativa","restrepo");
        String identificacion, nombre, oficina;
        double cali1, cali2, cali3;
        double promedio = 0;
        
        System.out.println("Digite el numero de vendedores: ");
        numVendedores = sc.nextInt();
        
        for(int i = 0; i < numVendedores; i++){
            System.out.println("Digite la Identificacion del vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina del Vendedor: ");
            oficina = sc.next();
            System.out.println("Digite primera calificacion del vendedor: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del vendedor: ");
            cali2 = sc.nextDouble();            
            System.out.println("Digite tercera calificacion del vendedor: ");
            cali3 = sc.nextDouble();
            miEdificio.adicionarVendedor(identificacion, nombre, oficina, cali1, cali2, cali3);
        }
        
        promedio = miEdificio.calcularPromedioGeneral();        
        System.out.println("\n El promedio de calificaciones es: " + promedio); 
    }
}
