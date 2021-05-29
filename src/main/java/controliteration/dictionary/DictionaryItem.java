package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryItem {

    private String word;
    private List<String> translations;

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        this.translations = new ArrayList<>(translations);
    }

    public void addTranslations(List<String> translations) {
        for (String s: translations) {
            if (!this.translations.contains(s)) {
                this.translations.add(s);
            }
        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("table");
        DictionaryItem di = new DictionaryItem("asztal", words);
       di.addTranslations(Arrays.asList("desc"));
    }
}
