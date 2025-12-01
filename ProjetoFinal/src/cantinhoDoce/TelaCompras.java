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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Downloads\\Logotipo (1).jpg"));
		setTitle("Tela de encomenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 412);
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu(">");
		menuBar.add(mnNewMenu);
		
		JMenuItem miAjuda = new JMenuItem("Ajuda");
		miAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 TelaAjuda ajuda = new TelaAjuda();
				 ajuda.setVisible(true);
			}
		});
		mnNewMenu.add(miAjuda);
		
		JMenuItem miQuemSomos = new JMenuItem("Quem somos");
		mnNewMenu.add(miQuemSomos);
		
		JMenuItem miSair = new JMenuItem("Sair");
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		mnNewMenu.add(miSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCantinhoDoce = new JLabel("Cantinho Doce");
		lbCantinhoDoce.setForeground(new Color(37, 58, 250));
		lbCantinhoDoce.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 17));
		lbCantinhoDoce.setBounds(10, 0, 127, 25);
		contentPane.add(lbCantinhoDoce);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbQuantidade.setForeground(new Color(0, 64, 128));
		lbQuantidade.setBounds(41, 146, 96, 22);
		contentPane.add(lbQuantidade);
		
		JLabel lbSabores = new JLabel("Sabores");
		lbSabores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbSabores.setForeground(new Color(0, 64, 128));
		lbSabores.setBounds(41, 63, 89, 20);
		contentPane.add(lbSabores);
		
		
		JCheckBox ckBrigadeiro = new JCheckBox("Brigadeiro");
		ckBrigadeiro.setBounds(128, 84, 97, 23);
		contentPane.add(ckBrigadeiro);
		
		JCheckBox ckMaracuja = new JCheckBox("Maracujá");
		ckMaracuja.setBounds(128, 48, 97, 23);
		contentPane.add(ckMaracuja);
		
		JCheckBox ckPrestigio = new JCheckBox("Prestígio");
		ckPrestigio.setBounds(227, 48, 97, 23);
		contentPane.add(ckPrestigio);
		
		JCheckBox ckBeijinho = new JCheckBox("Beijinho");
		ckBeijinho.setBounds(227, 84, 97, 23);
		contentPane.add(ckBeijinho);
		
		JCheckBox ckNinhoComNutella = new JCheckBox("Ninho com nutella");
		ckNinhoComNutella.setBounds(306, 48, 127, 23);
		contentPane.add(ckNinhoComNutella);
		
		JCheckBox ckDoceDeLeite = new JCheckBox("Doce de leite");
		ckDoceDeLeite.setBounds(327, 80, 106, 30);
		contentPane.add(ckDoceDeLeite);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(147, 150, 96, 20);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Embalagem Personalizada?");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 229, 202, 25);
		contentPane.add(lblNewLabel);
		
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setBounds(247, 233, 103, 21);
		contentPane.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setBounds(327, 233, 103, 21);
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
			   }
		});
		btComprar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btComprar.setBackground(new Color(152, 226, 254));
		btComprar.setBounds(203, 287, 106, 25);
		contentPane.add(btComprar);
	}
	
}
