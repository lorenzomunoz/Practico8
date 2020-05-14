/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratico8;

/**
 *
 * @author Lorenzo
 */
public class Matriz {
   
    
    
    public void armar(){
        int  [][] numeros;//={{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        int n=3;
        numeros = new int [4][];
        /////////////////////
        numeros[0] = new int [4];
        numeros[1] = new int [3];
        numeros[2] = new int [5];
        numeros[3] = new int [2];
        ///////////////////////
       
        for(int filas=0;filas<numeros.length;filas ++)
        {
            
            for(int columnas=0;columnas<numeros[filas].length;columnas ++){
                numeros[filas][columnas]= n;
                System.out.print(numeros[filas][columnas]+ " ");
                n=n+3;
            }
             System.out.println();
        }
        
         System.out.println();
         System.out.println("Pares");
         
         int s=1;
          for(int filas=0;filas<numeros.length;filas ++)
          { 
            System.out.print("Fila "+s+": ");
            
            for(int columnas=0;columnas<numeros[filas].length;columnas ++){
                if(numeros[filas][columnas]%2==0)
                {
                System.out.print(numeros[filas][columnas]+" ");               
                }
            }s= s+1;
             System.out.println();
        }
    }
}
