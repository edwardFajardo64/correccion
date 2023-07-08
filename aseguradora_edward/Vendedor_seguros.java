 public class Vendedor_seguros {
    private int numero;
    private String cedula;
    private String apellido;
    private String oficina;
    private double primerareseña;
    private double segundareseña;
    private double tercerareseña;

    public Vendedor_seguros(int numero, String cedula, String apellido, String oficina, double primerareseña, double segundareseña, double tercerareseña) {
        this.numero = numero;
        this.cedula = cedula;
        this.apellido = apellido;
        this.oficina = oficina;
        this.primerareseña = primerareseña;
        this.segundareseña = segundareseña;
        this.tercerareseña = tercerareseña;
    }
    
    public Vendedor_seguros(String cedula, String apellido, String oficina, double primerareseña, double segundareseña, double tercerareseña) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.oficina = oficina;
        this.primerareseña = primerareseña;
        this.segundareseña = segundareseña;
        this.tercerareseña = tercerareseña;
    }

    public int getnumero() {
        return numero;
    }

    public String getcedula() {
        return cedula;
    }

    public String getapellido() {
        return apellido;
    }

    public String getoficina() {
        return oficina;
    }

    public double getprimerareseña() {
        return primerareseña;
    }

    public double getsegundareseña() {
        return segundareseña;
    }

    public double gettercerareseña() {
        return tercerareseña;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public void setoficina(String oficina) {
        this.oficina = oficina;
    }

    public void setprimerareseña(double primerareseña) {
        this.primerareseña = primerareseña;
    }

    public void setsegundareseña(double segundareseña) {
        this.segundareseña = segundareseña;
    }

    public void settercerareseña(double tercerareseña) {
        this.tercerareseña = tercerareseña;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nnumero: ").append(numero)
          .append("\ncedula: ").append(cedula)
          .append("\napellido: ").append(apellido)
          .append("\noficina: ").append(oficina)
          .append("\nprimera reseña: ").append(primerareseña)
          .append("\nsegunda reseña: ").append(segundareseña)
          .append("\ntercera reseña: ").append(tercerareseña);
        return sb.toString();
    }
}