package com.example;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public interface Predator {

    List<String> eatMeat() throws Exception;

}
