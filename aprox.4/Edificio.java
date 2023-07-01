public class Edificio
{
    private final String nit;
    private String nombreEdi;
    private String direccion;
    private Vendedor[] vendedor;
    private int numVende;
    
    public Edificio(String nit,String nombreEdi,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreEdi(nombreEdi);
        setDireccion(direccion);        
        vendedor = new Vendedor[50];
        numVende = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreEdi(){
        return nombreEdi;
    }
    public void setNombreEdi(String nombreEdi){
        if(nombreEdi != null){
            this.nombreEdi = nombreEdi;
        }else{
            this.nombreEdi = "";
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
    
    public int getNumVende(){
        return numVende;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVende; i++){
            promedio = promedio + vendedor[i].calcularPromedio() / numVende;
        }
        return promedio;
    }
    
    public void adicionarVendedor(String id, String nombre, String ofi, double caliuno, double calidos, double calitres){
        Vendedor e = new Vendedor(id, nombre, ofi, caliuno, calidos, calitres);
        vendedor[numVende] = e;
        numVende++;
    }
}   

