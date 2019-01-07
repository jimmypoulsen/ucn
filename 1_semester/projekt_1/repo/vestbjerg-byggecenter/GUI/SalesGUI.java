package GUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

public class SalesGUI extends JPanel {
	private static SalesGUI instance;
	
	public static SalesGUI getInstance() {
		if(instance == null)
			instance = new SalesGUI();
		return instance;
	}
	
	/**
	 * Create the panel.
	 */
	public SalesGUI() {
		setLayout(new BorderLayout(0, 0));
	}
}