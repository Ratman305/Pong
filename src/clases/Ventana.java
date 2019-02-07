/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;

/**
 *
 * @author ratman305
 */
public class Ventana extends JFrame
{
    private final int ANCHO = 800, ALTO = 500;
    private TableroJuego lamina;
    private Hilo hilo;
    public Ventana()
    {
        setTitle("Pong");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null); //Ubica la ventana en el centro
        setResizable(false);
        lamina = new TableroJuego();
        add(lamina);
        hilo = new Hilo(lamina);
        hilo.start();
    }   
}
