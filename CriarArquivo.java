// questão 3

import java.io.File; //ja faz parte do pacote do java
import java.io.IOException;
import java.util.Scanner;

public class CriarArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo a ser criado: ");
        String caminho = scanner.nextLine();
        File arquivo = new File(caminho);

        //tratamento excecao
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso: " + arquivo.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe no caminho especificado.");
            }
        } catch (IOException e) {
            System.out.println("Caminho inválido");
        } finally {
            scanner.close();
        }
    }
}
