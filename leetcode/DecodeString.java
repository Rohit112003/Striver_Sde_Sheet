package Stack;
import java.util.*;
public class DecodeString {
    public static void main(String[] args) {

        String value = "3[a]2[bc]";
        System.out.println( decodeString(value));

    }
    public static String decodeString(String value){
        Stack<String> st = new Stack<>();
        Stack<Integer> intst = new Stack<>();
        int currnum = 0;
        String currString = "";
        for(int i =0 ; i<value.length() ; i++){
            if(value.charAt(i)=='['){
                st.push(currString);
                intst.push(currnum);
                currnum = 0;
                currString = "";
            }
            else if(Character.isDigit(value.charAt(i))){
                currnum = currnum * 10 + (value.charAt(i) - '0');
            }
            else if(value.charAt(i)==']'){
                int num = intst.pop();
                String prevString = st.pop();
                StringBuilder sb = new StringBuilder();
                sb.append(prevString);
                for(int j= 0; j<num ; j++){
                    sb.append(currString);
                }
                currString = sb.toString();
            }
            else{
                currString+=value.charAt(i);
            }
        }
        return currString;

    }
}
