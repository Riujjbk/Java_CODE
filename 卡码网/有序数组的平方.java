package 卡码网;

public class 有序数组的平方 {
    public static void main(String[] args){

    }
    public int[] sortedSquares(int[] nums){
        int index = nums.length;
        int[] nums1 = new int[index];
        for (int i = 0,j=nums.length-1;i<=j;) {
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                nums1[--index] = nums[i]*nums[i];
                i++;
            }else {
                nums1[--index] = nums[j]*nums[j];
                j--;
            }
        }
        return nums1;
    }
}
