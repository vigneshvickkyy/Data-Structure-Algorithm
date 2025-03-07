package vignesh;

public class floorNumber {
        public static void main(String[] args) {
            int [] arr = {2,4,5,8};
            int target = 1;
            System.out.println(floorNumber(arr,target));
        }

        static int floorNumber(int[] arr, int target) {
//            if (target<arr[arr.length-1]){
//                return -1;
//            }
            int start = 0;
            int end = arr.length - 1;
            boolean asc = arr[start]<arr[end];

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == target){
                    return mid;
                }
                if (asc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    }
                }else{
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }

            }
            return end;
        }
    }


