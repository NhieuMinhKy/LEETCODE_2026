using System;
public class Solution
{
    public int[] GetConcatenation(int[] nums)
    {
        int n=nums.Length;
        int[] ans=new int[n*2];
        for(int i = 0; i < n; i++)
        {
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }
        return ans;
    }
}

class Program
{
    static void Main(string[] args)
    {
        // Khởi tạo class Solution
        Solution sol= new Solution();
        int[] nums={1,2,1};
        int[] result=sol.GetConcatenation(nums);
        Console.WriteLine("Ket qua: [" + string.Join(", ",result) + "]");
    }
}
