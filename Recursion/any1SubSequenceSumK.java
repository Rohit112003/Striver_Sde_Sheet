package Recursion;

import java.util.ArrayList;

public class any1SubSequenceSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k =2;
        ArrayList<Integer> list = new ArrayList<>();
        subSquence(arr,k,list,0,0);
    }

    private static boolean subSquence(int[] arr, int k, ArrayList<Integer> list, int i, int sum) {
        if(sum>k){
            return false;
        }
        if(i==arr.length){
            if(sum==k){
                System.out.println(list);
                return true;

            }
            return false;
        }
        list.add(arr[i]);
        if(subSquence(arr,k, list,i+1,sum+arr[i]) == true){
            return true;
        }
        list.remove(list.size()-1);
        if(subSquence(arr,k,list,i+1,sum)==true){
            return true;
        }

        return false;

    }

}
