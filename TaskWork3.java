public class TaskWork3 {
    public static void main(String[] args) {
        double nums []  = new double[5];
        nums[0] = 35.555;
        nums[1] = 2575.554;
        nums[2] = 574.3875;
        nums[3] = 1550.318;
        nums[4]=355.928;
        double last = nums[nums.length - 1];
        double temp = nums[0];
        nums[0] = last;
        nums[4] = temp;
        double center = nums[(nums.length - 1)/2];
        System.out.print(nums[0]+center);
    }
}

