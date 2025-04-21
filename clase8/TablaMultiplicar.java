public class TablaMultiplicar{
    public static void main(String[] args) {
        //Encabezado
        System.out.println("");
        for(int i =1; i<=15;i++){
            System.out.printf("%4d", i);

        }
        System.out.println();
        
        //linea separada 
        System.out.print("**");
        for(int i=1; i<=15; i++){
            System.out.print("****");

        }
        System.out.println();
        
        //cuerpo de la tabla 
        for(int fila=1; fila<=15; fila++);
{
    System.out.printf("%2d*",fila);// Etiqueta de la fila
  for(int col=1;col<=15;col++)
{
    System.out.printf("%4d,fila*col");
}
System.out.println();
}
    }
}



