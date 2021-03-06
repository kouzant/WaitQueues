package gui;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.GregorianCalendar;
import java.util.Date;

import utilities.Cache;
import charts.*;
import entities.Flights;
import entities.Statistics;
import business.CancelBook;
import java.io.File;

public class DisplayFlights extends javax.swing.JFrame {

    /** Creates new form DisplayFlights */
    public DisplayFlights() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Προβολή Πτήσεων", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Από:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Επιλέξτε Αφετηρία--", "Athens", "Thessaloniki", "Rhodes" }));
        jComboBox1.setAutoscrolls(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioButton3, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Προβολή Στοιχείων");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayData(evt);
            }
        });

        jLabel3.setText("Προς:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioButton3, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Προβολή δρομολογίων  μιας πτήσης");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Προβολή δρομολογίων όλων των πτήσεων");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton4)))
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(700, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Κρατήσεις Πτήσεων", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 204, 0))); // NOI18N

        jLabel4.setText("Από:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Επιλέξτε Αφετηρία--", "Athens", "Thessaloniki", "Rhodes" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Προς:");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Ημερομηνία Αναχώρησης:");

        jLabel7.setText("Ώρα Αναχώρησης:");

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton3.setText("Συνέχεια...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fligthReservation(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(760, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(6, 6, 6))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ακύρωση Κράτησης", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel8.setText("Κωδικός Πτήσης:");

        jLabel9.setText("Κωδικός Κράτησης:");

        jButton4.setText("Συνέχεια...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightCancellation(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(760, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jButton1.setText("Λήξη Προσομοίωσης");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulation(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1.setForeground(new java.awt.Color(144, 153, 151));
        jLabel1.setText("Καλώς ήλθατε στο προσομοιωτικό σύστημα κράτησης αεροπορικών εισητηρίων");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(345, 345, 345))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayData(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayData
        // jButton2 handler:
        String startpoint = (String) jComboBox1.getSelectedItem();
        String endpoint = (String) jComboBox2.getSelectedItem();
        LinkedList<Flights> fList = Cache.getFList();
        Iterator<Flights> fListIt = fList.iterator();

        if (jRadioButton3.isSelected()) {
            LinkedList<Flights> fPList = new LinkedList();
            
            while (fListIt.hasNext()) {
                Flights tmpFlight = fListIt.next();
                if (tmpFlight.getDeparture().equals(startpoint)
                        && tmpFlight.getArrival().equals(endpoint)) {
                    fPList.add(tmpFlight);
                }
            }
            PrintFlightData newPrintFlightData = new PrintFlightData();
            newPrintFlightData.dispData(fPList);
            newPrintFlightData.setVisible(true);
        } else {
            PrintFlightData newPrintFlightData = new PrintFlightData();
            newPrintFlightData.dispData(fList);
            newPrintFlightData.setVisible(true);
        }
    }//GEN-LAST:event_displayData

    private void fligthReservation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fligthReservation
        // jButton3 handler:
        String startpoint = (String) jComboBox3.getSelectedItem();
        String endpoint = (String) jComboBox4.getSelectedItem();
        String depDate = (String) jComboBox5.getSelectedItem();
        String depHour = (String) jComboBox6.getSelectedItem();
        String[] tmpDDate = depDate.split("[/]");
        String[] tmpDHour = depHour.split("[:]");
        Date departureTime = new GregorianCalendar(Integer.parseInt(tmpDDate[2]),
                Integer.parseInt(tmpDDate[1]) - 1, Integer.parseInt(tmpDDate[0]),
                Integer.parseInt(tmpDHour[0]), Integer.parseInt(tmpDHour[1])).getTime();

        LinkedList<Flights> fList = Cache.getFList();
        Iterator<Flights> fListIt = fList.iterator();
        Flights indexF = null;
        while (fListIt.hasNext()) {
            Flights tmpFlight = fListIt.next();
            if (tmpFlight.getDeparture().equals(startpoint)
                    && tmpFlight.getArrival().equals(endpoint)
                    && (tmpFlight.getDepTime().getTime() == departureTime.getTime())) {
                indexF = tmpFlight;
                break;
            }
        }

        ReservationGUI newReservation = new ReservationGUI(indexF.getFlightCode(), indexF.getDeparture(),
                indexF.getArrival(), indexF.getDepTime(),
                indexF.getArrTime(), indexF.getTotalSeats(), indexF.getAvailSeats());
        newReservation.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_fligthReservation

    private void flightCancellation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightCancellation
        // jButton4 handler:
        String flightCode = jTextField1.getText().toUpperCase();
        String bookID = jTextField2.getText();

        super.setVisible(false);
        new CancelBook(bookID, flightCode);
        CancellationSuccess cancellation = new CancellationSuccess();
        cancellation.setVisible(true);
        if (Cache.getDeleted()) {
            cancellation.displayWindow("Η κράτηση ακυρώθηκε επιτυχώς!");
        } else {
            cancellation.displayWindow("Η ακύρωση της κράτησης απέτυχε!");
        }
        
    }//GEN-LAST:event_flightCancellation

    private void stopSimulation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulation
        // jButton1 handler:
        super.setVisible(false);
        FinalStatistics finStatistics = new FinalStatistics();
        finStatistics.setVisible(true);
        Iterator<Statistics> statsIt = Cache.getFlightStats().iterator();
        StringBuilder sb = new StringBuilder();
        Statistics index;
        while(statsIt.hasNext()){
            index = statsIt.next();
            sb.append("Flight Code: ");
            sb.append(index.getFlightCode()).append("\n");
            sb.append("-----------------\n");
            sb.append("λ: ");
            sb.append(index.getl()).append("\n");
            sb.append("μ: ");
            sb.append(index.getM()).append("\n");
            sb.append("ρ: ");
            sb.append(index.getRf()).append("\n");
            sb.append("W: ");
            sb.append(index.getW()).append("\n");
            sb.append("\n").append("\n");
            
            finStatistics.printStatsAll(sb.toString());
        }
        
        File chartDir = new File("charts");
        if (!chartDir.exists())
            chartDir.mkdir();
        BarChartL barChartL = new BarChartL("Προσομοίωση κράτησης αεροπορικών"
                + " εισητηρίων", "Μέσος όρος αφίξεων (λ)", Cache.getFlightStats());
        barChartL.pack();
        barChartL.setLocation(640, 20);
        barChartL.setVisible(true);
        
        BarChartM barChartM = new BarChartM("Προσομοίωση κράτησης αεροπορικών"
                + " εισητηρίων", "Μέσος ρυθμός στη φάση της εξυπηρέτησης (μ)", 
                Cache.getFlightStats());
        barChartM.pack();
        barChartM.setLocation(20, 20);
        barChartM.setVisible(true);
        
        BarChartR barChartR = new BarChartR("Προσομοίωση κράτησης αεροπορικών"
                + " εισητηρίων", "Βαθμός ενεργοποίησης συστήματος (ρ)", 
                Cache.getFlightStats());
        barChartR.pack();
        barChartR.setLocation(20, 520);
        barChartR.setVisible(true);
    }//GEN-LAST:event_stopSimulation

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String case1[] = new String[]{"-------------", "Thessaloniki", "Rhodes"};
        String case2[] = new String[]{"-------------", "Athens", "Rhodes"};
        String case3[] = new String[]{"-------------", "Athens", "Thessaloniki"};
        javax.swing.JComboBox cb = (javax.swing.JComboBox) evt.getSource();
        String startpoint = (String) cb.getSelectedItem();
        if (startpoint.equals("Athens")) {
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(case1));
        } else if (startpoint.equals("Thessaloniki")) {
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(case2));
        } else if (startpoint.equals("Rhodes")) {
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(case3));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String case1[] = new String[]{"-------------", "Thessaloniki", "Rhodes"};
        String case2[] = new String[]{"-------------", "Athens", "Rhodes"};
        String case3[] = new String[]{"-------------", "Athens", "Thessaloniki"};
        String case4[] = new String[]{" "};
        javax.swing.JComboBox cb = (javax.swing.JComboBox) evt.getSource();
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case4));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case4));
        String startpoint = (String) cb.getSelectedItem();
        if (startpoint.equals("Athens")) {
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(case1));
        } else if (startpoint.equals("Thessaloniki")) {
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(case2));
        } else if (startpoint.equals("Rhodes")) {
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(case3));
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        String case1[] = new String[]{"----------", "20/10/2011", "28/10/2011"};
        String case2[] = new String[]{"----------", "22/10/2011", "30/10/2011"};
        String case3[] = new String[]{"----------", "23/10/2011", "25/10/2011"};
        String case4[] = new String[]{"----------", "26/10/2011"};
        String case5[] = new String[]{"----------", "20/10/2011"};
        String case6[] = new String[]{" "};
        javax.swing.JComboBox cb = (javax.swing.JComboBox) evt.getSource();
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case6));
        String resultpoint = (String) cb.getSelectedItem();
        if ((resultpoint.equals("Athens")) && jComboBox3.getSelectedItem().equals("Thessaloniki")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case2));
        } else if (resultpoint.equals("Thessaloniki") && jComboBox3.getSelectedItem().equals("Athens")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case1));
        } else if (resultpoint.equals("Rhodes") && jComboBox3.getSelectedItem().equals("Athens")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case3));
        } else if (resultpoint.equals("Athens") && jComboBox3.getSelectedItem().equals("Rhodes")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case4));
        } else if (resultpoint.equals("Rhodes") && jComboBox3.getSelectedItem().equals("Thessaloniki")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case5));
        } else if (resultpoint.equals("Thessaloniki") && jComboBox3.getSelectedItem().equals("Rhodes")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(case5));
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        String case1[] = new String[]{"-----", "09:00"};
        String case2[] = new String[]{"-----", "10:00"};
        String case3[] = new String[]{"-----", "11:00"};
        String case4[] = new String[]{"-----", "10:45"};
        String case5[] = new String[]{"-----", "12:00"};
        String case6[] = new String[]{"-----", "09:00", "15:00"};
        String case7[] = new String[]{"-----", "21:00"};
        String case8[] = new String[]{"-----", "23:10"};
        javax.swing.JComboBox cb = (javax.swing.JComboBox) evt.getSource();
        String startpoint = (String) jComboBox3.getSelectedItem();
        String depDate = (String) cb.getSelectedItem();
        if (depDate.equals("20/10/2011")) {
            if (startpoint.equals("Athens")) {
                jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case1));
            } else if (startpoint.equals("Thessaloniki")) {
                jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case3));
            } else {
                jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case2));
            }
        } else if (depDate.equals("22/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case4));
        } else if (depDate.equals("23/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case2));
        } else if (depDate.equals("25/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case5));
        } else if (depDate.equals("26/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case6));
        } else if (depDate.equals("28/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case7));
        } else if (depDate.equals("30/10/2011")) {
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(case8));
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
