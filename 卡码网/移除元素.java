package 卡码网;

public class 移除元素 {
    public static void main(String[] args){

    }


    public int removeElement1(int[] nums, int val) {
            int n = nums.length;
            for(int i = 0; i < n; i++){
                if(val == nums[i]){//若发现删除元素 就把数组集体往前移动一位
                    for(int j = i + 1;j < n; j++){
                        nums[j - 1] = nums[j];
                    }
                    i--;//因为下标i的元素也往前移动一位了 所以i--回退1位
                    n--;//此时数组大小再-1
                }
            }
            return n;//返回数组长度
    }

    public int removeElement(int[] nums,int val){
        //双指针
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=val){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
