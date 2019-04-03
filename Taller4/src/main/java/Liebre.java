
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
public class Liebre extends Thread{
 
    @Override
    public void run() {
        Randoms random=new Randoms();
        int pasos=0;
        do{
            int numero1=random.crearRamdom();
            if (numero1>0 & numero1<=40){
                pasos+=6;
            }else if(numero1>=41 & numero1<=70){
                pasos+=3;
            }else{
                pasos-=4;
            }
            if(pasos>=0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
                }
                int i;
                for(i=0;i<=pasos;i++){
                    System.out.print(".");
                }
                System.out.println("*");
            }else{
                pasos=0;
            }
        }while(pasos<=30);
        System.out.println("gana liebre");
        System.exit(0);
    }
    
}
