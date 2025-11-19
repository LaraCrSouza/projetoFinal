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
import javax.swing.ImageIcon;
import java.awt.Canvas;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu(">");
		menuBar.add(mnNewMenu);
		
		JMenuItem miAjuda = new JMenuItem("Ajuda");
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
		lbCantinhoDoce.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 11));
		lbCantinhoDoce.setBounds(10, 11, 85, 14);
		contentPane.add(lbCantinhoDoce);
		
		JLabel lbEndereco = new JLabel("Endereço");
		lbEndereco.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEndereco.setForeground(new Color(0, 64, 128));
		lbEndereco.setBounds(70, 55, 60, 14);
		contentPane.add(lbEndereco);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbQuantidade.setForeground(new Color(0, 64, 128));
		lbQuantidade.setBounds(70, 103, 71, 14);
		contentPane.add(lbQuantidade);
		
		JLabel lbSabores = new JLabel("Sabores");
		lbSabores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbSabores.setForeground(new Color(0, 64, 128));
		lbSabores.setBounds(70, 150, 71, 14);
		contentPane.add(lbSabores);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(152, 226, 254));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Beijinho", "Brigadeiro", "Doce de leite com Amendoim", "Maracujá", "Ninho", "Ninho com creme de avelã", "Prestígio", ""}));
		comboBox.setBounds(151, 146, 208, 22);
		contentPane.add(comboBox);
		
		JButton btComprar = new JButton("Comprar");
		btComprar.setBackground(new Color(152, 226, 254));
		btComprar.setBounds(168, 192, 89, 23);
		contentPane.add(btComprar);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setColumns(10);
		tfEndereco.setBackground(new Color(152, 226, 254));
		tfEndereco.setBounds(151, 52, 230, 20);
		contentPane.add(tfEndereco);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setForeground(Color.BLACK);
		tfQuantidade.setColumns(10);
		tfQuantidade.setBackground(new Color(152, 226, 254));
		tfQuantidade.setBounds(151, 100, 230, 20);
		contentPane.add(tfQuantidade);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
