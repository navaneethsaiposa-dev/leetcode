class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[(i+k)%n]=nums[i];
        }
        System.arraycopy(arr,0,nums,0,n);

    }
}