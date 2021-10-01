import java.util.Scanner;
public class Task2Fin {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int algorithmId;
        int loopType;
        int n;
        int f1 = 0;
        int f2 = 1;
        int f3;
        int i = 1;

        System.out.println("Введите тип алгоритма: 1 или 2");
        algorithmId = s.nextInt();
        System.out.println("Введите число для выбора типа цикла: 1 - while; 2 - do while; 3 - for");
        loopType = s.nextInt();
        System.out.println("Введите n - параметр, передаваемый в алгоритм");
        n = s.nextInt();

        if (algorithmId == 1 && loopType == 1) {
            System.out.println(f1);
            System.out.println(f2);
            while (i < n) {
                f3 = f1 + f2;
                System.out.println(f3+" ");
                f1=f2;
                f2=f3;
                i++;
            }
        } else if (algorithmId == 1 && loopType == 2) {
            System.out.println(f1);
            System.out.println(f2);
            do {
            f3 = f1 + f2;
            System.out.println(f3+" ");
            f1=f2;
            f2=f3;
            i++;
            }
            while (i < n);
        } else if (algorithmId == 1 && loopType == 3) {
            System.out.println(f1);
            System.out.println(f2);
            for (i = 0; i < n; i++) {

                f3 = f1 + f2;
                System.out.println(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
        } else if (algorithmId == 2 && loopType == 1) {
            int sum = 1;
            while (i <= n) {
                sum = sum*i;
                i++;
                            }
            System.out.println("Factorial is " +sum);
        } else if (algorithmId == 2 && loopType == 2) {
            int sum = 1;
            do {
                sum = sum*i;
                i++;

            } while (i <= n);
            System.out.println("Factorial is " +sum);
        } else if (algorithmId == 2 && loopType == 3) {
            int sum = 1;
            for (i = 1; i <=n; i++) {
                sum = sum*i;
            } System.out.println("Factorial is " +sum);
        }
    }
}