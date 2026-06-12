
//Time Complexity: O(n^2) 2 vong lap lap nhau
//Space Complexity: O(1) 1 bien temp
// public class Solution{
//     public int[] sortArray(int[] nums){
//         int n = nums.length;
//         for(int i=0; i<n;i++){
//             for(int j=i+1; j<n;j++){
//                 if(nums[i]>nums[j]){
//                     int temp = nums[i];
//                     nums[i]=nums[j];
//                     nums[j]=temp;
//                 }
//             }
//         }
//         return nums;
//     }

//     public boolean hasDuplicate(int[] nums) {
//         nums = sortArray(nums);
//         int n = nums.length;
//         for(int i=0; i<n-1;i++){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
//         }   
//         return false;
//     }
// public static void main(String[] args) {
//     int[] nums={21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,21};
//     Solution sol= new Solution();
//     boolean result = sol.hasDuplicate(nums);
//     System.out.println(result);
// }
// }






//Time Complexity: O(n) 1 vong lap
//Space Complexity: O(n) hashset
import java.util.HashSet;
public class Solution{
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,21};
        Solution sol= new Solution();
        System.out.println(sol.hasDuplicate(nums));
    }
}