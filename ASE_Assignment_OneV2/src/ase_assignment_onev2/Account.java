/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

import java.io.Serializable;

public abstract class Account implements Serializable{
    private double balance = 0;
    private double interest = 0.25;
    private int accNum;
    private static int numOfAccs = 100000000;
    private double transactionFee;
    
    Account(){
        accNum = getNextAccNum();
    }
    public static int getNextAccNum(){
        return (++numOfAccs);
    }
    public abstract String getAccType();
    /**
     * @return the balance
     **/
    
    public double getBal() {
	return (balance);
    }
    public void setBal(double balance){
        this.balance = balance;
    }
    public double getInterest(){
        return(interest);
    }
    public void setInterest(double interest){
        this.interest = interest;
    }
    public int getAccNum(){
        return (accNum);
    }
    public void withdrawal(double amount) throws InsufficientFundsEx{
        if (amount + transactionFee > balance){
            throw new InsufficientFundsEx();
        }
        balance -= amount + transactionFee;
        checkInterest(0);
    }
    public void deposit(double amount) throws InvalidAmountEx{
        if(amount <= 0){
            throw new InvalidAmountEx();
        }
        checkInterest(amount);
        amount = amount + amount * interest;
        balance += amount;
    }
    public void checkInterest(double amount){
        if(balance + amount > 2500){
            interest = 0.25;
        }
        else{
            interest = 0.5;
        }
    }
    public double getTransactionFee(){
        return(transactionFee);
    }
    public void setTransactionFee(double fee){
        this.transactionFee = fee;
    }
    void setAccNum(int accNum){
        this.accNum = accNum;
    }
}
