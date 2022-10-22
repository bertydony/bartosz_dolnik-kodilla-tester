package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {

    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return Collections.emptyList();
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        return Collections.emptyList();
    }
    public int size() {
        return dictionary.size();
    }
}

