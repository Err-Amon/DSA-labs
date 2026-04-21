import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length+nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
public class lcode{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an index of array : ");
      int index = sc.nextInt();
      int[] nums = new int[index];
      System.out.println("Enter elements of an array : ");
      for(int i =0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      Solution s = new Solution();
      System.out.println("Array before concat : "+Arrays.toString(nums));
      System.out.println("Array after concat : "+Arrays.toString(s.getConcatenation(nums)));

    }
} 
