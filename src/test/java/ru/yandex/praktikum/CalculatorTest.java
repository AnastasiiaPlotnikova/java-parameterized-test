package ru.yandex.praktikum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        int ar = calc.sum(1, 2);
        int er = 3;
        assertEquals("Результат вычеслений неверен", er, ar);
    }
    }