public class TaskWork3 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;
        nums[4]=15;
        int temp = nums[0];
        nums[0]=nums[4];
        nums[4]=temp;
        int last = nums[nums.length - 1];
        int center = nums[(nums.length - 1)/2];
        System.out.print(last+center);
    }
}

