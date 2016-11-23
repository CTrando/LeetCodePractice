package Solutions;

/**
 * Created by Cameron on 11/19/2016.
 */
public class myPow {
    public myPow() {
    }

    public double myPow(double x, int n) {
        if(n < 0) {
            x = 1.0D / x;
            n *= -1;
        }

        return n == 0?1.0D:(n % 2 == 1?x * this.myPow(x, n - 1):this.myPow(x * x, n / 2));
    }
}
