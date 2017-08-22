package Arrays;
import java.util.Arrays;
public class Easy532 {
	public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            j=i+1;
            if(i != 0 && nums[i]==nums[i-1]) continue;
            while(j < nums.length && (nums[j]-nums[i]) < k) j++; 
            if(i!=0 && k==0 && nums[i] == nums[i-1]) count++; 
            if(j<nums.length && nums[j]-nums[i] == k)  count++;
        }
        return count;
    }
	
	//hashmap
	
}




