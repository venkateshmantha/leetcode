public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num>1){
            while(num%4==0)
                num = num/4;
        }
        return num==1;
    }
}