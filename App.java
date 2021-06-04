package medidas;
import java.util.Scanner;

public class App {
    public static int tamPolegadas;
    public static int tamPes;
    public static int disMilhas;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println
        ("------------------------------------------------------" + 
        "\n" + "CONVERSOR DE MEDIDAS AMERICANAS PARA UNI.INTERNACIONAL\n");
        System.out.print("Polegadas: ");
        int tamPolegadas = Integer.parseInt(input.nextLine());
        System.out.print("Pés: ");
        int tamPes = Integer.parseInt(input.nextLine());
        System.out.print("Milhas: ");
        int disMilhas = Integer.parseInt(input.nextLine());


        System.out.println("----------------------RESULTADO-----------------------\n");
        
        System.out.print ("Polegadas para centímetros: " + Conversao.polegadasEmCentimetros(tamPolegadas) + "\n" +
                          "Pés para centímetros: "       + Conversao.pesParaCentimetros(tamPes)           + "\n" +
                          "Milhas para quilômetros: "    + Conversao.milhasParaQuilometros(disMilhas)     + "\n");

        input.close();
    }

}
