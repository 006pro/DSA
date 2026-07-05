class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
        if(x<0){
            return false;
        }else{
            while(x>0){
            int rem = x%10;
            y = (y * 10) + rem;
            x = x/10;
                 }
                 
              return z==y;


                      }
    }
}