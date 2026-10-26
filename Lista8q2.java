import java.util.ArrayList;
import java.util.Scanner;

public class Lista8q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int culpado = 0;
        ArrayList<String> perg = new ArrayList<String>();

        perg.add(0, "Telefonou para a vítima?\nsim ou nao");
        perg.add(1, "Esteve no local do crime?");
        perg.add(2, "Mora perto da vítima?");
        perg.add(3, "Devia para a vítima?");
        perg.add(4, "Já trabalhou com a vítima?");
        for (int i = 0; i < 5; i++) {
            System.out.println(perg.get(i));
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                culpado = (culpado + 1);
            } else {
                culpado = (culpado + 0);
            }

        }
        System.out.println(culpado);
        if (culpado<2){
            System.out.println("Inocente");
        }else if(culpado<3){
            System.out.println("Suspeito");
        }else if(culpado<5){
            System.out.println("Cumplice");
        }else if(culpado==5){
            System.out.println("Culpado");
        }

    }
}
