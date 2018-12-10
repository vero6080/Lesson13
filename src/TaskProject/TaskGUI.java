package TaskProject;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskGUI extends javax.swing.JFrame {

    /*
    - btnnext causes curtask to shift towards the negative
    - some other stuff
     */
    ArrayList<Task> list;
    ListIterator li;
    int curtask, tottask;
    Task t;

    public TaskGUI() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask = 0;
        tottask = 0;
        preLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushow = new javax.swing.JCheckBoxMenuItem();
        mnuexit = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JCheckBoxMenuItem();
        mnurestore = new javax.swing.JCheckBoxMenuItem();
        mnuremove = new javax.swing.JCheckBoxMenuItem();
        mnuclear = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JCheckBoxMenuItem();
        mnuafter = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task:");

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("0");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Total Tasks:");

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("0");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblctask)
                    .addComponent(jLabel5)
                    .addComponent(lblttask))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfirst)
                .addGap(38, 38, 38)
                .addComponent(btnprevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addGap(39, 39, 39)
                .addComponent(btnlast)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnlast)
                    .addComponent(btnprevious)
                    .addComponent(btnnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        mnushow.setSelected(true);
        mnushow.setText("Show All Tasks");
        mnushow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowActionPerformed(evt);
            }
        });
        jMenu1.add(mnushow);

        mnuexit.setSelected(true);
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setSelected(true);
        mnureplace.setText("Replace This As Current Task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnurestore.setSelected(true);
        mnurestore.setText("Restore Current Task");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuremove.setSelected(true);
        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnuclear.setSelected(true);
        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setSelected(true);
        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnubefore);

        mnuafter.setSelected(true);
        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //keep closed
    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
        li.next();
        t = (Task) li.previous();
        //update display
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());

    }//GEN-LAST:event_mnurestoreActionPerformed

    //keep closed
    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - must enter all information");
            return;
        }

        if (tottask > 0 && curtask != 1) {
            li.previous();
        }

        li.add(t);
        curtask++;
        tottask++;
        lblttask.setText("" + tottask);
        lblctask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnubeforeActionPerformed

    //keep closed
    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - must enter all information");
            return;
        }
        if (tottask > 0) {
            li.next();
        }

        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lblttask.setText("" + tottask);
        lblctask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnuafterActionPerformed

    //keep closed
    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if (curtask == tottask) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        t = (Task) li.previous();
        curtask = tottask;
        //update display
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    //keep closed
    private void mnushowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = list.get(i);
            result += "Task " + (i + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnushowActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if (li.hasNext() == false) {
            return;
        } else {
            li.next();
        } if (li.hasNext() == false) {
            return;
        } else {
            li.next();
            t = (Task) li.previous();
            //update display
            curtask++;
            lblctask.setText("" + curtask);
            txtname.setText(t.getName());
            txtdesc.setText(t.getDescription());
        }
    }//GEN-LAST:event_btnnextActionPerformed

    //keep closed
    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
        if (tottask == 0) {
            JOptionPane.showMessageDialog(this, "You need to have at least one task in order to replace it");
            return;
        } else {
            String nm = txtname.getText();
            String d = txtdesc.getText();
            Task t = new Task(nm, d);
            if (t.validate() == false) {
                JOptionPane.showMessageDialog(this, "Error - must enter all information");
                return;
            }

            JOptionPane.showMessageDialog(this, "Task has been replaced");
            li.set(t);
            li.previous();
            txtname.setText(t.getName());
            txtdesc.setText(t.getDescription());
        }
    }//GEN-LAST:event_mnureplaceActionPerformed

    //keep closed
    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        if (tottask == 0) {
            JOptionPane.showMessageDialog(this, "You need to have at least one task in order to remove it");
            return;
        } else {
            li.next();
            li.remove();
            tottask -= 1;

            if (tottask == 0) {
                curtask = 0;
                lblctask.setText("" + curtask);
                lblttask.setText("" + tottask);
                txtname.setText("");
                txtdesc.setText("");
            } else if (tottask == 1) {
                if (li.hasPrevious()) {
                    li.previous();
                } else {
                    li.next();
                    li.previous();
                }
                curtask = 1;
                lblctask.setText("" + curtask);
                lblttask.setText("" + tottask);
                t = (Task) li.next();
                txtname.setText(t.getName());
                txtdesc.setText(t.getDescription());
            } else {
                if (li.hasPrevious()) {
                    li.previous();
                    curtask -= 1;
                } else {
                    li.next();
                    li.previous();
                }
                lblctask.setText("" + curtask);
                lblttask.setText("" + tottask);
                t = (Task) li.next();
                txtname.setText(t.getName());
                txtdesc.setText(t.getDescription());
            }
        }
    }//GEN-LAST:event_mnuremoveActionPerformed

    //keep closed
    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if (curtask == 0) {
            return;
        }
        while (li.hasPrevious()) {
            li.previous();
        }
        t = (Task) li.next();
        curtask = 1;
        //update display
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        li.previous();
    }//GEN-LAST:event_btnfirstActionPerformed

    //keep closed
    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if (li.hasPrevious() == false) {
            return;
        } else {
            t = (Task) li.previous();
            //update display
            curtask--;
            lblctask.setText("" + curtask);
            txtname.setText(t.getName());
            txtdesc.setText(t.getDescription());
        }
    }//GEN-LAST:event_btnpreviousActionPerformed

    //keep closed
    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    //keep closed
    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        txtname.setText("");
        txtdesc.setText("");
    }//GEN-LAST:event_mnuclearActionPerformed

    public void preLoad() {
        li.add(new Task("Math Homework", "pages 12-19"));
        li.add(new Task("Groceries", "Bread\nMilk\nEggs"));
        li.add(new Task("Chores", "Laundry\nClean Driveway"));
        while (li.hasPrevious()) {
            t = (Task) li.previous();
        }
        curtask = 1;
        tottask = 3;
        lblctask.setText("" + curtask);
        lblttask.setText("" + tottask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JCheckBoxMenuItem mnuafter;
    private javax.swing.JCheckBoxMenuItem mnubefore;
    private javax.swing.JCheckBoxMenuItem mnuclear;
    private javax.swing.JCheckBoxMenuItem mnuexit;
    private javax.swing.JCheckBoxMenuItem mnuremove;
    private javax.swing.JCheckBoxMenuItem mnureplace;
    private javax.swing.JCheckBoxMenuItem mnurestore;
    private javax.swing.JCheckBoxMenuItem mnushow;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
