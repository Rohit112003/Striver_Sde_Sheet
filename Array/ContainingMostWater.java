package Array;

public class ContainingMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containWater(height));
    }

    private static int containWater(int[] height) {
        int i =0;
        int j =height.length-1;
        int area = Integer.MIN_VALUE;
        int sum = 0;
        while(i<j){
            sum = (j-i)*Math.min(height[i], height[j]);
            area = Math.max(area,sum);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return area;
    }
}
