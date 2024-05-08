import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int primeiroParametro = scan.nextInt();
        System.out.println("Digite o segundo parametro");
        int segundoParametro = scan.nextInt();
        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro)
            throw new ParametrosInvalidosException();

        int contagem = segundoParametro - primeiroParametro;
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número: " + x);
        }

    }
}
