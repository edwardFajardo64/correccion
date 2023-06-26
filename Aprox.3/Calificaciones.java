import java.util.Scanner;

public class Calificaciones{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        Vendedor[] losVendedores = new Vendedor[50];
        String identificacion, nombre, oficina;
        double cali1, cali2, cali3;
        double promedio = 0;
        
        System.out.println("Digite el numero de vendedores: ");
        numVendedores = sc.nextInt();
        
        for(int i = 0; i < numVendedores; i++){
            System.out.println("Digite la Identificacion del vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina del vendedor: ");
            oficina = sc.next();
            System.out.println("Digite primera calificacion del vendedor: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del vendedor: ");
            cali2 = sc.nextDouble();            
            System.out.println("Digite tercera calificaicon del vendedor: ");
            cali3 = sc.nextDouble();
            Vendedor unVendedor = new Vendedor(identificacion, nombre, oficina, cali1, cali2, cali3);
            losVendedores[i] = unVendedor;
        }
        for(int i = 0; i < numVendedores; i++)
            promedio = promedio + losVendedores[i].calcularPromedio() / numVendedores;
        
        System.out.println("\n El promedio de calificaciones es: " + promedio); 
    }
}