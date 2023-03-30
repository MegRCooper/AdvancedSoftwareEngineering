/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

class InsufficientFundsEx extends Exception {
    public InsufficientFundsEx(){
        super("You have insufficient funds to complete transaction.");
    }
}
