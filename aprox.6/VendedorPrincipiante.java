
public class VendedorPrincipiante extends Vendedor
{
    private double caliuno;
    private double calidos;
    VendedorPrincipiante(String id, String nombre, String ofi, double caliuno, double calidos){
    super(id,nombre,ofi);
    setCaliuno(caliuno);
    setCalidos(calidos);
    }
    double calcularpromedio(){
        return(caliuno + calidos) / 2;
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
}
