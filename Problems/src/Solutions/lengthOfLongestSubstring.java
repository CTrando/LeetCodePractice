package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class lengthOfLongestSubstring {

    public int lengthofLongestSubstring(String s) {
        String retString = "";
        String tempString = "";
        for(int i = 0; i< s.length(); i++){
            for(int j = i; j< s.length(); j++){
                String currentLetter = s.substring(j, j+1);
                if(!tempString.contains(currentLetter)){
                    tempString += s.substring(j, j+1);
                } else break;

                if(j == s.length()-1){
                    if(tempString.length() > retString.length()){
                        retString = tempString;
                        return retString.length();
                    }
                }
            }
            if(tempString.length() > retString.length()){
                retString = tempString;
            }
            tempString = "";
        }
        return retString.length();
    }

}
