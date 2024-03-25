package com.mycompany.triangulo;
import java.util.Scanner;

public class Triangulo 
{

    public static void main(String[] args) 
    {
      Scanner ler = new Scanner(System.in);
      
      int lado1 = 0;
      int lado2 = 0;
      int lado3 = 0;
      
      System.out.println("degite o lado1");
      lado1 = ler.nextInt();
      
      System.out.println("degite o lado2");
      lado2 = ler.nextInt();
      
      System.out.println("degite o lado3");
      lado3 = ler.nextInt();
      
      if (lado1 == lado2 && lado2 == lado3)
    {
     System.out.printf("e um triangulo equilatero"); 
    }
      else
      {
      if (lado1 == lado2 && lado3 != lado2 )
    {
     System.out.printf("e um triangulo isosceles");
    }
       else       
    {
     System.out.printf("e um triangulo escaleno");
    }
       }
    }
}
