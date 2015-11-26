package br.univel.tela;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

import br.univel.cadastro.Cliente;
import br.univel.cadastro.DAOCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PreeCadCliente extends JPanel {
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField textTel;
	private JTextField textEmail;
	private JTextField textCidade;
	private JTextField textEnd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tableCliente;

	/**
	 * Create the panel.
	 */
	public PreeCadCliente() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 87, 21, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.gridwidth = 2;
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 1;
		add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 3;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 2;
		add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 0;
		gbc_lblGenero.gridy = 3;
		add(lblGenero, gbc_lblGenero);
		
		JRadioButton rdbtM = new JRadioButton("M");
		buttonGroup.add(rdbtM);
		GridBagConstraints gbc_rdbtM = new GridBagConstraints();
		gbc_rdbtM.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtM.gridx = 1;
		gbc_rdbtM.gridy = 3;
		add(rdbtM, gbc_rdbtM);
		
		JRadioButton rdbtF = new JRadioButton("F");
		buttonGroup.add(rdbtF);
		GridBagConstraints gbc_rdbtF = new GridBagConstraints();
		gbc_rdbtF.anchor = GridBagConstraints.WEST;
		gbc_rdbtF.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtF.gridx = 2;
		gbc_rdbtF.gridy = 3;
		add(rdbtF, gbc_rdbtF);
		
		JLabel label_4 = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 4;
		add(label_4, gbc_label_4);
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		GridBagConstraints gbc_textEnd = new GridBagConstraints();
		gbc_textEnd.gridwidth = 3;
		gbc_textEnd.insets = new Insets(0, 0, 5, 5);
		gbc_textEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEnd.gridx = 1;
		gbc_textEnd.gridy = 4;
		add(textEnd, gbc_textEnd);
		
		JLabel label_3 = new JLabel("Cidade");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 5;
		add(label_3, gbc_label_3);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		GridBagConstraints gbc_textCidade = new GridBagConstraints();
		gbc_textCidade.gridwidth = 2;
		gbc_textCidade.insets = new Insets(0, 0, 5, 5);
		gbc_textCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCidade.gridx = 1;
		gbc_textCidade.gridy = 5;
		add(textCidade, gbc_textCidade);
		
		JLabel label_2 = new JLabel("UF");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 6;
		add(label_2, gbc_label_2);
		
		JComboBox cbUF = new JComboBox();
		GridBagConstraints gbc_cbUF = new GridBagConstraints();
		gbc_cbUF.gridwidth = 2;
		gbc_cbUF.insets = new Insets(0, 0, 5, 5);
		gbc_cbUF.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbUF.gridx = 1;
		gbc_cbUF.gridy = 6;
		add(cbUF, gbc_cbUF);
		
		JLabel label_1 = new JLabel("Email");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 7;
		add(label_1, gbc_label_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 3;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 1;
		gbc_textEmail.gridy = 7;
		add(textEmail, gbc_textEmail);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAOCliente daoc = new DAOCliente();
				Cliente cli = new Cliente();
				
				cli.setId(Integer.parseInt(txtId.getText()));
				cli.setNome(txtNome.getText());
				cli.setTel(textTel.getText());
				cli.setEnd(textEnd.getText());
				cli.setCidade(textCidade.getText());
				cli.setEmail(textEmail.getText());
				//ta faltando uf sexo
				
			//	JOptionPane.showMessageDialog(rootPane, "Cliente adicionado");
				
				try{
					daoc.create(cli);
					
				}catch (SQLException ex){
					
					ex.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSalvar.gridx = 4;
		gbc_btnSalvar.gridy = 7;
		add(btnSalvar, gbc_btnSalvar);
		
		JLabel label = new JLabel("Telefone");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 8;
		add(label, gbc_label);
		
		textTel = new JTextField();
		textTel.setColumns(10);
		GridBagConstraints gbc_textTel = new GridBagConstraints();
		gbc_textTel.gridwidth = 2;
		gbc_textTel.insets = new Insets(0, 0, 5, 5);
		gbc_textTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTel.gridx = 1;
		gbc_textTel.gridy = 8;
		add(textTel, gbc_textTel);
		
		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 0);
		gbc_btnExcluir.gridx = 4;
		gbc_btnExcluir.gridy = 8;
		add(btnExcluir, gbc_btnExcluir);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.gridwidth = 5;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 10;
		add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		tableCliente = new JTable();
		scrollPane.setViewportView(tableCliente);
		
		

	}

}
