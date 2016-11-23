package seguradora;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Input{
    static int intErro(){
        Scanner input = new Scanner(System.in);
        int in = 0;
        try {
            in = input.nextInt();
        } catch (InputMismatchException a) {
            in = -666;
            input.nextLine();
        }
        return in;
    }

    static double doubleErro(){
        Scanner input = new Scanner(System.in);
        double in = 0;
        try {
            in = input.nextDouble();
        } catch (InputMismatchException a) {
            in = -666;
            input.nextLine();
        }
        return in;
    }

    static String string(int stringEnd){
        Scanner leitor = new Scanner(System.in);
        String string = new String();
        string = leitor.nextLine();
        if (string.length() > stringEnd){
            string = string.substring(0, stringEnd);
        }
        return string;
    }

    static String stringLimited(String titulo, String erro, String mensagem, int stringEnd){
        Console.clear();
        System.out.printf("\n  %s\n\n\n  %s: ", titulo, mensagem);
        return Input.string(stringEnd);
    }

    static String stringLettersLimited(String titulo, String erro, String mensagem, int stringEnd){
        String retorno = "a";
        do {
            Console.clear();
            System.out.printf("\n  %s\n", titulo);
            if (!checkLetters(retorno)){
                System.out.printf("\n  %s", erro);
            } else {
                System.out.println();
            }
            System.out.printf("\n  %s: ", mensagem);
            retorno = Input.string(stringEnd);
        } while(!checkLetters(retorno));
        return retorno;
    }

    static String stringNumLimited(String titulo, String erro, String erro2, String mensagem, int stringEnd){
        String retorno = "99999999999999999";

        do {
            Console.clear();
            System.out.printf("\n  %s\n", titulo);
            if (!Input.checkNum(retorno)){
                System.out.printf("\n  %s", erro);
            } else if (retorno.length() < stringEnd){
                System.out.printf("\n  %s", erro2);
            } else {
                System.out.println();
            }
            System.out.printf("\n  %s: ", mensagem);
            retorno = Input.string(stringEnd);
        } while(!Input.checkNum(retorno) || retorno.length() < stringEnd);
        return retorno;
    }

    static int intPrint(String titulo, String erro, String mensagem, int in){
        do {
            Console.clear();
            System.out.printf("\n  %s\n", titulo);
            if (in == -666){
                System.out.printf("\n  %s", erro);
            }
            System.out.printf("\n  %s: ", mensagem);
            in = Input.intErro();
        } while(in == -666);
        return in;
    }

    static double doublePrint(String titulo, String erro, String mensagem){
        double in = 0;
        do {
            Console.clear();
            System.out.printf("\n  %s\n", titulo);
            if (in == -666){
                System.out.printf("\n  %s", erro);
            } else {
                System.out.println();
            }
            System.out.printf("\n  %s: ", mensagem);
            in = Input.doubleErro();
        } while(in == -666);
        return in;
    }

    static boolean confirmacaoBoolean(String titulo, String opcao1, String opcao2, boolean clear){
        Scanner input = new Scanner(System.in);
        int in = 0;
        while(true){
            if (clear){
                Console.clear();
            }
            System.out.printf("\n  %s\n\n  1 - %s\n  2 - %s\n", titulo, opcao1, opcao2);
            if(in == -666){
                System.out.print("\n  Opção invalida, tente novamente");
            }
            System.out.print("\n  Escolha uma opcão: ");
            in = Input.intErro();
            if(in == 1){
                return true;
            }else if(in == 2){
                return false;
            }
            in = -666;
        }
    }

    static boolean checkLetters(String string) {
        return string.matches("[a-zA-Z]+");
    }

    static boolean checkNum(String string) {
        return string.matches("[0-9]+");
    }
}
