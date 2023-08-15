package sala1508;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Sala1508 {
    public static void main(String[] args) {
        File arq = new File("dados");
        Imovel imo[] = new Imovel[8];    
        
        
        try {
            Scanner scan = new Scanner(arq);
            for (int  i = 0;  i < imo.length;  i++) {
            imo[i] = new Imovel();
            imo[i].cod = scan.nextInt();
            imo[i].categoria = scan.next().charAt(0);
            imo[i].aluguelBase = scan.nextDouble();
            imo[i].situacao = scan.next();
                System.out.printf("%14d %14c %14.2f %14s\n",imo[i].cod,imo[i].categoria,imo[i].aluguelBase,imo[i].situacao);
            
        }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi encontrado");  
        }
        
     }
    
}
