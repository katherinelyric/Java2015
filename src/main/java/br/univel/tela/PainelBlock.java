package br.univel.tela;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

public class PainelBlock extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelBlock() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblUser = new JLabel("User");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.gridx = 2;
		gbc_lblUser.gridy = 2;
		add(lblUser, gbc_lblUser);
		

	}

}
