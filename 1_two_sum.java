class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            map.put(nums[i],i);
        }


        // for(int num : nums){
        //     //if(target%2 == 0 && target/2 == num) continue;

        //     if(map.containsKey(target-num) && map.get(target-num) != num){
        //         return new int[]{num,map.get(target-num)};
        //     }
        // }

        for(int i = 0 ; i < nums.length ; i ++){
            //if(target%2 == 0 && target/2 == num) continue;

            if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }

        return null;
    }
}