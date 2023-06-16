package herencia;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private int anoFundacion;
    private int victorias;
    private double presupuesto;
    private List<Jugador> jugadores; //Se puede hacer con un array, pero con arraylist considero que es mejor en este caso para hacerla dinamica
    private int maxJugadores;

    // Constructor
    public Equipo(String nombre, int anoFundacion, double presupuesto, int maxJugadores) {
        this.nombre = nombre;
        this.anoFundacion = anoFundacion;
        this.presupuesto = (presupuesto > 19700.0) ? presupuesto : 20000;
        this.victorias = 0;
        this.maxJugadores = (maxJugadores >= 6 && maxJugadores <= 12) ? maxJugadores : 8;
        this.jugadores = new ArrayList<>();
    }

    // Método PRIVADO para verificar si hay espacio para nuevos jugadores en el equipo
    private boolean inscripcion() {
        return jugadores.size() < this.maxJugadores; //si el tamañano del arraylist es menor al de jugadores true, sino false
    }

    // Método PRIVADO para verificar si un jugador está en el equipo
    private boolean enEquipo(Jugador player) {
        return jugadores.contains(player); //True si el jugador está en el equipo, false si no lo está
    }

    // Método para añadir un jugador al equipo
    public String aniadirJugador(Jugador nuevo) {
        if (inscripcion() && !enEquipo(nuevo)) {  //Aquí usamos los metodos privados combinados para saber si se cumplen los requisitos para añadir un jugador a la lista
            jugadores.add(nuevo);
            return "El jugador " + nuevo.getNombre() + " ha sido añadido al equipo.";
        } else {
            return "No se pudo añadir al jugador " + nuevo.getNombre() + " al equipo.";
        }
    }

    // Método para eliminar un jugador del equipo
    public String eliminarJugador(Jugador borrar) {
        if (enEquipo(borrar)) { //Si está en el equipo se borra, sino pues obviamente no se puede :)
            jugadores.remove(borrar);
            return "El jugador " + borrar.getNombre() + " ha sido eliminado del equipo.";
        } else {
            return "No se pudo eliminar al jugador " + borrar.getNombre() + " del equipo.";
        }
    }
    
    //Incrementa en 1 las victorias
    public void incrementarVictorias() {
        this.victorias++;
    }

    // Métodos getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoFundacion() {
        return this.anoFundacion;
    }

    public void setAnoFundacion(int anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    public int getVictorias() {
        return this.victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getMaxJugadores() {
        return this.maxJugadores;
    }

    public void setMaxJugadores(int maxJugadores) {
        this.maxJugadores = maxJugadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //RECORDEMOS!! StringBuilder proporciona métodos para agregar, insertar y manipular texto en una secuencia mutable. Podéis usar Insert también!
        sb.append("\n").append(this.nombre).append("\n");
        sb.append("Fundado en ").append(this.anoFundacion).append(". Con ").append(this.presupuesto).append("€ de presupuesto actual.\n");
        sb.append("Victorias: ").append(this.victorias).append(".\n");
        sb.append("Integrantes del equipo:\n");
        sb.append("==============================\n");

        for (Jugador jugador : this.jugadores) { //Sintaxis para recorrer un arrayList
            sb.append(jugador.toString()).append("\n"); //Vamos mostrando los datos de todos los jugadores del equipo
            sb.append("-----------------------------------\n");
        }
        return sb.toString();
    }

}
