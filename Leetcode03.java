//Two sum
package Java_Programming;
public class Leetcode03 {
    public int[] twoSum(int[] nums, int target) {
        int ind1=0,ind2=0;
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
        
    }
}
