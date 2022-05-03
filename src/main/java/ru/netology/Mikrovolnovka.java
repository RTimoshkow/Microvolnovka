package ru.netology;

public class Mikrovolnovka {
    private int power;
    private int temperature;
    private Mode modes;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setnextPower() {
        if (power >= 0 && power < 9) {
            power = power + 1;
            return;
        }
        else {
            power = 0;
        }
        return;
    }


}
