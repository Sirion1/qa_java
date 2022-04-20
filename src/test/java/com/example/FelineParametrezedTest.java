package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrezedTest {
    private final int kittensCount;
    private final int kittensCountExpected;

public FelineParametrezedTest (int kittensCount, int kittensCountExpected) {
    this.kittensCount = kittensCount;
    this.kittensCountExpected = kittensCountExpected;
}

    @Parameterized.Parameters
    public static Object[][] getKittenCount() {
        return new Object[][] {
                { 1, 1},
                { 0, 0},
                { 42, 42},
        };
    }

    @Test
    public void shouldBeKittenCount() {
    Feline feline = new Feline();
    int actual = kittensCount;
    int expected = kittensCountExpected;
    Assert.assertEquals(kittensCount, kittensCountExpected);
    }
}