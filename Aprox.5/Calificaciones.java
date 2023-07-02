import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Edificio miEdificio = new Edificio("123456","sede corporativa","restrepo");
        String identificacion, nombre, oficina;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de vendedores principiantes: ");
        int numVendedores1 = sc.nextInt();
        for(int i = 0; i < numVendedores1; i++){
            double cali1, cali2;
            System.out.println("Digite la Identificacion del vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina  del vendedor: ");
            oficina = sc.next();
            System.out.println("Digite primera calificacion del vendedor: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del vendedor: ");
            cali2 = sc.nextDouble();            
            miEdificio.adicionarVendedorPrincipiante(identificacion, nombre, oficina, cali1, cali2);
        }
                
        System.out.println("Digite el numero de vendedores comunes: ");
        int numVendedores2 = sc.nextInt();
        for(int i = 0; i < numVendedores2; i++){
            double cali1, cali2, cali3;
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
            System.out.println("Digite tercera calificacion del vendedor: ");
            cali3 = sc.nextDouble();
            miEdificio.adicionarVendedorComun(identificacion, nombre, oficina, cali1, cali2, cali3);
        }
        
        System.out.println("Digite el numero de vendedores avanzados: ");
        int numVendedores3 = sc.nextInt();
        for(int i = 0; i < numVendedores3; i++){
            double cali1, cali2, cali3, cali4;            
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
            System.out.println("Digite tercera calificacion del vendedor: ");
            cali3 = sc.nextDouble();
            System.out.println("Digite cuarta calificacion del vendedor: ");
            cali4 = sc.nextDouble();            
            miEdificio.adicionarVendedorAvanzado(identificacion, nombre, oficina, cali1, cali2, cali3, cali4);
        }
        
        promedio = miEdificio.calcularPromedioGeneral();
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}
