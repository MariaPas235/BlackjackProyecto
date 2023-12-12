package Model;

import java.util.Objects;

public class Bet {

    private double dineroGlobalApostado;

    public Bet(double dineroGlobalApostado) {
        this.dineroGlobalApostado = dineroGlobalApostado;
    }
    public Bet(){
        this(0);
    }

    public double getDineroGlobalApostado() {
        return dineroGlobalApostado;
    }

    public void setDineroGlobalApostado(double dineroGlobalApostado) {
        this.dineroGlobalApostado = dineroGlobalApostado;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "dineroGlobalApostado=" + dineroGlobalApostado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return Double.compare(dineroGlobalApostado, bet.dineroGlobalApostado) == 0;
    }


}
