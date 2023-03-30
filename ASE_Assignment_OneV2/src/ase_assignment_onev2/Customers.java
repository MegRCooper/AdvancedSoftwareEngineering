/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

import java.io.Serializable;

public class Customers implements Serializable{
    private final String fName;
    private final String lName;
    private final String idNum;
    private final Account account;
    
    Customers(String fName, String lName, String idNum, Account account){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return ("\n Customer Infomation \n" +
                "First Name: "+ getFName() + "\n" +
                "Surname: " + getLName() + "\n" + 
                "ID Number: " + getIDNum() + "\n" + account
                );
    }
    public String basicAccInfo(){
        return ("Account Number: " + account.getAccNum() + " - Name: " +
                getFName() + " " + getLName());
    }
    public Account getAcc(){
        return (account);
    }
    public String getFName(){
        return (fName);
    }
    public String getLName(){
        return (lName);
    }
    public String getIDNum(){
        return (idNum);
    }
}
