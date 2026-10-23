import java.util.Scanner;

public class Lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tem = new double[12];
        String[] mes = { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" };
        int soma = 0;
        int media = 0;
        for (int i = 0; i < tem.length; i++) {
            System.out.println("digite a temperatura media do mes de " + mes[i]);
            tem[i] = scanner.nextDouble();
            soma += tem[i];
            
        }
        
       // System.out.println(media/tem.length);
       
       media = (soma/mes.length);
       System.out.println("a media da temperaturo do ano foi "+media);
      for (int j = 0; j < mes.length; j++) {
        if(tem[j] > media){
            System.out.println("acima da media anunal");
            System.out.println(mes[j]+" | "+ tem[j]);
        }

    }

  }
}
