import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passlabel;
    private static JTextField passText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userlabel = new JLabel("Username");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passlabel = new JLabel("Password");
        passlabel.setBounds(10,50,80,25);
        panel.add(passlabel);

        passText = new JTextField(20);
        passText.setBounds(100,50,165,25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);














        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String user = userText.getText();
       String password = passText.getText();
       if(user.equals("Gerry") && password.equals("Password")) {
           success.setText("Login successful");
       }
       else {
           userText.setText("");
           passText.setText("");
           success.setText("Login failed try again");
       }
    }

}















