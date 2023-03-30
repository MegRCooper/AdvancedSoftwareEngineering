/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;


import javax.swing.JOptionPane;

public class AddAccMenu extends javax.swing.JDialog {

    private Bank bank;
    private Customers customer;

    /**
     * Creates new form AddAccountMenu
     */
    public AddAccMenu(java.awt.Frame parent, boolean modal, Bank bank) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.bank = bank;
        customer = null;
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
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        idNumLabel = new javax.swing.JLabel();
        idNumField = new javax.swing.JTextField();
        depositLabel = new javax.swing.JLabel();
        depositField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JComboBox();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Account Menu");
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        lastNameLabel.setText("Last Name:");
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);

        idNumLabel.setText("ID Number");
        getContentPane().add(idNumLabel);
        getContentPane().add(idNumField);

        depositLabel.setText("Initial Deposit:");
        getContentPane().add(depositLabel);
        getContentPane().add(depositField);

        typeLabel.setText("Account Type:");
        getContentPane().add(typeLabel);

        typeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current", "Savings" }));
        getContentPane().add(typeField);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        StringBuilder warnings = new StringBuilder();
        String firstName = "", lastName = "", idNum = "", depositString = "";
        double amount = 0;
        //Verify first name field
        if (firstNameField.getText().isEmpty()) {
            warnings.append("First name must not be empty.\n");
        } else {
            firstName = firstNameField.getText();
        }
        //Verify last name field
        if (lastNameField.getText().isEmpty()) {
            warnings.append("Last name must not be empty.\n");
        } else {
            lastName = lastNameField.getText();
        }
        if (!idNumField.getText().matches("(\\d{3}-?){2}\\d{4}")) {
            warnings.append("ID Num must be 10 digits, dashes are acceptable.\n");
        } else {
            idNum = idNumField.getText().replace("-", "");
        }
        //Verify initial deposit
        if (depositField.getText().isEmpty()) {
            warnings.append("Initial deposit must be entered.");
        } else {
            try {
                amount = Bank.round(Double.parseDouble(depositField.getText()), 2);
            } catch (NumberFormatException ex) {
                warnings.append("Initial deposit must be a number.");
            }
        }
        if (warnings.length() > 0) {
            JOptionPane.showMessageDialog(this, warnings.toString(), "Input Warnings", JOptionPane.WARNING_MESSAGE);
        } else {
            Account account = null;
            if ("Current".equals(typeField.getSelectedItem().toString())) {
                if (amount >= 10) {
                    account = new CurrntAcc(amount);
                } else {
                    warnings.append("Initial deposit must be at least £10 for Current accounts.");
                }
            } else if ("Savings".equals(typeField.getSelectedItem().toString())) {
                if (amount >= 1) {
                    account = new SavingsAcc(amount);
                } else {
                    warnings.append("Initial deposit must be at least £1 for Savings accounts.");
                }
            }
            if (account != null) {
                customer = new Customers(firstName, lastName, idNum, account);
                bank.addCustomer(customer);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, warnings.toString(), "Input Warnings", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_okButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField idNumField;
    private javax.swing.JLabel idNumLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox typeField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    Customers getCustomer() {
        return customer;
    }
}