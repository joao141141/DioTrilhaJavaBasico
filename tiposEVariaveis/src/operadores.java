public class operadores {
    public static void main(String [] args) {
        
        //operadores
        String nomeCompleto = "Joao" + "Amorim";
        System.out.println(nomeCompleto);

        String nome1 = "Joao ";
        String nome2 = "Amorim";

        String nomeCompleto2 = nome1 + nome2;

        System.out.println(nomeCompleto2);

        int numero = 5;

        numero = -numero;
        System.out.println(numero);


        int numero2 = 5;

        int numero3 = numero2 + 1; //soma 1
        numero2++; //incrementa 1
        

        System.out.println(numero3);
        System.out.println(numero2);

        numero2--; //decrementa 1
        System.out.println(numero2);
        numero2--; //decrementa 1
        System.err.println(numero2);



        boolean variavel = true;
        System.out.println(variavel);

        System.out.println(!variavel); // ! nega algo. (inverte o valor de uma variavel booleana)


    }
}
