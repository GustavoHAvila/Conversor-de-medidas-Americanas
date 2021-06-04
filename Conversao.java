package medidas;

public class Conversao {
    
    //Atributos:
    private int pes;
    private int polegadas;
    private int milhas;

    //Métodos
    public double polegadasEmCentimetros(int polegadas){
        double resposta;
        resposta = polegadas * 2.54;
        return resposta;

    }
    public double pesParaCentimetros(int pes){
        double resposta;
        resposta = pes * 30.48;
        return resposta;
    }
    public double milhasParaQuilometros(int milhas){
        double resposta;
        resposta = milhas * 1.609;
        return resposta;
    }

    //GETs e SETs

    //Pés:
    public int getPes(){
        return this.pes;
    } 
    public void setPes(int pes) {
        this.pes = pes;
    }

    //Polegadas:
    public int getPolegadas(){
        return this.polegadas;
    }
    public void setPolegadas(int polegadas){
        this.polegadas = polegadas;
    }

    //Milhas:
    public int getMilhas(){
        return this.milhas;
    }
    public void setMilhar(int milhas){
        this.milhas = milhas;
    }

    //Retorno do texto:
    public String toString(){
        return "Polegadas para centímetros: " + polegadasEmCentimetros(polegadas) + "\n" +
               "Pés para centímetros: "       + pesParaCentimetros(pes)           + "\n" +
               "Milhas para quilômetros: "    + milhasParaQuilometros(milhas)     + "\n" ;
    }


}
