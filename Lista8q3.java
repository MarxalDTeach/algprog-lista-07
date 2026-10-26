import java.util.Scanner;
import java.util.ArrayList;

public class Lista8q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();
        Double input;
        int contador = 0;
        int total = 0;
        int acima = 0;
        int abaixo = 0;
        System.out.println("digite as notas( digite -1 para finalizar)");
        while ((input = scanner.nextDouble()) != -1) {
            notas.add(input);
            contador += 1;
            total += input;
        }
        System.out.println(contador);
        System.out.println("foram registradas: " + notas.size());
        for (int i = 0; i < contador; i++) {
            System.out.print(" | " + notas.get(i));
            if (notas.get(i) > (total / contador)) {
                acima += 1;
            } else if (notas.get(i) < 7)
                abaixo += 1;
        }
        System.out.println("\n");
        for (int j = (contador - 1); j > -1; j--) {
            System.out.println(+notas.get(j));
        }
        System.out.println("A total e de: " + total);
        System.out.println("A media e de: " + (total / contador));
        System.out.println("tem: " + acima + " numeros a cima da media");
        System.out.println("tem: " + abaixo + " de 7 nas notas");
        System.out.println("encerado!");

    }

}
