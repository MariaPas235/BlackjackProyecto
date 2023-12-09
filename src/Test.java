import Model.Deck;
import Model.Player;

import View.Interact;

import static View.Interact.*;
import static View.Menu.player1;

public class Test {
    public static void main(String[] args) {
        Deck deck=new Deck();
        Player player1 = new Player();




        ImprimirInicio();
        pedirNumJugadores();
        player1.setNamePlayer(pedirNombreJugador1());
        System.out.println(player1.getNamePlayer());
        Imprimir2CartaPlayer(player1);

    }
}
