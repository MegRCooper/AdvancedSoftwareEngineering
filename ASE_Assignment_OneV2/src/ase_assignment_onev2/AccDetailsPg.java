/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

public class AccDetailsPg extends javax.swing.JDialog {

    /**
     * Creates new form AccountDetailsPage
     */
    public AccDetailsPg(java.awt.Frame parent, boolean modal, Customers customer) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
        setTitle(String.format("Account Details Page - %s %s", customer.getFName(), customer.getLName()));
        
        firstNameField.setText(customer.getFName());
        lastNameField.setText(customer.getLName());
        ssnField.setText(customer.getIDNum());
        typeField.setText(customer.getAcc().getAccType());
        accountNumberField.setText(String.valueOf(customer.getAcc().getAccNum()));
        balanceField.setText(String.format("$%.2f", customer.getAcc().getBal()));
        interestField.setText(String.valueOf(customer.getAcc().getInterest() * 100) + "%");
        feeField.setText(String.format("$%.2f", customer.getAcc().getTransactionFee()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        ssnField = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JLabel();
        accountNumberLabel = new javax.swing.JLabel();
        accountNumberField = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JLabel();
        interestLabel = new javax.swing.JLabel();
        interestField = new javax.swing.JLabel();
        feeLabel = new javax.swing.JLabel();
        feeField = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(9, 2, 5, 5));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        lastNameLabel.setText("Last Name:");
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);

        IDLabel.setText("ID Number");
        getContentPane().add(IDLabel);
        getContentPane().add(ssnField);

        typeLabel.setText("Account Type:");
        getContentPane().add(typeLabel);
        getContentPane().add(typeField);

        accountNumberLabel.setText("Account Number:");
        getContentPane().add(accountNumberLabel);
        getContentPane().add(accountNumberField);

        balanceLabel.setText("Balance:");
        getContentPane().add(balanceLabel);
        getContentPane().add(balanceField);

        interestLabel.setText("Interest Rate:");
        getContentPane().add(interestLabel);
        getContentPane().add(interestField);

        feeLabel.setText("Transaction Fee:");
        getContentPane().add(feeLabel);
        getContentPane().add(feeField);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel accountNumberField;
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JLabel balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel feeField;
    private javax.swing.JLabel feeLabel;
    private javax.swing.JLabel firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel interestField;
    private javax.swing.JLabel interestLabel;
    private javax.swing.JLabel lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel ssnField;
    private javax.swing.JLabel typeField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}