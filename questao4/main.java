public class SistemaGeometria {
    public static void main(String[] args) {
        try {
            Triangulo triangulo1 = new Triangulo(3, 4, 5);
            System.out.println(triangulo1);

            triangulo1.setLado1(10);
            System.out.println("Após alterar lado1: " + triangulo1);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite os três lados de um triângulo:");
            int lado1 = scanner.nextInt();
            int lado2 = scanner.nextInt();
            int lado3 = scanner.nextInt();

            Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);
            System.out.println("Triângulo criado: " + triangulo2);

            scanner.close();
        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
