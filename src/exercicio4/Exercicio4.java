package exercicio4;

import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) { 
       
       
       int Valores[] = new int[10];
       int impar = -1; 
       
        for(int i=0; i < Valores.length; i++){
            impar = impar + 2;
            Valores[i] = impar;
            System.out.println(Valores[i]);
        }      

      
        int Vetor[] = new int[5];
        int x;
        int posicao = 0;
        
        Scanner input1 = new Scanner(System.in);
        for(int j = 0; j < Vetor.length; j++){
            Vetor[j] = input1.nextInt();
        }
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite um valor x: ");
        x = input2.nextInt();
        
        
        for(int k = 0; k < Vetor.length; k++){
            posicao++;
            if(Vetor[k] == x){
                System.out.println(x + " esta na posicao " + posicao);
            }
        }

   }    
}