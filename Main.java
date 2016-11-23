package seguradora;

public class Main {
    public static void main(String[] args) {
        int op;

        do {
            op = Input.intPrint("Seguradora\n\n  1 - op\n  2 - op\n  3 - op\n\n  0 - Sair", "Opção invalida, tente novamente", "Digite uma opção");

            switch (op) {
                case 0:
                Console.clear();
                    break;
                case 1:
                    PessoaJuridica cliente = new PessoaJuridica();
                    cliente.cadastrar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (op != 0);
    }
}
