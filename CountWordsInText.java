import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordsInText {

    public HashMap<String, Integer> countWords(String text) {

        String[] wordsInTextWithSpaces = text.split("[^a-zA-z]");
        HashMap<String, Integer> wordToCount = new HashMap();
        int count = 0;

        for (int i = 0; i < wordsInTextWithSpaces.length; i++) {

            if (wordsInTextWithSpaces[i].equals("")) {
                continue;
            }

            for (int j = 0; j < wordsInTextWithSpaces.length; j++) {

                if (wordsInTextWithSpaces[j].equals("")) {
                    continue;
                }

                if (wordsInTextWithSpaces[i].equals(wordsInTextWithSpaces[j])) {
                    count++;
                }
            }
            wordToCount.put(wordsInTextWithSpaces[i], count);
            count = 0;
        }

        Set<Map.Entry<String, Integer>> entries = wordToCount.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return wordToCount;
    }
}
