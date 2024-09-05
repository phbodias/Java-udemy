import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        int y = sc.nextInt();

        double z = sc.nextDouble();

        char w = sc.next().charAt(0);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        // quando usa sem o nextLine e o usuário tecla enter, essa quebra de linha fica
        // pendente para o próximo 'next' 'nextLine'
        sc.nextLine(); // macete para 'consumir' a quebra de linha pendente

        String x1 = sc.nextLine();
        System.out.println("x1 = " + x1);

        sc.close();
    }
}
