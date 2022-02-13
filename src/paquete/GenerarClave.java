/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;
import java.util.Random;

public class GenerarClave 
{
    private String car="", clave="", dig = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789@$%^&*#!?/:;<>,.";
    private int pos;
    private boolean min, may, num, esp, general;
    private Random obr = new Random();
    
    public void GClave()
    {
        clave="";
        for (pos = 0; pos < 8; pos++)
            clave += dig.charAt(obr.nextInt(80));
    }
    
    public void Comprobar()
    {
        do
        {
            boolean min=false, may=false, num=false, esp=false, general=false;
                for (pos = 0; pos < 8; pos++)
                {
                    car=""+clave.charAt(pos);
                    if(((dig.substring(0, 27)).contains(car))&&may==false)
                        may=true;
                    else
                    {
                        if(((dig.substring(27, 54)).contains(car))&&min==false)
                            min=true;
                        else
                        {
                           if(((dig.substring(54, 64)).contains(car))&&num==false)
                                num=true;
                            else
                                if(((dig.substring(64, 80)).contains(car))&&esp==false)
                                    esp=true;
                        }
                    }
                }
                if((min==true)&&(may==true)&&(num==true)&&(esp==true))
                {
                    general=true;
                    break;
                }
                else
                    this.GClave();
        }
        while(general==false);
    }    
        public void Mostrar()
        {
            this.GClave();
            this.Comprobar();
            System.out.println(clave);
            
        }
    }

