package Arrays;

public class Easy485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
                temp++;
            if(nums[i]==0 || i==nums.length-1)
            {
                count = (count>temp) ? count : temp;
                temp = 0;
            }
                
        }
        if(count == 0) return temp;
        return count;
    }

}
