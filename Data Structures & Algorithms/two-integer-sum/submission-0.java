class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j =0; j<nums.length; j++){
            int i = nums[j];
            int complement = target - i;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),j};
            }
            map.put(i,j);
        }
        return new int[]{0,0};
    }
}
