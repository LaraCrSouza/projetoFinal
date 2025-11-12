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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaCompras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEndereco;
	private JTextField tfQuantidade;

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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem miSair = new JMenuItem("Sair");
		mnNewMenu.add(miSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCantinhoDoce = new JLabel("Cantinho Doce");
		lbCantinhoDoce.setForeground(new Color(37, 58, 250));
		lbCantinhoDoce.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 11));
		lbCantinhoDoce.setBounds(10, 11, 85, 14);
		contentPane.add(lbCantinhoDoce);
		
		JLabel lbEndereco = new JLabel("Endereço");
		lbEndereco.setBounds(70, 55, 60, 14);
		contentPane.add(lbEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(151, 52, 208, 20);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setBounds(70, 103, 71, 14);
		contentPane.add(lbQuantidade);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(151, 100, 208, 20);
		contentPane.add(tfQuantidade);
		
		JLabel lbSabores = new JLabel("Sabores");
		lbSabores.setBounds(70, 150, 71, 14);
		contentPane.add(lbSabores);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Beijinho", "Brigadeiro", "Doce de leite com Amendoim", "Maracujá", "Ninho", "Ninho com creme de avelã", "Prestígio", ""}));
		comboBox.setBounds(151, 146, 208, 22);
		contentPane.add(comboBox);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.setBounds(168, 192, 89, 23);
		contentPane.add(btComprar);

	}
}
