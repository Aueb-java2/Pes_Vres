import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Menu {

	static JFrame scr = new JFrame("Πες/Βρες");

	static void screenMenu() {
		scr.setBounds(0,0,1280,720);
		scr.setResizable(false);
		scr.setLayout(null);
		scr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    static void printHeader() {
    	JPanel jp = new JPanel();
        JLabel intro = new JLabel("Καλώς ορίσατε στο Πες Βρες!", SwingConstants.CENTER);
        intro.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        jp.setBounds(0,50,1280,250);
        jp.setLayout(new GridLayout(2,1,0,25));
        jp.add(intro);
        JLabel instruction = new JLabel("Παρακαλώ επιλέξτε...", SwingConstants.CENTER);
        jp.add(instruction);
        instruction.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        scr.add(jp);
        scr.setVisible(true);
    }

    static void printMenu() {
    	JPanel jp = new JPanel();
    	jp.setBounds(0,300,1280,200);
    	jp.setLayout(new FlowLayout());

    	JButton b1 = new JButton("Παίξε!");
    	b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
    	jp.add(b1);
    	b1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			scr.setVisible(false);
    			Choices.screenChoices();
    			Choices c = new Choices();
    			c.runChoices();
    		}
    	});

    	JButton b2 = new JButton("Κανόνες");
    	b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
    	jp.add(b2);
    	b2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			JOptionPane.showMessageDialog(jp, 
    					Rules.printRules(), "Κανόνες", JOptionPane.INFORMATION_MESSAGE);
    		}
    	});

    	JButton b3 = new JButton("Έξοδος");
    	b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
    	jp.add(b3);
    	b3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.exit(0);
    		}
    	});

    	scr.add(jp);
    	scr.setVisible(true);
    }
}
