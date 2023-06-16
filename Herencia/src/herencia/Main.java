
package herencia;

import java.util.Date;


public class Main {

    public static void main(String[] args) {
        
        //PARA TEAM1
        Jugador player1 = new Jugador("Pau","C/Villanueva del trabuco", "87622537G",true,2.07,"alero");
        Jugador player2 = new Jugador("Rober","C/San Julian", "37465110h",true,2.07,"pivot");
        Jugador player3 = new Jugador("Rupa","C/Riviera", "22449917j",true,2.07,"escolta");
        Jugador player4 = new Jugador("Niki","C/Nogaleza", "19567113f",true,2.07,"hfriouhf");
        Jugador player5 = new Jugador("Luis","C/Perales, 16", "58304576G",true,2.07,"alero");
        Jugador player6 = new Jugador("Alberto","C/Nuzas", "85743869h",true,2.07,"pivot");
        Jugador player7 = new Jugador("Kini","C/Malasaña", "24447549j",true,2.07,"escolta");
        Jugador player8 = new Jugador("Sebas","C/Los rubiales", "33888445f",true,2.07,"hfriouhf");
        
        //PARA TEAM 2
        Jugador player9 = new Jugador("Suso","C/Cantautor", "87622537G",true,2.07,"alero");
        Jugador player10 = new Jugador("Leo","C/Bestrino", "37465110h",true,2.07,"pivot");
        Jugador player11 = new Jugador("Mohamed","C/Clavelito", "22449917j",true,2.07,"escolta");
        Jugador player12 = new Jugador("Lauro","C/Pirañas", "19567113f",true,2.07,"hfriouhf");
        Jugador player13 = new Jugador("Enrique","C/Juan mostoza", "58304576G",true,2.07,"alero");
        Jugador player14 = new Jugador("Ignacio","C/Pastores", "85743869h",true,2.07,"pivot");
        Jugador player15 = new Jugador("Guillermo","C/Arnau", "24447549j",true,2.07,"escolta");
        Jugador player16 = new Jugador("Rodri","C/Casteñon de mena", "33888445f",true,2.07,"hfriouhf");
        
        //Arbitro
        Arbitro arbitrucho = new Arbitro("Isa","Los prados","22993746T",false,1025,"PRINCIPAL");
        System.out.println(arbitrucho.toString());
        
        //Creamos los equipos
        Equipo team1 = new Equipo("Málaga C.F.",1978,16000,8);
        Equipo team2 = new Equipo("Sevilla F.C.",1968,22000,8);
        
        //Añadimos equipo 1
        System.out.println(team1.aniadirJugador(player1));
        System.out.println(team1.aniadirJugador(player2));
        System.out.println(team1.aniadirJugador(player3));
        System.out.println(team1.aniadirJugador(player4));
        System.out.println(team1.aniadirJugador(player5));
        System.out.println(team1.aniadirJugador(player6));
        System.out.println(team1.aniadirJugador(player7));
        System.out.println(team1.aniadirJugador(player8));
        
        System.out.println(team1.toString()); //datos equipo 1
        
        
        //Añadimos equipo 2
        System.out.println(team2.aniadirJugador(player9));
        System.out.println(team2.aniadirJugador(player10));
        System.out.println(team2.aniadirJugador(player11));
        System.out.println(team2.aniadirJugador(player12));
        System.out.println(team2.aniadirJugador(player13));
        System.out.println(team2.aniadirJugador(player14));
        System.out.println(team2.aniadirJugador(player15));
        System.out.println(team2.aniadirJugador(player16));
        
        System.out.println(team2.toString()); //datos equipo 1
        
        //Creamos el partido
        Date fechaPartido = new Date();
        Partido partido = new Partido(fechaPartido,"Martin Carpena",team1,team2,arbitrucho);
        System.out.println(partido.jugarPartido());
        
        //para ver cambios
        System.out.println(team1.toString()); //datos equipo 1
        System.out.println(team2.toString()); //datos equipo 1
    }

}
