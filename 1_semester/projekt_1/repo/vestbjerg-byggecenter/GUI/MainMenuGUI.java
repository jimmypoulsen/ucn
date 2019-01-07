package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
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

public class MainMenuGUI extends JFrame {
	private EmployeeController eCtrl;
    private BranchController bCtrl;
    private LocationController lCtrl;
    private ItemController iCtrl;
	private JPanel contentPane;
	private LoginGUI loginGUI;
	private OrdersGUI ordersGUI;
	private SalesGUI salesGUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuGUI frame = new MainMenuGUI();
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
	public MainMenuGUI() {
		loginGUI = new LoginGUI();
		ordersGUI = OrdersGUI.getInstance();
		salesGUI = SalesGUI.getInstance();
		SessionsController sessionsCtrl = new SessionsController();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAddTestData = new JMenuItem("Add test data");
		mntmAddTestData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTestData();
			}
		});
		mnFile.add(mntmAddTestData);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out (" + sessionsCtrl.getCurrentLoggedInEmployee().getFirstName() + ")");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: handle log out
			}
		});
		mnFile.add(mntmLogOut);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		tabbedPane.addTab("Orders", null, ordersGUI, null);
		tabbedPane.addTab("Sales", null, salesGUI, null);
		GridBagLayout gbl_ordersGUI = new GridBagLayout();
		gbl_ordersGUI.columnWidths = new int[]{419, 0};
		gbl_ordersGUI.rowHeights = new int[]{26, 0};
		gbl_ordersGUI.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_ordersGUI.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		ordersGUI.setLayout(gbl_ordersGUI);
		
		init();
	}
	
	private void init() {
		eCtrl = new EmployeeController();
		bCtrl = new BranchController();
		lCtrl = new LocationController();
		iCtrl = new ItemController();
		addTestData();
	}
	
	private void performLogOut() {
		// TODO: log out code here ..
	}
	
	private void exit() {
		System.exit(0);
	}
	
	private void addTestData() {
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
        Item ia = iCtrl.createItem(l, "12345678", "Damplokomotiv", "xddd", 50000, 10, 5, 15, 5, true);
        Item ib = iCtrl.createItem(l, "1234", "Hammer", "hammer hammer fedt", 250, 10, 5, 15, 5, true);
	}

}
