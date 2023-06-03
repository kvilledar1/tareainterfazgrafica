
package calculadora.poo;

import java.util.Random;

/**
 *
 * @author Alfredo Villeda
 */
public class InterfazSwimg extends javax.swing.JFrame {
    CalculadoraEspecial ce = new CalculadoraEspecial("Especial", "Verde", 15, "abc123", "kim");
    public InterfazSwimg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgbotones = new javax.swing.JPanel();
        num1txt = new javax.swing.JTextField();
        num2txt = new javax.swing.JTextField();
        cebtn = new javax.swing.JButton();
        sumabtn = new javax.swing.JButton();
        multibtn = new javax.swing.JButton();
        raizcubibtn = new javax.swing.JButton();
        menosbtn = new javax.swing.JButton();
        dividirbtn = new javax.swing.JButton();
        potenciabtn = new javax.swing.JButton();
        Senobtn = new javax.swing.JButton();
        Cosbtn = new javax.swing.JButton();
        Tanbtn = new javax.swing.JButton();
        numpbtn = new javax.swing.JButton();
        Numalebtn = new javax.swing.JButton();
        raizcubtn = new javax.swing.JButton();
        Lnbtn = new javax.swing.JButton();
        sumabtn13 = new javax.swing.JButton();
        resultadotxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 420));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(400, 430));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgbotones.setBackground(new java.awt.Color(102, 102, 255));
        bgbotones.setPreferredSize(new java.awt.Dimension(400, 280));
        bgbotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num1txt.setBackground(new java.awt.Color(0, 255, 255));
        num1txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        num1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1txt.setText("Primer Numero");
        num1txt.setToolTipText("");
        num1txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                num1txtMousePressed(evt);
            }
        });
        bgbotones.add(num1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        num2txt.setBackground(new java.awt.Color(51, 255, 255));
        num2txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        num2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2txt.setText("Segundo Numero");
        num2txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                num2txtMousePressed(evt);
            }
        });
        bgbotones.add(num2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 30));

        cebtn.setBackground(new java.awt.Color(255, 51, 102));
        cebtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cebtn.setText("CE");
        cebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cebtnMousePressed(evt);
            }
        });
        cebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cebtnActionPerformed(evt);
            }
        });
        bgbotones.add(cebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 10, 60, 40));

        sumabtn.setBackground(new java.awt.Color(255, 255, 204));
        sumabtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sumabtn.setText("+");
        sumabtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sumabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumabtnMousePressed(evt);
            }
        });
        bgbotones.add(sumabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        multibtn.setBackground(new java.awt.Color(255, 255, 204));
        multibtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        multibtn.setText("*");
        multibtn.setToolTipText("*");
        multibtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                multibtnMousePressed(evt);
            }
        });
        bgbotones.add(multibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 30, 30));

        raizcubibtn.setBackground(new java.awt.Color(255, 204, 204));
        raizcubibtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        raizcubibtn.setText("3√");
        raizcubibtn.setToolTipText("3√");
        raizcubibtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raizcubibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raizcubibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                raizcubibtnMousePressed(evt);
            }
        });
        raizcubibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizcubibtnActionPerformed(evt);
            }
        });
        bgbotones.add(raizcubibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 30));

        menosbtn.setBackground(new java.awt.Color(255, 255, 204));
        menosbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        menosbtn.setText("-");
        menosbtn.setToolTipText("-");
        menosbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menosbtnMousePressed(evt);
            }
        });
        bgbotones.add(menosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 30, 30));

        dividirbtn.setBackground(new java.awt.Color(255, 255, 204));
        dividirbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        dividirbtn.setText("/");
        dividirbtn.setToolTipText("/");
        dividirbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dividirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dividirbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dividirbtnMousePressed(evt);
            }
        });
        bgbotones.add(dividirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        potenciabtn.setBackground(new java.awt.Color(255, 255, 51));
        potenciabtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        potenciabtn.setText("^");
        potenciabtn.setToolTipText("^");
        potenciabtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        potenciabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        potenciabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                potenciabtnMousePressed(evt);
            }
        });
        potenciabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciabtnActionPerformed(evt);
            }
        });
        bgbotones.add(potenciabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 30, 30));

        Senobtn.setBackground(new java.awt.Color(255, 255, 204));
        Senobtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Senobtn.setText("Sin");
        Senobtn.setToolTipText("Sin");
        Senobtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Senobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Senobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SenobtnMousePressed(evt);
            }
        });
        Senobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenobtnActionPerformed(evt);
            }
        });
        bgbotones.add(Senobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        Cosbtn.setBackground(new java.awt.Color(255, 255, 204));
        Cosbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Cosbtn.setText("Cos");
        Cosbtn.setToolTipText("Cos");
        Cosbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CosbtnMousePressed(evt);
            }
        });
        Cosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CosbtnActionPerformed(evt);
            }
        });
        bgbotones.add(Cosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 30, 30));

        Tanbtn.setBackground(new java.awt.Color(255, 255, 204));
        Tanbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Tanbtn.setText("Tan");
        Tanbtn.setToolTipText("Tan");
        Tanbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tanbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TanbtnMousePressed(evt);
            }
        });
        Tanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanbtnActionPerformed(evt);
            }
        });
        bgbotones.add(Tanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 40, 30));

        numpbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        numpbtn.setText("Num primo");
        numpbtn.setToolTipText("Num Primo");
        numpbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numpbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numpbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numpbtnMousePressed(evt);
            }
        });
        numpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numpbtnActionPerformed(evt);
            }
        });
        bgbotones.add(numpbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 30));

        Numalebtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Numalebtn.setText("Num Aleatorio");
        Numalebtn.setToolTipText("Num Aleatorio");
        Numalebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Numalebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Numalebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NumalebtnMousePressed(evt);
            }
        });
        Numalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumalebtnActionPerformed(evt);
            }
        });
        bgbotones.add(Numalebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 100, 30));

        raizcubtn.setBackground(new java.awt.Color(255, 204, 204));
        raizcubtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        raizcubtn.setText("√");
        raizcubtn.setToolTipText("√");
        raizcubtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raizcubtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raizcubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                raizcubtnMousePressed(evt);
            }
        });
        raizcubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizcubtnActionPerformed(evt);
            }
        });
        bgbotones.add(raizcubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 30, 30));

        Lnbtn.setBackground(new java.awt.Color(255, 204, 204));
        Lnbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Lnbtn.setText("Ln");
        Lnbtn.setToolTipText("Ln");
        Lnbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lnbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LnbtnMousePressed(evt);
            }
        });
        Lnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnbtnActionPerformed(evt);
            }
        });
        bgbotones.add(Lnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, 30));

        sumabtn13.setBackground(new java.awt.Color(255, 204, 204));
        sumabtn13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sumabtn13.setText("Ln");
        sumabtn13.setToolTipText("Ln");
        sumabtn13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sumabtn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumabtn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumabtn13MousePressed(evt);
            }
        });
        sumabtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabtn13ActionPerformed(evt);
            }
        });
        bgbotones.add(sumabtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 30, 30));

        bg.add(bgbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 280));

        resultadotxt.setEditable(false);
        resultadotxt.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        resultadotxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultadotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadotxtActionPerformed(evt);
            }
        });
        bg.add(resultadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadotxtActionPerformed

    private void cebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cebtnMousePressed
        
    }//GEN-LAST:event_cebtnMousePressed

    private void num1txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1txtMousePressed
        if(num1txt.getText().equals("Primer Numero")){
           num1txt.setText("");
        }
        if(num2txt.getText().equals("Segundo Numero")){
           num2txt.setText("Segundo Numero");
        }
    }//GEN-LAST:event_num1txtMousePressed

    private void num2txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2txtMousePressed
        if(num2txt.getText().equals("Segundo Numero")){
        num2txt.setText("");
        }
        if(num1txt.getText().equals("Primer Numero")){
        num1txt.setText("Primer Numero");
        }
    }//GEN-LAST:event_num2txtMousePressed

    private void cebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebtnActionPerformed
        resultadotxt.setText("");
        num1txt.setText("Primer Numero");
        num2txt.setText("Segundo Numero");
    }//GEN-LAST:event_cebtnActionPerformed

    private void sumabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumabtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double num2 = Double.parseDouble(num2txt.getText());
        double resultado = ce.sumar(num1, num2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_sumabtnMousePressed

    private void multibtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multibtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double num2 = Double.parseDouble(num2txt.getText());
        double resultado = ce.multiplicar(num1, num2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_multibtnMousePressed

    private void raizcubibtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizcubibtnMousePressed
double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.calcularRaizCubica((int) num1);
        resultadotxt.setText(String.valueOf(resultado));        // TODO add your handling code here:
    }//GEN-LAST:event_raizcubibtnMousePressed

    private void menosbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosbtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double num2 = Double.parseDouble(num2txt.getText());
        double resultado = ce.restar(num1, num2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_menosbtnMousePressed

    private void dividirbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividirbtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double num2 = Double.parseDouble(num2txt.getText());
        double resultado = ce.dividir(num1, num2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_dividirbtnMousePressed

    private void raizcubibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizcubibtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizcubibtnActionPerformed

    private void potenciabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciabtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double num2 = Double.parseDouble(num2txt.getText());
        double resultado = ce.calcularPotencia(num1, num2);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_potenciabtnMousePressed

    private void potenciabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potenciabtnActionPerformed

    private void SenobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SenobtnMousePressed
          double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.calcularSeno((int) num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_SenobtnMousePressed

    private void SenobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenobtnActionPerformed

    private void CosbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CosbtnMousePressed
double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.calcularCoseno((int) num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_CosbtnMousePressed

    private void CosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CosbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CosbtnActionPerformed

    private void TanbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TanbtnMousePressed
double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.calcularTangente((int) num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_TanbtnMousePressed

    private void TanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanbtnActionPerformed

    private void numpbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numpbtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        boolean resultado = ce.esPrimo((int) num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_numpbtnMousePressed

    private void numpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numpbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numpbtnActionPerformed

    private void NumalebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumalebtnMousePressed
       double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.generarNumeroAleatorio((int) num1);
        resultadotxt.setText(String.valueOf(resultado)); 
    }//GEN-LAST:event_NumalebtnMousePressed

    private void NumalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumalebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumalebtnActionPerformed

    private void raizcubtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizcubtnMousePressed
        double num1 = Double.parseDouble(num1txt.getText());
        double resultado = ce.raizCuadrada(num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_raizcubtnMousePressed

    private void raizcubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizcubtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizcubtnActionPerformed

    private void LnbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LnbtnMousePressed
double num1 = Double.parseDouble(num1txt.getText());
       double resultado = ce.calcularLogaritmo((int) num1);
        resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_LnbtnMousePressed

    private void LnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnbtnActionPerformed

    private void sumabtn13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumabtn13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumabtn13MousePressed

    private void sumabtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabtn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumabtn13ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cosbtn;
    private javax.swing.JButton Lnbtn;
    private javax.swing.JButton Numalebtn;
    private javax.swing.JButton Senobtn;
    private javax.swing.JButton Tanbtn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgbotones;
    private javax.swing.JButton cebtn;
    private javax.swing.JButton dividirbtn;
    private javax.swing.JButton menosbtn;
    private javax.swing.JButton multibtn;
    private javax.swing.JTextField num1txt;
    private javax.swing.JTextField num2txt;
    private javax.swing.JButton numpbtn;
    private javax.swing.JButton potenciabtn;
    private javax.swing.JButton raizcubibtn;
    private javax.swing.JButton raizcubtn;
    private javax.swing.JTextField resultadotxt;
    private javax.swing.JButton sumabtn;
    private javax.swing.JButton sumabtn13;
    // End of variables declaration//GEN-END:variables
}
