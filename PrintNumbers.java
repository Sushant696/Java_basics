public class PrintNumbers {
    public static void main(String[] args) {
        final int targetCount = 1000000000; // 1 billion

        for (int number = 1; number <= targetCount; number++) {
            System.out.println(number);
        }
    }
}
