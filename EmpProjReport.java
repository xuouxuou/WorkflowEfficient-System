/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfes;

import dal.ConnectionDAL;
import dal.EmployeeDAL;
import dal.ProjEmpDal;
import dal.ProjectDAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import to.Department;
import to.Designation;
import to.Employee;
import to.ProjEmp;
import to.Project;

/**
 *
 * @author hp pav 15-e015tx
 */
public class EmpProjReport extends javax.swing.JPanel {

    /**
     * Creates new form EmpProjReport
     */
    public EmpProjReport() {
        initComponents();
        fillComboDataEmployee();
        if(LogIn.localempid.getDsgnId().getDsgnId()==2 || LogIn.localempid.getDsgnId().getDsgnId()==3) {
            fillComboDataProjectMgt();
        }
        else{
            fillComboDataProject();
        }
        if(LogIn.localempid.getDsgnId().getDsgnId()==2){
            empChrtLB.setVisible(false);
            empRB.setVisible(false);
        }
        
        jPanel3.setVisible(false);
        jPanel1.setVisible(false);
        op3RB.setVisible(false);

        empRB.addActionListener(al);
        projRB.addActionListener(al);
        op1RB.addActionListener(al);
        op2RB.addActionListener(al);
        op3RB.addActionListener(al);
        
        reportBT.addActionListener(a2);
        reportBT.addKeyListener(k2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        typeOfChartLB = new javax.swing.JLabel();
        empRB = new javax.swing.JRadioButton();
        projRB = new javax.swing.JRadioButton();
        empChrtLB = new javax.swing.JLabel();
        projChrtLB = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        projCB = new javax.swing.JComboBox();
        projectselLB = new javax.swing.JLabel();
        empselLB = new javax.swing.JLabel();
        employeeCB = new javax.swing.JComboBox();
        reportBT = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        op1RB = new javax.swing.JRadioButton();
        op2RB = new javax.swing.JRadioButton();
        op3RB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        typeOfChartLB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        typeOfChartLB.setText("Type Of Report:");

        buttonGroup1.add(empRB);

        buttonGroup1.add(projRB);

        empChrtLB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        empChrtLB.setText("Employee Report:");

        projChrtLB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        projChrtLB.setText("Project Report:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeOfChartLB, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(projChrtLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empChrtLB, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empRB)
                            .addComponent(projRB))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeOfChartLB)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empChrtLB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(projRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projChrtLB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        projCB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        projCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        projectselLB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        projectselLB.setText("Project:");

        empselLB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        empselLB.setText("Employee:");

        employeeCB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        employeeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        reportBT.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        reportBT.setText("Show Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectselLB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empselLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(projCB, 0, 279, Short.MAX_VALUE)
                        .addComponent(employeeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reportBT))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectselLB))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empselLB)
                    .addComponent(employeeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(reportBT)
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel1.setText("View As:");

        buttonGroup2.add(op1RB);
        op1RB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N

        buttonGroup2.add(op2RB);
        op2RB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N

        buttonGroup2.add(op3RB);
        op3RB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op2RB)
                            .addComponent(op1RB)
                            .addComponent(op3RB))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op1RB)
                .addGap(18, 18, 18)
                .addComponent(op2RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(op3RB))
        );

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel2.setText("Reports:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel empChrtLB;
    private javax.swing.JRadioButton empRB;
    private javax.swing.JComboBox employeeCB;
    private javax.swing.JLabel empselLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton op1RB;
    private javax.swing.JRadioButton op2RB;
    private javax.swing.JRadioButton op3RB;
    private javax.swing.JComboBox projCB;
    private javax.swing.JLabel projChrtLB;
    private javax.swing.JRadioButton projRB;
    private javax.swing.JLabel projectselLB;
    private javax.swing.JButton reportBT;
    private javax.swing.JLabel typeOfChartLB;
    // End of variables declaration//GEN-END:variables

    public void reportButtonMethod(){
           if (empRB.isSelected()) {
                    if (op1RB.isSelected()) {
                        Employee employee = (Employee) employeeCB.getSelectedItem();
                        Project project = (Project) projCB.getSelectedItem();

                        try {
                            File file = new File("report\\Employee_Perfo_In_Proj.jasper");
                            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);

                            //Creating hashmap for parameters of report
                            HashMap h = new HashMap();
                            
                            h.put("employee_id",(long)employee.getEmpId());
                           
                            h.put("project_id", (long)project.getProjId());

                            //Passing connection and hashmap to the report
                            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, h, new ConnectionDAL().getConnection());

                            //Loding the report window
                            JasperViewer.viewReport(jasperPrint, false);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }



                    }
                    if (op2RB.isSelected()) {
                        Employee employee = (Employee) employeeCB.getSelectedItem();
                          try {
                            File file = new File("report\\Employee_Quarter_perfo.jasper");
                            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);

                            //Creating hashmap for parameters of report
                            HashMap h = new HashMap();
                            
                            h.put("employee_id",(long)employee.getEmpId());
                           
                            Calendar c = Calendar.getInstance();
                            Calendar o= Calendar.getInstance();
                            
                           
                            o.roll(Calendar.MONTH, false);
                            o.roll(Calendar.MONTH, false);
                            o.roll(Calendar.MONTH, false);
                            
                              System.out.println("O.get"+o.getTime()+"c::"+c.getTime());
                           
                            
                            
                            h.put("start_date",o.getTime());
                            h.put("end_date",c.getTime());

                            //Passing connection and hashmap to the report
                            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, h, new ConnectionDAL().getConnection());

                            //Loding the report window
                            JasperViewer.viewReport(jasperPrint, false);
                        } catch (Exception ex) {
                           ex.printStackTrace();
                            try
                            {
                            File f = new File("error.txt");
                            FileWriter fw = new FileWriter(f);
                            fw.write(ex.getMessage());
                            fw.write(System.getProperty("user.dir"));
                            fw.close();
                            }
                            catch(Exception e)
                            {
                                
                            }
                        }
                        

                    }
                    if (op3RB.isSelected()) {
                        Employee employee = (Employee) employeeCB.getSelectedItem();

                    }
                }
                if (projRB.isSelected()) {
                    Project project = (Project) projCB.getSelectedItem();
                    
                     try {
                            File file = new File("report\\Project_Report.jasper");
                            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);

                            //Creating hashmap for parameters of report
                            HashMap h = new HashMap();
                            
                           
                           
                            h.put("project_id", (long)project.getProjId());

                            //Passing connection and hashmap to the report
                            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, h, new ConnectionDAL().getConnection());

                            //Loding the report window
                            JasperViewer.viewReport(jasperPrint, false);
                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }

                }
    }
    void fillComboDataProject() {
        Vector vector = new Vector();
        vector.add("Please Enter");
        List<ProjEmp> projEmpList = new ProjEmpDal().getProjEmpDetails();
        ProjEmp projEmpTempFinal = null;
        for (ProjEmp projEmpTemp : projEmpList) {
            if (projEmpTemp.getProjId().getDeleteFlag() == 0 && projEmpTemp.getEmpId().getEmpId() == LogIn.localempid.getEmpId()) {


                vector.add(projEmpTemp.getProjId());
//                }
            }
        }
        ComboBoxModel cbm = new DefaultComboBoxModel(vector);
        projCB.setModel(cbm);
    }
    
    void fillComboDataProjectMgt() {
        Vector vector = new Vector();
        vector.add("Please Enter");
        List<Project> projectList = new ProjectDAL().getProjectDetails();
        Project projectTempFinal = null;
        for (Project projectTemp : projectList) {
            if (projectTemp.getDeleteFlag() == 0) {


                vector.add(projectTemp);
//                }
            }
        }
        ComboBoxModel cbm = new DefaultComboBoxModel(vector);
        projCB.setModel(cbm);
    }

    void fillComboDataEmployee() {
        Vector vector = new Vector();
        vector.add("Please Enter");
        List<Employee> employeeList = new EmployeeDAL().getEmployeeDetails();


        Employee emplocal = LogIn.localempid;
        Department department = emplocal.getDeptId();
        Designation designation = emplocal.getDsgnId();

        for (Employee employeeTemp : employeeList) {

            if (employeeTemp.getDeptId().getDeptId() == department.getDeptId()) {
                if (employeeTemp.getDsgnId().getDsgnTitle().toString().equals("JUNIOR EXECUTIVE")) {
                    vector.add(employeeTemp);
                }

            }


        }


        ComboBoxModel cbm = new DefaultComboBoxModel(vector);
        employeeCB.setModel(cbm);

    }
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == empRB) {
                jPanel3.setVisible(true);
                jPanel1.setVisible(false);
                op1RB.setSelected(false);
                op2RB.setSelected(false);
                op3RB.setSelected(false);
                op1RB.setText("Employee Performance In A Project");
                op2RB.setText("Quarterly Performance");
                op3RB.setText("Attendance Report");
            }
            if (e.getSource() == projRB) {
                jPanel3.setVisible(false);
                jPanel1.setVisible(true);
                projectselLB.setVisible(true);
                projCB.setVisible(true);
                empselLB.setVisible(false);
                employeeCB.setVisible(false);
            }
            if (e.getSource() == op1RB) {
                jPanel1.setVisible(true);
                empselLB.setVisible(true);
                employeeCB.setVisible(true);
                projectselLB.setVisible(true);
                projCB.setVisible(true);


            }
            if (e.getSource() == op2RB) {
                jPanel1.setVisible(true);
                empselLB.setVisible(true);
                employeeCB.setVisible(true);
                projectselLB.setVisible(false);
                projCB.setVisible(false);

            }
            if (e.getSource() == op3RB) {
                jPanel1.setVisible(true);
                empselLB.setVisible(true);
                employeeCB.setVisible(true);
                projectselLB.setVisible(false);
                projCB.setVisible(false);

            }

        }
    };
    ActionListener a2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == reportBT) {
             reportButtonMethod();
            }
        }
    };
    KeyListener k2 = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
             if (e.getSource() == reportBT) {
             reportButtonMethod();
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };
}
