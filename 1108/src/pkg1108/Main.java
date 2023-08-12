package pkg1108;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        File arq = new File("dados");
        int codigo[] = new int[8];
        String descricao[] = new String[8];
        int estoque[] = new int[8];
        int estoqueMinimo[] = new int[8];
        double precoUnit[] = new double[8];

        try {
            Scanner scan = new Scanner(arq);
            Scanner scan2 = new Scanner(System.in);
            for (int i = 0; i < 8; i++) {
                codigo[i] = scan.nextInt();
                descricao[i] = scan.next();
                estoque[i] = scan.nextInt();
                estoqueMinimo[i] = scan.nextInt();
                precoUnit[i] = scan.nextDouble();
                System.out.printf("%14d %14s %14d %14d %14.2f\n", codigo[i], descricao[i],
                        estoque[i], estoqueMinimo[i], precoUnit[i]
                );
            }
            for (int i = 0; i < 8; i++) {
                if (estoque[i] < estoqueMinimo[i]) {
                    System.out.println("O produto de codigo " + codigo[i] + " precisa ser reposto, digite a quantidade de produtos a ser adicionado no estoque.");
                    int qtde = scan2.nextInt();
                    estoque[i] =  estoque[i] + qtde;
                    System.out.println("o estoque foi atualizado para " + estoque[i]);
                    if (estoque[i]<estoqueMinimo[i]) {
                        System.out.println("Precisa ser adicionado mais produtos ao estoque");
                        qtde = scan2.nextInt();
                        estoque[i] =  estoque[i] + qtde;
                        System.out.println("o estoque foi atualizado para " + estoque[i]);
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
