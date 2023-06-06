public class Main {
    public static void main(String[] args) {
        System.out.println("1'den 100'e kadar olan asal sayılar:");
        for (int i = 2; i <= 100; i++) {
            boolean asalmi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;
                    break;
                }
            }
            if (asalmi) {
                System.out.println(i);
            }
        }
    }
}