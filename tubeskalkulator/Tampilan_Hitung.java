/**
 * @Name        : Tampilan_Hitung.java
 * @Author      : Andika Yudha Riyanto 
 * @edit        : Sanjaya Wisnu Ramadhan
 * @description : UI for Calculator (main driver)
 * @IDE         : Apache NetBeans 11.2 
 */
package tubeskalkulator;

public class Tampilan_Hitung extends javax.swing.JFrame {

    String num;

    public Tampilan_Hitung() {
        initComponents();
        num = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_7 = new javax.swing.JButton();
        Btn_8 = new javax.swing.JButton();
        Btn_9 = new javax.swing.JButton();
        Btn_5 = new javax.swing.JButton();
        Btn_4 = new javax.swing.JButton();
        Btn_6 = new javax.swing.JButton();
        Btn_2 = new javax.swing.JButton();
        Btn_3 = new javax.swing.JButton();
        Btn_KurungTutup = new javax.swing.JButton();
        Btn_1 = new javax.swing.JButton();
        Btn_Titik = new javax.swing.JButton();
        Btn_KurungBuka = new javax.swing.JButton();
        TxtInput = new javax.swing.JTextField();
        Btn_0 = new javax.swing.JButton();
        Btn_SamaDengan = new javax.swing.JButton();
        Btn_Bagi = new javax.swing.JButton();
        Btn_Clear = new javax.swing.JButton();
        Btn_Tambah = new javax.swing.JButton();
        Btn_Pangkat = new javax.swing.JButton();
        Btn_Minus = new javax.swing.JButton();
        Btn_toHexa = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();
        Btn_Exit = new javax.swing.JButton();
        Btn_Kali2 = new javax.swing.JButton();
        Btn_toBinary = new javax.swing.JButton();
        Btn_AkarKubik = new javax.swing.JButton();
        Btn_SIN = new javax.swing.JButton();
        Btn_COS = new javax.swing.JButton();
        Btn_TAN = new javax.swing.JButton();
        Btn_Modulus = new javax.swing.JButton();
        Btn_toOctal1 = new javax.swing.JButton();
        Btn_AkarKuadrad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator Expression");
        setForeground(new java.awt.Color(204, 255, 51));

        Btn_7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_7.setText("7");
        Btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_7ActionPerformed(evt);
            }
        });

        Btn_8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_8.setText("8");
        Btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_8ActionPerformed(evt);
            }
        });

        Btn_9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_9.setText("9");
        Btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_9ActionPerformed(evt);
            }
        });

        Btn_5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_5.setText("5");
        Btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_5ActionPerformed(evt);
            }
        });

        Btn_4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_4.setText("4");
        Btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_4ActionPerformed(evt);
            }
        });

        Btn_6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_6.setText("6");
        Btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_6ActionPerformed(evt);
            }
        });

        Btn_2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_2.setText("2");
        Btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_2ActionPerformed(evt);
            }
        });

        Btn_3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_3.setText("3");
        Btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_3ActionPerformed(evt);
            }
        });

        Btn_KurungTutup.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_KurungTutup.setText(")");
        Btn_KurungTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KurungTutupActionPerformed(evt);
            }
        });

        Btn_1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_1.setText("1");
        Btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_1ActionPerformed(evt);
            }
        });

        Btn_Titik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Titik.setText(".");
        Btn_Titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TitikActionPerformed(evt);
            }
        });

        Btn_KurungBuka.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_KurungBuka.setText("(");
        Btn_KurungBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KurungBukaActionPerformed(evt);
            }
        });

        TxtInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInputActionPerformed(evt);
            }
        });

        Btn_0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_0.setText("0");
        Btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_0ActionPerformed(evt);
            }
        });

        Btn_SamaDengan.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_SamaDengan.setText("=");
        Btn_SamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SamaDenganActionPerformed(evt);
            }
        });

        Btn_Bagi.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Bagi.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Bagi.setText("/");
        Btn_Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BagiActionPerformed(evt);
            }
        });

        Btn_Clear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Clear.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Clear.setText("C");
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });

        Btn_Tambah.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Tambah.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Tambah.setText("+");
        Btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TambahActionPerformed(evt);
            }
        });

        Btn_Pangkat.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Pangkat.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Pangkat.setText("^");
        Btn_Pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PangkatActionPerformed(evt);
            }
        });

        Btn_Minus.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Minus.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Minus.setText("-");
        Btn_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MinusActionPerformed(evt);
            }
        });

        Btn_toHexa.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toHexa.setForeground(new java.awt.Color(0, 153, 0));
        Btn_toHexa.setText("toHexa");
        Btn_toHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toHexaActionPerformed(evt);
            }
        });

        Btn_Reset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Reset.setText("RESET");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });

        Btn_Exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Exit.setText("EXIT");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });

        Btn_Kali2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Kali2.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Kali2.setText("*");
        Btn_Kali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Kali2ActionPerformed(evt);
            }
        });

        Btn_toBinary.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toBinary.setForeground(new java.awt.Color(0, 153, 0));
        Btn_toBinary.setText("toBinary");
        Btn_toBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toBinaryActionPerformed(evt);
            }
        });

        Btn_AkarKubik.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_AkarKubik.setForeground(new java.awt.Color(0, 153, 0));
        Btn_AkarKubik.setText("3√");
        Btn_AkarKubik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AkarKubikActionPerformed(evt);
            }
        });

        Btn_SIN.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_SIN.setForeground(new java.awt.Color(0, 255, 204));
        Btn_SIN.setText("SIN");
        Btn_SIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SINActionPerformed(evt);
            }
        });

        Btn_COS.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_COS.setForeground(new java.awt.Color(0, 255, 204));
        Btn_COS.setText("COS");
        Btn_COS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_COSActionPerformed(evt);
            }
        });

        Btn_TAN.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_TAN.setForeground(new java.awt.Color(0, 255, 204));
        Btn_TAN.setText("TAN");
        Btn_TAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TANActionPerformed(evt);
            }
        });

        Btn_Modulus.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Btn_Modulus.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Modulus.setText("%");
        Btn_Modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModulusActionPerformed(evt);
            }
        });

        Btn_toOctal1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_toOctal1.setForeground(new java.awt.Color(0, 153, 0));
        Btn_toOctal1.setText("toOctal");
        Btn_toOctal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_toOctal1ActionPerformed(evt);
            }
        });

        Btn_AkarKuadrad.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn_AkarKuadrad.setForeground(new java.awt.Color(0, 153, 0));
        Btn_AkarKuadrad.setText("√");
        Btn_AkarKuadrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AkarKuadradActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Btn_Exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtInput, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Btn_8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Btn_5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_6)
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn_Bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_toBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(Btn_Pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_toHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Btn_SIN, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Btn_Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Btn_Modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(53, 53, 53)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Btn_TAN, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Btn_COS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_9)
                                    .addGap(45, 45, 45)
                                    .addComponent(Btn_Kali2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_toOctal1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Btn_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Titik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_KurungBuka, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Btn_KurungTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_3))
                                    .addComponent(Btn_SamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_AkarKubik, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_AkarKuadrad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Kali2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_toOctal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_AkarKuadrad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_toBinary, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(Btn_AkarKubik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_toHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_SIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_KurungBuka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_KurungTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_COS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_SamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Titik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_TAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_7ActionPerformed
        Btn_7.setText("7");
        num += "7";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_7ActionPerformed

    private void Btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_8ActionPerformed
        Btn_8.setText("8");
        num += "8";
        TxtInput.setText(num);
    }//GEN-LAST:event_Btn_8ActionPerformed

    private void Btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_9ActionPerformed

        Btn_9.setText("9");
        num += "9";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_9ActionPerformed

    private void Btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_5ActionPerformed
        Btn_5.setText("5");
        num += "5";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_5ActionPerformed

    private void Btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_4ActionPerformed
        Btn_4.setText("4");
        num += "4";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_4ActionPerformed

    private void Btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_6ActionPerformed
        Btn_6.setText("6");
        num += "6";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_6ActionPerformed

    private void Btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_2ActionPerformed
        Btn_2.setText("2");
        num += "2";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_2ActionPerformed

    private void Btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_3ActionPerformed
        Btn_3.setText("3");
        num += "3";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_3ActionPerformed

    private void Btn_KurungTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KurungTutupActionPerformed
        Btn_KurungTutup.setText(")");
        num += ")";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_KurungTutupActionPerformed

    private void Btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_1ActionPerformed
        Btn_1.setText("1");
        num += "1";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_1ActionPerformed

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

    private void Btn_SamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SamaDenganActionPerformed
        // Evaluate tree
        Calculator ev = new Calculator(num);
        float a = ev.getValue();

        TxtInput.setText(Float.toString(a));
    }//GEN-LAST:event_Btn_SamaDenganActionPerformed

    private void TxtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInputActionPerformed
        String hasil = "hasilnya";

    }//GEN-LAST:event_TxtInputActionPerformed

    private void Btn_BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BagiActionPerformed
        Btn_Bagi.setText("/");
        num += "/";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_BagiActionPerformed

    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        num = TxtInput.getText();
        if (!num.equals("")) {
            TxtInput.setText(num.substring(0, num.length() - 1));
        }
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void Btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TambahActionPerformed
        Btn_Tambah.setText("+");
        num += "+";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_TambahActionPerformed

    private void Btn_PangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PangkatActionPerformed
        Btn_Pangkat.setText("^");
        num += "^";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_PangkatActionPerformed

    private void Btn_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MinusActionPerformed
        Btn_Minus.setText("-");
        num += "-";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_MinusActionPerformed

    private void Btn_toHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toHexaActionPerformed
        Calculator ev = new Calculator(num);
        long a = (long) ev.getValue();
        TxtInput.setText(Long.toHexString(a));

    }//GEN-LAST:event_Btn_toHexaActionPerformed

    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        num = "";
        TxtInput.setText("");
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_ExitActionPerformed

    private void Btn_Kali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Kali2ActionPerformed
        Btn_Kali2.setText("*");
        num += "*";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_Kali2ActionPerformed

    private void Btn_toBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toBinaryActionPerformed
        Calculator ev = new Calculator(num);
        long a = (long) ev.getValue();
        TxtInput.setText(Long.toBinaryString(a));

    }//GEN-LAST:event_Btn_toBinaryActionPerformed

    private void Btn_AkarKubikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AkarKubikActionPerformed
        Calculator ev = new Calculator(num);
        double result = (double) ev.getValue();
        double kubik = Math.cbrt(result);
        //TxtInput.setText("Akar Kubik dari " + result + " = " + kubik);
        TxtInput.setText("∛" + result + " = " + kubik);


    }//GEN-LAST:event_Btn_AkarKubikActionPerformed

    private void Btn_SINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SINActionPerformed
        Calculator ev = new Calculator(num);
        double sin = (double) ev.getValue();
        double radians = Math.toRadians(sin);
        double sinValue = Math.sin(radians);
        TxtInput.setText("sin(" + sin + ")=" + sinValue);
    }//GEN-LAST:event_Btn_SINActionPerformed

    private void Btn_COSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_COSActionPerformed
        Calculator ev = new Calculator(num);
        double cos = (double) ev.getValue();
        double radians = Math.toRadians(cos);
        double cosValue = Math.cos(radians);
        TxtInput.setText("cos(" + cos + ")=" + cosValue);
    }//GEN-LAST:event_Btn_COSActionPerformed

    private void Btn_TANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TANActionPerformed
        Calculator ev = new Calculator(num);
        double tan = (double) ev.getValue();
        double radians = Math.toRadians(tan);
        double tanValue = Math.tan(radians);
        TxtInput.setText("tan(" + tan + ")=" + tanValue);
    }//GEN-LAST:event_Btn_TANActionPerformed

    private void Btn_ModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModulusActionPerformed
        Btn_Modulus.setText("%");
        num += "%";
        TxtInput.setText(num);

    }//GEN-LAST:event_Btn_ModulusActionPerformed

    private void Btn_toOctal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_toOctal1ActionPerformed
        Calculator ev = new Calculator(num);
        long a = (long) ev.getValue();
        TxtInput.setText(Long.toOctalString(a));
    }//GEN-LAST:event_Btn_toOctal1ActionPerformed

    private void Btn_AkarKuadradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AkarKuadradActionPerformed
        Calculator ev = new Calculator(num);
        double result = (double) ev.getValue();
        double kuadrad = Math.sqrt(result);
        //TxtInput.setText("Akar Kuadrat dari " + result + " = " + kuadrad);
        TxtInput.setText("√" + result + " = " + kuadrad);
    }//GEN-LAST:event_Btn_AkarKuadradActionPerformed

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
    private javax.swing.JTextField TxtInput;
    // End of variables declaration//GEN-END:variables

}
