/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

public class CurrntAcc extends Account{
    private static String accType = "Current";
    
    CurrntAcc(double initialDepo){
        this.setBal(initialDepo);
        this.checkInterest(0.1);
        this.setTransactionFee(0);
    }
    
    @Override
    public String toString(){
        return("Account Type:" + accType + "Account\n" +
	"Account Number: " + this.getAccNum() + "\n" + "Current Balance: " + 
        this.getBal() + "\n" + "Intrest Rate: " + this.getInterest() * 100 + 
        "%\n");
    }
    
    @Override
    public String getAccType(){
        return (accType);
    }    
}