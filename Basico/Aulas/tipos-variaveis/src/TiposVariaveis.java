public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      double salarioMinimo = 2500.42; // R$2.500,00;
      double salarioErrado = 2.500; // 2.5;
      System.out.println(salarioMinimo);
      System.out.println(salarioErrado);


      float pi = 3.14F; // usar o F na frente do valor float

      System.out.println(pi);

      byte idade = 123;
      short ano = 2021;
      String cep = "21070333"; // se começar com zero, talvez tenha que ser outro tipo
      long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo

      System.out.println(idade);
      System.out.println(ano);
      System.out.println(cep);
      System.out.println(cpf);

      // Fortemente Tipado

      short numeroCurto = 250;
      int numeroNormal = numeroCurto;
      short numeroCurto2 = (short) numeroNormal;
      // Casting para converter ^ e não dar erro "adaptação" ajustar precisão de tamanho da variavel

      System.out.println(numeroCurto2);

      int numero = 5;

      numero = 10;

      System.out.print(numero);


      final double VALOR_DE_PI = 3.14;
      // VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

    }


}
