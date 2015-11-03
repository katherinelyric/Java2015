package br.univel.tela;
/**
 * 
 * @author Danii
 *
 */
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Color;

public abstract class Moldura extends JPanel {

	
	protected abstract void instCadastro();
	
	/**
	 * Create the panel.
	 */
	public Moldura() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gbl_panel.rowHeights = new int[] {0, 10};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCadastros = new JLabel("Cadastros");
		GridBagConstraints gbc_lblCadastros = new GridBagConstraints();
		gbc_lblCadastros.insets = new Insets(0, 0, 0, 5);
		gbc_lblCadastros.anchor = GridBagConstraints.WEST;
		gbc_lblCadastros.gridx = 0;
		gbc_lblCadastros.gridy = 0;
		panel.add(lblCadastros, gbc_lblCadastros);
		
		JButton btnFechar = new JButton("Fechar");
		GridBagConstraints gbc_btnFechar = new GridBagConstraints();
		gbc_btnFechar.gridwidth = 2;
		gbc_btnFechar.anchor = GridBagConstraints.EAST;
		gbc_btnFechar.gridx = 11;
		gbc_btnFechar.gridy = 0;
		panel.add(btnFechar, gbc_btnFechar);
		
		instCadastro();

	}

}
