/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 9, 6, 11, -1}; //inicializando um vetor com 5 elementos.

        int count = 0; //o contador inicia em 0
        System.out.print("Vetor: "); //Frase ilustrativa

        //loop
        while (count < (vetor.length)) { //enquanto o contador tiver o valor menor que o tamanho do vetor
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posição indicada pelo contador.
            count++; //diminua o valor 1 do contador a cada loop
        }

        System.out.println("\n----------------------"); //separar os vetores

        System.out.print("Inverso: "); //Frase ilustrativa
        for(int i = (vetor.length - 1); i >= 0; i--){ // vetor.length - 1 por causa do tamnho(6) e posições(5)
          System.out.print(vetor[i] + " ");
        }

        /*loop for-each
        for (int elemento : vetor) { //para cada elemento dentro do vetor
            System.out.print(elemento + " "); //imprima o elemento
        } */
    }
}
