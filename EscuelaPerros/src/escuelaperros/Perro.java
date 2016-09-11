
package escuelaperros;


public class Perro {
    
        private String Cedula;
        private String Nombre;
        private String Raza;
        private Dueno DuenoPerro;


    public Dueno getDuenoPerro() {
        return DuenoPerro;
    }

    public void setDuenoPerro(Dueno DuenoPerro) {
        this.DuenoPerro = DuenoPerro;
    }



    public String getRaza() {
        return Raza;
    }


    public void setRaza(String Raza) {
        this.Raza = Raza;
    }


    public String getNombre() {
        return Nombre;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }



    public String getCedula() {
        return Cedula;
    }


    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    
}
