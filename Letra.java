import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
      // scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número: ");
        int posicao = scanner.nextInt();

        // validacao
        if (posicao >= 0 && posicao < nome.length()) {
            char letra = nome.charAt(posicao);
            System.out.println("O caractere na posição " + posicao + " é: " + letra);
        // excecao
        } else {
            System.out.println("Posição inválida!");
        }

        scanner.close();
    }
}
