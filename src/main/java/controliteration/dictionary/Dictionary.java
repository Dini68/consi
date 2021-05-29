package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        int i = -1;
        int index = -1;
        for (DictionaryItem d: dictionaryItems) {
            i++;
            if (d.getWord().equals(word)) {
                index = i;
            }
        }
        if (index != -1) {
            dictionaryItems.get(index).addTranslations(translations);
        } else {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
    }

    public List<String> findTranslations(String word) {
        for (DictionaryItem d: dictionaryItems) {
            if (d.getWord().equals(word)) {
                return d.getTranslations();
            }
        }
        return new ArrayList<>();
    }

}
