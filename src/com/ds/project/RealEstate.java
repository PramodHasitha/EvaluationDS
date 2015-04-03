/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds.project;

import com.ds.file.HouseFile;
import com.ds.interfaces.Listable;
import com.ds.objects.House;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaBrickWallLookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;

/**
 *
 * @author Ezio
 */
public class RealEstate extends javax.swing.JFrame implements Listable {

    private List<House> houses;
    private int row = 0;
    private Boolean checkAdd = true;
    private HouseFile hf;

    /**
     * Creates new form RealEstate
     */
    public RealEstate() {
        initComponents();
        setLocationRelativeTo(null);

        HouseFile fm = new HouseFile();

        houses = fm.readFile();

        setHouseFile();
//        fm.saveFile("123\tpp\tpp1\t321\t100\t2");
//        SortedList sl = new SortedList();
//        sl.setHouses(houses);
//
//        List<House> h = sl.getHouses();
//
//        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
//        for (House th : h) {
//            System.out.println(th.getLotNumber());
//        }
//        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

    private void setHouseFile(){
        hf = new HouseFile();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_dis = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_lotNumber = new javax.swing.JTextField();
        jTextField_firstName = new javax.swing.JTextField();
        jTextField_lastName = new javax.swing.JTextField();
        jTextField_sqareFeet = new javax.swing.JTextField();
        jTextField_numBedRooms = new javax.swing.JTextField();
        jButton_reset = new javax.swing.JButton();
        jButton_next = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jTextField_price = new javax.swing.JTextField();
        jButton_list = new javax.swing.JButton();
        jButton_find = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evolution");

        jLabel_dis.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel_dis.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_dis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_dis.setText("Next House Displaed : ");
        jLabel_dis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Lot Number:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Nname:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Square Feet:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Number Of Bedrooms:");

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_list.setText("Short List");
        jButton_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listActionPerformed(evt);
            }
        });

        jButton_find.setText("Find");
        jButton_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_dis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_firstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jButton_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_list, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_find, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed

        int i = JOptionPane.showConfirmDialog(rootPane, "What do you want \n Yes - Delete File \n No - Clear Fields", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (i == 0) {
            hf.deleteFile();
            
            houses = hf.readFile();
            JOptionPane.showMessageDialog(rootPane, "Sucessfully Deleted", "Sucess ", JOptionPane.INFORMATION_MESSAGE);
        } else if (i == 1) {
            jTextField_firstName.setText("");
            jTextField_lastName.setText("");
            jTextField_lotNumber.setText("");
            jTextField_numBedRooms.setText("");
            jTextField_price.setText("");
            jTextField_sqareFeet.setText("");

            jLabel_dis.setText("Next House Displaed : ");

            row = 0;

            checkAdd = true;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed

        checkAdd = false;

        if (!(houses.isEmpty())) {
            House house = houses.get(row);
            jLabel_dis.setText("Next House Displaed : " + (row + 1));

            jTextField_firstName.setText(house.getFirstName());
            jTextField_lastName.setText(house.getLastName());
            jTextField_lotNumber.setText(house.getLotNumber() + "");
            jTextField_numBedRooms.setText(house.getNoOfBedroom() + "");
            jTextField_price.setText(house.getPrice() + "");
            jTextField_sqareFeet.setText(house.getSquareFeet() + "");

            Integer i = houses.size();
            if (--i != row) {
                row++;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

        if (checkAdd && !(jTextField_lotNumber.getText().equals(""))) {

            House house = new House();
            house.setFirstName(jTextField_firstName.getText());
            house.setLastName(jTextField_lastName.getText());
            house.setLotNumber(Long.parseLong(jTextField_lotNumber.getText()));
            house.setNoOfBedroom(Integer.parseInt(jTextField_numBedRooms.getText()));
            house.setPrice(Long.parseLong(jTextField_price.getText()));
            house.setSquareFeet(Long.parseLong(jTextField_sqareFeet.getText()));

            Boolean bol = compierList(Long.parseLong(jTextField_lotNumber.getText()));

            if (bol) {
                JOptionPane.showMessageDialog(rootPane, "Error in Lot Number", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                hf.saveHouseFile(house);

                houses = hf.readFile();

                JOptionPane.showMessageDialog(rootPane, "Successfully Added", "Success", JOptionPane.INFORMATION_MESSAGE);

                clear();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "You need to rest befor add or Check Lot Number !", "Error", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed

        if (checkAdd) {
            JOptionPane.showMessageDialog(rootPane, "Error No Recode Selected !", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            List<House> newList = new ArrayList<>();

            for (House h : houses) {
                if (!(h.getLotNumber().toString().equals(jTextField_lotNumber.getText()))) {
                    newList.add(h);
                }
            }

            JOptionPane.showMessageDialog(rootPane, "Successfully Delete", "Success", JOptionPane.INFORMATION_MESSAGE);
//
//            jTextField_firstName.setText("");
//            jTextField_lastName.setText("");
//            jTextField_lotNumber.setText("");
//            jTextField_numBedRooms.setText("");
//            jTextField_price.setText("");
//            jTextField_sqareFeet.setText("");
//
//            jLabel_dis.setText("Next House Displaed : ");
//
//            row = 0;
//
//            checkAdd = true;
            
            clear();
            System.out.println(newList.size());
            hf.saveHouseList(newList);

            houses = hf.readFile();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listActionPerformed

        ListHouse lh = new ListHouse(this, rootPaneCheckingEnabled, houses);
        lh.setVisible(true);


        houses = hf.readFile();

        SortedList sl = new SortedList();
        sl.setHouses(houses);

        houses = sl.getShortHouses();

        hf.saveHouseList(houses);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_listActionPerformed

    private void jButton_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_findActionPerformed

        Long lot = Long.parseLong(jTextField_lotNumber.getText());
        jTextField_firstName.setText("");
        
        clear();

        try {
            Long lotNumber = lot;

            houses = hf.readFile();
            Boolean v = false;
            //            System.out.println("l "+lotNumber);
            for (House h : houses) {
                //                System.out.println("s "+h.getLotNumber());
                if (h.getLotNumber().equals(lotNumber)) {
                    jTextField_firstName.setText(h.getFirstName());
                    jTextField_lastName.setText(h.getLastName());
                    jTextField_numBedRooms.setText(h.getNoOfBedroom() + "");
                    jTextField_price.setText(h.getPrice() + "");
                    jTextField_sqareFeet.setText(h.getSquareFeet() + "");
                    v = true;
                }
            }

            if (!v) {
                JOptionPane.showMessageDialog(rootPane, "No Result to Show", "Information ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Lot number Error !", "Error ", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_findActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEstate().setVisible(true);
                try {
//                    UIManager.setLookAndFeel(new SubstanceNebulaBrickWallLookAndFeel());
                    UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
//                    UIManager.setLookAndFeel(new SynthLookAndFeel());
                } catch (UnsupportedLookAndFeelException e) {
                }
            }
        });
    }

    private void clear() {

        jTextField_firstName.setText("");
        jTextField_lastName.setText("");
        jTextField_lotNumber.setText("");
        jTextField_numBedRooms.setText("");
        jTextField_price.setText("");
        jTextField_sqareFeet.setText("");

        jLabel_dis.setText("Next House Displaed : ");

        row = 0;

        checkAdd = true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_find;
    private javax.swing.JButton jButton_list;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_dis;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_lotNumber;
    private javax.swing.JTextField jTextField_numBedRooms;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_sqareFeet;
    // End of variables declaration//GEN-END:variables

    @Override
    public Boolean compierList(Long lotNumber) {
        Boolean bol = false;
        for (House h : houses) {
            if (lotNumber.equals(h.getLotNumber())) {
                bol = true;
                break;
            }
        }

        return bol;
    }
}
