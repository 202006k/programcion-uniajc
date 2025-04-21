public class EjecutarCirculo {
    public static void main (String[]args){

        double r = 2.3; //radio

        //creación del objeto
        Circulo objCirculo1 = new Circulo(r);

        System.out.println("perimetro: " + objCirculo1.calcularPerimetro());
        
         System.out.println("area: " + objCirculo1.calcularArea());
    }
    
}
