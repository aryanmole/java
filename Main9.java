import java.util.*;

class Main9 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements in 1st 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();  // ✅ Take input
            }
        }

        System.out.println("Enter elements in 2nd 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();  // ✅ Take input
            }
        }

        System.out.print("Enter choice (1=Add, 2=Multiply, 3=Transpose): ");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Addition:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Multiplication:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            c[i][j] += a[i][k] * b[k][j];
                        }
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Transpose of 1st matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

