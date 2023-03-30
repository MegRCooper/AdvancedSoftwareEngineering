/**
 *
 * @author Megan Cooper COO19695119
 * Completed as part of the MSc Comp Sci @ the University of Lincoln
 * Module: Advanced Software Engineering (CMP9134M)
 * 
 */
package ase_assignment_onev2;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class BofFilter extends FileFilter {
    public BofFilter(){
        
    }
    
    @Override
    public boolean accept(File f){
        if (f.isDirectory() || f.getName().toLowerCase().endsWith(".bof")){
            return (true);
        }
        else{
            return (false);
        }
    }
    
    @Override
    public String getDescription(){
        return("Bank Object File");
    }
}
