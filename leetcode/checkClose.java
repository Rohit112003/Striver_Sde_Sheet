package Array;
import java.util.*;
public class checkClose {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2= "abbccc";
        System.out.println(check(word1,word2));
    }

    private static boolean check(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i =0; i<word1.length() ; i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i =0; i<word2.length() ; i++){
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0)+1);
        }
        //for checking key are same or not
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        HashMap<Integer, Integer> freq1 = new HashMap<>();
        HashMap<Integer, Integer> freq2 = new HashMap<>();

        for(int  i : map1.values()){
            freq1.put(i, freq1.getOrDefault(i,0) + 1);
        }
        for(int  i : map2.values()){
            freq2.put(i, freq2.getOrDefault(i,0) + 1);
        }
        if(freq1.equals(freq2)){
            return true;
        }
        return false;
    }
}
