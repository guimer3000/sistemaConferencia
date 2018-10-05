
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Guimer Delgadillo Rivera
 */
public class participantes extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
   
    public participantes() {
        initComponents();
        this.setTitle("Registro de Participantes");
        this.setLocation(540, 250);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoNombre = new javax.swing.JLabel();
        EscribirNombre = new javax.swing.JTextField();
        TextoCI = new javax.swing.JLabel();
        EscribirCI = new javax.swing.JTextField();
        TextoEdad = new javax.swing.JLabel();
        EscribirEdad = new javax.swing.JTextField();
        TextoGenero = new javax.swing.JLabel();
        ElegirGenero = new javax.swing.JComboBox();
        TextoOcupacion = new javax.swing.JLabel();
        EscribirOcupacion = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JLabel();
        EscribirDireccion = new javax.swing.JTextField();
        TextoTelefono = new javax.swing.JLabel();
        EscribirTelefono = new javax.swing.JTextField();
        TextoEmail = new javax.swing.JLabel();
        EscribirEmail = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoNombre.setText("Nombre:");
        getContentPane().add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        EscribirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscribirNombreActionPerformed(evt);
            }
        });
        EscribirNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EscribirNombreKeyTyped(evt);
            }
        });
        getContentPane().add(EscribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 250, -1));

        TextoCI.setText("CI:");
        getContentPane().add(TextoCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        EscribirCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscribirCIActionPerformed(evt);
            }
        });
        EscribirCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EscribirCIKeyTyped(evt);
            }
        });
        getContentPane().add(EscribirCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, -1));

        TextoEdad.setText("Edad:");
        getContentPane().add(TextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        EscribirEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EscribirEdadKeyTyped(evt);
            }
        });
        getContentPane().add(EscribirEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, -1));

        TextoGenero.setText("Genero:");
        getContentPane().add(TextoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        ElegirGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(ElegirGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, -1));

        TextoOcupacion.setText("Ocupación:");
        getContentPane().add(TextoOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        EscribirOcupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EscribirOcupacionKeyTyped(evt);
            }
        });
        getContentPane().add(EscribirOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 170, -1));

        TextoDireccion.setText("Dirección:");
        getContentPane().add(TextoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));
        getContentPane().add(EscribirDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 170, -1));

        TextoTelefono.setText("Telefono:");
        getContentPane().add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        EscribirTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EscribirTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(EscribirTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 120, -1));

        TextoEmail.setText("Email:");
        getContentPane().add(TextoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        EscribirEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EscribirEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EscribirEmailFocusLost(evt);
            }
        });
        getContentPane().add(EscribirEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 220, -1));

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EscribirNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EscribirNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c<' ' || c>' '))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_EscribirNombreKeyTyped

    private void EscribirTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EscribirTelefonoKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9')&&(c<'+' || c>'+'))evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_EscribirTelefonoKeyTyped

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7,cadena8, cadena9;
        
        cadena1 = EscribirNombre.getText();
        cadena2 = EscribirCI.getText();
        cadena3 = EscribirEdad.getText();
        cadena4 = ElegirGenero.getSelectedItem().toString();
        cadena5 = EscribirOcupacion.getText();
        cadena6 = EscribirDireccion.getText();
        cadena7 = EscribirTelefono.getText();
        cadena8 = EscribirEmail.getText();
        
        if (EscribirNombre.getText().equals("") || (EscribirCI.getText().equals("")) || (EscribirEdad.getText().equals(""))|| (ElegirGenero.getSelectedItem().equals("")) 
            || (EscribirOcupacion.getText().equals("")) || (EscribirDireccion.getText().equals("")) || (EscribirTelefono.getText().equals("")) || (EscribirEmail.getText().equals(""))){
            
           javax.swing.JOptionPane.showMessageDialog(this, "debe llenar todos los campos\n", "Nota", javax.swing.JOptionPane.INFORMATION_MESSAGE);
           EscribirNombre.requestFocus();        // TODO add your handling code here:
        }
        else {
            try {
           
            String url = "jdbc:mysql://localhost:3306/bdconferecia";
            String usuario = "root";
            String contraseña = "guimer77913525";
         
             
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Conectado a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("INSERT INTO participante VALUES('"+cadena1+"','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"','"+cadena8+"')");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                  
                  javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                  
                 
                  String SQL = "SELECT * FROM participante ORDER BY valor;";
                  
                  
       } catch (InstantiationException ex) {
           Logger.getLogger(participantes.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(participantes.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(participantes.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           
           javax.swing.JOptionPane.showMessageDialog(this,"El Usuario ya esta registrado! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) {
                                       
                    System.out.println( e.getMessage());
                }
                
            }
        }
         
        }
        
        this.EscribirNombre.setText("");
        this.EscribirCI.setText("");
        this.EscribirEdad.setText("");
        this.EscribirOcupacion.setText("");
        this.EscribirDireccion.setText("");
        this.EscribirTelefono.setText("");
        this.EscribirEmail.setText("");

    }//GEN-LAST:event_BotonRegistrarActionPerformed
    
    private void EscribirOcupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EscribirOcupacionKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c<' ' || c>' '))evt.consume();   // TODO add your handling code here:
    }//GEN-LAST:event_EscribirOcupacionKeyTyped

    private void EscribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscribirNombreActionPerformed
        TextoNombre.transferFocus();         // TODO add your handling code here:
    }//GEN-LAST:event_EscribirNombreActionPerformed

    public boolean isEmail(String correo){
    Pattern pat = null;
    Matcher mat = null;
    pat = Pattern.compile("^[\\w\\\\\\+]+(\\.[\\w\\\\]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
    mat = pat.matcher(correo);
    if (mat.find()){
        return true;
    }else{
        return false;
         }
    }
    
    private void EscribirEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EscribirEmailFocusGained
    }//GEN-LAST:event_EscribirEmailFocusGained

    private void EscribirEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EscribirEmailFocusLost
         if (isEmail(EscribirEmail.getText())){
         }else{
             javax.swing.JOptionPane.showMessageDialog(null, "Email Incorrecto", "Validar Email", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             EscribirEmail.requestFocus();
         }
    }//GEN-LAST:event_EscribirEmailFocusLost

    private void EscribirCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscribirCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscribirCIActionPerformed

    private void EscribirCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EscribirCIKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_EscribirCIKeyTyped

    private void EscribirEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EscribirEdadKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_EscribirEdadKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new participantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JComboBox ElegirGenero;
    private javax.swing.JTextField EscribirCI;
    private javax.swing.JTextField EscribirDireccion;
    private javax.swing.JTextField EscribirEdad;
    private javax.swing.JTextField EscribirEmail;
    private javax.swing.JTextField EscribirNombre;
    private javax.swing.JTextField EscribirOcupacion;
    private javax.swing.JTextField EscribirTelefono;
    private javax.swing.JLabel TextoCI;
    private javax.swing.JLabel TextoDireccion;
    private javax.swing.JLabel TextoEdad;
    private javax.swing.JLabel TextoEmail;
    private javax.swing.JLabel TextoGenero;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoOcupacion;
    private javax.swing.JLabel TextoTelefono;
    // End of variables declaration//GEN-END:variables
}
