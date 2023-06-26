public class Edificio
{
    private final String nit;
    private String nombreEdificio;
    private String direccion;
    private VendedorPrincipiante[] vendedor1;
    private VendedorComun[] vendedor2;
    private VendedorAvanzado[] vendedor3;    
    private int numVendedores1;
    private int numVendedores2;
    private int numVendedores3;    
    
    public Edificio(String nit,String nombreEdificio,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreEdificio(nombreEdificio);
        setDireccion(direccion);        
        vendedor1 = new VendedorPrincipiante[50];
        vendedor2 = new VendedorComun[50];
        vendedor3 = new VendedorAvanzado[50];        
        numVendedores1 = 0;
        numVendedores2 = 0;
        numVendedores3 = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreEdificio(){
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio){
        if(nombreEdificio != null){
            this.nombreEdificio = nombreEdificio;
        }else{
            this.nombreEdificio = "";
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
    
    public int getNumVendedores1(){
        return numVendedores1;
    }
    
    public int getNumVendedores2(){
        return numVendedores2;
    }
    
    public int getNumVendedores3(){
        return numVendedores3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores1; i++){
            promedio = promedio + vendedor1[i].calcularPromedio() / numVendedores1;
        }
        for(int i = 0; i < numVendedores2; i++){
            promedio = promedio + vendedor2[i].calcularPromedio() / numVendedores2;
        }
        for(int i = 0; i < numVendedores3; i++){
            promedio = promedio + vendedor3[i].calcularPromedio() / numVendedores3;
        }
        return promedio / 3;
    }
    public void adicionarVendedorPrincipiante(String identificacion, String nombre, String oficina, double caliuno, double calidos){
        vendedor1[numVendedores1] = new VendedorPrincipiante(identificacion, nombre, oficina, caliuno, calidos);
        numVendedores1++;
    }
    
    public void adicionarVendedorComun(String identificacion, String nombre, String oficina, double caliuno, double calidos, double calitres){
        vendedor2[numVendedores2] = new VendedorComun(identificacion, nombre, oficina, caliuno, calidos, calitres);
        numVendedores2++;
    }
    
    public void adicionarEstudianteTecnico(String identificacion, String nombre, String oficina, double caliuno, double calidos, double calitres, double calicuatro){
        vendedor3[numVendedores3] = new VendedorAvanzado(identificacion, nombre, oficina, caliuno, calidos, calitres, calicuatro);
        numVendedores3++;
    }
}    