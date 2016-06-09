/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andres
 */
public class HiloconThread extends Thread
{
    //clase  que extiende a Thread
    @Override
    public void run() {
    // se redefine el método run() con el código asociado al hilo
        System.out.println("¡Saludo desde un hilo extendiendo thread!.");
        System.out.println("Me llamo:"+getName());
    }
}
