public class relacionaisString {
    public static void main(String[] args) {
        String nome1 = "Joao";
        String nome2 = "Joao";
        String resultado = "";


        /*if(nome1==nome2)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);*/

        resultado = nome1 == nome2 ? "verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
