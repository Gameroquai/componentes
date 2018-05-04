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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ComponentesTabbed extends JTabbedPane implements ActionListener, ChangeListener{
    JPanel      panelBotones, pBotN, pBotS, pBotE, pBotO, pBotC;
    JButton     botonN1, botonN2, botonS1, botonS2, botonS3, botonPrueba;
    JTextField  textoS;
    JCheckBox   checkE1, checkE2, checkE3;
    static JSlider     alto, ancho;
    JLabel      altoL, anchoL, altoV, anchoV;
    JPanel      panelCombos;
    JPanel      panelEtiqueta;
    JPanel      panelTextos;
    
    public ComponentesTabbed() throws HeadlessException {
        
        panelBotones    = new JPanel(new BorderLayout());
        panelCombos     = new JPanel();
        panelEtiqueta   = new JPanel();
        panelTextos     = new JPanel();
        
        //Botones---------------------------------------------------------------
        panelBotones.setBorder(BorderFactory.createTitledBorder("Botones"));
        pBotN = new JPanel(new FlowLayout());
        pBotN.setBorder(BorderFactory.createLineBorder(Color.yellow));
        pBotE = new JPanel();
        pBotE.setBorder(BorderFactory.createLineBorder(Color.blue));
        pBotE.setPreferredSize(new Dimension(100, HEIGHT));
        pBotC = new JPanel();
        pBotC.setBorder(BorderFactory.createLineBorder(Color.magenta));
        pBotO = new JPanel();
        pBotO.setBorder(BorderFactory.createLineBorder(Color.orange));
        pBotO.setPreferredSize(new Dimension(100, HEIGHT));
        pBotS = new JPanel();
        pBotS.setBorder(BorderFactory.createTitledBorder("Panel Sur"));
        
        botonN1 = new JButton("Primero");
        botonN2 = new JButton("Segundo");
        botonPrueba = new JButton("Boton de Prueba");
        
        botonPrueba.setBounds(100, 100, 100, 100);
        System.out.println(botonPrueba.toString());
        
        //Slider----------------------------------------------------------------
        alto = new JSlider(VERTICAL, 0, 200, botonPrueba.getHeight());
        alto.setPaintTicks(true);
        alto.setPaintLabels(true);
        alto.setMajorTickSpacing(30);
        alto.setMinorTickSpacing(15);
        altoL = new JLabel("Alto");
        altoL.setPreferredSize(new Dimension(50, 20));
        altoV = new JLabel("Alto: "+Integer.toString(alto.getValue()));
        altoV.setPreferredSize(new Dimension(75,20));
        ancho = new JSlider(VERTICAL, 0, 400, botonPrueba.getWidth());
        ancho.setPaintTicks(true);
        ancho.setPaintLabels(true);
        ancho.setMajorTickSpacing(50);
        ancho.setMinorTickSpacing(25);
        anchoL = new JLabel("Ancho");
        anchoL.setPreferredSize(new Dimension(50, 20));
        anchoV = new JLabel("Ancho: "+Integer.toString(ancho.getValue()));
        anchoV.setPreferredSize(new Dimension(75,20));
        
        alto.addChangeListener(this);
        ancho.addChangeListener(this);
        //Slider----------------------------------------------------------------
        
        botonS1 = new JButton("Sur 1");
        botonS2 = new JButton("Sur 2");
        botonS3 = new JButton("Sur 3");
        textoS = new JTextField(6);
        textoS.setPreferredSize(new Dimension(WIDTH, 27));
        panelBotones.add(pBotN, BorderLayout.NORTH);
        panelBotones.add(pBotE, BorderLayout.EAST);
        panelBotones.add(pBotC, BorderLayout.CENTER);
        panelBotones.add(pBotO, BorderLayout.WEST);
        panelBotones.add(pBotS, BorderLayout.SOUTH);
        checkE1 = new JCheckBox("Radio 1", false);
        checkE2 = new JCheckBox("Radio 2", false);
        checkE3 = new JCheckBox("Radio 3", false);
        pBotN.add(botonN1);
        pBotN.add(botonN2);
        pBotO.add(anchoL);
        pBotO.add(ancho);
        pBotO.add(anchoV);
        pBotO.add(altoL);
        pBotO.add(alto);
        pBotO.add(altoV);
        pBotC.add(botonPrueba);
        pBotE.add(checkE1);
        pBotE.add(checkE2);
        pBotE.add(checkE3);
        pBotS.add(botonS1);
        pBotS.add(textoS);
        pBotS.add(botonS2);
        pBotS.add(botonS3);
        //Botones---------------------------------------------------------------
        addTab("Botones", panelBotones);
        addTab("Combos", panelCombos);
        addTab("Etiquetas", panelEtiqueta);
        addTab("Textos", panelTextos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }
    
}
