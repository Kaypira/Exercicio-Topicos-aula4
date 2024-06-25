public class Main {
    public static void main(String[] args) {
        int numero = 10; // Exemplo de número inteiro

        // Usando Expressão Lambda
        NumeroAntecessorSucessor nas = n -> {
            System.out.println("Número: " + n);
            System.out.println("Antecessor: " + (n - 1));
            System.out.println("Sucessor: " + (n + 1));
        };

        nas.calcular(numero);
    }

    // Interface Funcional
    interface NumeroAntecessorSucessor {
        void calcular(int n);
    }
}
