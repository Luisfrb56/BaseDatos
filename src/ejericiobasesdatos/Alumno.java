
package ejericiobasesdatos;

import java.sql.*;




public class Alumno {
    private int clave, nota;
    private String nombre;

    public Alumno(int clave, int nota, String nombre) {
        this.clave = clave;
        this.nota = nota;
        this.nombre = nombre;
    }

    public Alumno() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
