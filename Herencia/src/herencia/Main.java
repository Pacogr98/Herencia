
package herencia;


public class Main {

    public static void main(String[] args) {
        
        Jugador player1 = new Jugador("Pau","Villanueva del trabuco", "87622537G",true,2.07,"alero");
        System.out.println(player1.jugando());
        System.out.println(player1.toString());
    }

}
