/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;





/**
 *
 * @author mateus
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
         
         
    public principal() {
        initComponents();
        labelVerifica();  
        visibilidade();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

      
      
      
    boolean encontrado = true;
     boolean teste;
    //Nome.setEditable(false);
  
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Linkedin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nome");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço");

        jLabel4.setText("Bairro");

        Bairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BairroMouseClicked(evt);
            }
        });

        jLabel5.setText("Estado");

        jButton1.setText("Cadastrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone");

        jLabel1.setText("Cidade");

        jLabel7.setText("Email");

        jLabel8.setText("Linkedin");

        jLabel9.setText("Informe o Cep");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("Campo Obrigatorio");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("Campo Obrigatorio");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("Campo Obrigatorio");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("Campo Obrigatorio");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("Campo Obrigatorio");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("Campo Obrigatorio");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setText("Campo Obrigatorio");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel17.setForeground(java.awt.Color.red);
        jLabel17.setText("Campo Obrigatorio");

        jButton2.setText("Localizar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
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
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(Linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(Telefone))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12)))
                            .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel17)
                        .addGap(36, 36, 36)))
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
/*
if ("".equals(Nome.getText()) || "".equals(Endereco.getText()) || "".equals(Bairro.getText()) || "".equals(Cidade.getText()) || "".equals(Estado.getText()) || "".equals(Cep.getText()) || "".equals(Telefone.getText()) || "".equals(Email.getText())) {
    JOptionPane.showMessageDialog(null, "Porfavor, preencha todos os campos!", "Erro de validação",
	JOptionPane.ERROR_MESSAGE);
       return;	
        }*/
        verificacao();
            Dados d = new Dados();
        if (d.conecta("localhost", "Form", "mateus", "14161821")) {
            d.insere("pessoas", Nome.getText(), Endereco.getText(), Bairro.getText(), Cidade.getText(),Estado.getText(), Cep.getText(), Telefone.getText(), Email.getText(), Linkedin.getText());
           Nome.setText("");
           Endereco.setText(""); Bairro.setText(""); Cidade.setText(""); Estado.setText(""); Cep.setText(""); Telefone.setText(""); Email.setText(""); Linkedin.setText("");
        } else {
           // jLabel18.setText("Erro!");
        }  
    }//GEN-LAST:event_jButton1MouseClicked

    private void BairroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BairroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
  
      pesquisa_cep();
      /*
      if(teste == false){
               Endereco.setEditable(true);
               Bairro.setEditable(true);
               Cidade.setEditable(true);
               Estado.setEditable(true); 
      }*/
      
    }//GEN-LAST:event_jButton2MouseClicked

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        
    }//GEN-LAST:event_NomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JTextField Cep;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Endereco;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField Linkedin;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void labelVerifica() {
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel16.setVisible(false);
     jLabel17.setVisible(false);
    }
    
    public void verificacao(){
        if (Nome.getText().length() > 0) {
            jLabel10.setVisible(false);
        } else {
            jLabel10.setVisible(true);
        }
 
        if (Endereco.getText().length() > 0) {
            jLabel11.setVisible(false);
        } else {
            jLabel11.setVisible(true);
        }
        if (Bairro.getText().length() > 0) {
            jLabel12.setVisible(false);
        } else {
            jLabel12.setVisible(true);
        }
         if (Cidade.getText().length() > 0) {
            jLabel13.setVisible(false);
        } else {
            jLabel13.setVisible(true);
        }
         if (Estado.getText().length() > 0) {
            jLabel14.setVisible(false);
        } else {
            jLabel14.setVisible(true);
        }
         if (Cep.getText().length() > 0) {
            jLabel15.setVisible(false);
        } else {
            jLabel15.setVisible(true);
        }
          if (Telefone.getText().length() > 0) {
            jLabel16.setVisible(false);
        } else {
            jLabel16.setVisible(true);
        }
         if (Email.getText().length() > 0) {
            jLabel17.setVisible(false);
        } else {
            jLabel17.setVisible(true);
        }
if ((Nome.getText().length()>0)
                &&(Endereco.getText().length()> 0)
                && (Bairro.getText().length() > 0)
                &&(Cidade.getText().length()> 0)
                && (Estado.getText().length() > 0)
                &&(Cep.getText().length()> 0)
                && (Telefone.getText().length() > 0)
                && (Email.getText().length() > 0) ) {
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos Obrigatórios!");
}
    
    }


    
    public void pesquisa_cep(){
         Dados d = new Dados();
        if (d.conecta("localhost", "Form", "mateus", "14161821")) {
        }
         String cep = Cep.getText();
       
        ResultSet rs = d.consulta("SELECT cidades.descricao as cidade, bairros.descricao as bairro, logradouros.cep, logradouros.descricao as rua, logradouros.uf as estado FROM cidades, bairros, logradouros WHERE cidades.idcidade = bairros.cidades_idcidade and logradouros.bairros_idbairros = bairros.idbairros and logradouros.cep = '"+cep+"'");
       
        int linha = 0;
        try {
            if(rs.next()) {
                Cidade.setText(rs.getString("cidade"));
                Endereco.setText(rs.getString("rua"));
                Bairro.setText(rs.getString("bairro"));
                Estado.setText(rs.getString("estado"));
                linha++;
            }
            else{teste = false;
                          JOptionPane.showMessageDialog(null, "Cep não encontrado");
               Endereco.setEditable(true);
               Bairro.setEditable(true);
               Cidade.setEditable(true);
               Estado.setEditable(true); 
               Endereco.setText("");
               Bairro.setText("");
               Cidade.setText("");
               Estado.setText(""); 
}
        } catch (SQLException e) {
            System.err.println("Erro: " + e);
            JOptionPane.showMessageDialog(null, "Cep não encontrado");
            throw new RuntimeException(e);
        }
        
        
    }
    private void visibilidade() {
        if(encontrado == true){
            Endereco.setEditable(false);
            Bairro.setEditable(false);
            Cidade.setEditable(false);
            Estado.setEditable(false);
        }
    }
  
}