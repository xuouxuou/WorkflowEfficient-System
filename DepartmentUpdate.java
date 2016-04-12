package wfes;

import dal.DepartmentDAL;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingUtilities;
import to.Department;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01
 */
public class DepartmentUpdate extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentUpdate
     */
    
        Department department=null;

    public DepartmentUpdate() {
        initComponents();
        clear();
        UpdateBT.addActionListener(al);
    }
    
    public DepartmentUpdate(Department department) {
        initComponents();
        clear();
        
        
        this.department=department;
        
        deptNameTF.setText(department.getDeptName());
        deptDescTA.setText(department.getDeptDesc());
      
        


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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deptNameTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        deptDescTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        deptDescTA1 = new javax.swing.JTextArea();
        UpdateBT = new javax.swing.JButton();
        deptNameVal = new javax.swing.JLabel();
        deptDescVal = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 87));
        jLabel1.setText("   Update Department");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 86, 87));
        jLabel2.setText("Department Name :");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 86, 87));
        jLabel3.setText("Department Description :");

        deptNameTF.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N

        deptDescTA.setColumns(20);
        deptDescTA.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        deptDescTA.setRows(5);
        jScrollPane1.setViewportView(deptDescTA);

        deptDescTA1.setColumns(20);
        deptDescTA1.setRows(5);
        jScrollPane2.setViewportView(deptDescTA1);

        UpdateBT.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        UpdateBT.setForeground(new java.awt.Color(86, 86, 87));
        UpdateBT.setText("UPDATE");

        deptNameVal.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        deptNameVal.setForeground(new java.awt.Color(255, 0, 0));
        deptNameVal.setText("jLabel4");

        deptDescVal.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        deptDescVal.setForeground(new java.awt.Color(255, 0, 0));
        deptDescVal.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deptNameTF)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptNameVal, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(deptDescVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(UpdateBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(deptNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptNameVal))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptDescVal))
                .addGap(71, 71, 71)
                .addComponent(UpdateBT)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBT;
    private javax.swing.JTextArea deptDescTA;
    private javax.swing.JTextArea deptDescTA1;
    private javax.swing.JLabel deptDescVal;
    private javax.swing.JTextField deptNameTF;
    private javax.swing.JLabel deptNameVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void updateButtonMethod()
    {
         if (validation()) {
                    Department departmenttemp=new Department();
                    
                    departmenttemp.setDeptId(department.getDeptId());
                    departmenttemp.setDeptName(deptNameTF.getText());
                    departmenttemp.setDeptDesc(deptDescTA.getText());
                    

                    new DepartmentDAL().updateDepartmentDetails(departmenttemp);
                 
                    Window w = SwingUtilities.getWindowAncestor(popup.popup.departmentUpdate);
                    w.setVisible(false);
                    
                    System.out.println("Done");

                }
    }
    ActionListener al=new ActionListener() {

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
        deptNameVal.setText("");
        deptDescVal.setText("");

    }

 boolean validation() {
        boolean flag = true;
        clear();

        if (deptNameTF.getText().equals("")) {
            deptNameVal.setText("Please enter Department Name");
            flag = false;
        }
        if (deptDescTA.getText().equals("")) {
            deptDescVal.setText("Please enter Team Description");
            flag = false;
        }
       
        return flag;
    }
}