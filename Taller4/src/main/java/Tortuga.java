
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public class Tortuga extends Thread{
 
    @Override
    public void run() {
        Randoms random=new Randoms();
        int pasos=0;

        
        do{
            int numero1=random.crearRamdom();
            if (numero1>0 & numero1<=50){
                pasos+=1;
            }else if(numero1>=51 & numero1<=80){
                pasos-=2;
            }else{
                pasos+=3;
            }
            if (pasos>=0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
                }
                int i;
                for(i=0;i<=pasos;i++){
                    System.out.print(".");
                }
                System.out.println("#");
            }else{
                pasos=0;
            }
        }while(pasos<=30);
        System.out.println("gana tortuga");
         System.exit(0);
    }
    
}
