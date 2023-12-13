package Model;
import Model.Player;
import Model.Deck;


public class Game {

    public static double SumarPuntos(Player player){
        double puntosTotales=0;
        Card[]deckplayer=player.getDeckplayer();
        player.getDeckplayer();
        for (int i=0; i<deckplayer.length;i++){
            puntosTotales=puntosTotales+deckplayer[i].getNumberCard();
            player.setSumaPuntos((int) puntosTotales);
        }

        return puntosTotales;

    }





}
