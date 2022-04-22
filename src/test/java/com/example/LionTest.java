package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeInputManOfLionTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean expectedManOfLionTest = true;
        boolean actualManOfLionTest = lion.hasMane;
        Assert.assertEquals(actualManOfLionTest, expectedManOfLionTest);
    }

    @Test
    public void doesHaveManeInputWomanOfLionTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean expectedWomanOfLionTest = false;
        boolean actualWomanOfLionTest = lion.hasMane;
        Assert.assertEquals(actualWomanOfLionTest, expectedWomanOfLionTest);
    }

    @Test(expected= Exception.class)
    public void shouldHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion(feline, "Чубака");
        lion.doesHaveMane();
    }

    @Test
    public void getKittens() throws Exception{
        Lion lion = new Lion (feline, "Самка");
        int expectedGetKittensValueTest = 36;
        Mockito.when(lion.getKittens()).thenReturn(36);
        int actualGetKittensValueTest = lion.getKittens();
        assertEquals(expectedGetKittensValueTest, actualGetKittensValueTest);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        List<String> exceptedGetFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFoodList = lion.getFood() ;
        Assert.assertEquals(exceptedGetFoodList, actualGetFoodList);
    }
}