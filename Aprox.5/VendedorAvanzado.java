public class VendedorAvanzado{
    private final String identificacion;
    private String nombre;
    private String oficina;
    private double caliuno;
    private double calidos;
    private double calitres;
    private double calicuatro;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getOficina(){
        return oficina;
    }
    public void setOficina(String oficina){
        if(oficina != null) this.oficina = oficina;
        else this.oficina = "";
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
    
    public double getCalicuatro(){
        return calicuatro;
    }
    public void setCalicuatro(double calicuatro){
        if(calicuatro >= 0) this.calicuatro = calicuatro;
        else this.calicuatro = 0;
    }
    
    VendedorAvanzado(String identificacion, String nombre, String oficina, double caliuno, double calidos, double calitres, double calicuatro){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setOficina(oficina);
        setCaliuno(caliuno);
        setCalidos(calidos);
        setCalitres(calitres);
        setCalicuatro(calicuatro);        
    }
    
    double calcularPromedio(){
        return (caliuno + calidos + calitres + calicuatro) / 4;
    }
}