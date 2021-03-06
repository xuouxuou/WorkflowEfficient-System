/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfes;



import dal.DesignationDAL;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingUtilities;

import to.Designation;


/**
 *
 * @author 02
 */
public class DesignationUpdate extends javax.swing.JPanel {

    /**
     * Creates new form DesignationAdd
     */
    Designation designation=null;
    
    
    public DesignationUpdate() {
        initComponents();
        clear();
        UpdateBT.addActionListener(al);
    }

     public DesignationUpdate(Designation designation) {
        initComponents();
        clear();
        
        
        this.designation=designation;
        
        dsgnTitleTF.setText(designation.getDsgnTitle());
        dsgnDesTA.setText(designation.getDsgnDesc());
      
        


        UpdateBT.addActionListener(al);
        UpdateBT.addKeyListener(k2);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dsgnTitleTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dsgnDesTA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        UpdateBT = new javax.swing.JButton();
        dsgnTitleVAL = new javax.swing.JLabel();
        dsgnDesVAL = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 87));
        jLabel1.setText("Update Designation");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 86, 87));
        jLabel2.setText("Designation Title :");

        dsgnTitleTF.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N

        dsgnDesTA.setColumns(20);
        dsgnDesTA.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        dsgnDesTA.setRows(5);
        jScrollPane1.setViewportView(dsgnDesTA);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 86, 87));
        jLabel3.setText("Designation Description :");

        UpdateBT.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        UpdateBT.setForeground(new java.awt.Color(86, 86, 87));
        UpdateBT.setText("UPDATE");

        dsgnTitleVAL.setForeground(new java.awt.Color(255, 0, 0));
        dsgnTitleVAL.setText("dsgnNameLB");

        dsgnDesVAL.setForeground(new java.awt.Color(255, 0, 0));
        dsgnDesVAL.setText("jLabel5");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(42, 42, 42)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(dsgnTitleTF)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 249, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dsgnDesVAL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(dsgnTitleVAL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(192, 192, 192))
            .add(jPanel1Layout.createSequentialGroup()
                .add(312, 312, 312)
                .add(UpdateBT)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .add(46, 46, 46)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(dsgnTitleTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dsgnTitleVAL))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(64, 64, 64)
                        .add(dsgnDesVAL)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 65, Short.MAX_VALUE)
                .add(UpdateBT))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBT;
    private javax.swing.JTextArea dsgnDesTA;
    private javax.swing.JLabel dsgnDesVAL;
    private javax.swing.JTextField dsgnTitleTF;
    private javax.swing.JLabel dsgnTitleVAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public void updateButtonMethod(){
         if (validation()) {
                    
                    Designation designationtemp = new Designation();
                    designationtemp.setDsgnId(designation.getDsgnId());
                    designationtemp.setDsgnTitle(dsgnTitleTF.getText());
                    designationtemp.setDsgnDesc(dsgnDesTA.getText());
                  
                    new DesignationDAL().updateDesignationDetails(designationtemp);
                       Window w = SwingUtilities.getWindowAncestor(popup.popup.designationUpdate);
                    w.setVisible(false);

                  System.out.println("Done");

                }
    }
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == UpdateBT) {
               updateButtonMethod();
            }
        }
    };
    KeyListener k2 = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
             if (e.getSource() == UpdateBT) {
               updateButtonMethod();
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };
    

    void clear() {
        dsgnTitleVAL.setText("");
        dsgnDesVAL.setText("");
        
    }

    boolean validation() {
        boolean flag = true;
        clear();

        if (dsgnTitleTF.getText().equals("")) {
            dsgnTitleVAL.setText("Please enter designation title");
            flag = false;
        }
        if (dsgnDesTA.getText().equals("")) {
            dsgnDesVAL.setText("Please enter designation description");
            flag = false;
        }
        return flag;
    }
}
