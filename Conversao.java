package medidas;

public class Conversao {
    //Métodos
    public static double polegadasEmCentimetros(int polegadas){
        double resposta;
        resposta = polegadas * 2.54;
        return resposta;
    }
    public static double pesParaCentimetros(int pes){
        double resposta;
        resposta = pes * 30.48;
        return resposta;
    }
    public static double milhasParaQuilometros(int milhas){
        double resposta;
        resposta = milhas * 1.609;
        return resposta;
    }
}
