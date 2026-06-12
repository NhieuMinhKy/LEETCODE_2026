
//Time Complexity: O(nlogn) sort array
// //Space Complexity: O(logn) sort array
// using System;
// public class Solution
// {
//     public bool HasDuplicate(int[] nums)
//     {
//         Array.Sort(nums);
//         for(int i=0; i < nums.Length - 1; i++)
//         {
//             if(nums[i]==nums[i+1])
//             {
//                 return true;
//             }
//         }
//         return false;
//     }

//     static void Main(string[] args)
//     {
//         int[] nums = {21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,21};
//         Solution solution = new Solution();
//         bool result = solution.HasDuplicate(nums);
//         Console.WriteLine(result);
//     }
// }



//
using System;
using System.Collections.Generic;
public class Solution
{
    public bool HasDuplicate(int[] nums)
    {
        HashSet<int> set= new HashSet<int>();
        foreach(int num in nums)
        {
            if(set.Contains(num))
            {
                return true;
            }
            set.Add(num);
        }
        return false;
    }

    public static void Main(string[] args)
    {
        int[] nums={21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
        Solution sol=new Solution();
        System.Console.WriteLine(sol.HasDuplicate(nums));
    }
}