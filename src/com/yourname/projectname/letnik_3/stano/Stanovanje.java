package com.yourname.projectname.letnik_3.stano;

public class Stanovanje {

    private double velikostX;
    private double velikostY;
    private double vrednost;
    private int opremljenost;
    private int okolica;

    public Stanovanje(double velikostX, double velikostY, double vrednost, int opremljenost, int okolica) {
        this.velikostX = velikostX;
        this.velikostY = velikostY;
        this.vrednost = vrednost;
        this.opremljenost = opremljenost;
        this.okolica = okolica;
    }

    public double getPovrsina() {
        return velikostX * velikostY;
    }

    public double getVelikostX() {
        return velikostX;
    }

    public void setVelikostX(double velikostX) {
        this.velikostX = velikostX;
    }

    public double getVelikostY() {
        return velikostY;
    }

    public void setVelikostY(double velikostY) {
        this.velikostY = velikostY;
    }

    public double getVrednost() {
        return vrednost;
    }

    public void setVrednost(double vrednost) {
        this.vrednost = vrednost;
    }

    public int getOpremljenost() {
        return opremljenost;
    }

    public void setOpremljenost(int opremljenost) {
        this.opremljenost = opremljenost;
    }

    public int getOkolica() {
        return okolica;
    }

    public void setOkolica(int okolica) {
        this.okolica = okolica;
    }
}
