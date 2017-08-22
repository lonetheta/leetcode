package Arrays;
import java.util.List;
import java.util.ArrayList;
public class youqu448 {
	class Solution {
	    public List<Integer> findDisappearedNumbers(int[] nums){
	        List<Integer> res = new ArrayList<>();
	        for(int i = 0; i < nums.length; i++) nums[(nums[i]-1) % nums.length] += nums.length; // 实现标记，表示该数存在
	        for(int i = 0; i < nums.length; i++) if(nums[i]<=nums.length) res.add(i+1);
	        return res;
	    }
	}

}
