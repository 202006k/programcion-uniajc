import java.util.Scanner;
public class ExamenFabricadechocolates{
    public static void main(String[] args) {
        Scanner scanner=new
        Scanner(System.in);
        //solicitar la cantidad de barras producidas en un dia
        System.out.print("cantidad de barras pruducidas:");
        int N =scanner.nextInt();
        //calcular costo total de produccion
        double costobarra=2.50;
        double costoempaque=0.50;
        double costototalproduccion=N*
        (costobarra+costoempaque);
        //calcular precio de venta por barra y el, ingreso por dia
        double ganancia=0.30;
        double precioventabarra=(costobarra+costoempaque)*(1+ganancia);
        double ingresototal=N*
        precioventabarra;
        //calcular cuantas cajas completas se pueden llenar y cuantas barras quedan sueltas
        int capacidadcaja=10;
        int cajascompletas=N/capacidadcaja;
        int barrassueltas=N%capacidadcaja;
        //mostrar resultado final
        System.out.println("\nresultados:");
        System.out.println("costo total de produccion:$"+costototalproduccion);
        System.out.println("precio de venta por barra:$"+precioventabarra);
        System.out.println("ingre total del dia:$"+ingresototal);
        System.out.println("cajas completas llenandas:"+cajascompletas);
        System.out.println("baras sueltas:"+barrassueltas);
        scanner.close();


        
        
    }
}
