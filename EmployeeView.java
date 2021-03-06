package wfes;

import Conversion.TableData;
import dal.ConnectionDAL;
import dal.EmployeeDAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import to.Employee;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 01
 */
public class EmployeeView extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeView
     */
    List<Employee> employeeList = null;
    public Vector columnvector = null;
    TableData td = new TableData();
    Connection connection = new ConnectionDAL().getConnection();
    public static int selectedRow = 0;

    public EmployeeView() {

        initComponents();

        //td.fillTableData(employeeModifyTB, new ConnectionDAL().getConnection(), "employee");

        Vector rowVector = new Vector();
        Vector colVector = new Vector();


        employeeList = new EmployeeDAL().getEmployeeDetails();

        List<Employee> employeeListTemp = new ArrayList<Employee>();
        for (Employee employeeTemp : employeeList) {
            {
                employeeListTemp.add(employeeTemp);

            }
        }

        for (Employee employeeTemp : employeeListTemp) {
            Vector temp = new Vector();
            temp.add(employeeTemp.getEmpId());
            temp.add(employeeTemp.getEmpName());
            temp.add(employeeTemp.getDeptId().getDeptName().toString());
            temp.add(employeeTemp.getDsgnId().getDsgnTitle().toString());
            rowVector.add(temp);
        }

        Statement st = null;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from employee where `DELETE_FLAG`=0");
            ResultSetMetaData rmd = rs.getMetaData();
            int j = rmd.getColumnCount();
            String[] type = new String[50];
            System.out.println("" + j);
            for (int i = 1; i <= j; i++) {

                String col = rmd.getColumnName(i);
                if(col.equals("EMP_ID")){
                    colVector.add("Employee ID");
                }
                 else if(col.equals("EMP_NAME")){
                    colVector.add("Employee Name");
                }
                 else if(col.equals("DEPT_ID")){
                    colVector.add("Department Name");
                }
                 else if(col.equals("DSGN_ID")){
                    colVector.add("Designation Title");
                }
//                if (col.equals("EMP_ID") || col.equals("EMP_NAME") || col.equals("DEPT_ID") || col.equals("DSGN_ID")) {
//                    colVector.add(col);
//
//                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }





        TableModel model = new DefaultTableModel(rowVector, colVector) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        employeeViewTB.setModel(model);
        employeeViewTB.setAutoCreateRowSorter(true);


        employeeViewTB.removeColumn(employeeViewTB.getColumnModel().getColumn(0));

        employeeViewTB.getSelectionModel().addListSelectionListener(l1);
        employeeViewTB.addKeyListener(kl);
        searchTextField.setEnabled(false);
        detailedViewBT.addActionListener(al);
        detailedViewBT.addKeyListener(k2);





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
        detailedViewBT = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeViewTB = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        detailedViewBT.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        detailedViewBT.setForeground(new java.awt.Color(86, 86, 87));
        detailedViewBT.setText("DETAILED VIEW");

        searchTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(86, 86, 87));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 86, 87));
        jLabel2.setText("Search:");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 87));
        jLabel1.setText("EMPLOYEE VIEW");

        employeeViewTB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        employeeViewTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(employeeViewTB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(detailedViewBT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)))
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailedViewBT)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detailedViewBT;
    private javax.swing.JTable employeeViewTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == detailedViewBT) {

                new popup.popup().displayEmployeeDetail();
            }
        }
    };
    
     KeyListener k2 = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
             if (e.getSource() == detailedViewBT) {

                new popup.popup().displayEmployeeDetail();
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };
    
    ListSelectionListener l1 = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (employeeViewTB.getSelectedRow() > -1) {
                int row = employeeViewTB.convertRowIndexToModel(employeeViewTB.getSelectedRow());


                int col = employeeViewTB.convertColumnIndexToModel(employeeViewTB.getSelectedColumn());

                Object obj = employeeViewTB.getModel().getValueAt(row, 0);

                String x = obj.toString();

                selectedRow = Integer.parseInt(x);

            }

        }
    };

    public static int returnSelectedRow() {
        return selectedRow;
    }
    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
           
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

                String data = searchTextField.getText();
                if (data.length() > 0) {
                    data = data.substring(0, data.length() - 1);
                    searchTextField.setText(data);
                }
            }
            else{  
                if((e.getKeyCode()>= 'a' && e.getKeyCode()<='z') ||(e.getKeyCode()>= 'A' && e.getKeyCode()<='Z') || (e.getKeyCode()>= '0' && e.getKeyCode()<='9') || e.getKeyCode()==' '){
                searchTextField.setText(searchTextField.getText() + e.getKeyChar());
                searchTextField.setText(searchTextField.getText().toLowerCase());
                }
                else{
                    //System.out.println("hello");
                }
            }
            searchEmployeeList();
        }

        @Override
        public void keyReleased(KeyEvent ke) {
        }
    };

    public void searchEmployeeList() {
        String data = searchTextField.getText();
        List<Employee> employeeListTemp = new ArrayList<Employee>();
        for (Employee employeeTemp : employeeList) {
             if (employeeTemp.getEmpName().toLowerCase().contains(data) || employeeTemp.getDeptId().getDeptName().toLowerCase().contains(data) || employeeTemp.getDsgnId().getDsgnTitle().toLowerCase().contains(data)){
                employeeListTemp.add(employeeTemp);
            
                
            }
        }
        Vector rowVector = new Vector();
        for (Employee employeeTemp : employeeListTemp) {
            Vector temp = new Vector();
            temp.add(employeeTemp.getEmpId());
            temp.add(employeeTemp.getEmpName());
       temp.add(employeeTemp.getDeptId().getDeptName().toString());
            
            temp.add(employeeTemp.getDsgnId().getDsgnTitle().toString());
            rowVector.add(temp);
        }
        //System.out.println(rowVector);
        Vector colVector= new Vector();
        //System.out.println(td.colVector);
        Statement st=null;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from employee where `DELETE_FLAG`=0");
            ResultSetMetaData rmd = rs.getMetaData();
            int j = rmd.getColumnCount();
            String[] type=new String[50];
            System.out.println("" + j);
            for (int i = 1; i <= j; i++) {
                
                String col = rmd.getColumnName(i);
                
                if(col.equals("EMP_ID")){
                    colVector.add("Employee ID");
                }
                 else if(col.equals("EMP_NAME")){
                    colVector.add("Employee Name");
                }
                 else if(col.equals("DEPT_ID")){
                    colVector.add("Department Name");
                }
                 else if(col.equals("DSGN_ID")){
                    colVector.add("Designation Title");
                }
//                if(col.equals("EMP_ID")||col.equals("EMP_NAME")||col.equals("DEPT_ID")||col.equals("DSGN_ID"))
//                {              
//                colVector.add(col);
//                
//                }
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
            
            
        
        
        TableModel model = new DefaultTableModel(rowVector,colVector) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        employeeViewTB.setModel(model);

        
        employeeViewTB.removeColumn(employeeViewTB.getColumnModel().getColumn(0));
    }
}
