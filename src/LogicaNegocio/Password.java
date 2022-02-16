/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.Random;

public class Password {
    private int tamano;
    
    public Password(int tamano)
    {
        int tam=tamano;
    }
    
    public String generarContra()
    {
        String contra="";
        int valor;
        for(int i = 0; i<tamano; i++)
        {
            Random rnd = new Random();
            valor = rnd.nextInt(5);
            switch(valor)
            {
                case 0:
                    contra+=generarLetraMayuscula();
                    break;
                case 1:
                    contra+=generarLetraMinuscula();
                    break;
                case 2:
                    contra+=generarNumeros();
                    break;
                //case 3:
                    //contra+=generarCaracterEspecial();
                   //break;
            }
        }
        return contra;
    }
    
    public char generarLetraMayuscula()
    {
        return(char)(int)(Math.random()*90+65);
    }
    
    public char generarLetraMinuscula()
    {
        return(char)(int)(Math.random()*122+97);
    }
    
    public int generarNumeros()
    {
        return (int)(Math.random()*9+0);
    }
    
    public char generarCaracterEspecial()
    {
        return(char)(int)(Math.random()*90+65);
    }
}
