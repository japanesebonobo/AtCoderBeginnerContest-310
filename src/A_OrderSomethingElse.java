import java.util.*;

public class A_OrderSomethingElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int D[] = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = scanner.nextInt();
        }
        scanner.close();
        
        int ans = 0;
        Arrays.sort(D);
        if (D[0] + Q <= P) {
            ans = D[0] + Q;
        } else {
            ans = P;
        }
        System.out.println(ans);
    }
}

