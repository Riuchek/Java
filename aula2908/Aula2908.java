package aula2908;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula2908 {

    public static void main(String[] args) {
        Imovel imo[] = new Imovel[8];
        try {
            lerDados(imo);
            exibir(imo);
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }

    public static void lerDados(Imovel imo[]) throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);  // Lê o Arquivo
        for (int i = 0; i < imo.length; i++) {
            imo[i] = new Imovel(scan.nextInt(), scan.next().charAt(0),
                    scan.nextDouble(), scan.next());
        }
    }

    public static void exibir(Imovel imo[]) {
        
        for (int i = 0; i < imo.length; i++) {
            System.out.printf("%14d %14c %14.2f %14s\n",
                    imo[i].cod, imo[i].categoria,
                    imo[i].aluguelbase, imo[i].situacao);
        }
    }
}
