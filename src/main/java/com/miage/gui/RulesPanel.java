/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.miage.gui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Anne-Sophie
 */
public class RulesPanel extends javax.swing.JPanel {

    /**
     * Table of rules pages
     */
    private HashMap<Integer, String> rulesTable;

    /**
     * counter pages
     */
    private int counterPages;

    private JPanel panelContainer;
    
    /**
     * Creates new form RulesPanel
     */
    public RulesPanel( JPanel panelContainer ) {
        
        this.panelContainer = panelContainer;
        rulesTable = new HashMap<Integer, String>();
        rulesTable.put(1, "/reglesP1.png");
        rulesTable.put(2, "/reglesP2.png");
        rulesTable.put(3, "/reglesP3.png");
        rulesTable.put(4, "/reglesP4.png");
        rulesTable.put(5, "/reglesP5.png");
        rulesTable.put(6, "/reglesP6.png");
        rulesTable.put(7, "/reglesP7.png");
        rulesTable.put(8, "/reglesP8.png");
        rulesTable.put(9, "/reglesP9.png");
        rulesTable.put(10, "/reglesP10.png");

        counterPages = 1;

        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rulesScrollPane = new javax.swing.JScrollPane();
        rulesLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        crossLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rulesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reglesP1.png"))); // NOI18N
        rulesScrollPane.setViewportView(rulesLabel);

        add(rulesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 1260, 520));

        titleLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        titleLabel.setText("Règles du jeu");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 310, 80));

        nextButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        nextButton.setText("Suivant");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 160, -1));

        previousButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        previousButton.setText("Précédent");
        previousButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousButtonMouseClicked(evt);
            }
        });
        add(previousButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 160, -1));

        crossLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/croix_fermer.png"))); // NOI18N
        crossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossLabelMouseClicked(evt);
            }
        });
        add(crossLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rulesBackground.jpg"))); // NOI18N
        add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * when mouse click on next button
     * @param evt 
     */
    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        if (counterPages < 10) {
            counterPages++;
            String namePage;
            namePage = rulesTable.get(counterPages);
            rulesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(namePage)));
        }
    }//GEN-LAST:event_nextButtonMouseClicked

    /**
     * when mouse click on previous button
     * @param evt 
     */
    private void previousButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousButtonMouseClicked
        if (counterPages > 1) {
            counterPages--;
            String namePage;
            namePage = rulesTable.get(counterPages);
            rulesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(namePage)));
        }
    }//GEN-LAST:event_previousButtonMouseClicked

    /**
     * when mouse click on cross button
     * @param evt 
     */
    private void crossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossLabelMouseClicked
        removeAll();
        PanelHome home = null;
        try {
            home = new PanelHome( this.panelContainer );
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        updateUI();
    }//GEN-LAST:event_crossLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel crossLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel rulesLabel;
    private javax.swing.JScrollPane rulesScrollPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
