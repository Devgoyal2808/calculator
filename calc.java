/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class calc extends javax.swing.JFrame {
    int i,j,k;
    char ch;

    /**
     * Creates new form calc
     */
    public calc() {
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

        b10 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bb7 = new javax.swing.JButton();
        bb9 = new javax.swing.JButton();
        bb8 = new javax.swing.JButton();
        bbdi = new javax.swing.JButton();
        bb5 = new javax.swing.JButton();
        bb6 = new javax.swing.JButton();
        bbmu = new javax.swing.JButton();
        bb1 = new javax.swing.JButton();
        bb4 = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();
        bb3 = new javax.swing.JButton();
        bbmi = new javax.swing.JButton();
        bb0 = new javax.swing.JButton();
        bb00 = new javax.swing.JButton();
        bbeq = new javax.swing.JButton();
        bbpl = new javax.swing.JButton();
        bbclr = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bbclr1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b10.setForeground(new java.awt.Color(240, 240, 240));
        b10.setText("1");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        t2.setBackground(new java.awt.Color(240, 240, 240));
        t2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 225, 225));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result");

        bb7.setBackground(new java.awt.Color(0, 0, 0));
        bb7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb7.setForeground(new java.awt.Color(240, 240, 240));
        bb7.setText("7");
        bb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb7ActionPerformed(evt);
            }
        });

        bb9.setBackground(new java.awt.Color(0, 0, 0));
        bb9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb9.setForeground(new java.awt.Color(240, 240, 240));
        bb9.setText("9");
        bb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb9ActionPerformed(evt);
            }
        });

        bb8.setBackground(new java.awt.Color(0, 0, 0));
        bb8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb8.setForeground(new java.awt.Color(240, 240, 240));
        bb8.setText("8");
        bb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb8ActionPerformed(evt);
            }
        });

        bbdi.setBackground(new java.awt.Color(0, 0, 0));
        bbdi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbdi.setForeground(new java.awt.Color(240, 240, 240));
        bbdi.setText("/");
        bbdi.setPreferredSize(new java.awt.Dimension(50, 35));
        bbdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbdiActionPerformed(evt);
            }
        });

        bb5.setBackground(new java.awt.Color(0, 0, 0));
        bb5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb5.setForeground(new java.awt.Color(240, 240, 240));
        bb5.setText("5");
        bb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb5ActionPerformed(evt);
            }
        });

        bb6.setBackground(new java.awt.Color(0, 0, 0));
        bb6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb6.setForeground(new java.awt.Color(240, 240, 240));
        bb6.setText("6");
        bb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb6ActionPerformed(evt);
            }
        });

        bbmu.setBackground(new java.awt.Color(0, 0, 0));
        bbmu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbmu.setForeground(new java.awt.Color(240, 240, 240));
        bbmu.setText("*");
        bbmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbmuActionPerformed(evt);
            }
        });

        bb1.setBackground(new java.awt.Color(0, 0, 0));
        bb1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb1.setForeground(new java.awt.Color(240, 240, 240));
        bb1.setText("1");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });

        bb4.setBackground(new java.awt.Color(0, 0, 0));
        bb4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb4.setForeground(new java.awt.Color(240, 240, 240));
        bb4.setText("4");
        bb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb4ActionPerformed(evt);
            }
        });

        bb2.setBackground(new java.awt.Color(0, 0, 0));
        bb2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb2.setForeground(new java.awt.Color(240, 240, 240));
        bb2.setText("2");
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });

        bb3.setBackground(new java.awt.Color(0, 0, 0));
        bb3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb3.setForeground(new java.awt.Color(240, 240, 240));
        bb3.setText("3");
        bb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb3ActionPerformed(evt);
            }
        });

        bbmi.setBackground(new java.awt.Color(0, 0, 0));
        bbmi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbmi.setForeground(new java.awt.Color(240, 240, 240));
        bbmi.setText("-");
        bbmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbmiActionPerformed(evt);
            }
        });

        bb0.setBackground(new java.awt.Color(0, 0, 0));
        bb0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb0.setForeground(new java.awt.Color(240, 240, 240));
        bb0.setText("0");
        bb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb0ActionPerformed(evt);
            }
        });

        bb00.setBackground(new java.awt.Color(0, 0, 0));
        bb00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bb00.setForeground(new java.awt.Color(240, 240, 240));
        bb00.setText("00");
        bb00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb00ActionPerformed(evt);
            }
        });

        bbeq.setBackground(new java.awt.Color(10, 100, 10));
        bbeq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbeq.setForeground(new java.awt.Color(140, 140, 240));
        bbeq.setText("=");
        bbeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbeqActionPerformed(evt);
            }
        });

        bbpl.setBackground(new java.awt.Color(0, 0, 0));
        bbpl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbpl.setForeground(new java.awt.Color(240, 240, 240));
        bbpl.setText("+");
        bbpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbplActionPerformed(evt);
            }
        });

        bbclr.setBackground(new java.awt.Color(10, 100, 10));
        bbclr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbclr.setForeground(new java.awt.Color(240, 240, 240));
        bbclr.setText("Clr");
        bbclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbclrActionPerformed(evt);
            }
        });

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("operand");

        bbclr1.setBackground(new java.awt.Color(10, 100, 10));
        bbclr1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bbclr1.setForeground(new java.awt.Color(240, 240, 240));
        bbclr1.setText("Backspace");
        bbclr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbclr1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/cross.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bb7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbclr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bb00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbeq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bb2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bb3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbmi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbpl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bb5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bb6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bb8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bb9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbdi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbmu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbclr1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bbclr1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addComponent(bbclr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbdi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbmu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbmi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bb0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbeq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbpl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb9ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+9);
    }//GEN-LAST:event_bb9ActionPerformed

    private void bb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb7ActionPerformed
        // TODO add your handling code here:
       String s=t1.getText();
        t1.setText(s+""+7);
    }//GEN-LAST:event_bb7ActionPerformed

    private void bb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb5ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+5);
    }//GEN-LAST:event_bb5ActionPerformed

    private void bb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb6ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+6);
    }//GEN-LAST:event_bb6ActionPerformed

    private void bbmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbmuActionPerformed
        // TODO add your handling code here:
        i=Integer.parseInt(t1.getText());
        t3.setText("*");
        t1.setText("");
        ch='*';
        int xx=Integer.parseInt(t2.getText());
        if(xx!=0)
        {
            i=xx;
        }
        
    }//GEN-LAST:event_bbmuActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+1);
    }//GEN-LAST:event_bb1ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void bb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb4ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+4);
    }//GEN-LAST:event_bb4ActionPerformed

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb2ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+2);
    }//GEN-LAST:event_bb2ActionPerformed

    private void bb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb3ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+3);
    }//GEN-LAST:event_bb3ActionPerformed

    private void bbmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbmiActionPerformed
        // TODO add your handling code here:
        i=Integer.parseInt(t1.getText());
        t3.setText("-");
        t1.setText("");
        ch='-';
        int xx=Integer.parseInt(t2.getText());
        if(xx!=0)
        {
            i=xx;
        }
    }//GEN-LAST:event_bbmiActionPerformed

    private void bb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb0ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+0);
    }//GEN-LAST:event_bb0ActionPerformed

    private void bb00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb00ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+00);
    }//GEN-LAST:event_bb00ActionPerformed

    private void bbeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbeqActionPerformed
        // TODO add your handling code here:
        j=Integer.parseInt(t1.getText());
        t3.setText("=");
        if(ch=='+')
        {
            k=i+j;
        }
        else
            if(ch=='-')
            {
                k=i-j;
            }
        else
                if(ch=='*')
                {
                    k=i*j;
                }
        else
                    if(ch=='/')
                    {
                        k=i/j;
                    }
        t2.setText(""+k);
         try
        {
            String s11=""+i;
            String s12=""+j;
            String s13=""+k;
            String s14=""+ch;
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/calculator","root","");
            Statement st=c.createStatement();
            int h=st.executeUpdate("insert into history values('"+s11+"','"+s12+"','"+s14+"','"+s13+"')");
        }
         catch(ClassNotFoundException | SQLException ekk)
         {
             System.out.println(ekk);
         }
         
    }//GEN-LAST:event_bbeqActionPerformed

    private void bbplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbplActionPerformed
        // TODO add your handling code here:
        i=Integer.parseInt(t1.getText());
        t3.setText("+");
        t1.setText("");
        ch='+';
        int xx=Integer.parseInt(t2.getText());
        if(xx!=0)
        {
            i=xx;
        }
    }//GEN-LAST:event_bbplActionPerformed

    private void bb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb8ActionPerformed
        // TODO add your handling code here:
        String s=t1.getText();
        t1.setText(s+""+8);
    }//GEN-LAST:event_bb8ActionPerformed

    private void bbdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbdiActionPerformed
        // TODO add your handling code here:
        i=Integer.parseInt(t1.getText());
        t3.setText("/");
        t1.setText("");
        ch='/';
        int xx=Integer.parseInt(t2.getText());
        if(xx!=0)
        {
            i=xx;
        }
    }//GEN-LAST:event_bbdiActionPerformed

    private void bbclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbclrActionPerformed
        // TODO add your handling code here:
        i=0;
        j=0;
        k=0;
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }//GEN-LAST:event_bbclrActionPerformed

    private void bbclr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbclr1ActionPerformed
        // TODO add your handling code here:
        j=Integer.parseInt(t1.getText());
        j=j/10;
       t1.setText(""+j); 
        
    }//GEN-LAST:event_bbclr1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        history1 h1=new history1();
        h1.setVisible(true);
        h1.setSize(1000,500);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b10;
    private javax.swing.JButton bb0;
    private javax.swing.JButton bb00;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bb2;
    private javax.swing.JButton bb3;
    private javax.swing.JButton bb4;
    private javax.swing.JButton bb5;
    private javax.swing.JButton bb6;
    private javax.swing.JButton bb7;
    private javax.swing.JButton bb8;
    private javax.swing.JButton bb9;
    private javax.swing.JButton bbclr;
    private javax.swing.JButton bbclr1;
    private javax.swing.JButton bbdi;
    private javax.swing.JButton bbeq;
    private javax.swing.JButton bbmi;
    private javax.swing.JButton bbmu;
    private javax.swing.JButton bbpl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
