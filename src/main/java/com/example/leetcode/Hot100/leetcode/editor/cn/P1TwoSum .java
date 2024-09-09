//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
//
// 你可以按任意顺序返回答案。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
//
// 示例 2：
//
//
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//
//
// 示例 3：
//
//
//输入：nums = [3,3], target = 6
//输出：[0,1]
//
//
//
//
// 提示：
//
//
// 2 <= nums.length <= 10⁴
// -10⁹ <= nums[i] <= 10⁹
// -10⁹ <= target <= 10⁹
// 只会存在一个有效答案
//
//
//
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？
//
// Related Topics 数组 哈希表 👍 18845 👎 0

package com.example.leetcode.Hot100.leetcode.editor.cn;

import java.util.HashMap;

//java:两数之和
class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int i = 0;
            for (int num : nums) {
                hashMap.put(i++, num);
            }
            for (int j = 0; j < hashMap.size(); j++) {
                for (int k = j + 1; k < hashMap.size(); k++) {
                    if (hashMap.get(k) + hashMap.get(j) == target) {
                        return new int[]{j, k};
                    }
                }
            }
            return null;
        }
    }

    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int i = 0;
            for (int num : nums) {
                hashMap.put(num, i++);
            }
            for (int j = 0; j < hashMap.size(); j++) {
                if (hashMap.containsKey(target-nums[j]) & hashMap.get(target-nums[j])!=j){
                    return new int[]{j,hashMap.get(target-nums[j])};
                }
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
