package testeJunior;

public class Questao3_Inteiro {
    public static void main(String[] args) {
        int[] lista = {334, 568, 123, 796, 225};
        System.out.println(maiorValor(lista));
    }

    public static int maiorValor(int[] listaDeInteiros) {
        int maiorValorTemp = listaDeInteiros[0];
        for (int valor : listaDeInteiros) {
            if (valor > maiorValorTemp) maiorValorTemp = valor;
        }

        return maiorValorTemp;
    }
}
