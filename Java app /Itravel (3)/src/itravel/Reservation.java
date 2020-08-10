/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itravel; 
  
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;   
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hanadim
 */
public class Reservation extends javax.swing.JFrame {
Connection connect=null;
PreparedStatement statement=null;
ResultSet result=null;
HotelOwner Hotel=new HotelOwner();
Admin Am=new Admin();

    public Reservation() {
        initComponents();
  
        TableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        OwnerHeader = new javax.swing.JLabel();
        NumRoomLabel = new javax.swing.JLabel();
        NumberComboBox = new javax.swing.JComboBox<>();
        ArrivalDateLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HotelTable = new javax.swing.JTable();
        HIcon = new javax.swing.JLabel();
        DepartureDateLabel = new javax.swing.JLabel();
        ArrivalDateChooser = new com.toedter.calendar.JDateChooser();
        DepDateChooser = new com.toedter.calendar.JDateChooser();
        BackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation");

        BGPanel.setBackground(new java.awt.Color(238, 236, 233));

        OwnerHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/h.jpg"))); // NOI18N

        NumRoomLabel.setText("Number of Rooms");

        NumberComboBox.setMaximumRowCount(3);
        NumberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        ArrivalDateLabel.setText("Arrival Date");

        TotalLabel.setText("Total");

        TotalField.setEditable(false);
        TotalField.setToolTipText("the total price");
        TotalField.setEnabled(false);

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        HotelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        HotelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HotelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HotelTable);

        HIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fotter1.jpg"))); // NOI18N

        DepartureDateLabel.setText("Departure Date");

        ArrivalDateChooser.setDateFormatString("yyyy-MM-dd");

        DepDateChooser.setDateFormatString("yyyy-MM-dd");

        BackButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        BackButton1.setToolTipText("");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArrivalDateLabel)
                            .addComponent(TotalLabel)
                            .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumRoomLabel))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ArrivalDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(DepDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DepartureDateLabel))
                        .addContainerGap())))
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addComponent(HIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addComponent(OwnerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OwnerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(NumRoomLabel)
                        .addGap(12, 12, 12)
                        .addComponent(NumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ArrivalDateLabel)
                        .addGap(2, 2, 2)
                        .addComponent(ArrivalDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DepartureDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DepDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(HIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
  
        if(ArrivalDateChooser.getDate()!=null && DepDateChooser.getDate()!=null)
        {
    JOptionPane.showMessageDialog(null," Booked successfully ");
     try {
                
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/itravel","root","Hn@30113011");
                String selectMax = "SELECT MAX(RESERVATION_NUMBER) FROM reservation";
                Statement st=connect.createStatement();
                ResultSet rs = st.executeQuery(selectMax);
                int max = 0;
                while(rs.next()) {
                    max = rs.getInt(1);
                }
                String INSERT1="INSERT INTO  itravel.reservation "+
                        "(serial_number, Room_number, Arrival_date, Departure_date, Reservation_Number, Customer_ID) VALUES(?,?,?,?,?,?)";
                statement=connect.prepareStatement(INSERT1);
               statement.setInt(1,Integer.parseInt(Am.SerialField.getText()));
                statement.setInt(2,(NumberComboBox.getSelectedIndex()+1));
                statement.setDate(3, new java.sql.Date(ArrivalDateChooser.getDate().getTime()));
                statement.setDate(4, new java.sql.Date(DepDateChooser.getDate().getTime()));
                statement.setInt(5, max+1);
                statement.setInt(6, 212001);
                statement.executeUpdate();
                String UPDATE = "UPDATE ROOMS SET RESERVATION_NUMBER = ? WHERE HSN=?";
                statement=connect.prepareStatement(UPDATE);
                statement.setInt(1, max+1);
                statement.setInt(2, Integer.parseInt(Am.SerialField.getText()));
                statement.executeUpdate();
         
            } catch (HeadlessException | NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error please try again ");
               
            }
  }
      else
            JOptionPane.showMessageDialog(Reservation.this,"Missing field","Missing Information",JOptionPane.WARNING_MESSAGE); 
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void HotelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotelTableMouseClicked
SimpleDateFormat form=new SimpleDateFormat("yyyy-MM-dd");
Date A;  
Date D;  

        try{
int i = HotelTable.getSelectedRow();
TableModel model = HotelTable.getModel();
Hotel.PriceField.setText(model.getValueAt(i,2).toString());
Am.SerialField.setText(model.getValueAt(i,0).toString());
int total = Integer.parseInt(Hotel.PriceField.getText());
if(ArrivalDateChooser.getDate() != null && DepDateChooser.getDate()!=null) {
    A=form.parse(form.format(ArrivalDateChooser.getDate()));
    D=form.parse(form.format(DepDateChooser.getDate()));

    long dif=D.getTime()-A.getTime();
    long H=dif/(60*60*1000);
    long day=H/24;
    total =(int) (Integer.parseInt(Hotel.PriceField.getText())* (NumberComboBox.getSelectedIndex()+1)*day);

}
TotalField.setText(String.valueOf(total));

 }
 catch(NumberFormatException | ParseException e){
     JOptionPane.showMessageDialog(null,"Error please try again ");
 }
    }//GEN-LAST:event_HotelTableMouseClicked

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed

        new Login().setVisible(true);
        dispose();  
    }//GEN-LAST:event_BackButton1ActionPerformed
  
    public void TableData(){
    try {
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/itravel","root","Hn@30113011");
        String SHOW="SELECT `Serial_Number`,`Hotel_name`, `Price`, `Location`,`Hotel_service`"
                + " FROM itravel.`hotels_information`,itravel.`hotel_service` "
                + "WHERE `Serial_number`=`SN` ";
        statement=connect.prepareStatement(SHOW);
        result=statement.executeQuery();
        HotelTable.setModel(DbUtils.resultSetToTableModel(result));
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }

}

    /**
     * @Hanadim the command line arguments
     */
    public static void main(String args[]) {
        Reservation reserv=new Reservation();
       reserv.addWindowListener(
      new WindowAdapter(){
          @Override
          public void windowClosed(WindowEvent e) {
              try {
                  reserv.connect.close();
                  reserv.statement.close();
                  reserv.result.close();
                
              } catch (SQLException ex) {
                ex.printStackTrace();
              }
   } }); 
        
        
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ArrivalDateChooser;
    private javax.swing.JLabel ArrivalDateLabel;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JButton BackButton1;
    private com.toedter.calendar.JDateChooser DepDateChooser;
    private javax.swing.JLabel DepartureDateLabel;
    private javax.swing.JLabel HIcon;
    private javax.swing.JTable HotelTable;
    private javax.swing.JLabel NumRoomLabel;
    private javax.swing.JComboBox<String> NumberComboBox;
    private javax.swing.JLabel OwnerHeader;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField TotalField;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
} 
