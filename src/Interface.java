/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Júnior
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Interface extends JFrame {

    private JButton jButton1;

    private JComboBox jComboBox1;

    private JEditorPane jEditorPane1;

    private JLabel jLabel1;

    private JLabel jLabel2;

    private JScrollPane jScrollPane1;

    private JTextField jTextField1;

    public Interface() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jEditorPane1 = new JEditorPane();
        this.jLabel2 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jButton1 = new JButton();
        setDefaultCloseOperation(3);
        setTitle("Conversor de Sistemas de Numeração");
        this.jLabel1.setText("Decimal");
        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jEditorPane1);
        this.jLabel2.setText("Resultado");
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"Binário", "Octal", "Hexadecimal"}));
        this.jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jButton1.setText("Converter");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interface.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(65, 65, 65).addComponent(this.jLabel1)).addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(this.jTextField1, -2, 106, -2))).addGap(43, 43, 43).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox1, -2, 108, -2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jButton1))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(83, 83, 83).addComponent(this.jLabel2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.jScrollPane1, -2, 142, -2).addGap(31, 31, 31))).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jLabel1, -2, 19, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane1, -2, -1, -2).addContainerGap(-1, 32767)))).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jComboBox1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1).addContainerGap(27, 32767)));
        pack();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String numero = this.jTextField1.getText();
        int decimal = Integer.parseInt(numero);
        int opcao = this.jComboBox1.getSelectedIndex();
        switch (opcao) {
            case 0:
                this.jEditorPane1.setText(Conversor.decimalBinario(decimal));
                break;
            case 1:
                this.jEditorPane1.setText(Conversor.decimalOctal(decimal));
                break;
            case 2:
                this.jEditorPane1.setText(Conversor.decimalHexa(decimal));
                break;
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Interface()).setVisible(true);
            }
        });
    }
}
