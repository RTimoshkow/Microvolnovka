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
        return;
    }

    public void setNextPower() {
        if (power >= 0 && power < 8) {
            power = power + 1;
            return;
        }
        else {
            power = 0;
        }
        return;
    }

    public void setPrevPower() {
        if (power > 0 && power <= 8) {
            power = power - 1;
            return;
        }
        else {
            power = 8;
        }
        return;
    }
}
