class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> list, int[] nums, int s) {
        // if(list.size() > nums.length) return;
        res.add(new ArrayList<>(list));
        for(int i=s; i<nums.length; i++) {
            list.add(nums[i]);
            dfs(res, list, nums, i+1);
            list.remove(list.size()-1);
        }   
    }
}
