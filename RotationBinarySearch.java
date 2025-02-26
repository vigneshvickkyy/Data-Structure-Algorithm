package vignesh;

public class RotationBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 1, 2};  // Rotated sorted array
        int target = 6;
        int result = search(nums, target);
        System.out.println("Index of " + target + " is: " + result);
    }
    static int search(int[]nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot -1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length-1);
    }

     static int binarySearch(int[] nums, int target, int start, int end) {
         while(start<=end){
             int mid = start + (end-start) / 2;
             if(target<nums[mid]){
                 end=mid-1;
             } else if (target>nums[mid]) {
                 start=mid+1;
             } else {
                 return mid;
             }
         }
         return -1;
     }
    static int findPivot(int[] arr){    //arr:[4,5,6,7,8,1,2]
       int start = 0; //4
       int end = arr.length - 1; //6

       while (start <= end){ //4<6
           int mid = start + (end - start) / 2; //mid=5

           if(mid < end && arr[mid] > arr[mid + 1]){ //5<6 && 1>2 = false
               return mid;
           }
           if(mid > start && arr[mid] < arr[mid - 1]){ //5>4 && 1<8 = true
               return mid-1; //4
           }
           if (arr[mid] <= arr[start]){ //7<=0 = false
               end = mid - 1;
           }else {
               start = mid + 1; //start = 4
           }
       }
       return -1;
    }
}
