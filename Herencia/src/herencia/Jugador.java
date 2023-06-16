package herencia;

public class Jugador extends Persona {

    private double altura;
    private String posicion;
    private int partidosJugados;
    private boolean estaJugando;

    // Constructor
    public Jugador(String nombre, String direccion, String dni, boolean sexo, double altura, String posicion) {
        super(nombre, direccion, dni, sexo);
        this.altura = (altura > 1.65) ? altura : 1.70; //si la altura es menor a 1.65 se coloca 1.70 por defecto
        setPosicion(posicion); //Usamos el metodo setPosicion y ahoraamos codigo redundante
        this.partidosJugados = 0;
        this.estaJugando = false; //De primeras un jugador no estrá jugando
    }

    // Método para validar y asignar la posición correcta
    public void setPosicion(String posicion) {
        switch (posicion.toLowerCase()) {
            case "base":
            case "escolta":
            case "alero":
            case "ala-pivot":
            case "pivot":
                this.posicion = posicion;
                break;
            default:
                this.posicion = "Alero";
                break;
        }
    }

    // Métodos getters y setters
    public double getAltura() {
        return this.altura;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public boolean isEstaJugando() {
        return this.estaJugando;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void setEstaJugando(boolean estaJugando) {
        this.estaJugando = estaJugando;
    }

    // Método jugando
    public String jugando() {
        incrementarPartidosJugados();
        String mensajeJugando = (this.estaJugando) ? "está jugando." : "no está jugando.";
        String genero = (super.dameSexo()) ? "Es un chico" : "Es una chica";
        String jugadorOjugadora = (super.dameSexo()) ? "Jugador" : "Jugadora";

        return "El "+ jugadorOjugadora + " " + getNombre() + " " + mensajeJugando + "\n";
    }
    
    //Incrementa en 1 los partidos jugados
    public void incrementarPartidosJugados() {
        this.partidosJugados++;
    }

    // Método toString
    @Override
    public String toString() {
        String genero = (super.dameSexo()) ? "Es un chico" : "Es una chica";
        String jugadorOjugadora = (super.dameSexo()) ? "Jugador" : "Jugadora";
        String jugandoActualmente = (this.estaJugando) ? "Ahora mismo está jugando." : "Ahora mismo no está jugando.";

        return  super.getNombre() + " - " + super.getDni().toUpperCase()
                + "\n" + genero
                + "\n" + super.getDireccion()
                + "\nAltura: " + this.altura
                + "\nSu posicion es: " + this.posicion
                + "\n"+jugadorOjugadora + " en " + this.partidosJugados + " partidos"
                + "\n" + jugandoActualmente + "\n";
    }
}
