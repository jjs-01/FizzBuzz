package lab1;

public class Reduce {
    public static void main(String[] args) {
        int steps = reduce(100);
        System.out.println(steps);
    }

    public static int reduce(int n) {
        int i = n;
        int stepsToZero = 0;

        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i - 1;
            }
            stepsToZero++;
        }

        return stepsToZero;
    }
}
