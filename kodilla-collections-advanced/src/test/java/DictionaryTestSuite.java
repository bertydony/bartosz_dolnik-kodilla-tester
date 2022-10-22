import com.kodilla.collections.adv.exercises.dictionary.Dictionary;
import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class DictionaryTestSuite {
        @Test
        public void testAddWord(){
            Dictionary dictionary = new Dictionary();
            String polishWord = "stos";
            EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
            dictionary.addWord(polishWord, englishWord);
            assertEquals(1, dictionary.size());
        }
}
