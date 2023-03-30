/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Bank implements Serializable{
    private ArrayList <Customers> customers = new ArrayList<Customers>();
    
    void addCustomer(Customers customer){
        if(accExists(customer.getAcc().getAccNum())){
            customer.getAcc().setAccNum(findValidAccNum());
        }
        customers.add(customer);
    }
    private int findValidAccNum(){
        int accNum;
        do{
            accNum = Account.getNextAccNum();
        }
        while(accExists(accNum));
        return(accNum);
    }
    private boolean accExists(int accNum){
        for(Customers cstmr : customers){
            if(cstmr.getAcc().getAccNum() == accNum){
                return(true);
            }
        }
        return(false);
    }
    Customers getCustomer(int account){
        return customers.get(account);
    }
    ArrayList<Customers> getCustomers(){
        return(customers);
    }
    Customers getCustomerByAccNum(int accNum){
        Customers customer = null;
        for (Customers cstmr : customers) {
            if(cstmr.getAcc().getAccNum() == accNum) {
		customer = cstmr;
		break;
            }
	}
        return (customer);
    }
    void delCustomer(Customers customer){
        customers.remove(customer);
    }
    public static double round(double value, int places){
        if(places < 0){
            throw new IllegalArgumentException();
        }
        BigDecimal bigDec = new BigDecimal(value);
        bigDec = bigDec.setScale(places, RoundingMode.HALF_UP);
        return(bigDec.doubleValue());
    }
}
