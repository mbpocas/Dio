public class Conta {
	//variavel da classe conta, podera ser usada em qualquer lugar / metódo
	double saldo=10.0;

	public void sacar(Double valor) {
		//2 variaveis local de método (parametro valor | novoSaldo)
		double novoSaldo = saldo - valor;
    System.out.println(novoSaldo);
	}
	public void imprimirSaldo(){
		//disponível em toda classe - declarada no começo
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel (novoSaldo)
		//System.out.println(novoSaldo);

	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for

		return valorMontante;
	}
}
