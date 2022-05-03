package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MikrovolnovkaTest {

    Mikrovolnovka mikrovolnovka = new Mikrovolnovka();

    @Test
    public void setnextPower() {

        mikrovolnovka.setPower(3);
        mikrovolnovka.setnextPower();

        int expected = 4;
        int actual = mikrovolnovka.getPower();

        assertEquals(expected, actual);
    }
}