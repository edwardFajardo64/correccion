import java.util.Scanner;
public class Calificaciones
{
 public static void main(String[] arg){
 Scanner sc = new Scanner (System.in);
 Edificio miEdificio = new Edificio ("12","sede corporativa","restrepo");
 String id, nombre, ofi;
 double promedio = 0;
 
 System.out.println("digite el numero de vendedores principiantes");
 int numVendedores1 = sc.nextInt();
 
 for(int i=0; i < numVendedores1; i++){
 double cali1,cali2;
 System.out.println("digite la id del vendedor");
 id = sc.next();
 System.out.println("digite el nombre del vendedor");
 nombre = sc.next();
 System.out.println("digite la oficina del vendedor");
 ofi = sc.next();
 System.out.println("digite la primera calificacion del vendedor");
 cali1 = sc.nextInt();
 System.out.println("digite la segunda calificacion del vendedor");
 cali2 = sc.nextInt();
 miEdificio.addVenP(id, nombre, ofi, cali1, cali2);
 }
 System.out.println("Digite el numero de vendedores comunes: ");
 int numVendedores2 = sc.nextInt();
 for(int i = 0; i < numVendedores2; i++){
            double cali1, cali2, cali3;
            System.out.println("Digite la Id del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina del vendedor: ");
            ofi = sc.next();
            System.out.println("Digite primera calificacion del vendedor: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del vendedor: ");
            cali2 = sc.nextDouble();            
            System.out.println("Digite tercera calificacion del vendedor: ");
            cali3 = sc.nextDouble();
            miEdificio.addVenC(id, nombre, ofi, cali1, cali2, cali3);
        }
 System.out.println("Digite el numero de vendedores avanzados: ");
 int numVendedores3 = sc.nextInt();
        for(int i = 0; i < numVendedores3; i++){
            double cali1, cali2, cali3, cali4;            
            System.out.println("Digite la Id del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina del vendedor: ");
            ofi = sc.next();
            System.out.println("Digite primera calificacion del vendedor: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del vendedor: ");
            cali2 = sc.nextDouble();            
            System.out.println("Digite tercera calificacion del vendedor: ");
            cali3 = sc.nextDouble();
            System.out.println("Digite cuarta calificacion del vendedor: ");
            cali4 = sc.nextDouble();            
            miEdificio.addVenA(id, nombre, ofi, cali1, cali2, cali3, cali4);
        }
  promedio = miEdificio.calcularpromediogeneral();
        System.out.println("El promedio de calificaciones es: " + promedio);
 }
}
