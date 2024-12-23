package com.oibsip;
import java.lang.Math;
public class NumberGuesser {
    private static Integer guessedNumber;
    private static Integer secretNumber;
    public static void setNumber(Integer number){
        guessedNumber = number;
    }

    public static Integer getGuessedNumber(){
        return guessedNumber;
    }

    public static void randomNumber(){
        secretNumber = (int)(Math.random()*100) + 1;
    } 

    public static Integer getSecretNumber(){
        return secretNumber;
    }
}
