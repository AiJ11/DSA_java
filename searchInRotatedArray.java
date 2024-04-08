import java.util.*; 
public class searchInRotatedArray {

    public static int find_target(int[] nums,  int target){
        if (nums.length<=1) {
            if (nums[0]==target) {
                return 0;
                
            }
            else return -1;
            
        }
        
        int pivot= find_pivot(nums);
        
        int a= binarySearch(nums, 0, pivot, target);
        int b= binarySearch(nums, pivot+1, nums.length-1, target);
        return Math.max(a, b);


    }

    public static int find_pivot(int[] nums){
        int start=0 , end= nums.length-1;
        while (start<=end) {
            int mid= start+(end-start)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if (nums[mid]>=nums[start]) {
                start= mid+1;
                
            }
            else if (nums[mid]<nums[start]) {
                end=mid-1;
                
            }
            
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        
        while (start<=end) {
            int mid= start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
                
            }
            else if (target<arr[mid]) {
                end=mid-1;
                
            }
            else {
                start=mid+1;
                
            }
            
            
        }
        return -1;
    }

            
    
    public static void main(String[] args) {

        int arr[] =  {4,5,6,7,0,1,2};
        
        int target= 100;
        int k= find_target(arr, target);
        System.out.println(k);

        
       

            
        
        
        
    
    }
    
} 

