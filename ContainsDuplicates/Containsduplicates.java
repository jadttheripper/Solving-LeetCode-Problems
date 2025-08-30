class Solution {
    public boolean hasDuplicate(int[] nums) {
           boolean has=false;
         int i,j;
         for(i=0;i<nums.length;i++){
             for(j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     has=true;
                 }
             }
         }
         return has;
    }
}