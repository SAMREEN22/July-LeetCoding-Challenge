class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        char[] arr=new char[26];
        char[] newarr=new char[26];
        List<String> ll=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            Arrays.fill(arr,'*');
            Arrays.fill(newarr,'*');
            for(int j=0;j<words[i].length();j++){
                int pos=pattern.charAt(j)-97;
                int t=words[i].charAt(j)-97;
                if(arr[pos]!='*' && newarr[t]!='*'){
                    if(arr[pos]!=words[i].charAt(j) || newarr[t]!=(char)pos){
                        break;
                    }
                }else if(arr[pos]=='*' && newarr[t]=='*'){
                    arr[pos]=words[i].charAt(j);
                    newarr[t]=(char)pos; 
                }else{
                    break;
                }
                if(j==words[i].length()-1){
                    ll.add(words[i]);
                }
            }
        }
        return ll;
    }
}
