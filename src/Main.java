public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {

        System.out.println("Мой Git проект. Development");
        System.out.println("Мой Super проект.");

        int a = 5;
        int b = 6;

        int sum = countSum(a, b);
    }
    private static int countSum(int a, int b){
        return a + b;
    }

    private static int countMultiply(int a, int b){
        return a * b;
    }
}
