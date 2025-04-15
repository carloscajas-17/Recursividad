package Ejercicio;

public class EjercicioCompleto {
    //EJERCICIO 1 
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
    }

    //Ejercicio 2

    public class Potencia {
        public static int Potencia(int base, int exponente){
            if (exponente == 0) {
                return 1;
                }else{
                    return base * Potencia(base, exponente - 1);
                
                }
    
        }
    }



    //EJERCICIO 3
    public class SumaDeDigito {
        public static int SumaDeDigito(int numero){
            if(numero<10){
                return numero;
            }else{
                int ultimoDigito= numero % 10;
                int resto=numero/10;
                return ultimoDigito + SumaDeDigito(resto);
            }
        
        }
    }


    //EJERCICIO DE FIBONACCI
    public class Fibonacci {
        
        public int fibonacci(int n){
           
            if(n==0 || n==1){    
            return n;
            }
            
            return fibonacci(n-1) + fibonacci(n-2);
        }
       
        
    }




}
