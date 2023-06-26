public class Edificio
{
    private final String nit;
    private String nombreEdificio;
    private String direccion;
    private Vendedor[] Vendedor;
    private int numVendedores;
    
    public Edificio(String nit,String nombreEdificio,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreEdificio(nombreEdificio);
        setDireccion(direccion);        
        Vendedor = new Vendedor[50];
        numVendedores = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreEdificio(){
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio){
        if(nombreEdificio != null){
            this.nombreEdificio = nombreEdificio;
        }else{
            this.nombreEdificio = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumVendedores(){
        return numVendedores;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores; i++){
            promedio = promedio + Vendedor[i].calcularPromedio() / numVendedores;
        }
        return promedio;
    }
    
    public void adicionarVendedor(String identificacion, String nombre, String oficina, double caliuno, double calidos, double calitres){
        Vendedor e = new Vendedor(identificacion, nombre, oficina, caliuno, calidos, calitres);
        Vendedor[numVendedores] = e;
        numVendedores++;
    }
}   