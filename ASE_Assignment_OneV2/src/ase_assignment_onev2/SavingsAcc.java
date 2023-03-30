/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

public class SavingsAcc extends Account{
    private static String accType = "Savings";
    
    SavingsAcc(double initialDepo){
        this.setBal(initialDepo);
        this.checkInterest(0.15);
        this.setTransactionFee(0);
    }
    
    @Override
    public String getAccType(){
        return (accType);
    }
}
