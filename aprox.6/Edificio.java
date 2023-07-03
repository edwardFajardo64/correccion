public class Edificio
{
 private final String nit;
 private String nombreEdi;
 private String direccion;
 private Vendedor[] Vendedor;
 private int numeroVendedor;
 
 public Edificio (String nit, String nombreEdi, String direccion){
  if (nit != null) this.nit = nit;
 else this.nit = "";
 setNombreEdi(nombreEdi);
 setDireccion(direccion);
 Vendedor = new Vendedor [50];
 numeroVendedor = 0;
 }
 public String getNit(){
 return nit;
 }
 
 public String getNombreEdi(){
 return nombreEdi;
 }
 public void setNombreEdi(String nombreEdi){
 if (nombreEdi != null){
 this.nombreEdi = nombreEdi;
 }
 else{
 this.nombreEdi = "";
 }
 }
 
 public String getDireccion(){
 return direccion;
 }
 public void setDireccion(String Direccion){
 if (direccion != null){
 this.direccion = direccion;
 }
 else{
 this.direccion = "";
 }
 }
 public double calcularpromediogeneral(){
 double promedio = 0;    
 for(int i = 0; i < numeroVendedor; i++){
   promedio = promedio + Vendedor[i].calcularpromedio();  
 }
 return promedio / 3;
 }

 public void addVenP(String id, String nombre, String ofi, double caliuno, double calidos){
     Vendedor[numeroVendedor] = new VendedorPrincipiante(id, nombre, ofi, caliuno, calidos);
     numeroVendedor++;
 }
 public void addVenC(String id, String nombre, String ofi, double caliuno, double calidos, double calitres){
     Vendedor[numeroVendedor] = new VendedorComun(id, nombre, ofi, caliuno, calidos, calitres);
     numeroVendedor++;
 }
 public void addVenA(String id, String nombre, String ofi, double caliuno, double calidos, double calitres, double calicuatro){
     Vendedor[numeroVendedor] = new VendedorAvanzado(id, nombre, ofi, caliuno, calidos, calitres, calicuatro);
     numeroVendedor++;
 }
 
}
