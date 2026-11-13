
class Solution {
    public double myPow(double x, int n) {

        long num = n;

        if (num < 0) {
            num = -num;
            return 1 / power(x, num);
        }

        return power(x, num);
    }

    public double power(double x, long n) {

        if (n == 0) {
            return 1.0;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } 
        else {
            return half * half * x;
        }
    }
}
