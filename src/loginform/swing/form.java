
package loginform.swing;

import javax.swing.ImageIcon;


public class form extends javax.swing.JPanel {

  private boolean passwordVisible = false;

    public form() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        circles1 = new loginform.swing.circles();
        txtUser = new loginform.swing.textFieldIcon();
        jSeparator1 = new javax.swing.JSeparator();
        txtPass = new loginform.swing.PasswordFileIcon();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 165, 111));
        add(circles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 14, -1, -1));

        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHint("Usuario");
        txtUser.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/swing/user.png"))); // NOI18N
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 142, 218, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 187, 260, 10));

        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHint("Contraseña");
        txtPass.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/swing/pass.png"))); // NOI18N
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 215, 239, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 260, 260, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/swing/mostrar.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 24));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    String pass = new String(txtPass.getPassword());
    passwordVisible = !passwordVisible;
         if (passwordVisible) {

             jLabel1.setIcon(new ImageIcon(getClass().getResource("/loginform/swing/mostrar2.png")));
        txtPass.setEchoChar((char) 0); 
    } else {
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/loginform/swing/mostrar.png")));
        txtPass.setEchoChar('*'); 
    }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private loginform.swing.circles circles1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private loginform.swing.PasswordFileIcon txtPass;
    private loginform.swing.textFieldIcon txtUser;
    // End of variables declaration//GEN-END:variables
}
