package vignesh;

public class evenDigits {
    public static void main(String[] args) {
        int[]nums = {123,1234,12,111,1,1111};
        System.out.println(findNumbers(nums));
    }

     static int findNumbers(int[] nums) {
        int count =0;
        for(int i = 0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int digits = digits(num);
        return digits % 2 == 0;
    }

     static int digits(int num) {
        if (num<0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

}



