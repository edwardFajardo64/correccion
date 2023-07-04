public class VendedorAvanzado extends Vendedor{
    private double cuno;
    private double cdos;
    private double ctres;
    private double ccuatro;
    
    VendedorAvanzado(String id, String nom, String ofi, double cuno, double cdos, double ctres, double ccuatro)throws Exception{
        super(id, nom, ofi);
        setCuno(cuno);
        setCdos(cdos);
        setCtres(ctres);
        setCcuatro(ccuatro);        
    }
    
    public double calcularProm(){
        return (cuno + cdos + ctres + ccuatro) / 4;
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
    
    public double getCcuatro(){
        return ccuatro;
    }
    public void setCcuatro(double ccuatro){
        if(ccuatro >= 0) this.ccuatro = ccuatro;
        else this.ccuatro = 0;
    }
    
}


