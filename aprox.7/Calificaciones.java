import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Edificio miEdificio = new Edificio("123","sede corporativa","restrepo");
        String id, nom, ofi;
        double c1, c2, c3, c4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar vendedor principiante: ");
            System.out.println("[2]- Adicionar vendedor comun: ");
            System.out.println("[3]- Adicionar vendedor avanzado ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Id del vendedor: ");
                        id = sc.next();
                        System.out.println("Digite el nombre del vendedor: ");
                        nom = sc.next();
                        System.out.println("Digite la oficina del vendedor: ");
                        ofi = sc.next();
                        System.out.println("Digite primera calificacion: ");
                        c1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion: ");
                        c2 = sc.nextDouble();
                        try{
                            miEdificio.addVendedor(id, nom, ofi, c1, c2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Id del vendedor: ");
                        id = sc.next();
                        System.out.println("Digite el nombre del vendedor: ");
                        nom = sc.next();
                        System.out.println("Digite la oficina del vendedor: ");
                        ofi = sc.next();
                        System.out.println("Digite primera calificacion: ");
                        c1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion: ");
                        c2 = sc.nextDouble();            
                        System.out.println("Digite tercera calificacion: ");
                        c3 = sc.nextDouble();
                        try{                        
                        miEdificio.addVendedor(id, nom, ofi, c1, c2, c3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la Id del vendedor: ");
                        id = sc.next();
                        System.out.println("Digite el nombre del vendedor: ");
                        nom = sc.next();
                        System.out.println("Digite la oficina del vendedor: ");
                        ofi = sc.next();
                        System.out.println("Digite primera calificacion: ");
                        c1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion: ");
                        c2 = sc.nextDouble();            
                        System.out.println("Digite tercera calificacion: ");
                        c3 = sc.nextDouble();
                        System.out.println("Digite cuarta calificacion: ");
                        c4 = sc.nextDouble();
                        try{                         
                        miEdificio.addVendedor(id, nom, ofi, c1, c2, c3, c4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miEdificio.calcularPromedioGeneral();
                        System.out.println("\n El promedio es de: " + promedio); 
                        break;
                default:
                        System.out.println("has Salido");
                        
            }
        }while(opcionMenu != 5);
    }
}

