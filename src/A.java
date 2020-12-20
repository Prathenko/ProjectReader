
    import java.util.Locale;
    import java.util.Scanner;

    import static java.lang.StrictMath.sqrt;

    public class A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float M = scanner.nextFloat();
            int N = scanner.nextInt();
            for (int i = 0; i <= N; i++) {
               Math.ceil(M = M - (1 / M));
            }
            System.out.printf("%.2f", M);


        }

    }

