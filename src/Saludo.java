/*Crea un hilo derivando de la clase Thread*/

//@author IMCG

 public class Saludo {
 
    public static void main(String args[]) 
    {
        HiloconThread hilo1=new HiloconThread();
        
        Thread hiloPrincipal=Thread.currentThread();
        
        System.out.println("Soy el hilo principal. Me llamo:"+hiloPrincipal.getName()+ ".Voy a llamar al hilo hijo");
        //se crea un objeto Thread, el hilo hilo1
        hilo1.start();
        //invoca a start() y pone en marcha el hilo hilo1
        System.out.println("Fin del hilo Principal");
    }
  }
 


