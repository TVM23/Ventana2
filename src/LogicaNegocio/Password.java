/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.Random;

public class Password {
    private int tamano;
    private String contrasena;
    
    public Password(int tam)
    {
        tamano=tam;
        contrasena="";
    }
    
    public Password(String clave)
    {
        tamano = clave.length();
        contrasena = clave;
        
    }
    
    public String generarContra()
    {
        int valor;
        for(int i = 0; i<tamano; i++)
        {
            Random rnd = new Random();
            valor = rnd.nextInt(4);
            switch(valor)
            {
                case 0:
                    contrasena+=generarLetraMayuscula();
                    break;
                case 1:
                    contrasena+=generarLetraMinuscula();
                    break;
                case 2:
                    contrasena+=generarNumeros();
                    break;
                case 3:
                    contrasena+=generarCaracterEspecial();
                   break;
            }
        }
        return contrasena;
    }
    
    public char generarLetraMayuscula()
    {
        //rango de 65-90
        return(char)(int)(Math.random()*26+65);
        //genera 26 numeros iniciando desde 65
    }
    
    public char generarLetraMinuscula()
    {
        return(char)(int)(Math.random()*26+97);
    }
    
    public int generarNumeros()
    {
        return (int)(Math.random()*9+0);
    }
    
    public char generarCaracterEspecial()
    {
        char[] caracteresEspeciales = {',', '@', '#', '$', '%', '^', '&', '(', ')', '?','<','>','!'};
        return caracteresEspeciales[(int)(Math.random()*13+0)];
    }
}
