public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {    
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        if ((l1+l2)!=l3) {
            return false;
        }
        boolean[][] falseFlag = new boolean[l1+1][l2+1];
        return funcCore(s1, 0, s2, 0, s3, 0, falseFlag);
    }
    private boolean funcCore(String s1, int b1, String s2, int b2, String s3, int b3, boolean[][] falseFlag) {
        if (b1==s1.length()) {
            if (s2.substring(b2).equals(s3.substring(b3))) {
                return true;
            } else {
                falseFlag[b1][b2]=true;
                return false;
            }
        }
        if (b2==s2.length()) {
            if (s1.substring(b1).equals(s3.substring(b3))) {
                return true;
            } else {
                falseFlag[b1][b2]=true;
                return false;
            }
        }
        boolean flag=false;
        if (s1.charAt(b1)==s3.charAt(b3)) {
            if (falseFlag[b1+1][b2]) { // falseFlag[b1+1][b2] has already been marked as true, set flag to false directly.
                flag=false;
            } else {
                flag=funcCore(s1,b1+1,s2,b2,s3,b3+1,falseFlag);
                if (!flag) {
                    falseFlag[b1+1][b2]=true;
                }
            }
        }
        if (flag) {
            return true;
        }
        if(s2.charAt(b2)==s3.charAt(b3)) {
            if (falseFlag[b1][b2+1]) {
                flag=false;
            } else {
                flag=funcCore(s1,b1,s2,b2+1,s3,b3+1,falseFlag);
                if (!flag) {
                    falseFlag[b1][b2+1]=true;
                }
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
