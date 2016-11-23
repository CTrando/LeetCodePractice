package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int isNegative = 1;
        if (x < 0) {
            isNegative = -1;
            x*=-1;
        }

        String str = x+"";
        StringBuilder retStr = new StringBuilder();
        for(int i =0; i< str.length(); i++){
            retStr.insert(0, str.substring(i, i+1));
        }
        try {
            return isNegative * Integer.parseInt(retStr.toString());
        } catch(NumberFormatException e){
            return 0;
        }
    }
}
