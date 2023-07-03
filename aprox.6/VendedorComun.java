public class VendedorComun extends Vendedor
{
    private double caliuno;
    private double calidos;
    private double calitres;
    VendedorComun(String id, String nombre, String ofi, double caliuno, double calidos, double calitres){
    super(id,nombre,ofi);
    setCaliuno(caliuno);
    setCalidos(calidos);
    setCalitres(calitres);
    }
    double calcularpromedio(){
        return(caliuno + calidos + calitres) / 3;
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
}
