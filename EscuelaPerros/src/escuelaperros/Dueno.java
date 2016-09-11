
package escuelaperros;


public class Dueno {
    
    
    private String NumeroIdentificacion;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private Perro perro;
    
    private int idDueno;

    
    public int getIdDueno() {
        return idDueno;
    }


    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }


    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }


    public String getTelefono() {
        return Telefono;
    }


    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }


    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }


    public void setNumeroIdentificacion(String NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

       public String toString(){
        return this.getApellido();
    } 
}
