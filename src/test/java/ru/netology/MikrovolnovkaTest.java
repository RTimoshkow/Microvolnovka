package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MikrovolnovkaTest {

    Mikrovolnovka mikrovolnovka = new Mikrovolnovka();

    @Test
    public void  shouldtNextPower() {

        mikrovolnovka.setPower(8);
        mikrovolnovka.setNextPower();

        int expected = 0;
        int actual = mikrovolnovka.getPower();

        assertEquals(expected, actual);
    }

    @Test
    public void  shouldPrevPower() {

        mikrovolnovka.setPower(0);
        mikrovolnovka.setPrevPower();

        int expected = 8;
        int actual = mikrovolnovka.getPower();

        assertEquals(expected, actual);
    }
}