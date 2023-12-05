package Model;

public class Player {
    private String namePlayer;

    private double money;

    public Player(String namePlayer, double money) {
        this.namePlayer = namePlayer;
        this.money = money;
    }

    public Player(){
        this(" ",0);
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Player{" +
                "namePlayer='" + namePlayer + '\'' +
                ", money=" + money +
                '}';
    }
}
