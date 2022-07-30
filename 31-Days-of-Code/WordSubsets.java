class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res=new ArrayList<>();
        int[] target=new int[26];
        for(String word : words2){
            int[] currarr=new int[26];
            for(char x : word.toCharArray()){
                currarr[x-'a']++;
                target[x-'a']=Math.max(currarr[x-'a'], target[x-'a']);
            }
        }
        for(String word : words1){
            int[] arr=new int[26];
            for(char x : word.toCharArray())
                arr[x-'a']++;
            if(check(arr,target))
                res.add(word);
        }
        return res;
    }
    private boolean check(int[] wcount1, int[] wcount2){
        for(int i=0;i<26;i++)
            if(wcount1[i]<wcount2[i]) return false;
        return true;
    }
}
