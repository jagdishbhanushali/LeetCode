import java.util.Arrays;

/**
 * Created by jagdish on 12/21/2016.
 * https://leetcode.com/problems/two-sum/
 */
public class Sum2 {
    public static void main (String args[]){
        int[] nums={2,7,11,15};
        int target=9;

        Sum2 s= new Sum2();
        int[] result=s.twoSum(nums,target);

        System.out.println("Result (Array's index)-> "+Arrays.toString(result));
    }
        public int[] twoSum(int[] nums, int target) {
            int[] result=new int[2];
            int l=nums.length;
            for(int i=0;i<l;i++){
                for(int j=i+1;j<l;j++){
                    if((nums[i]+nums[j])==target){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
            }
            return null;
        }
}
