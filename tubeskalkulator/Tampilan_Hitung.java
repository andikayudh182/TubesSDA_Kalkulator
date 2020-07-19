/**
 * @Name        : Tampilan_Hitung.java
 * @Author      : Andika Yudha Riyanto 
 * @edit        : Sanjaya Wisnu Ramadhan
 * @description : UI for Calculator (main driver)
 * @IDE         : Apache NetBeans 11.2 
 * @Date        : 17-07-2020
 */
package tubeskalkulator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Stack;

public class Tampilan_Hitung extends javax.swing.JFrame {
 String num;    
    private Stack postfixStack;     
    public Tampilan_Hitung() {
        initComponents();
        num ="";
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        TxtInput = new javax.swing.JTextField();
        Btn_7 = new javax.swing.JButton();
        Btn_4 = new javax.swing.JButton();
        Btn_8 = new javax.swing.JButton();
        Btn_5 = new javax.swing.JButton();
        Btn_2 = new javax.swing.JButton();
        Btn_3 = new javax.swing.JButton();
        Btn_0 = new javax.swing.JButton();
        Btn_KurungBuka = new javax.swing.JButton();
        Btn_Titik = new javax.swing.JButton();
        Btn_SIN = new javax.swing.JButton();
        Btn_KurungTutup = new javax.swing.JButton();
        Btn_SamaDengan = new javax.swing.JButton();
        Btn_Kali2 = new javax.swing.JButton();
        Btn_Bagi = new javax.swing.JButton();
        Btn_toOctal1 = new javax.swing.JButton();
        Btn_Pangkat = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();
        Btn_Exit = new javax.swing.JButton();
        Btn_toBinary = new javax.swing.JButton();
        Btn_Tambah = new javax.swing.JButton();
        Btn_Minus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        Btn_Clear = new javax.swing.JButton();
        Btn_AkarKuadrad = new javax.swing.JButton();
        Btn_AkarKubik = new javax.swing.JButton();
        Btn_Modulus = new javax.swing.JButton();
        Btn_COS = new javax.swing.JButton();
        Btn_toHexa = new javax.swing.JButton();
        Btn_TAN = new javax.swing.JButton();
        Btn_1 = new javax.swing.JButton();
        Btn_6 = new javax.swing.JButton();
        Btn_9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator Expression");
        setForeground(new java.awt.Color(204, 255, 51));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInputActionPerformed(evt);
            }
        });
        jPanel2.add(TxtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 417, 40));

        Btn_7.setBackground(new java.awt.Color(255, 255, 255));
        Btn_7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_7.setText("7");
        Btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, 40));

        Btn_4.setBackground(new java.awt.Color(255, 255, 255));
        Btn_4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_4.setText("4");
        Btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, 40));

        Btn_8.setBackground(new java.awt.Color(255, 255, 255));
        Btn_8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_8.setText("8");
        Btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 145, -1, 40));

        Btn_5.setBackground(new java.awt.Color(255, 255, 255));
        Btn_5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_5.setText("5");
        Btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, 40));

        Btn_2.setBackground(new java.awt.Color(255, 255, 255));
        Btn_2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_2.setText("2");
        Btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 246, -1, 40));

        Btn_3.setBackground(new java.awt.Color(255, 255, 255));
        Btn_3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_3.setText("3");
        Btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 246, -1, 40));

        Btn_0.setBackground(new java.awt.Color(255, 255, 255));
        Btn_0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_0.setText("0");
        Btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 297, -1, 40));

        Btn_KurungBuka.setBackground(new java.awt.Color(255, 255, 255));
        Btn_KurungBuka.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_KurungBuka.setText("(");
        Btn_KurungBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KurungBukaActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_KurungBuka, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 297, 45, 40));

        Btn_Titik.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Titik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Titik.setText(".");
        Btn_Titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TitikActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Titik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, 45, 40));

        Btn_SIN.setBackground(new java.awt.Color(0, 255, 204));
        Btn_SIN.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_SIN.setForeground(new java.awt.Color(0, 0, 102));
        Btn_SIN.setText("SIN");
        Btn_SIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SINActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_SIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 300, 77, 40));

        Btn_KurungTutup.setBackground(new java.awt.Color(255, 255, 255));
        Btn_KurungTutup.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_KurungTutup.setText(")");
        Btn_KurungTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KurungTutupActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_KurungTutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 297, 45, 40));

        Btn_SamaDengan.setBackground(new java.awt.Color(0, 153, 0));
        Btn_SamaDengan.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_SamaDengan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SamaDengan.setText("=");
        Btn_SamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SamaDenganActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_SamaDengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 346, 96, 40));

        Btn_Kali2.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Kali2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Kali2.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Kali2.setText("*");
        Btn_Kali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Kali2ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Kali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 145, 77, 40));

        Btn_Bagi.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Bagi.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Bagi.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Bagi.setText("/");
        Btn_Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BagiActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 196, 77, 40));

        Btn_toOctal1.setBackground(new java.awt.Color(0, 153, 0));
        Btn_toOctal1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toOctal1.setText("toOctal");
        Btn_toOctal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toOctal1ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_toOctal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 199, 77, 41));

        Btn_Pangkat.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Pangkat.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Pangkat.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Pangkat.setText("^");
        Btn_Pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PangkatActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Pangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 245, 77, 43));

        Btn_Reset.setBackground(new java.awt.Color(255, 0, 0));
        Btn_Reset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Reset.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Reset.setText("RESET");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, 147, 40));

        Btn_Exit.setBackground(new java.awt.Color(255, 0, 0));
        Btn_Exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Exit.setText("EXIT");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 234, 40));

        Btn_toBinary.setBackground(new java.awt.Color(0, 153, 0));
        Btn_toBinary.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toBinary.setText("toBinary");
        Btn_toBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toBinaryActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_toBinary, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 248, 77, 43));

        Btn_Tambah.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Tambah.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Tambah.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tambah.setText("+");
        Btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TambahActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 392, 77, 40));

        Btn_Minus.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Minus.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Minus.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Minus.setText("-");
        Btn_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MinusActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 346, 77, 40));

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 245, 230, 211));

        Btn_Clear.setBackground(new java.awt.Color(255, 0, 0));
        Btn_Clear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Clear.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Clear.setText("C");
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 68, 40));

        Btn_AkarKuadrad.setBackground(new java.awt.Color(0, 102, 102));
        Btn_AkarKuadrad.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_AkarKuadrad.setForeground(new java.awt.Color(255, 0, 0));
        Btn_AkarKuadrad.setText("√");
        Btn_AkarKuadrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AkarKuadradActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_AkarKuadrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 147, 77, 41));

        Btn_AkarKubik.setBackground(new java.awt.Color(0, 102, 102));
        Btn_AkarKubik.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_AkarKubik.setForeground(new java.awt.Color(255, 0, 0));
        Btn_AkarKubik.setText("3√");
        Btn_AkarKubik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AkarKubikActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_AkarKubik, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 199, 77, 41));

        Btn_Modulus.setBackground(new java.awt.Color(255, 102, 0));
        Btn_Modulus.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Modulus.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Modulus.setText("%");
        Btn_Modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModulusActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Modulus, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 297, 77, 40));

        Btn_COS.setBackground(new java.awt.Color(0, 255, 204));
        Btn_COS.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_COS.setForeground(new java.awt.Color(0, 0, 102));
        Btn_COS.setText("COS");
        Btn_COS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_COSActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_COS, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 346, 77, 40));

        Btn_toHexa.setBackground(new java.awt.Color(0, 153, 0));
        Btn_toHexa.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toHexa.setText("toHexa");
        Btn_toHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toHexaActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_toHexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 147, 77, 40));

        Btn_TAN.setBackground(new java.awt.Color(0, 255, 204));
        Btn_TAN.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_TAN.setForeground(new java.awt.Color(0, 0, 102));
        Btn_TAN.setText("TAN");
        Btn_TAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TANActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_TAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 392, 77, 40));

        Btn_1.setBackground(new java.awt.Color(255, 255, 255));
        Btn_1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_1.setText("1");
        Btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, -1, 40));

        Btn_6.setBackground(new java.awt.Color(255, 255, 255));
        Btn_6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_6.setText("6");
        Btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 196, -1, 40));

        Btn_9.setBackground(new java.awt.Color(255, 255, 255));
        Btn_9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_9.setText("9");
        Btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 145, -1, 40));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SANDIKA KALKULATOR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 50));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_9ActionPerformed
        Btn_6.setText("9");
        num += "9";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_9ActionPerformed

    private void Btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_6ActionPerformed
        Btn_6.setText("6");
        num += "6";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_6ActionPerformed

    private void Btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_1ActionPerformed
        Btn_1.setText("1");
        num += "1";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_1ActionPerformed

    private void Btn_TANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TANActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        double tan=  (double)ev.getValue();
        double radians = Math.toRadians(tan);
        double tanValue= Math.tan(radians);
        TxtInput.setText("tan("+tan+")="+tanValue);
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_TANActionPerformed

    private void Btn_toHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toHexaActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        long a= (long) ev.getValue();
        TxtInput.setText(Long.toHexString(a));
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_toHexaActionPerformed

    private void Btn_COSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_COSActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        double cos=  (double)ev.getValue();
        double radians = Math.toRadians(cos);
        double cosValue= Math.cos(radians);
        TxtInput.setText("cos("+cos+")="+cosValue);
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_COSActionPerformed

    private void Btn_ModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModulusActionPerformed
        Btn_Modulus.setText("%");
        num += "%";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_ModulusActionPerformed

    private void Btn_AkarKubikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AkarKubikActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        double result=  (double)ev.getValue();
        double kubik = Math.cbrt(result);
        //TxtInput.setText("Akar Kubik dari " + result + " = " + kubik);
        TxtInput.setText("3√" + result + " = " + kubik);
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_AkarKubikActionPerformed

    private void Btn_AkarKuadradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AkarKuadradActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        double result=  (double)ev.getValue();
        double kuadrad = Math.sqrt(result);
        // TxtInput.setText("Akar Kuadrat dari " + result + " = " + kuadrad);
        TxtInput.setText("√" + result + " = " + kuadrad);
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_AkarKuadradActionPerformed

    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        num = TxtInput.getText();
        if (!num.equals("")) {
            TxtInput.setText(num.substring(0, num.length() - 1));
        }
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void Btn_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MinusActionPerformed
        Btn_Minus.setText("-");
        num += "-";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_MinusActionPerformed

    private void Btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TambahActionPerformed
        Btn_Tambah.setText("+");
        num += "+";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_TambahActionPerformed

    private void Btn_toBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toBinaryActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        long a= (long) ev.getValue();
        TxtInput.setText(Long.toBinaryString(a));
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_toBinaryActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_ExitActionPerformed

    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        num = "";
        TxtInput.setText("");
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Btn_PangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PangkatActionPerformed
        Btn_Pangkat.setText("^");
        num += "^";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_PangkatActionPerformed

    private void Btn_toOctal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toOctal1ActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        long a= (long) ev.getValue();
        TxtInput.setText(Long.toOctalString(a));
        TxtArea.setText("Message : \n");

    }//GEN-LAST:event_Btn_toOctal1ActionPerformed

    private void Btn_BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BagiActionPerformed
        Btn_Bagi.setText("/");
        num += "/";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_BagiActionPerformed

    private void Btn_Kali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Kali2ActionPerformed
        Btn_Kali2.setText("*");
        num += "*";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_Kali2ActionPerformed

    private void Btn_SamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SamaDenganActionPerformed
        // Evaluate tree
           
        PrintStream out = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                TxtArea.append(""+(char)(b & 0xFF));
            }
        });
        System.setOut(out);
        System.setErr(out);

        TxtArea.setEditable(false);
        TxtArea.setText("Message : \n");
            //}
        String str = TxtInput.getText();
        Calculator ev = new Calculator(str);

        float a= ev.getValue();
        // if (ev.getValue()==0.0) {
            //TxtArea.append("Missing operand!");

           
        TxtInput.setText(Float.toString(a));
    }//GEN-LAST:event_Btn_SamaDenganActionPerformed

    private void Btn_KurungTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KurungTutupActionPerformed
        Btn_KurungTutup.setText(")");
        num += ")";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_KurungTutupActionPerformed

    private void Btn_SINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SINActionPerformed
        String str = TxtInput.getText();
        Calculator ev = new Calculator(num);
        double sin=  (double)ev.getValue();
        double radians = Math.toRadians(sin);
        double sinValue= Math.sin(radians);
        TxtInput.setText("sin("+sin+")="+sinValue);
        TxtArea.setText("Message : \n");
    }//GEN-LAST:event_Btn_SINActionPerformed

    private void Btn_TitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TitikActionPerformed
        Btn_Titik.setText(".");
        num += ".";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_TitikActionPerformed

    private void Btn_KurungBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KurungBukaActionPerformed
        Btn_KurungBuka.setText("(");
        num += "(";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_KurungBukaActionPerformed

    private void Btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_0ActionPerformed
        Btn_0.setText("0");
        num += "0";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_0ActionPerformed

    private void Btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_3ActionPerformed
        Btn_3.setText("3");
        num += "3";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_3ActionPerformed

    private void Btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_2ActionPerformed
        Btn_2.setText("2");
        num += "2";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_2ActionPerformed

    private void Btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_5ActionPerformed
        Btn_5.setText("5");
        num += "5";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_5ActionPerformed

    private void Btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_8ActionPerformed
        Btn_8.setText("8");
        num += "8";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_8ActionPerformed

    private void Btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_4ActionPerformed
        Btn_4.setText("4");
        num += "4";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_4ActionPerformed

    private void Btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_7ActionPerformed
        Btn_7.setText("7");
        num += "7";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_7ActionPerformed

    private void TxtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInputActionPerformed
        String hasil= "hasilnya";

    }//GEN-LAST:event_TxtInputActionPerformed
    
        
    /**
     * @param args the command line arguments
     */
        
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan_Hitung().setVisible(true);
                
            }
          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_0;
    private javax.swing.JButton Btn_1;
    private javax.swing.JButton Btn_2;
    private javax.swing.JButton Btn_3;
    private javax.swing.JButton Btn_4;
    private javax.swing.JButton Btn_5;
    private javax.swing.JButton Btn_6;
    private javax.swing.JButton Btn_7;
    private javax.swing.JButton Btn_8;
    private javax.swing.JButton Btn_9;
    private javax.swing.JButton Btn_AkarKuadrad;
    private javax.swing.JButton Btn_AkarKubik;
    private javax.swing.JButton Btn_Bagi;
    private javax.swing.JButton Btn_COS;
    private javax.swing.JButton Btn_Clear;
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JButton Btn_Kali2;
    private javax.swing.JButton Btn_KurungBuka;
    private javax.swing.JButton Btn_KurungTutup;
    private javax.swing.JButton Btn_Minus;
    private javax.swing.JButton Btn_Modulus;
    private javax.swing.JButton Btn_Pangkat;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_SIN;
    private javax.swing.JButton Btn_SamaDengan;
    private javax.swing.JButton Btn_TAN;
    private javax.swing.JButton Btn_Tambah;
    private javax.swing.JButton Btn_Titik;
    private javax.swing.JButton Btn_toBinary;
    private javax.swing.JButton Btn_toHexa;
    private javax.swing.JButton Btn_toOctal1;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JTextField TxtInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
