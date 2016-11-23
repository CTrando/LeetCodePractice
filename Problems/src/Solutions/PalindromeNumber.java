package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String loop = x+"";
        for(int i = 0; i< loop.length()/2; i++){
            if(!loop.substring(i, i+1).equals(loop.substring(loop.length()-i-1, loop.length()-i)))
                return false;
        }
        return true;
    }
}
