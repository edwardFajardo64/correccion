public class Vendedor
{
    private final String id;
    private String nombre;
    private String ofi;
    private double caliuno;
    private double calidos;
    private double calitres;
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getOfi(){
        return ofi;
    }
    public void setOfi(String ofi){
        if(ofi != null) this.ofi = ofi;
        else this.ofi = "";
    }
    
    public double getCaliuno(){
        return caliuno;
    }
    public void setCaliuno(double caliuno){
        if(caliuno >= 0) this.caliuno = caliuno;
        else this.caliuno = 0;
    }
    
    public double getCalidos(){
        return calidos;
    }
    public void setCalidos(double calidos){
        if(calidos >= 0) this.calidos = calidos;
        else this.calidos = 0;
    }
    
    public double getCalitres(){
        return calitres;
    }
    public void setCalitres(double calitres){
        if(calitres >= 0) this.calitres = calitres;
        else this.calitres = 0;
    }
    
    Vendedor(String id, String nombre, String ofi, double caliuno, double calidos, double calitres){
        if(id != null) this.id = id;
        else this.id = "";
        setNombre(nombre);
        setOfi(ofi);
        setCaliuno(caliuno);
        setCalidos(calidos);
        setCalitres(calitres);
    }
    
    double calcularPromedio(){
        return (caliuno + calidos + calitres) / 3;
    }
}


