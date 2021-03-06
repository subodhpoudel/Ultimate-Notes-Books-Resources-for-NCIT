import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;


public class ToolbarEx extends JFrame {

    public ToolbarEx() {
        
        initUI();
    }

    private void initUI() {
        
        createMenuBar();
        createToolBar();

        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void createMenuBar() {
        
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        menubar.add(file);
        setJMenuBar(menubar);        
    }
    
    private void createToolBar() {
        
        JToolBar toolbar = new JToolBar();

        ImageIcon icon = new ImageIcon("android.png");

        JButton exitButton = new JButton(icon);
        toolbar.add(exitButton);
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        add(toolbar, BorderLayout.NORTH);        
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                ToolbarEx ex = new ToolbarEx();
                ex.setVisible(true);
            }
        });
    }
}
