/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;


public class ComponentesTabbed extends JTabbedPane{
    JPanel panelBotones, pBotN, pBotS, pBotE, pBotO, pBotC;
    JPanel panelCombos;
    JPanel panelEtiqueta;
    JPanel panelTextos;
    
    public ComponentesTabbed() throws HeadlessException {
        
        panelBotones = new JPanel(new BorderLayout());
        panelCombos = new JPanel();
        panelEtiqueta = new JPanel();
        panelTextos = new JPanel();
        
        pBotN = new JPanel();
        pBotN.setBorder(BorderFactory.createLineBorder(Color.yellow));
        pBotE = new JPanel();
        pBotE.setBorder(BorderFactory.createLineBorder(Color.blue));
        pBotC = new JPanel();
        pBotC.setBorder(BorderFactory.createLineBorder(Color.magenta));
        pBotO = new JPanel();
        pBotO.setBorder(BorderFactory.createLineBorder(Color.orange));
        pBotS = new JPanel();
        pBotS.setBorder(BorderFactory.createLineBorder(Color.red));
                
        panelBotones.add(pBotN, BorderLayout.NORTH);
        panelBotones.add(pBotE, BorderLayout.EAST);
        panelBotones.add(pBotC, BorderLayout.CENTER);
        panelBotones.add(pBotO, BorderLayout.WEST);
        panelBotones.add(pBotS, BorderLayout.SOUTH);
        
                
        addTab("Botones", panelBotones);
        addTab("Combos", panelCombos);
        addTab("Etiquetas", panelEtiqueta);
        addTab("Textos", panelTextos);
    }
    
}
