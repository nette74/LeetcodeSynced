import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int strLen = beginWord.length();

        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Queue<Integer> depthQueue = new LinkedList<>();
        depthQueue.add(0);


        while(!queue.isEmpty() && !depthQueue.isEmpty()){
            String now = queue.poll();
            int depth = depthQueue.poll();
            char[] nowArr = now.toCharArray();

            if(now.equals(endWord))
                return depth+1;


            for(int index = 0 ; index < strLen ; index++){
                for(char changed = 'a' ; changed <= 'z' ; changed++){
                    char[] arr = nowArr.clone();
                    arr[index] = changed;
                    String newString = new String(arr);

                    if(wordSet.contains(newString)){
                        wordSet.remove(newString);
                        queue.add(newString);
                        depthQueue.add(depth+1);
                    }
                }
            }
        }
        return 0;

    }
}