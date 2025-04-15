package Recursividad;


//import java.util.Scanner;

public class Suma {
    public static int llamadaRecursivas=1;

    public static int SumaConsecutivos(int numero){ 
        int idActual= llamadaRecursivas++;

        System.out.println("LLamada a"+idActual+"con numero n = "+numero);

        //if (numero==1){
        if (numero==1){
            System.out.println("LLamada a"+idActual+"caso base alcanzado n = 1");
            return 1;
           }//else{
               // return numero+Suma(numero-1);
           // }
           System.out.println("LLamada a"+idActual+"Llamando recursivamente con n ="+(numero-1));

           int resultadoParcial= SumaConsecutivos(numero-1);
           int resultado =numero + resultadoParcial;

           System.out.println("LLamada a"+idActual+"sumando "+numero+"al resultado de"+resultadoParcial+" = "+ resultado);

           System.out.println("LLamada a"+idActual+"Retorno"+resultado);
           return resultado;
    }

    //public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        

        //System.out.println("Ingrese el numero que desea sumar");
       // int numero=sc.nextInt();

       // int resultado=Suma(numero);

        //System.out.println("La suma de los numero de 1 al "+numero+" es "+resultado);

    //}
    

}
