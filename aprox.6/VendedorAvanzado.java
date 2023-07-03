public class VendedorAvanzado extends Vendedor
{
    private double caliuno;
    private double calidos;
    private double calitres;
    private double calicuatro;
    VendedorAvanzado(String id, String nombre, String ofi, double caliuno, double calidos, double calitres, double calicuatro){
    super(id,nombre,ofi);
    setCaliuno(caliuno);
    setCalidos(calidos);
    setCalitres(calitres);
    setCalicuatro(calicuatro);
    }
    double calcularpromedio(){
        return(caliuno + calidos + calitres + calicuatro) / 4;
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
}

