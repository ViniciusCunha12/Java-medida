package com.mycompany.bissextos;
import java.util.Scanner;
        
public class Bissextos
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        int ano = 0;
        int result;
                
      System.out.println("degite o ano");
      ano = ler.nextInt();
      
       if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))      
     {
      System.out.printf("o ano e bissexto");       
     }
       else
     {
      System.out.printf("o ano nao e bissexto");
     }
      
    }
}
