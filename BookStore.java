import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 


class MainWindow extends LoginPage {
	MainWindow() {
		JFrame Mframe = new JFrame();
		Mframe.setTitle("Welcome");
    	Mframe.setSize(300, 200);
    	Mframe.setLocationRelativeTo(null); 
    	Mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Mframe.setVisible(true);
		
		JLabel l1 = new JLabel("Choose:");
		JButton BAdmin,BUser, BExit;
		BAdmin = new JButton("Admin");
		BUser = new JButton("User");
		BExit = new JButton("Exit");

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2,20,50)) ;
		p1.setBounds(30,30,30,30);
		p1.add(BAdmin);
		p1.add(BUser);
		

		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.setBounds(30,30,30,30);
		p2.add(l1, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		p2.add(BExit, BorderLayout.SOUTH);
		Mframe.add(p2, BorderLayout.CENTER);
		
		BAdmin.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	ALoginPage Lf = new ALoginPage();
		  	Mframe.setVisible(false); 
			}  
		});	
		
		BUser.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	ULoginPage Lf = new ULoginPage();
		  	Mframe.setVisible(false); 
			}  
		});	
		
		BExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				System.exit(0);
				}
			});
	}
}

class ALoginPage extends JFrame {
	ALoginPage() {
		JFrame Lframe = new JFrame();
    	Lframe.setSize(300, 200);
    	Lframe.setLocationRelativeTo(null); 
    	Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	Lframe.setVisible(true);
		
		JPanel p3 = new JPanel(new GridLayout(2,2,5,5));
		JLabel LUname, LPassword;
		LUname = new JLabel("Enter Username: "); 
		LPassword = new JLabel("Enter Password: ");
		JTextField FUname = new JTextField("Type your username");
		JPasswordField FPassword = new JPasswordField();
		p3.add(LUname);
		p3.add(FUname);
		p3.add(LPassword);
		p3.add(FPassword);
		
		JButton BSubmit = new JButton("Login");
		BSubmit.setSize(50,50);
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(new JLabel("Login Page"), BorderLayout.NORTH);
		p4.add(p3, BorderLayout.CENTER);
		p4.add(BSubmit,BorderLayout.SOUTH); 
		Lframe.add(p4, BorderLayout.CENTER);	
		
		BSubmit.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	AdminFunctions admin = new AdminFunctions();
		  	Lframe.setVisible(false);
			}  
		});
				
	}
}

class ULoginPage extends JFrame {
	ULoginPage() {
		JFrame Lframe = new JFrame();
    	Lframe.setSize(300, 200);
    	Lframe.setLocationRelativeTo(null); 
    	Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	Lframe.setVisible(true);
		
		JPanel p3 = new JPanel(new GridLayout(3,3,5,5));
		JLabel LUname, LPassword;
		LUname = new JLabel("Enter Username: "); 
		LPassword = new JLabel("Enter Password: ");
		JTextField FUname = new JTextField("Type your username");
		JPasswordField FPassword = new JPasswordField();
		
		
		JButton BSubmit = new JButton("Submit");
		JButton BLogin = new JButton("Don't have an account?");
		BSubmit.setSize(50,50);
		BLogin.setSize(50,50);
		
		p3.add(LUname);
		p3.add(FUname);
		p3.add(LPassword);
		p3.add(FPassword);
		p3.add(BSubmit);
		p3.add(BLogin);	
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(new JLabel("Login Page"), BorderLayout.NORTH);
		p4.add(p3, BorderLayout.CENTER); 
		Lframe.add(p4, BorderLayout.CENTER);
		
		BLogin.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	RegistrationPage r = new RegistrationPage();
		  	Lframe.setVisible(false);
			}  
		});
			
	}
}

class RegistrationPage extends JFrame {
	RegistrationPage() {
		JFrame Rframe = new JFrame();
		JPanel j = new JPanel(new GridLayout(7,2,5,5));
		JLabel l1,l2,l3,l4,l5,l6;
		l1 = new JLabel("Username");
		l1.setBounds(20,50, 100,30); 
		l2 = new JLabel("Password");
		l2.setBounds(20, 100, 100, 30);
		l3 = new JLabel("Gender");
		l3.setBounds(20, 150, 100, 30);
		l4 = new JLabel("Address");
		l4.setBounds(20,250,100,30);
		l5 = new JLabel("About you");
		l5.setBounds(20,300,100,30);
		l6 = new JLabel("Language Preference");
		l6.setBounds(20,600,250,30);
		
        JTextField t1,t2; 
        t1=new JTextField("Type your username");  
        t2=new JTextField("Fill your address");
        t1.setBounds(95,50, 200,30); 
        t2.setBounds(95,250, 200, 30);
        
        JPasswordField value = new JPasswordField();  
        value.setBounds(100,100,100,30);      
        
        JComboBox jcb1 = new JComboBox(new String[]{"Male", "Female"});

        JButton b1=new JButton("Submit");  
        b1.setBounds(50,700,95,30); 
        JDialog DSuccess = new JDialog(Rframe, "Confirmation", true); 
        JDialog DCancel = new JDialog(Rframe, "Cancellation", true);
        DSuccess.setLayout( new GridLayout() );  
        DCancel.setLayout(new FlowLayout());
        b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e1){  
				DSuccess.setVisible(true); 
				}  
			});  
        JButton b2=new JButton("Cancel");  
        b2.setBounds(200,700,95,30); 
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				DCancel.setVisible(true);
				}
			});
      
        JButton b3=new JButton("Exit");  
        b3.setBounds(350,700,95,30);
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				System.exit(0);
				}
			});
       
        DSuccess.add( new JLabel ("You have registered successfully!!!"));  
        DSuccess.setSize(300,300); 
        DCancel.add(new JLabel("Registration Cancelled"));
        DCancel.setSize(400,400);
        
        JTextArea area=new JTextArea("Type about yourself");  
        area.setBounds(100,310, 200,200);  
    
        JComboBox jcb2 = new JComboBox(new String[]{"Hindi", "English","French","Malayalam"});
        
        j.add(l1);
        j.add(t1);
		j.add(l2);
		j.add(value); 
		j.add(l3);
		j.add(jcb1);
		j.add(l4);
		j.add(t2);
		j.add(l5);
		j.add(area); 
		j.add(l6);
		j.add(jcb2);
		j.add(b1); 
        j.add(b2);
        
        JPanel p5 = new JPanel(new BorderLayout());
        p5.add(j, BorderLayout.CENTER);
        p5.add(b3, BorderLayout.SOUTH);  
         
        Rframe.add(p5, BorderLayout.CENTER);
        
        Rframe.setTitle("Registration Page");
        Rframe.setLocationRelativeTo(null); 
    	Rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rframe.setSize(500,500);  
        Rframe.setVisible(true);       
	}
}

class AdminFunctions extends JFrame {
	AdminFunctions() {
		JFrame AFframe = new JFrame();
		AFframe.setTitle("Login Successfull. Welcome");
        AFframe.setLocationRelativeTo(null); 
    	AFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AFframe.setSize(500,500);  
        AFframe.setVisible(true);
        
        JPanel p6 = new JPanel(new GridLayout(4,4,5,5));
        
        JButton BAddB, BAddC, BAddU, BRemoveB, BRemoveU, BRemoveC, BModifyB, BModifyC, BModifyU, BDisp, BLog ;
        BAddB = new JButton("Add a book");
        BAddB.setBackground(Color.GREEN);
        BAddC = new JButton("Add a category");
        BAddC.setBackground(Color.GREEN);
        BAddU = new JButton("Add a user");
        BAddU.setBackground(Color.GREEN);
        
        BRemoveB = new JButton("Remove a book");
        BRemoveB.setBackground(Color.RED);
        BRemoveC = new JButton("Remove a category");
        BRemoveC.setBackground(Color.RED);
        BRemoveU = new JButton("Remove a user");
        BRemoveU.setBackground(Color.RED);
        
        BModifyB = new JButton("Edit Details of book");
        BModifyB.setBackground(Color.CYAN);
        BModifyC = new JButton("Edit Details of category");
        BModifyC.setBackground(Color.CYAN);
        BModifyU = new JButton("Edit Details of user");
        BModifyU.setBackground(Color.CYAN);
        
        BDisp = new JButton("Display all Books");
        BDisp.setBackground(Color.WHITE);
        BLog = new JButton("Logout");
        BLog.setBackground(Color.LIGHT_GRAY);
        
        JLabel l1,l2,l3 ;
        l1 = new JLabel("Book:");
        l2 = new JLabel("Category:");
        l3 = new JLabel("User:");
        
        p6.add(l1);
        p6.add(BAddB); p6.add(BRemoveB); p6.add(BModifyB);
        p6.add(l2);
        p6.add(BAddC); p6.add(BRemoveC); p6.add(BModifyC);
        p6.add(l3);
        p6.add(BAddU); p6.add(BRemoveU); p6.add(BModifyU);
        p6.add(BDisp);
        p6.add(BLog);
        
		AFframe.add(new JLabel("Choose a Function"), BorderLayout.NORTH);
		AFframe.add(p6, BorderLayout.CENTER);
	}
}
    

public class project {
	public static void main(String[] args) {
		MainWindow Mframe = new MainWindow();
	}
} 

