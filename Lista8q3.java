import java.util.Scanner;
import java.util.ArrayList;
public class Lista8q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();
        Double input;
        int i =0;
        System.out.println("digite as notas( digite -1 para finalizar)");
        while ((input = scanner.nextDouble()) != -1) {
            notas.add(input);
            


        }
        System.out.println(notas.size());
    }
    
}
