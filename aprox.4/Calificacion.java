import java.util.Scanner;
public class Calificacion{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numVende;
        Edificio miEdi = new Edificio("123","sede corporativa","soacha");
        String id, nombre, ofi;
        double cali1, cali2, cali3;
        double promedio = 0;
        
        System.out.println("Digite cuantos vendedores consultara: ");
        numVende = sc.nextInt();
        
        for(int i = 0; i < numVende; i++){
            System.out.println("Digite la Id del Vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del Vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la oficina del Vendedor: ");
            ofi = sc.next();
            System.out.println("Digite primera calificacion: ");
            cali1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion: ");
            cali2 = sc.nextDouble();            
            System.out.println("Digite tercera calificacion: ");
            cali3 = sc.nextDouble();
            miEdi.adicionarVendedor(id, nombre, ofi, cali1, cali2, cali3);
        }
        
        promedio = miEdi.calcularPromedioGeneral();        
        System.out.println("\n El promedio de calificaciones es de: " + promedio); 
    }
}
