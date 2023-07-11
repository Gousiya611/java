public class TwoSum{
    public int[] twosum( int[] nums, int sum){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                // int k= nums[i]+nums[j];
                if(nums[i]+nums[j]==sum){

                }
                    return new int[]{i,j};

                }
          
            }
    
        throw new IllegalArgumentException("NO such pair exist");

    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] n1={1,2,3,8,10,11,6,9};
        int target=11;
        int[] result = twoSum.twosum(n1,target);
        System.out.println(result);

    }

}