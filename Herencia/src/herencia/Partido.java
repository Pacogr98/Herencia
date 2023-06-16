package herencia;

import java.util.Date;
import java.util.Random;

public class Partido {

    private Date fecha;
    private String nombrePabellon;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitro;

    public Partido(Date fecha, String nombrePabellon) {
        this.fecha = fecha;
        this.nombrePabellon = nombrePabellon;
        this.equipoLocal = null;
        this.equipoVisitante = null;
        this.arbitro = null;
    }

    public Partido(Date fecha, String nombrePabellon, Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitro) {
        this.fecha = fecha;
        this.nombrePabellon = nombrePabellon;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.arbitro = arbitro;
    }

    public void aniadirLocal(Equipo local) {
        this.equipoLocal = local;
    }

    public void aniadirVisitante(Equipo visitante) {
        this.equipoVisitante = visitante;
    }

    public void aniadirArbitro(Arbitro nuevo) {
        this.arbitro = nuevo;
    }

    public String jugarPartido() {

        if (this.equipoLocal == null || this.equipoVisitante == null || this.arbitro == null) {
            return "El partido no puede jugarse porque no cumple con las condiciones mínimas.";
        } else {

            for (int i = 0; i < this.equipoLocal.getJugadores().size(); i++) { //incrementamos en 1 los partidos de los jugadores en lista de convocados del equipo local
                this.equipoLocal.getJugadores().get(i).incrementarPartidosJugados();
            }

            for (int i = 0; i < this.equipoVisitante.getJugadores().size(); i++) { //incrementamos en 1 los partidos de los jugadores en lista de convocados del equipo visitante
                this.equipoVisitante.getJugadores().get(i).incrementarPartidosJugados();
            }
        }

        Equipo equipoGanador = (dameVictoria(1, 2) == 1) ? this.equipoLocal : this.equipoVisitante;
        equipoGanador.incrementarVictorias(); //Incrementamos victorias del equipo que gana en 1

        return "El partido se ha disputado y ha ganado el equipo " + equipoGanador.getNombre();
    }

    //Nos dirá si la victoria es local o visitante
    private int dameVictoria(int min, int max) {
        Random random = new Random(); //Os pedirá importar la clase random
        return random.nextInt(max - min + 1) + min;
    }

    //Métodos, getters y setters
    public Date getFecha() {
        return this.fecha;
    }

    public String getNombrePabellon() {
        return this.nombrePabellon;
    }

    public Equipo getEquipoLocal() {
        return this.equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public Arbitro getArbitro() {
        return this.arbitro;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombrePabellon(String nombrePabellon) {
        this.nombrePabellon = nombrePabellon;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

}
