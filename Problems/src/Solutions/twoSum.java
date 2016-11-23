package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class twoSum {
    public twoSum() {
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];

        for(int i = 0; i < nums.length; ++i) {
            int indice1 = i;

            for(int j = i; j < nums.length; ++j) {
                if(nums[indice1] + nums[j] == target) {
                    ret[0] = indice1;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public int[] twoSumSecondTry(int[] nums, int target) {
        String num = nums.toString();
        int point = 0;
        int[] arr = new int[2];

        for(int i = 0; i< nums.length; i++){
            if(num.contains(target - nums[i]+ "")){
                point = i;
            }
        }
        arr[0] = point;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target - point){
                arr[1] = i;
            }
        }
        return arr;
    }


}
