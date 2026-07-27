package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class FlashcardData {
    public static List<Flashcard> getSampleFlashcards(){
        List<Flashcard> list = new ArrayList<>();
        list.add(new Flashcard("What is the capital of Mexico?", "Mexico City"));
        list.add(new Flashcard("How many states are in Mexico ?", "32"));
        list.add(new Flashcard("On what date is Mexico's Independence Day celebrated?", "September 16th"));
        list.add(new Flashcard("What is the biggest state in Mexico?", "Chihuahua"));
        list.add(new Flashcard("What is the highest volcano in Mexico?", "Pico de Orizaba (Citlaltépetl)"));
        list.add(new Flashcard("Which pre-Hispanic civilization built Chichén Itzá?", "The Maya"));
        list.add(new Flashcard("What is the most widely spoken language in Mexico?", "Spanish"));
        list.add(new Flashcard("Which sea borders the Yucatán Peninsula?", "The Caribbean Sea"));
        list.add(new Flashcard("Who gave the \"Grito de Dolores\" in 1810?", "Miguel Hidalgo y Costilla"));
        list.add(new Flashcard("What animal is shown devouring a snake on Mexico's national coat of arms?", "A golden eagle"));
        return list;
    }
}
