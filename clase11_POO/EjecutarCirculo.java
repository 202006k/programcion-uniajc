public class EjecutarCirculo {
    public static void main (String[]args){

        float r= 2.3; //radio

        //creación del objeto
        circulo objCirculo1 = new circulo(r);

        System.out.println("perimetro:" + objCirculo1.calcularPerimetro());
        
         System.out.println("area:" + objCirculo1.calcularArea());
    }
    
}
