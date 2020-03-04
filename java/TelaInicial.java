import javax.swing.*;
import java.awt.EventQueue;
public class TelaInicial extends JFrame{

    public TelaInicial(){
        initComponents();
    }
    private JButton btnEntrar;
    private JPanel principalPanel;

    private void initComponents() {

        btnEntrar = new JButton();
        principalPanel = new JPanel();

        btnEntrar.setText("Entrar");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnEntrar)
                .addContainerGap(160, Short.MAX_VALUE))
                
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnEntrar)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        pack();
    }
    public static void main(String ... args) {
        System.out.println("*****Iniciando o Programa*******");

        EventQueue.invokeLater( () -> {
            new TelaInicial().setVisible(true);
        });

    }
}