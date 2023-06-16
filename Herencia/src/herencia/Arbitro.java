
package herencia;

public class Arbitro extends Persona {
    private double sueldoPorPartido;
    private String especialidad;

    // Constructor
    public Arbitro(String nombre, String direccion, String dni, boolean sexo, double sueldoPorPartido, String especialidad) {
        super(nombre, direccion, dni, sexo);
        this.sueldoPorPartido = (sueldoPorPartido >= 800.0 && sueldoPorPartido <= 1200.0) ? sueldoPorPartido : 914.0; //Si el sueldo está dentro de los rangos de la condición se asigna el sueldo, sino por defecto 914
        setEspecialidad(especialidad.toLowerCase()); //Usamos el set Evitamos codigo redundante
    }

    // Método para validar y asignar la especialidad correcta
    public void setEspecialidad(String especialidad) {
        switch (especialidad.toLowerCase()) {
            case "principal":
            case "auxiliar":
            case "oficial de mesa":
                this.especialidad = especialidad;
                break;
            default:
                this.especialidad = "Auxiliar";
                break;
        }
    }

    // Métodos getters y setters

    public double getSueldoPorPartido() {
        return sueldoPorPartido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setSueldoPorPartido(double sueldoPorPartido) {
        this.sueldoPorPartido = sueldoPorPartido;
    }

    // Método toString
    @Override
    public String toString() {
        String sexoEspecialidad = (super.dameSexo()) ? "Especializado" : "Especializada";
        return super.toString() +
                "\n" + sexoEspecialidad + " como " + this.especialidad + " que cobra " + this.sueldoPorPartido + "€" + " por partido.\n";
    }
}

