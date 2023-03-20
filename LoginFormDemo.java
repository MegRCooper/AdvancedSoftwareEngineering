// Imports Required Classes & Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;


/**
 * Creating a class to create a login form which extends JFrame to create a window where
 * the components are added. Implements ActionListener to perform an action on bttn click.
 * 
 * **/
class LoginFormDemo extends JFrame implements ActionListener {
	// Initialise bttn, panel, label and txt field.
	JButton bttnOne;
	JPanel nPanel;
	JLabel userLabel, passwdLabel;
	final JTextField txtFieldOne, txtFieldTwo;
	
	// Calling Constructor:
	LoginFormDemo(){
		// Create label for username.
		userLabel = new JLabel();
		userLabel.setText("Username"); // Sets the label value for textFieldOne
	
		// Creation of txt field to get username from the user
		txtFieldOne = new JTextField(15); // Sets length of TXT
		
		// Same code as above for the password function
		passwdLabel = new JLabel();
		passwdLabel.setText("Password");
		txtFieldTwo = new JPasswordField(15);
		
		// Creation of submit bttn
		bttnOne = new JButton("Submit"); 
		
		// Creation of pannel for the form elements.
		nPanel = new JPanel(new GridLayout(3,1));
		nPanel.add(userLabel);
		nPanel.add(txtFieldOne);
		nPanel.add(passwdLabel);
		nPanel.add(txtFieldTwo);
		nPanel.add(bttnOne);
		// Sets border to Panel
		add(nPanel, BorderLayout.CENTER);
		// Perform an action on Bttn Click, by adding an action listener to bttn.
		bttnOne.addActionListener(this);
		setTitle("Login Form:"); // Sets title to the login form
	}
	
	// Defines abstract method actionPerformed() which will be called on the bttn click
	// Pass action listener as a param
	public void actionPerformed(ActionEvent actevnt) {
		String userVal = txtFieldOne.getText(); 
		String passwdVal = txtFieldTwo.getText();
		
        //Checks whether the creds are authentic or not.
		//If authentic, navigate user to a new page
        if (userVal.equals("test1@gmail.com") && passwdVal.equals("test")) {  
            //Create an instance of the NewPage.
            NewPage page = new NewPage();  
            //Make page visible to the user  
            page.setVisible(true);  
            //Creates a welcome label and sets it to the new page  
            JLabel welcomeLabel = new JLabel("   Welcome: "+ userVal); 
            page.getContentPane().add(welcomeLabel);
        }
        else {
        	//Show Error Msg.
        	System.out.println("Please Enter a Valid Username and Password");
        }

	}
}

//Create the Main Class
class LoginForm {
	public static void main(String arg[]) {
		try {
			//Create instance of the LoginFormDemo
			LoginFormDemo form = new LoginFormDemo();
			form.setSize(300,100); //Sets the size of the frame  
            form.setVisible(true);  //Makes the form visible to the user  
		}
		catch (Exception e) {
			// Handle Exception
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
