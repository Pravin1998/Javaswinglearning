import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswinglearning implements ActionListener {
    JFrame frame;
    Dimension size;

    JButton button;
    boolean change;
    javaswinglearning(){
        frame = new JFrame("This is my project");
        frame.setLayout(null);
        button = new JButton("Click me");
        button.setSize(100,50);
        button.setLocation(600,300);
        button.addActionListener(this);
        frame.add(button);
        size =new Dimension(Toolkit. getDefaultToolkit(). getScreenSize());
        frame.setSize(size);
        frame.getContentPane().setBackground(Color.blue);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javaswinglearning obj = new javaswinglearning();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String ans = e.getActionCommand();
        if(ans.equals("Click me") && change == false){
            frame.getContentPane().setBackground(Color.pink);
            change = true;
        }
        else{
        frame.getContentPane().setBackground(Color.blue);
        change = false;
        }
    }
}
