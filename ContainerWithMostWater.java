/**
 * Created by Jagdish on 12/17/2016.
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
    public  static void main(String args[]){
        int[] height={15000,14999,14998,14997,14996,14995,14994};
        float waterHeight,area,maxArea=0;
        int length=height.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                waterHeight=height[i]<height[j] ? height[i]: height[j];
                area=waterHeight*(j-i);
                maxArea=maxArea < area ? area : maxArea;
            }
        }
        System.out.println(maxArea);
    }
}
