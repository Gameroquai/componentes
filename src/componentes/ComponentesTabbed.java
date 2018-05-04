/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;


public class ComponentesTabbed extends JTabbedPane{
    JPanel panelBotones, pBotN, pBotS, pBotE, pBotO, pBotC;
    JButton botonN1, botonN2, botonS1, botonS2, botonS3;
    JRadioButton radioO1, radioO2, radioO3;
    JSlider alto, ancho;
    JPanel panelCombos;
    JPanel panelEtiqueta;
    JPanel panelTextos;
    
    public ComponentesTabbed() throws HeadlessException {
        
        panelBotones = new JPanel(new BorderLayout());
        panelCombos = new JPanel();
        panelEtiqueta = new JPanel();
        panelTextos = new JPanel();
        
        pBotN = new JPanel(new FlowLayout());
        pBotN.setBorder(BorderFactory.createLineBorder(Color.yellow));
        pBotE = new JPanel();
        pBotE.setBorder(BorderFactory.createLineBorder(Color.blue));
        pBotC = new JPanel();
        pBotC.setBorder(BorderFactory.createLineBorder(Color.magenta));
        pBotO = new JPanel();
        pBotO.setBorder(BorderFactory.createLineBorder(Color.orange));
        pBotO.setPreferredSize(new Dimension(80, HEIGHT));
        pBotS = new JPanel();
        pBotS.setBorder(BorderFactory.createLineBorder(Color.red));
        
        botonN1 = new JButton("Primero");
        botonN2 = new JButton("Segundo");
        alto = new JSlider(VERTICAL, 0, 100, 50);
        alto.
        ancho = new JSlider(VERTICAL, 0, 100, 50);
        
        
        panelBotones.add(pBotN, BorderLayout.NORTH);
        panelBotones.add(pBotE, BorderLayout.EAST);
        panelBotones.add(pBotC, BorderLayout.CENTER);
        panelBotones.add(pBotO, BorderLayout.WEST);
        panelBotones.add(pBotS, BorderLayout.SOUTH);
        
        pBotN.add(botonN1);
        pBotN.add(botonN2);
        pBotO.add(alto);
        pBotO.add(ancho);
                
        addTab("Botones", panelBotones);
        addTab("Combos", panelCombos);
        addTab("Etiquetas", panelEtiqueta);
        addTab("Textos", panelTextos);
    }
    
}
