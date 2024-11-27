package 卡码网;

public class 二分查找 {
    public static void main(String[] args){
        //[left,right]


    }
    public int search(int[] nums,int target){
        //[left,right]
        int left = 0,right = nums.length -1;
        while (left<=right){
            int middle = left + (right - left)/2;
            if(nums[middle]>target){
                right = middle-1;
            }
            else if(nums[middle]<target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    public int search1(int[] nums,int target){
        //[left,right)
        int left = 0,right = nums.length -1;
        while (left<right){
            int middle = left + (right - left)/2;
            if(nums[middle]>target){
                right = middle;
            }
            else if(nums[middle]<target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
