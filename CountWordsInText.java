import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordsInText {

    public HashMap<String, Integer> countWords(String text) {

        text = text.replaceAll("[!@#$%^&*(){},.;:<>+\\-/=_\\[\\]~]", "");
        String[] wordsInTextWithSpaces = text.split(" ");
        HashMap<String, Integer> wordToCount = new HashMap();

        for(String word : wordsInTextWithSpaces) {
            if(wordToCount.containsKey(word)) {
                wordToCount.put(word, wordToCount.get(word) + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

       /* Set<Map.Entry<String, Integer>> entries = wordToCount.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

        for (String key : wordToCount.keySet()) {
            System.out.println(key + " : " + wordToCount.get(key));
        }

        return wordToCount;
    }
}
