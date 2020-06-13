package source;

import javax.swing.JButton;

public class Win計算機 extends javax.swing.JFrame {

    private Double x;
    private Double y;
    private String op;

    private boolean 要先清空 = false;

    public Win計算機() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        btn根號 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn除 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn乘 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn減 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn小數點 = new javax.swing.JButton();
        btn等於 = new javax.swing.JButton();
        btn加 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("計算機");

        txtInput.setEditable(false);
        txtInput.setFont(new java.awt.Font("標楷體", 0, 36)); // NOI18N
        txtInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInput.setText("0");
        txtInput.setToolTipText("");

        jPanel1.setLayout(new java.awt.GridLayout(0, 4, 10, 10));

        btnClear.setBackground(new java.awt.Color(175, 105, 120));
        btnClear.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);

        btnSign.setBackground(new java.awt.Color(52, 59, 80));
        btnSign.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setText("+/-");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });
        jPanel1.add(btnSign);

        btn根號.setBackground(new java.awt.Color(52, 59, 80));
        btn根號.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        btn根號.setForeground(new java.awt.Color(255, 255, 255));
        btn根號.setText("√");
        btn根號.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn根號ActionPerformed(evt);
            }
        });
        jPanel1.add(btn根號);

        btnBack.setBackground(new java.awt.Color(52, 59, 80));
        btnBack.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("←");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                刪除(evt);
            }
        });
        jPanel1.add(btnBack);

        btn7.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn9);

        btn除.setBackground(new java.awt.Color(52, 59, 80));
        btn除.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn除.setForeground(new java.awt.Color(255, 255, 255));
        btn除.setText("÷");
        btn除.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                運算鈕共用事件(evt);
            }
        });
        jPanel1.add(btn除);

        btn4.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn6);

        btn乘.setBackground(new java.awt.Color(52, 59, 80));
        btn乘.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn乘.setForeground(new java.awt.Color(255, 255, 255));
        btn乘.setText("×");
        btn乘.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                運算鈕共用事件(evt);
            }
        });
        jPanel1.add(btn乘);

        btn1.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn3);

        btn減.setBackground(new java.awt.Color(52, 59, 80));
        btn減.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn減.setForeground(new java.awt.Color(255, 255, 255));
        btn減.setText("-");
        btn減.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                運算鈕共用事件(evt);
            }
        });
        jPanel1.add(btn減);

        btn0.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn0);

        btn小數點.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        btn小數點.setText(".");
        btn小數點.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });
        jPanel1.add(btn小數點);

        btn等於.setBackground(new java.awt.Color(77, 139, 241));
        btn等於.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn等於.setForeground(new java.awt.Color(255, 255, 255));
        btn等於.setText("=");
        btn等於.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn等於ActionPerformed(evt);
            }
        });
        jPanel1.add(btn等於);

        btn加.setBackground(new java.awt.Color(52, 59, 80));
        btn加.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn加.setForeground(new java.awt.Color(255, 255, 255));
        btn加.setText("+");
        btn加.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                運算鈕共用事件(evt);
            }
        });
        jPanel1.add(btn加);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtInput)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void 顯示計算結果() {
        double answer = 0.0;

        switch (op) {
            case "+":
                answer = x + y;
                break;
            case "-":
                answer = x - y;
                break;
            case "×":
                answer = x * y;
                break;
            case "÷":
                answer = x / y;
                break;
        }

        //如果answer是整數
        if (answer == (int) answer) {
            txtInput.setText(String.valueOf((int) answer));
        } else {
            txtInput.setText(String.valueOf(answer));
        }
        x = answer;
        y = null;
        op = null;

    }

    //把txtInput中的值丟給X或Y
    private void txtInput_to_XY() {
        if (op == null) {
            x = Double.parseDouble(txtInput.getText());
        } else {
            y = Double.parseDouble(txtInput.getText());
        }
    }

    private void 數字(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_數字
        JButton btn = (JButton) evt.getSource();

        //輸入小數點
        if (btn.getText().equals(".")) {

            //如果小數點已經出現過了
            if (txtInput.getText().contains(".")) {
                return;
            }

            if (要先清空) {
                txtInput.setText("0");
                要先清空 = false;
            }

        } else { //輸入數字
            if (要先清空) {
                txtInput.setText("");
                要先清空 = false;
            }

            if (txtInput.getText().equals("0")) {
                txtInput.setText("");
            }
        }

        txtInput.setText(txtInput.getText() + btn.getText());

        txtInput_to_XY();


    }//GEN-LAST:event_數字

    private void 刪除(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_刪除
        int len;
        len = txtInput.getText().length();

        if (len != 0) {
            String str = txtInput.getText().substring(0, len - 1);
            txtInput.setText(str);
            if (txtInput.getText().length() == 0) {
                txtInput.setText("0");
            }
        }

        txtInput_to_XY();
    }//GEN-LAST:event_刪除

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtInput.setText("0");
        op = null;
    }//GEN-LAST:event_btnClearActionPerformed

    private void 運算鈕共用事件(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_運算鈕共用事件
        JButton btn = (JButton) evt.getSource();

        if (op != null && y != null) {
            顯示計算結果();
        }

        op = btn.getText();
        要先清空 = true;


    }//GEN-LAST:event_運算鈕共用事件

    private void btn等於ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn等於ActionPerformed
        if (op != null && y != null) {
            顯示計算結果();
        }
    }//GEN-LAST:event_btn等於ActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed

        double n = Double.parseDouble(txtInput.getText()) * -1;

        //如果n是整數
        if (n == (int) n) {
            txtInput.setText(String.valueOf((int) n));
        } else {
            txtInput.setText(String.valueOf(n));
        }

        txtInput_to_XY();

    }//GEN-LAST:event_btnSignActionPerformed

    private void btn根號ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn根號ActionPerformed

        if (op == null) {
            x = Math.sqrt(Double.parseDouble(txtInput.getText()));
            //如果x是整數
            if (x.doubleValue() == (int) x.doubleValue()) {
                txtInput.setText(String.valueOf((int) x.doubleValue()));
            } else {
                txtInput.setText(String.valueOf(x));
            }
        } else if(y!=null) {
            顯示計算結果();
            double answer = Math.sqrt(Double.parseDouble(txtInput.getText()));

            //如果answer是整數
            if (answer == (int) answer) {
                txtInput.setText(String.valueOf((int) answer));
            } else {
                txtInput.setText(String.valueOf(answer));
            }
        }

    }//GEN-LAST:event_btn根號ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Win計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win計算機().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton btn乘;
    private javax.swing.JButton btn加;
    private javax.swing.JButton btn小數點;
    private javax.swing.JButton btn根號;
    private javax.swing.JButton btn減;
    private javax.swing.JButton btn等於;
    private javax.swing.JButton btn除;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
