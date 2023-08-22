package aula2208;

import java.util.Scanner;

public class Aula2208 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double a, b, result;
        char operador;

        do {
            System.out.println("\nMenu\n"
                    + "+\n"
                    + "-\n"
                    + "*\n"
                    + "/\n"
                    + "s para sair \n"
                    + "Digite a operacao");
            operador = scan.next().charAt(0);
            switch (operador) {
                case '+':
                    somar();
                    break;
                case '-':
                    menos();
                    break;
                case '*':
                    multi();
                    break;
                case '/':
                    div();
                    break;
                default:
                    System.out.println("Digite uma das opções...!!!(┬┬﹏┬┬)");
                    break;
            }
        } while (operador != 's');
    }

    public static void somar() {
        Scanner scan = new Scanner(System.in);
        double a, b, result;
        System.out.println("Digite o primeiro numero");
        a = scan.nextDouble();
        System.out.println("Digite o primeiro numero");
        b = scan.nextDouble();
        result = a + b;
        System.out.println("Soma:" + result);
    }
    public static void menos() {
        Scanner scan = new Scanner(System.in);
        double a, b, result;
        System.out.println("Digite o primeiro numero");
        a = scan.nextDouble();
        System.out.println("Digite o primeiro numero");
        b = scan.nextDouble();
        result = a - b;
        System.out.println("Subtração:" + result);
    }
    public static void multi() {
        Scanner scan = new Scanner(System.in);
        double a, b, result;
        System.out.println("Digite o primeiro numero");
        a = scan.nextDouble();
        System.out.println("Digite o primeiro numero");
        b = scan.nextDouble();
        result = a * b;
        System.out.println("Multiplicação:" + result);
    }
    public static void div() {
        Scanner scan = new Scanner(System.in);
        double a, b, result;
        System.out.println("Digite o primeiro numero");
        a = scan.nextDouble();
        System.out.println("Digite o primeiro numero");
        b = scan.nextDouble();
        result = a / b;
        System.out.println("Divisão:" + result);
    }
    

}
