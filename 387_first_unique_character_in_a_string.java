public class Solution {
    public int firstUniqChar(String s) {
//        boolean[] a = new boolean['z' - 'a'];
//        boolean[] b = new boolean['z' - 'a'];
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        for (char c : arr) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[arr[i] - 'a'] == 1) {
                return i; 
            }
        }
        return -1;
    }
}