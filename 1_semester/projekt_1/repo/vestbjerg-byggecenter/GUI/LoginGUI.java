package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import Controllers.*;
import Models.Branch;
import Models.Company;
import Models.Customer;
import Models.Employee;
import Models.Item;
import Models.Location;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {
	private MainMenuGUI mainMenuGUI;
	private JTextField txtEmployeeNo;
	private JPasswordField pwdEmployeePassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{82, 35, 333, 0};
		gridBagLayout.rowHeights = new int[]{90, 26, 26, 29, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEmployeeNo = new JLabel("Employee No");
		GridBagConstraints gbc_lblEmployeeNo = new GridBagConstraints();
		gbc_lblEmployeeNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmployeeNo.gridx = 0;
		gbc_lblEmployeeNo.gridy = 1;
		add(lblEmployeeNo, gbc_lblEmployeeNo);
		
		txtEmployeeNo = new JTextField();
		txtEmployeeNo.setToolTipText("Enter employee no. ..");
		GridBagConstraints gbc_txtEmployeeNo = new GridBagConstraints();
		gbc_txtEmployeeNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmployeeNo.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmployeeNo.gridx = 2;
		gbc_txtEmployeeNo.gridy = 1;
		add(txtEmployeeNo, gbc_txtEmployeeNo);
		txtEmployeeNo.setColumns(10);
		
		JLabel lblEmployeePassword = new JLabel("Password");
		lblEmployeePassword.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblEmployeePassword = new GridBagConstraints();
		gbc_lblEmployeePassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmployeePassword.gridx = 0;
		gbc_lblEmployeePassword.gridy = 2;
		add(lblEmployeePassword, gbc_lblEmployeePassword);
		
		pwdEmployeePassword = new JPasswordField();
		pwdEmployeePassword.setToolTipText("Enter password ..");
		GridBagConstraints gbc_pwdEmployeePassword = new GridBagConstraints();
		gbc_pwdEmployeePassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdEmployeePassword.insets = new Insets(0, 0, 5, 0);
		gbc_pwdEmployeePassword.gridx = 2;
		gbc_pwdEmployeePassword.gridy = 2;
		add(pwdEmployeePassword, gbc_pwdEmployeePassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performLogin();
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.NORTH;
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.gridx = 2;
		gbc_btnLogin.gridy = 3;
		add(btnLogin, gbc_btnLogin);
		
		addTestData();
	}
	
	private void performLogin() {
		int employeeNo = Integer.parseInt(txtEmployeeNo.getText());
		String employeePassword = pwdEmployeePassword.getText();
		
		SessionsController sessionsCtrl = new SessionsController();
		
		if(sessionsCtrl.loginEmployee(employeeNo, employeePassword)) {
			JOptionPane.showMessageDialog(null, "You successfully logged in!", "Success", JOptionPane.INFORMATION_MESSAGE);
			mainMenuGUI = new MainMenuGUI();
			mainMenuGUI.setVisible(true);
			this.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "There was an error ... Try again!", "Error", JOptionPane.ERROR_MESSAGE);
			txtEmployeeNo.setText("");
			pwdEmployeePassword.setText("");
		}
	}
	
	private void addTestData() {
		EmployeeController eCtrl = new EmployeeController();
        BranchController bCtrl = new BranchController();
        LocationController lCtrl = new LocationController();
        ItemController iCtrl = new ItemController();
        
        Employee e = eCtrl.createEmployee("Knægt", "Knægtessen", "2828282828", "31337135", "Langagervej 4", 9220, "Aalborg Øst", "dengodekode123", "Master of Disaster", "Direktør");
        Employee ea = eCtrl.createEmployee("Konge", "Kongessen", "2828282828", "31337135", "Langagervej 4", 9220, "Aalborg Øst", "dengodekode123", "Master of Disaster", "Direktør");
        Employee eb = eCtrl.createEmployee("Dronning", "Dronningsen", "2828282828", "31337135", "Langagervej 4", 9220, "Aalborg Øst", "dengodekode123", "Master of Disaster", "Direktør");
        Branch b = bCtrl.createBranch("Afdeling Q", "Sejvej 1", 9000, "Aalborg", "22222222");
        Location l = lCtrl.createLocation("Department A", 1, b);

        bCtrl.addEmployee("Afdeling Q", e);
        bCtrl.addEmployee("Afdeling Q", ea);
        bCtrl.addEmployee("Afdeling Q", eb);
        bCtrl.addLocation("Afdeling Q", l);
        
        CustomerController cCtrl = new CustomerController();
        CompanyController coCtrl = new CompanyController();
    
        Customer c = cCtrl.createCustomer("Kongen", "Kongesen", "1234567890", "12345678", "Havvej", "Havby", 8000, "Erhverv");
        Company co = coCtrl.createCompany("UCN",1234567890, "Vejen", 9000, "Aalborg", c);
        cCtrl.setCompany(c, co);
        
        Item i = iCtrl.createItem(l, "123456", "Damprenser", "Gør rent nemt", 500, 10, 5, 15, 5, true);
	}

}
