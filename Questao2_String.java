package testeJunior;

public class Questao2_String {
    public static void main(String[] args) {
        String[] teste = {"Carlos", "Eduardo", "Da", "Costa", "Xavier"};
        System.out.println(concatenar(teste));
    }

    public static String concatenar(String[] listaStr) {
        StringBuilder stringDeRetorno = new StringBuilder();

        for (String texto : listaStr) {
            stringDeRetorno.append(texto);
            stringDeRetorno.append(" ");
        }

        return stringDeRetorno.toString().trim();
    }
}
