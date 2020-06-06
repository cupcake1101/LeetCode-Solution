/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. 
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int x[] = new int[2];
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                x[0] = i;
                x[1] = map.get(nums[i]);
                break;
            }
            map.put(target-nums[i],i);
        }
        return x;
    }
}
