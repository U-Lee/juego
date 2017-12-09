package juego;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anahi, Omar, Pablo
 */
public class diseño {
    public int  usuariogana, maquinagana, ganador;
    
    int volado()
    {
        int x;
        x = (int) (Math.random() * 2);              
        return x;
    }   
    
    int mensaje(int resultadovolado, int valorelegido)
    {
        grafico gr = new grafico();
        if(resultadovolado==0)
        {
            JOptionPane.showMessageDialog(null, "El volado salió águila");
        }
        else{
            JOptionPane.showMessageDialog(null, "El volado salió sol");
        }
        if(resultadovolado==valorelegido)
        {
            JOptionPane.showMessageDialog(null, "¡Acertaste!");
            usuariogana=usuariogana+1;
            ganador=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "La máquina acertó");
            maquinagana=maquinagana+1;
            ganador=0;
        }
        if(usuariogana==2)   //Total de aciertos del usuario para ganar la partida
        {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Le ganaste a la máquina", "Final",JOptionPane.INFORMATION_MESSAGE);
            ganador=100;   //Valor que da la salida
        }
        if(maquinagana==2)   //Total de aciertos de la máquina para ganar la partida
        {
            JOptionPane.showMessageDialog(null, "Perdiste. La máquina ganó", "Final", JOptionPane.ERROR_MESSAGE);
            ganador=100;    //Valor que da la salida
        }
        return ganador;
    }
    
    int conversion(int valorelegido)
    {
        int x;
        if(valorelegido==0)
        {
            JOptionPane.showMessageDialog(null, "La máquina eligió águila");
            valorelegido=1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La máquina eligió sol");
            valorelegido=0;
        }
        return valorelegido;
    }
   
   
}