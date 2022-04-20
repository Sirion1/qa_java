package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {



    @Test
    public void getSoundReturnsCorrectValueTest() {
        Cat cat = new Cat(new Feline());
        String expectedCatSound = "Мяу";
        String actualCatSound = cat.getSound();
        Assert.assertEquals(expectedCatSound, actualCatSound);
    }

    @Mock
    Feline feline;
    @Test
    public void getFoodReturnCorrectEatMeatTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Трава", "Различные растения"));
        List<String> exceptedGetFood = feline.eatMeat();
        List<String> actualGetFood = cat.getFood() ;
       Assert.assertEquals(exceptedGetFood, actualGetFood);
    }

    @Test
    public void getFoodReturnCorrectFoodListTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> exceptedGetFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFoodList = cat.getFood() ;
        Assert.assertEquals(exceptedGetFoodList, actualGetFoodList);
    }

}
