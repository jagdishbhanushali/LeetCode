import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Jagdish on 12/20/2016.
 * https://leetcode.com/problems/3sum/
 */
public class Sum3_Zero {
    public static void main(String args[]) {
        int[] num={9,-15,6,6,10,-2,8,8,0,-6,-4,-2,14,-6,-14,-2,12,5,-2,-8,13,13,-10,4,-6,8,6,-15,-5,11,-15,11,3,-2,-6,-10,11,-12,13,-12,-11,-5,2,10,-4,-5,-15,-7,7,-2,0,5,-11,-3,-13,-10,-9,0,-10,-7,-12,12,-11,7,-5,-1,12,-8,-6,3,-13,-10,5,-4,-14,-14,6,8,-14,-9,-8,-7,3,-4,6,5,1,12,-9,6,-10,-6,-5,-14,-14,5,-8,6,4,1};
        Sum3_Zero s=new Sum3_Zero();
        s.threeSum(num);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i,left,right,numsLength,total;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        numsLength=nums.length;
        for (i=0;i<numsLength-2;i++){
            left=i+1;
            right=numsLength-1;
            while(left<right){
                total=nums[i]+nums[left]+nums[right];
                if(total==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(total<0){
                    left++;
                }else if(total>0){
                    right--;
                }
            }
        }
        result=new ArrayList(new HashSet(result));
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }
}
