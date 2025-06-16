import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro número: ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo número: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
                break; 
            } catch (ParametrosInvalidosException exception) {
                System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro. Tente novamente.\n");
            }
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = parametroUm + 1; i < parametroDois; i++) {
        	System.out.println("###################");
            System.out.println("Imprimindo o número: " + i);
        }
        System.out.println();
        System.out.println("------- Programa Finzalizado ---------");
    }
}


