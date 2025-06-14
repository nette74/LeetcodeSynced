import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int n1 : nums1){
            set.add(n1);
        }
        for(int n2 : nums2){
           if(set.contains(n2))
               result.add(n2);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}