
package prog;

import java.util.Scanner;

/**
 *
 * @author TESTE
 */
public class Prog {

    static void soma (int a, int b)
            
    {
     int s = a+b;
        System.out.println("A soma é "+ s);
    }
    
    
    
  public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
     float heightf = 0;
     System.out.println("Type the height (between 1 and 15):");
      while (heightf<1 || heightf >60)
      {
       heightf= teclado.nextFloat();
      }
      int height = Math.round(heightf);
      System.out.println("Value:    "+height);
      
    
      
     for (int linha =1; linha<=height; linha++)
      {
          
          for (int i1 = 1; i1<=height-linha;i1++)
          {
              System.out.print(" ");
          }
          for (int i1 = 1; i1<=linha*2+1;i1++)
          {
            char x=   (i1 == linha+1 && i1>1)? ' ':'#';
            System.out.print(x);
          }
          
          
             
          System.out.println("");
}
      
      
      //       //PROGRAMA PAARA SORTEIO

        /**int num = (int) Math.ceil(Math.random()*26);
        char letra = 'A';
        for (int i=1; i<num; i++)
        {
            letra++;            
        }
        System.out.println(letra);
        
        
        
        //PROGRAMA PARA FATORIAL
  
   /** Scanner teclado = new Scanner (System.in);
    
      System.out.print("Digite um número inteiro entre 1 e 20: ");
      int valor = teclado.nextInt();
long fat = (long) valor;
           for (int i =  valor-1; i>0; i--)
           {
                fat = fat * (long)i;
            }
           
      System.out.println("O fatorial de " + valor + " é " + fat);
       */
}
}