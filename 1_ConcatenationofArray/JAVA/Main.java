import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}

public class Main {
    static void main(String[] args) {
        //Khởi tạo class Solution
        Solution sol = new Solution();

        int[] myNums = { 1, 2, 1 };
        int[] result = sol.getConcatenation(myNums);
        //In kết quả ra màn hình (Dùng Arrays.toString để in mảng)
        System.out.println("Ket qua: " + Arrays.toString(result));
    }
}