class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        int i =0, j= 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                k++;
                i++;
            }
            j++;
        }
        return k;
    }
}