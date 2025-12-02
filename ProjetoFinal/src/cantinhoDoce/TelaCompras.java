package cantinhoDoce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.TextField;

public class TelaCompras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	TelaDePagamento pagamento = new TelaDePagamento();
	private JTextField tfQuantidade;
	private float preco;
	private String ckSel;
	private TelaDePagamento tabelaC;
	private String rbSel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompras frame = new TelaCompras();
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
	public TelaCompras() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\Logotipo200.png"));
		setTitle("Tela de encomenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 565);
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\menu20x20.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem miAjuda = new JMenuItem("Ajuda");
		miAjuda.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\telefone20x20.png"));
		miAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 TelaAjuda ajuda = new TelaAjuda();
				 ajuda.setVisible(true);
				 dispose();
			}
		});
		mnNewMenu.add(miAjuda);
		
		JMenuItem miQuemSomos = new JMenuItem("Quem somos");
		miQuemSomos.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\interrogação20x20.png"));
		mnNewMenu.add(miQuemSomos);
		
		JMenuItem miSair = new JMenuItem("Sair");
		miSair.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\sair20x20.png"));
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		mnNewMenu.add(miSair);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\carrinho.png"));
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCantinhoDoce = new JLabel("Cantinho Doce");
		lbCantinhoDoce.setBackground(new Color(255, 255, 255));
		lbCantinhoDoce.setForeground(new Color(0, 64, 128));
		lbCantinhoDoce.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 17));
		lbCantinhoDoce.setBounds(10, 0, 127, 25);
		contentPane.add(lbCantinhoDoce);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbQuantidade.setForeground(new Color(0, 64, 128));
		lbQuantidade.setBounds(41, 341, 96, 22);
		contentPane.add(lbQuantidade);
		
		JLabel lbSabores = new JLabel("Sabores");
		lbSabores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbSabores.setForeground(new Color(0, 64, 128));
		lbSabores.setBounds(41, 260, 89, 20);
		contentPane.add(lbSabores);
		
		
		JCheckBox ckBrigadeiro = new JCheckBox("Brigadeiro");
		ckBrigadeiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckBrigadeiro.setBounds(149, 287, 111, 23);
		contentPane.add(ckBrigadeiro);
		
		JCheckBox ckMaracuja = new JCheckBox("Maracujá");
		ckMaracuja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckMaracuja.setBounds(148, 231, 97, 23);
		contentPane.add(ckMaracuja);
		
		JCheckBox ckPrestigio = new JCheckBox("Prestígio");
		ckPrestigio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckPrestigio.setBounds(263, 231, 97, 23);
		contentPane.add(ckPrestigio);
		
		JCheckBox ckBeijinho = new JCheckBox("Beijinho");
		ckBeijinho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckBeijinho.setBounds(263, 287, 97, 23);
		contentPane.add(ckBeijinho);
		
		JCheckBox ckNinhoComNutella = new JCheckBox("Ninho com nutella");
		ckNinhoComNutella.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckNinhoComNutella.setBounds(384, 287, 159, 23);
		contentPane.add(ckNinhoComNutella);
		
		JCheckBox ckDoceDeLeite = new JCheckBox("Doce de leite");
		ckDoceDeLeite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ckDoceDeLeite.setBounds(382, 227, 111, 30);
		contentPane.add(ckDoceDeLeite);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBackground(new Color(196, 255, 255));
		tfQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfQuantidade.setBounds(149, 340, 111, 25);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Embalagem Personalizada?");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 399, 246, 25);
		contentPane.add(lblNewLabel);
		
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbSim.setBounds(293, 401, 67, 21);
		contentPane.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbNao.setBounds(382, 401, 77, 21);
		contentPane.add(rbNao);
		grupo.add(rbSim);
		grupo.add(rbNao);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tabelaC = new TelaDePagamento();
				String textoInserido = tfQuantidade.getText(); //  Obter o texto do textfield
				
				if(tfQuantidade.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btComprar, "Favor inserir a quantidade que você deseja", "Tela de erro", JOptionPane.ERROR_MESSAGE);
				}
				if(!tfQuantidade.getText().isEmpty()) {
					// Converter o texto para um número inteiro
	                float valor = Float.parseFloat(textoInserido);
					preco = valor * 12.0f;
					// Converter o valor do preço para String antses de passar para setText()
				    String precoString = String.valueOf(preco);
				 // Formata o float para 2 casas decimais (padrão monetário)
				    String precoStringFormatado = String.format("%.2f", preco);
				    
				    pagamento.taValorFinal.setText("R$ " +precoString);
				    pagamento.setVisible(true);
				}
				
				if(ckBeijinho.isSelected()) {
					ckSel = ckBeijinho.getText();
				}
				else if(ckBrigadeiro.isSelected()) {
					ckSel = ckBrigadeiro.getText();
				}
				else if(ckDoceDeLeite.isSelected()) {
					ckSel = ckDoceDeLeite.getText();
				}
				else if(ckMaracuja.isSelected()) {
					ckSel = ckMaracuja.getText();
				}
				else if(ckNinhoComNutella.isSelected()) {
					ckSel = ckNinhoComNutella.getText();
				}
				else if(ckPrestigio.isSelected()) {
					ckSel = ckPrestigio.getText();
				}
				if (rbSim.isSelected()) {
			        rbSel = rbSim.getText(); // "Sim"
			    } else if (rbNao.isSelected()) {
			        rbSel = rbNao.getText(); // "Não"D
			    } else {
			        rbSel = "Não Informado"; // Caso nenhum esteja selecionado
			    }
				Object[] informacoes = {ckSel, textoInserido, rbSel};
			
				pagamento.AdicionarProdutos(informacoes);
				pagamento.setVisible(true);
				dispose();
			   }
		});
		btComprar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btComprar.setBackground(new Color(196, 255, 255));
		btComprar.setBounds(287, 447, 106, 25);
		contentPane.add(btComprar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\cone2.jpg"));
		lblNewLabel_1.setBounds(41, 77, 77, 81);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\WhatsApp Image 2025-09-22 at 17.03.06.jpg"));
		lblNewLabel_1_1.setBounds(183, 77, 77, 81);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\cone3.jpg"));
		lblNewLabel_1_2.setBounds(323, 77, 77, 81);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\cone4.jpg"));
		lblNewLabel_1_2_1.setBounds(456, 77, 77, 81);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\cone5.jpg"));
		lblNewLabel_1_2_1_1.setBounds(592, 77, 77, 81);
		contentPane.add(lblNewLabel_1_2_1_1);
	}
}
