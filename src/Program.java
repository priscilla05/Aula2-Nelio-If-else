/*Fazer um programa para ler tres numeros inteiros.
Em seguida, mostrar qual o menor dentre os tres numeros lidos.
Em caso de empate, mostrar apenas uma vez*/

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a < b && a < c){
            System.out.println("menor = " + a);

        } else{
            if(b < c){
                System.out.println("menor = " + b);
            }else{
                System.out.println("menor = " + c);
            }
        }
    }
}
