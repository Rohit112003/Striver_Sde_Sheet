package Assignment;
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcd";
        System.out.println(reversePrefix(word, 'z'));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                break;
            }

        }
        if(i==word.length()){
            return word;
        }

        for (int j = i; j >= 0; j--) {
            sb.append(word.charAt(j));
        }

        for (int j = i + 1; j < word.length(); j++) {
            sb.append(word.charAt(j));
        }

        return sb.toString();
    }
}
