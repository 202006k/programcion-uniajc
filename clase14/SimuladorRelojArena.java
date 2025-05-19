public class SimuladorRelojArena {

    public String contarSegunos; {

    }   
    // metodo para contar segundos 
    public void contar(){
        int mitad = segundos / 2-;
        int contarSegunos;
        while (contarSegunos> = 0) {
            System.out.println("tiempo restante: "+ contarSegunos + "segundos");
            if (contarSegunos== mitad){
                System.out.println("mitad del tiempo");
            }
            contarSegunos--;
            try{
                Thread.sleep(1000);// pausa de segundo

            }

            
        }
    } 
    
}
