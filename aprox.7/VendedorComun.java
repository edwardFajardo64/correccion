public class VendedorComun extends Vendedor{
    private double cuno;
    private double cdos;
    private double ctres;
    
    VendedorComun(String id, String nom, String ofi, double cuno, double cdos, double ctres)throws Exception{
        super(id, nom, ofi);
        setCuno(cuno);
        setCdos(cdos);
        setCtres(ctres);
    }
    
    public double calcularProm(){
        return (cuno + cdos + ctres) / 3;
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
    
    public double getCtres(){
        return ctres;
    }
    public void setCtres(double ctres){
        if(ctres >= 0) this.ctres = ctres;
        else this.ctres = 0;
    }
    
}
