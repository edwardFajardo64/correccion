import java.util.ArrayList;
public class Edificio
{
    private final String nit;
    private String nombreEdi;
    private String direccion;
    private ArrayList vendedor;
    
    public Edificio(String nit,String nombreEdi,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreEdi(nombreEdi);
        setDireccion(direccion);        
        vendedor = vendedor = new ArrayList();
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < vendedor.size(); i++){
            promedio += ((Vendedor)vendedor.get(i)).calcularProm();
        }

        return promedio / 3;
    }
    
    public void addVendedor(String id, String nom, String ofi, double cuno, double cdos)throws Exception{
        vendedor.add(new VendedorPrincipiante(id, nom, ofi, cuno, cdos));
    }
    
    public void addVendedor(String id, String nom, String ofi, double cuno, double cdos, double ctres)throws Exception{
        vendedor.add(new VendedorComun(id, nom, ofi, cuno, cdos, ctres));
    }
    
    public void addVendedor(String id, String nom, String ofi, double cuno, double cdos, double ctres, double ccuatro)throws Exception{
        vendedor.add(new VendedorAvanzado(id, nom, ofi, cuno, cdos, ctres, ccuatro));
    }
}    
