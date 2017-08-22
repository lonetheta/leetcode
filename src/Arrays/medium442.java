package Arrays;
import java.util.List;
import java.util.ArrayList;
public class medium442 {
	 public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> rew = new ArrayList<>();
	        for(int i=0; i<nums.length; i++) nums[(nums[i]-1)%(nums.length+1)] += nums.length+1;
	        for(int i=0; i<nums.length; i++)
	        {
	            if(nums[i]/(nums.length+1) == 2) rew.add(i+1);
	        }
	     return rew;
	    }

}
