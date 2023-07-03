public class Vendedor
{
 protected final String id;
 private String nombre;
 private String ofi;
 
 public Vendedor (String id, String nombre, String ofi){
 if (id != null) this. id = id;
 else this.id = "";
 setNombre(nombre);
 setOfi(ofi);
 }
 double calcularpromedio(){
return 0;
}
 
public String getid(){
return id;
}
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
if (nombre != null) this.nombre = nombre;
else this.nombre = "";
}
public String getOfi(){
return ofi;
}
public void setOfi(String ofi){
if (ofi != null) this.ofi = ofi;
else this.ofi = "";
}

}
