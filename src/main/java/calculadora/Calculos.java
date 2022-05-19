package calculadora;

public class Calculos {
    public double soma(double... numeros){

        double soma=0;

        if (numeros.length>0){
            for (double numeroASomar : numeros){
                soma += numeroASomar;
            }
        }
        return soma;

    }
}
