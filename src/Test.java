import Model.*;

import View.Interact;

import static Model.Game.SumarPuntos;
import static View.Controller.*;
import static View.Interact.*;

public class Test {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Bet bet = new Bet();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player banca = new Player("Banca");

        ImprimirInicio();
        double opcion = 0;
        opcion = pedirNumJugadores();
        switch ((int) opcion) {
            case 1:
                pedirNombreJugador(player1);
                da2Cartas(player1, deck);
                ajustarValores(player1);
                Imprimir2CartaPlayer(player1, bet);
                ImprimirHucha(player1);
                PedirApuesta(player1, bet);
                ImprimirHucha(player1);
                double eleccion1 = 0;
                do {

                    eleccion1 = Elegircartas();
                    switch ((int) eleccion1) {
                        case 1:
                            daNuevaCarta(player1, deck);
                            ajustarValores(player1);
                            ImprimirNuevasCartas(player1, bet);
                            if (SumarPuntos(player1) >= 21) {
                                eleccion1 = 2;
                            }
                            break;
                        case 2:
                            System.out.println("Ha finalizado tu turno");
                            break;
                    }

                } while (eleccion1 != 2);

                jugarBanca(deck, player1.getSumaPuntos(), banca);

                Player[] ganador = {player1, banca};
                Player ganadores = sacarGanador(ganador);
                DarPremio1jugador(bet, ganadores);


                break;


            case 2:
                pedirNombreJugador(player1);
                da2Cartas(player1, deck);
                ajustarValores(player1);
                Imprimir2CartaPlayer(player1, bet);
                ImprimirHucha(player1);
                PedirApuesta(player1, bet);
                ImprimirHucha(player1);
                double eleccion2 = 0;
                do {

                    eleccion2 = Elegircartas();
                    switch ((int) eleccion2) {
                        case 1:
                            daNuevaCarta(player1, deck);
                            ajustarValores(player1);
                            ImprimirNuevasCartas(player1, bet);
                            if (SumarPuntos(player1) >= 21) {
                                eleccion2 = 2;
                            }
                            break;
                        case 2:
                            System.out.println("Ha finalizado tu turno");
                            break;
                    }

                } while (eleccion2 != 2);


                pedirNombreJugador(player2);
                da2Cartas(player2, deck);
                ajustarValores(player2);
                SumarPuntos(player2);
                Imprimir2CartaPlayer(player2, bet);
                ImprimirHucha(player2);
                PedirApuesta(player2, bet);
                ImprimirHucha(player2);

                do {

                    eleccion2 = Elegircartas();
                    switch ((int) eleccion2) {
                        case 1:
                            daNuevaCarta(player2, deck);
                            ajustarValores(player2);
                            SumarPuntos(player2);
                            ImprimirNuevasCartas(player2, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player2.getSumaPuntos() < 21 || eleccion2 != 2);

                Player winner[] = {player1, player2};
                Player winnevsr = comprobarVSBanca(winner);

                jugarBanca(deck, winnevsr.getSumaPuntos(), banca);


                break;


            case 3:
                pedirNombreJugador(player1);
                da2Cartas(player1, deck);
                ajustarValores(player1);
                SumarPuntos(player1);
                Imprimir2CartaPlayer(player1, bet);
                ImprimirHucha(player1);
                PedirApuesta(player1, bet);
                ImprimirHucha(player1);
                double eleccion3 = 0;
                do {

                    eleccion3 = Elegircartas();
                    switch ((int) eleccion3) {
                        case 1:
                            daNuevaCarta(player1, deck);
                            ajustarValores(player1);
                            SumarPuntos(player1);
                            ImprimirNuevasCartas(player1, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player1.getSumaPuntos() < 21 || eleccion3 != 2);


                pedirNombreJugador(player2);
                da2Cartas(player2, deck);
                ajustarValores(player2);
                SumarPuntos(player2);
                Imprimir2CartaPlayer(player2, bet);
                ImprimirHucha(player2);
                PedirApuesta(player2, bet);
                ImprimirHucha(player2);

                do {

                    eleccion3 = Elegircartas();
                    switch ((int) eleccion3) {
                        case 1:
                            daNuevaCarta(player2, deck);
                            ajustarValores(player2);
                            SumarPuntos(player2);
                            ImprimirNuevasCartas(player2, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player2.getSumaPuntos() < 21 || eleccion3 != 2);


                pedirNombreJugador(player3);
                da2Cartas(player3, deck);
                ajustarValores(player3);
                SumarPuntos(player3);
                Imprimir2CartaPlayer(player3, bet);
                ImprimirHucha(player3);
                PedirApuesta(player3, bet);
                ImprimirHucha(player3);

                do {

                    eleccion3 = Elegircartas();
                    switch ((int) eleccion3) {
                        case 1:
                            daNuevaCarta(player3, deck);
                            ajustarValores(player3);
                            SumarPuntos(player3);
                            ImprimirNuevasCartas(player3, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player3.getSumaPuntos() < 21 || eleccion3 != 2);

                Player winner2[] = {player1, player2};
                Player winnevsr2 = comprobarVSBanca(winner2);
                jugarBanca(deck, player1.getSumaPuntos(), banca);


            case 4:
                pedirNombreJugador(player1);
                da2Cartas(player1, deck);
                ajustarValores(player1);
                SumarPuntos(player1);
                Imprimir2CartaPlayer(player1, bet);
                ImprimirHucha(player1);
                PedirApuesta(player1, bet);
                ImprimirHucha(player1);
                double eleccion4 = 0;
                do {

                    eleccion4 = Elegircartas();
                    switch ((int) eleccion4) {
                        case 1:
                            daNuevaCarta(player1, deck);
                            ajustarValores(player1);
                            SumarPuntos(player1);
                            ImprimirNuevasCartas(player1, bet);
                            break;
                        case 2:
                            System.out.println("Su turno ha terminado");
                            break;
                    }

                } while (player1.getSumaPuntos() < 21 && eleccion4 != 2);


                pedirNombreJugador(player2);
                da2Cartas(player2, deck);
                ajustarValores(player2);
                SumarPuntos(player2);
                Imprimir2CartaPlayer(player2, bet);
                ImprimirHucha(player2);
                PedirApuesta(player2, bet);
                ImprimirHucha(player2);

                do {

                    eleccion4 = Elegircartas();
                    switch ((int) eleccion4) {
                        case 1:
                            daNuevaCarta(player2, deck);
                            ajustarValores(player2);
                            SumarPuntos(player2);
                            ImprimirNuevasCartas(player2, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player2.getSumaPuntos() < 21 && eleccion4 != 2);


                pedirNombreJugador(player3);
                da2Cartas(player3, deck);
                ajustarValores(player3);
                SumarPuntos(player3);
                Imprimir2CartaPlayer(player3, bet);
                ImprimirHucha(player3);
                PedirApuesta(player3, bet);
                ImprimirHucha(player3);

                do {

                    eleccion4 = Elegircartas();
                    switch ((int) eleccion4) {
                        case 1:
                            daNuevaCarta(player3, deck);
                            ajustarValores(player3);
                            SumarPuntos(player3);
                            ImprimirNuevasCartas(player3, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player3.getSumaPuntos() < 21 && eleccion4 != 2);


                pedirNombreJugador(player4);
                da2Cartas(player4, deck);
                ajustarValores(player4);
                SumarPuntos(player4);
                Imprimir2CartaPlayer(player4, bet);
                ImprimirHucha(player4);
                PedirApuesta(player4, bet);
                ImprimirHucha(player4);

                do {

                    eleccion4 = Elegircartas();
                    switch ((int) eleccion4) {
                        case 1:
                            daNuevaCarta(player4, deck);
                            ajustarValores(player4);
                            SumarPuntos(player4);
                            ImprimirNuevasCartas(player4, bet);
                            break;
                        case 2:
                            break;
                    }

                } while (player4.getSumaPuntos() < 21 && eleccion4 != 2);

                Player winner3[] = {player1, player2};
                Player winnevsr3 = comprobarVSBanca(winner3);
                jugarBanca(deck, player1.getSumaPuntos(), banca);
                break;


        }


    }
}
