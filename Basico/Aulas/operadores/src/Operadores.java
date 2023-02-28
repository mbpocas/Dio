public class Operadores {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
     //qual o resultado das expressoes abaixo?
      String concatenacao ="?";
      System.out.println(concatenacao);
      concatenacao = 1+1+1+"1";
      System.out.println(concatenacao);
      concatenacao = 1+"1"+1+1;
      System.out.println(concatenacao);
      concatenacao = 1+"1"+1+"1";
      System.out.println(concatenacao);
      concatenacao = "1"+1+1+1;
      System.out.println(concatenacao);
      concatenacao = "1"+(1+1+1);
      System.out.println(concatenacao);


      //Unários
      int numero = 5;
      //Imprimindo o numero negativo
      System.out.println(- numero);

      //incrementando numero em mais 1 numero, imprime 6
      numero ++;
      System.out.println(numero);

      //incrementando numero em mais 1 numero, imprime 7
      System.out.println(numero ++);// Imprimiu 6 e depois a variavel foi alterada para 7

      System.out.println(numero);// agora sim, numero imprime 7

      //ordem de precedencia conta aqui
      System.out.println(++ numero);

      boolean verdadeiro = true;

      System.out.println("Inverteu " + !verdadeiro);


      int a = 5;
      int b = 4;
      System.out.println(a==b);

      String nome = "Mauricio";
      String nome1 = "Mauricio";
      String nome2 = new String("Mauricio"); // Criando novo objeto String - não será igual - false

      System.out.println(nome==nome1);
      System.out.println(nome1==nome2);

      // para verificar o conteúdo usar equals() = verdadeiro
      System.out.println(nome1.equals(nome2));

      int numero1 = 1;
      int numero2 = 1;


      if(numero1== 1 & ++ numero2 == 2 )
          System.out.println("As 2 condições são verdadeiras");

      System.out.println("O numero 1 agora é " + numero1);
      System.out.println("O numero 2 agora é " + numero2);


      //String str = "abc";
      char data[] = {'a', 'b', 'c'};
      String str = new String(data);
      System.out.println(str);


      System.out.println("abc");
      String cde = "cde";
      System.out.println("abc" + cde);
      String c = "abc".substring(2);
      String d = cde.substring(2);

      System.out.println(c);
      System.out.println(d);
    }
}
