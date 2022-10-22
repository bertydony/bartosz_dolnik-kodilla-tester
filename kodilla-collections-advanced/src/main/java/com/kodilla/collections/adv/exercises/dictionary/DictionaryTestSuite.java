package com.kodilla.collections.adv.exercises.dictionary;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    public void testAddWord(){
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        dictionary.addWord(polishWord, englishWord);
        assertEquals(1, dictionary.size());
    }
}