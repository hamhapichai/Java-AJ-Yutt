import javax.swing.JOptionPane;
public class UserPassW extends javax.swing.JFrame {
  static String Myusn ="abcdef";
  static String Mypsw ="123456";
  String us="",pw="";
  public UserPassW() {
    initComponents();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        psw = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usshow = new javax.swing.JLabel();
        pwshow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Username and Password");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        usn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usnKeyReleased(evt);
            }
        });

        psw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswKeyReleased(evt);
            }
        });

        Ok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ok.setText("Ok");
        Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Your username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Your password");

        usshow.setForeground(new java.awt.Color(0, 204, 204));
        usshow.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pwshow.setForeground(new java.awt.Color(0, 153, 153));
        pwshow.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ok, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(psw)
                            .addComponent(usn))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usshow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwshow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usshow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pwshow))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnKeyPressed
     
    }//GEN-LAST:event_usnKeyPressed

    private void pswKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswKeyPressed
      
    }//GEN-LAST:event_pswKeyPressed

    private void OkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkMouseClicked
       usshow.setText(us);
       pwshow.setText(pw);
       if((Myusn.compareTo(us)==0)&&(Mypsw.compareTo(pw)==0))
           JOptionPane.showMessageDialog(null,"Username Password ถูกต้อง","ผลการตรวจสอบ",1);
       else
          if((Myusn.compareTo(us)==0)&&(Mypsw.compareTo(pw)!=0))
            JOptionPane.showMessageDialog(null,"Username ถูกต้อง Password ไม่ถูกต้อง","ผลการตรวจสอบ",1);
       else
            if((Mypsw.compareTo(pw)==0)&&(Mypsw.compareTo(pw)==0))
                JOptionPane.showMessageDialog(null,"Username ไม่ถูกต้อง Password ถูกต้อง","ผลการตรวจสอบ",1);
       else
                    JOptionPane.showMessageDialog(null,"Username ไม่ถูกต้อง Password ไม่ถูกต้อง","ผลการตรวจสอบ",1);
    }//GEN-LAST:event_OkMouseClicked

    private void usnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnKeyReleased
      us=usn.getText();
      //System.out.println("Username ="+us); 
    }//GEN-LAST:event_usnKeyReleased

    private void pswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswKeyReleased
      pw=psw.getText();  
      //System.out.println("Password ="+pw); 
    }//GEN-LAST:event_pswKeyReleased
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPassW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField psw;
    private javax.swing.JLabel pwshow;
    public static javax.swing.JTextField usn;
    private javax.swing.JLabel usshow;
    // End of variables declaration//GEN-END:variables
}
