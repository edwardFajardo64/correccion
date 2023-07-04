public abstract class Vendedor{
    protected final String id;
    private String nom;
    private String ofi;
    
    public Vendedor(String id, String nom, String ofi)throws Exception{
        if(id.trim().equals(""))
            throw new Exception("valor invalido en la identificacion");
        
        if(id.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.id = id;
        setNom(nom);
        setOfi(ofi);
        
    }
    
    public abstract double calcularProm();
    
    public String getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        if(nom != null) this.nom = nom;
        else this.nom = "";
    }
    
    public String getOfi(){
        return ofi;
    }
    public void setOfi(String ofi){
        if(ofi != null) this.ofi = ofi;
        else this.ofi = "";
    }
    
}
