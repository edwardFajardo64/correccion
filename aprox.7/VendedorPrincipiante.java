public class VendedorPrincipiante extends Vendedor{
    private double cuno;
    private double cdos;
    
    VendedorPrincipiante(String id, String nom, String ofi, double cuno, double cdos)throws Exception{
        super(id,nom,ofi);
        setCuno(cuno);
        setCdos(cdos);
    }

    public double calcularProm(){
        return (cuno + cdos) / 2;
    }
    
    public double getCuno(){
        return cuno;
    }
    public void setCuno(double cuno){
        if(cuno >= 0) this.cuno = cuno;
        else this.cuno = 0;
    }
    
    public double getCdos(){
        return cdos;
    }
    public void setCdos(double cdos){
        if(cdos >= 0) this.cdos = cdos;
        else this.cdos = 0;
    }
}
