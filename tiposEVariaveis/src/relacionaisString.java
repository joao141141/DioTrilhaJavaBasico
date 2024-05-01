public class relacionaisString {
    public static void main(String[] args) {
        String nome1 = "Joao";
        String nome2 = "Joao";
        //String nome2 = new String("Joao"); em OOP
        String resultado = "";

        //System.out.println(nome1.equals(nome2)); em OOP

        /*if(nome1==nome2)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);*/

        resultado = nome1 == nome2 ? "verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
