public class RecursiveMetot {
    public static void main(String[] args) {
        int n = 20;
        recursiveMetot(n);
    }

    public static void recursiveMetot(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        recursiveMetot(n - 5);
        System.out.print(n + " ");
    }
}
