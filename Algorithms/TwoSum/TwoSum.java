import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] TwoSum (int[] nums, int target) {
     int[] B = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
   
           B[1] = i;
            B[0] = map.get(target - nums[i]);
            return B;
        }
        map.put(nums[i], i );
      }
    return B;
    }
    public  static void main(String []args){
    	int [] A = new int[2];
    	int [] inputArray = {1, 7, 9, 7, 8, 33};
    	TwoSum twosum = new TwoSum();
    	A = twosum.TwoSum(inputArray, 7);
    	if (A[0]!= A[1]){
    	System.out.println(A[0]);
    	System.out.println(A[1]);
    	}
    	else
    	System.out.println("The number equal to target sum is present in the integer array");
    }
}
