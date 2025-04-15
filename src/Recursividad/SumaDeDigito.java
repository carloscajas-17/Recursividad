package Recursividad;
import java.util.Scanner;
public class SumaDeDigito {
    public static int SumaDeDigito(int numero){
        if(numero<10){
            return numero;
        }else{
            int ultimoDigito= numero %10;
            int resto=numero/10;
            return ultimoDigito + SumaDeDigito(resto);
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int resultado= SumaDeDigito(numero);
        System.out.println("La suma de los digitos del numero es: "+resultado);
    }
        
}
