package vignesh;
import java.util.*;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 4, 4, 8, 10};//nums=[5,7,4,4,8,10]
        int target = 4;//target = 4
        int[] result = searchRange(nums, target); //nums,target
        System.out.println("First and Last Position: " + Arrays.toString(result)); //result: [2,3]
    }

    static int[] searchRange(int[] nums, int target) { //nums[5,7,4,4,8,10], target=4
        int[] ans = {-1, -1};//ans=[-1,-1]
        //check for first occurance of target first
        ans[0] = search(nums, target, true); //2
        //check for last occurance of target
        if (ans[0]!=-1){
            ans[1] = search(nums,target, false);//3
        }
//        ans[0] = start; //2
//        ans[1]=end; //3
        return ans; // [2,3]
    }

    static int search(int[] nums, int target, boolean findStartIndex ){ //[5,7,4,4,8,10], target =4, findStartIndex = false
            int ans = -1; //ans = -1  //ans=2                               0,1,2,3,4,5
            int start = 0; //start = 0 //start = 0 //start = 3 //start = 4
            int end = nums.length - 1; //end = 5 //end =1 //end = -1 //end =5 //end =3
            while (start <= end) { //0<=5 //0<=1 //0<=-1 => false //0<=5 //3<=5-> true //3<=3 //4<=3
                int mid = start + (end - start) / 2;  //mid = 2 // mid = 0 //mid = 2 //mid = 4 // mid = 3

                if (target < nums[mid]) { //4<4=false //4<5 //4<4=false //4<8 //4<4=>false
                    end = mid - 1; //end = -1 //end = 3
                } else if (target > nums[mid]) { //4>4=false //4>4=false //4>4=>false
                    start = mid + 1;
                } else {
                   ans=mid;  //ans = 2 //ans = 2 //ans = 3
                   if (findStartIndex){ //false
                       end = mid-1;  //end = 1
                   }else {
                       start = mid+1; //start = 3 //start=4
                   }
                }
            }
            return ans;
        }
    }

