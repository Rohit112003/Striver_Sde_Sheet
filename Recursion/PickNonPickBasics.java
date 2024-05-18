package Recursion;

import java.util.ArrayList;

public class PickNonPickBasics {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        giveSubsequence(arr,list, 0);

    }

    private static void giveSubsequence(int[] arr, ArrayList<Integer> list, int i ) {
        if(i>=arr.length){
            System.out.println(list);
            return;
        }
        giveSubsequence(arr,list,i+1);
        list.add(arr[i]);
        giveSubsequence(arr, list,i+1);
        list.remove(list.size()-1);

    }

}
