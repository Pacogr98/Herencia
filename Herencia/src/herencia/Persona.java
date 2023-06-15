package herencia;

public class Persona {
    private String nombre;
    private String direccion;
    private String dni;
    protected boolean sexo; //True chico , False chica

    // Constructor
    public Persona(String nombre, String direccion, String dni, boolean sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.sexo = sexo;
    }

    // Constructor de copia
    public Persona(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.direccion = otraPersona.direccion;
        this.dni = otraPersona.dni;
        this.sexo = otraPersona.sexo;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean dameSexo() {
        return this.sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    // Método toString
    @Override
    public String toString() {
        String genero = (this.sexo) ? "Es un chico" : "Es una chica";  //variable = (condición) ? valor_si_verdadero : valor_si_falso; Así quizás lo entendais mejor
        return this.nombre + " - " + this.dni + "\n" + genero + "\n" + this.direccion+"\n";
    }
}

