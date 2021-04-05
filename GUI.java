import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GUI implements ActionListener {

  private static JLabel userLabel;
  private static JTextField userText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel success;
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    userText = new JTextField(20);
    userLabel = new JLabel("User");
    JPanel panel = new JPanel();
    passwordLabel = new JLabel("Password");
    passwordText = new JPasswordField(20);
    button = new JButton("Login");
    success = new JLabel("");

    frame.setSize(350, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);

    panel.setLayout(null);
    panel.add(userLabel);
    panel.add(userText);
    panel.add(passwordLabel);
    panel.add(passwordText);
    panel.add(button);

    button.addActionListener(new GUI());

    userLabel.setBounds(10, 20, 80, 25);

    userText.setBounds(100, 20, 165, 25);

    passwordLabel.setBounds(10, 50, 80, 25);

    passwordText.setBounds(100, 50, 165, 25);

    button.setBounds(10, 80, 80, 25);

    success.setBounds(10, 110, 300, 25);

    panel.add(success);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String user = userText.getText();
    String password = passwordText.getText();
    System.out.println(user + ", " + password);

    if (user.equals("Tudor") && password.equals("2009")) {
      success.setText("Login successful!");
    } else {
      success.setText("Login failed! Retry!");
    }

  }
}