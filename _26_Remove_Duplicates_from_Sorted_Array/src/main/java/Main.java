import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,5,6};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j < nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
