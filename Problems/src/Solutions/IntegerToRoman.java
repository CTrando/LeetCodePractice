package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        String retStr = "";
        while(num > 1000){
            retStr += "M";
            num-=1000;
        }

        while(num > 500){
            retStr += "D";
            num-=500;
        }

        while(num > 100){
            retStr += "C";
            num-=100;
        }

        while(num > 50){
            retStr += "L";
            num-= 50;
        }

        while(num > 10){
            retStr+= "X";
            num-=10;
        }

        while(num>5){
            retStr+= "V";
            num-=5;
        }

        while(num > 1){
            retStr+= "I";
            num-=1;
        }
        return retStr;
    }
}
