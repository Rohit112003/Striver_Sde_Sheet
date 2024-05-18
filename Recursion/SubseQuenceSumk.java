package Recursion;

import java.util.ArrayList;

public class SubseQuenceSumk {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        checkSubseQuence(k,arr,list,0,0);

    }

    private static void checkSubseQuence(int k, int[] arr, ArrayList<Integer> list, int i, int sum) {
        if(sum>k){
            return;
        }
        if(i==arr.length){
            if(sum==k){
                System.out.println(list);

            }
            return;
        }

        list.add(arr[i]);
        checkSubseQuence(k,arr, list, i+1, sum+arr[i]);
        list.remove(list.size()-1);
        checkSubseQuence(k,arr,list,i+1,sum);
    }


}
