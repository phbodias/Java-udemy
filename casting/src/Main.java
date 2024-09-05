/*                 CASTING
É a conversão explícita de um tipo para outro.
É necessário quando o compilador não é capaz de “adivinhar” que o
resultado de uma expressão deve ser de outro tipo.*/

public class Main {
    public static void main(String[] args) {
        // exemplo 1
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b; // SE NÃO COLOCAR O DOUBLE IMPRIME 2
        System.out.println(resultado);

        // exemplo 2
        double c;
        int d;
        c = 5.0;
        d = (int) c; // SE NÃO PÔR O "INT": Type mismatch: cannot convert from double to int
        System.out.println(d);
    }
}
