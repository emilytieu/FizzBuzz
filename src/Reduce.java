public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                steps++;
            }
            else {
                n--;
                steps++;
            }
        }
        System.out.println(steps);

    }
}
