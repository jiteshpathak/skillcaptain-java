import java.util.HashMap;
import java.util.Map;
public class hashMaps {
                public static void main(String[] args) {
                    Map<String, Integer> wordCountMap = new HashMap<>();
                    String str = "The quick brown fox jumps over the lazy dog. The dog barks loudly";
                    String[] words = str.split(" ");
                    for (String word: words){
                        word = word.toLowerCase();
                       Integer count = wordCountMap.get(word); 
                    if (count == null){
                        wordCountMap.put(word,1);
                    }
                    else{
                        wordCountMap.put(word, count + 1);
                    }
                }
                System.out.println(wordCountMap);
            }
}