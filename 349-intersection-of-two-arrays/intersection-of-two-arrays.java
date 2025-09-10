class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length ==0 ) return new int[0];
        boolean[] seen = new boolean[1001];
        for(int num : nums1){
            seen[num] = true;
        }

        int[]result = new int[nums1.length];
        int idx = 0;
        for(int num : nums2){
            if(seen[num] == true){
                result[idx++] = num;
                seen[num] = false;
            }
        }
        return Arrays.copyOfRange(result, 0, idx);
    }
}