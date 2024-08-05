public class Lamda {
    private static int sum = 0;

    public static boolean modTwo(int element) {
        if (element % 2 == 0) return true;
        else return false;

    }

    public static int sum(int element) {
        sum = sum + element;
        return sum;
    }

    public static int getSum() {
        return sum;
    }
}