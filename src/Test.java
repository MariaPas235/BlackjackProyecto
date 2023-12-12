import Model.Bet;
import Model.Deck;
import Model.Player;

import View.Interact;

import static View.Interact.*;

public class Test {
    public static void main(String[] args) {
        Deck deck=new Deck();
        Bet bet= new Bet();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player banca = new Player();


        ImprimirInicio();
        double opcion=0;
        opcion=pedirNumJugadores();
        switch ((int) opcion){
            case 1:
                pedirNombreJugador(player1);
                da2Cartas(player1,deck);
                Imprimir2CartaPlayer(player1,bet);
                ImprimirHucha(player1);
                PedirApuesta(player1,bet);



                break;




            case 2:
                pedirNombreJugador(player1);
                da2Cartas(player1,deck);
                Imprimir2CartaPlayer(player1,bet);
                ImprimirHucha(player1);
                PedirApuesta(player1,bet);






                pedirNombreJugador(player2);
                da2Cartas(player2,deck);
                Imprimir2CartaPlayer(player2,bet);
                ImprimirHucha(player2);
                PedirApuesta(player2,bet);
                break;




            case 3:
                pedirNombreJugador(player1);
                da2Cartas(player1,deck);
                Imprimir2CartaPlayer(player1,bet);
                ImprimirHucha(player1);
                PedirApuesta(player1,bet);





                pedirNombreJugador(player2);
                da2Cartas(player2,deck);
                Imprimir2CartaPlayer(player2,bet);
                ImprimirHucha(player2);
                PedirApuesta(player2,bet);




                pedirNombreJugador(player3);
                da2Cartas(player3,deck);
                Imprimir2CartaPlayer(player3,bet);
                ImprimirHucha(player3);
                PedirApuesta(player3,bet);
                break;





            case 4:
                pedirNombreJugador(player1);
                da2Cartas(player1,deck);
                Imprimir2CartaPlayer(player1,bet);
                ImprimirHucha(player1);
                PedirApuesta(player1,bet);




                pedirNombreJugador(player2);
                da2Cartas(player2,deck);
                Imprimir2CartaPlayer(player2,bet);
                ImprimirHucha(player2);
                PedirApuesta(player2,bet);




                pedirNombreJugador(player3);
                da2Cartas(player3,deck);
                Imprimir2CartaPlayer(player3,bet);
                ImprimirHucha(player3);
                PedirApuesta(player3,bet);




                pedirNombreJugador(player4);
                da2Cartas(player4,deck);
                Imprimir2CartaPlayer(player4,bet);
                ImprimirHucha(player4);
                PedirApuesta(player4,bet);
                break;


        }






    }
}
