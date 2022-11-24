class Calculator {
    int a = 12, b = 33, c = 57;

    public int calculator() {
        int result = (a + b + c) / 3;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git!");
        System.out.println("Hello, JAVA!");

        Calculator middle = new Calculator();
        System.out.println("Среднее значение равно: " + middle.calculator());
    }
}