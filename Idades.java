//questao 2

import java.util.ArrayList;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
      
        System.out.println("Digite a idade de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        System.out.println("Lista de idades: " + idades);                                   
        System.out.print("Digite a posição da idade que deseja remover (0 a 9): ");

      //tratamento excecao
        try {
            int posicao = scanner.nextInt();
            int idadeRemovida = idades.remove(posicao);
            System.out.println("A idade removida foi: " + idadeRemovida);
            System.out.println("Lista atualizada: " + idades);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        } finally {
            scanner.close();
        }
    }
}
