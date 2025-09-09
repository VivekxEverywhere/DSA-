class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE, key = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n / 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}