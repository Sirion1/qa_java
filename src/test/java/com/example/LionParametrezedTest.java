package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrezedTest {
    private final String sexLion;
    private final boolean expectedLion;

    public LionParametrezedTest (String sexLion, boolean expectedLion) {
        this.sexLion = sexLion;
        this.expectedLion = expectedLion;
    }
    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
              //{ "Чубака", false },
        };
    }

    @Test
    public void sexLionParametrezedTest() throws Exception {
        Lion lion = new Lion (new Feline(), sexLion);
        boolean actual = lion.hasMane;
        Assert.assertEquals(expectedLion, actual);
    }
}
