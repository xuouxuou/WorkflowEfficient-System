package wfes;

import Conversion.TableData;
import dal.ConnectionDAL;
import dal.DepartmentDAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import to.Department;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 01
 */
public class DepartmentModify extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentModify
     */
    List<Department> departmentList = null;
    static int selectedRow = 0;
    Vector colVector = new Vector();

    public DepartmentModify() {
        initComponents();

        //td.fillTableData(departmentModifyTB, new ConnectionDAL().getConnection(), "department");

        refreshtb();

        departmentModifyTB.getSelectionModel().addListSelectionListener(l1);
        departmentModifyTB.addKeyListener(kl);
        UpdateBT.addActionListener(al);
        UpdateBT.addKeyListener(k2);
        //deleteBT.addActionListener(al);
        searchTextField.setEnabled(false);

      
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
        UpdateBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        departmentModifyTB = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        UpdateBT.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        UpdateBT.setForeground(new java.awt.Color(86, 86, 87));
        UpdateBT.setText("UPDATE");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 87));
        jLabel1.setText("Department Modify");

        searchTextField.setEnabled(false);

        departmentModifyTB.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        departmentModifyTB.setForeground(new java.awt.Color(86, 86, 87));
        departmentModifyTB.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(departmentModifyTB);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 86, 87));
        jLabel2.setText("Search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBT))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBT)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262)
                .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBT;
    private javax.swing.JTable departmentModifyTB;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
    
    void refreshtb()
    {
        departmentList = new DepartmentDAL().getDepartmentDetails();
        colVector = new DepartmentDAL().getDepartmentColumnDetails();



        Vector rowVector = new Vector();
        for (Department departmentTemp : departmentList) {
            Vector temp = new Vector();
            temp.add(departmentTemp.getDeptId());
            temp.add(departmentTemp.getDeptName());
            temp.add(departmentTemp.getDeptDesc());
            rowVector.add(temp);
        }
        TableModel model = new DefaultTableModel(rowVector, colVector) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        departmentModifyTB.setModel(model);
        departmentModifyTB.setAutoCreateRowSorter(true);


        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(7));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(6));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(5));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(4));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(3));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(0));

    }
    
    
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == UpdateBT) {

                new popup.popup().displayDepartmentUpdate();
                refreshtb();
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

                new popup.popup().displayDepartmentUpdate();
                refreshtb();
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };
    ListSelectionListener l1 = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (departmentModifyTB.getSelectedRow() > -1) {
                int row = departmentModifyTB.convertRowIndexToModel(departmentModifyTB.getSelectedRow());


                int col = departmentModifyTB.convertColumnIndexToModel(departmentModifyTB.getSelectedColumn());

                Object obj = departmentModifyTB.getModel().getValueAt(row, 0);

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
            } else {
                if ((e.getKeyCode() >= 'a' && e.getKeyCode() <= 'z') || (e.getKeyCode() >= 'A' && e.getKeyCode() <= 'Z') || (e.getKeyCode() >= '0' && e.getKeyCode() <= '9') || e.getKeyCode() == ' ') {
                    searchTextField.setText(searchTextField.getText() + e.getKeyChar());
                    searchTextField.setText(searchTextField.getText().toLowerCase());
                } else {
                    //System.out.println("hello");
                }
            }
            searchDepartmentList();

        }

        @Override
        public void keyReleased(KeyEvent ke) {
        }
    };

    public void searchDepartmentList() {
        String data = searchTextField.getText();
        List<Department> departmentListTemp = new ArrayList<Department>();
        for (Department departmentTemp : departmentList) {
            if (departmentTemp.getDeptName().toLowerCase().contains(data) || departmentTemp.getDeptDesc().toLowerCase().contains(data)) {
                departmentListTemp.add(departmentTemp);
            }
        }
        Vector rowVector = new Vector();
        for (Department departmentTemp : departmentListTemp) {
            Vector temp = new Vector();
            temp.add(departmentTemp.getDeptId());
            temp.add(departmentTemp.getDeptName());
            temp.add(departmentTemp.getDeptDesc());
            rowVector.add(temp);
        }
        TableModel model = new DefaultTableModel(rowVector, colVector) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        departmentModifyTB.setModel(model);

        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(7));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(6));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(5));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(4));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(3));
        departmentModifyTB.removeColumn(departmentModifyTB.getColumnModel().getColumn(0));
        
    }
}
