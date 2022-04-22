package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Animal animal;

    @Test
    public void eatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeatFelineTest = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeatFelineTest = feline.eatMeat() ;
        Assert.assertEquals(expectedEatMeatFelineTest, actualEatMeatFelineTest);
    }

    @Test
    public void getFamilyFelineTest() {
        Feline feline = new Feline();
        String expectedFamilyFeline = "Кошачьи";
        String actualFamilyFeline = feline.getFamily();
        Assert.assertEquals(expectedFamilyFeline, actualFamilyFeline);
    }

    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int expectedGetKittensCountTest = 1;
        int actualGetKittensCountTest = feline.getKittens(1);
        Assert.assertEquals(expectedGetKittensCountTest, actualGetKittensCountTest);
    }

    @Test
    public void getKittensNoCountTest() {
        Feline feline = new Feline();
        int expectedGetKittensNoCountTest = 1;
        int actualGetKittensNoCountTest = feline.getKittens();
        Assert.assertEquals(expectedGetKittensNoCountTest, actualGetKittensNoCountTest);
    }
}