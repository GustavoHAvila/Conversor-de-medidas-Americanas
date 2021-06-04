package medidas;
import java.util.Scanner;

public class App {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Conversao conversao = new Conversao();

        System.out.println
        ("------------------------------------------------------" + 
        "\n" + "CONVERSOR DE MEDIDAS AMERICANAS PARA UNI.INTERNACIONAL\n");
        System.out.print("Polegadas: ");
        int tamPolegada = Integer.parseInt(input.nextLine());
        System.out.print("Pés: ");
        int tamPes = Integer.parseInt(input.nextLine());
        System.out.print("Milhas: ");
        int disMilhas = Integer.parseInt(input.nextLine());

        conversao.setPolegadas(tamPolegada);
        conversao.setPes(tamPes);
        conversao.setMilhar(disMilhas);

        System.out.println("----------------------RESULTADO-----------------------\n");
        System.out.println(conversao.toString());

        input.close();
    }

}