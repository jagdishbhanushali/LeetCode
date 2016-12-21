import java.util.Arrays;

/**
 * Created by Jagdish on 12/17/2016.
 * https://leetcode.com/problems/3sum-closest/
 */
public class Sum3 {
    public static void main(String args[]){
        int[] nums={43,75,-90,47,-49,72,17,-31,-68,-22,-21,-30,65,88,-75,23,97,-61,53,87,-3,33,20,51,-79,43,80,-9,34,-89,-7,93,43,55,-94,29,-32,-49,25,72,-6,35,53,63,6,-62,-96,-83,-73,66,-11,96,-90,-27,78,-51,79,35,-63,85,-82,-15,100,-82,1,-4,-41,-21,11,12,12,72,-82,-22,37,47,-18,61,60,55,22,-6,26,-60,-42,-92,68,45,-1,-26,5,-56,-1,73,92,-55,-20,-43,-56,-15,7,52,35,-90,63,41,-55,-58,46,-84,-92,17,-66,-23,96,-19,-44,77,67,-47,-48,99,51,-25,19,0,-13,-88,-10,-67,14,7,89,-69,-83,86,-70,-66,-38,-50,66,0,-67,-91,-65,83,42,70,-6,52,-21,-86,-87,-44,8,49,-76,86,-3,87,-32,81,-58,37,-55,19,-26,66,-89,-70,-69,37,0,19,-65,38,7,3,1,-96,96,-65,-52,66,5,-3,-87,-16,-96,57,-74,91,46,-79,0,-69,55,49,-96,80,83,73,56,22,58,-44,-40,-45,95,99,-97,-22,-33,-92,-51,62,20,70,90};

        int target=284;
        int closestTarget=nums[0]+nums[1]+nums[2];
        int[] bestTargetIndex={0,1,2};
        int numLength=nums.length,sumResult;
        for(int i=0;i<numLength-2;i++){
            for(int j=i+1;j<numLength-1;j++) {
                for(int k=j+1;k<numLength;k++){
                    sumResult=nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-sumResult) < Math.abs(target-closestTarget)){
                        closestTarget=sumResult;
                        bestTargetIndex[0]=i;
                        bestTargetIndex[1]=j;
                        bestTargetIndex[2]=k;
                    }
                    if(closestTarget==target)
                    {
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(bestTargetIndex));
        System.out.println(closestTarget);
    }
}
