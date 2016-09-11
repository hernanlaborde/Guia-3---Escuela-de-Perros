
package escuelaperros;


public class Localidad {
    
    private int idLocalidad;
    private String Localidad;

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }


    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String toString(){
        return this.getLocalidad();
    }
}
