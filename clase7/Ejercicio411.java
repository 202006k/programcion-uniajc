import java.util.Scanner;

public class Ejercicio411 {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        
        //solicitar los numeros al ussuario 
        System.out.print("ingrese el primer numero:");
        double num1=scanner.nextDouble();

        System.out.println("ingrese el segundo numero:");
        double num2=scanner.nextDouble();

        //solicitar la operacion 
        System.out.println("selecione la operacion: suma (+), resta (-), multiplicacion(*), divicion(/)");
        char seleccionOP=
        scanner.next().charAt(0);

        double resultado=0;
        boolean operacionValida=true;

        //determinar la operacion a realizar
        if(seleccionOP=="+"){
            resultado=num1+num2;
        }else if(seleccionOP=="-"){
            resultado=num1-num2;
        }else if(seleccionOP=="*"){
            resultado=num1*num2;
        }else if(seleccionOP=="/"){
            if(num2 !=0){
                resultado=num1/num2;
            }else{
                System.out.println("error division por cero.");
                operacionValida=false;
            
            }
        }else{
            System.out.println("operacion no valida");
            operacionValida=false;

        }
        //mostrar el resultado si la operacion fue valida
        if(operacionValida){
            System.out.println("el resultado es:"+resultado);
        }
        scanner.close();
            }
        }
        
        
    
            
    

        

        
        



        
    

    
