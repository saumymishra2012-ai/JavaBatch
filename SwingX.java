import javax.swing.*;
public class SwingX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        JButton b1=new JButton();
        JButton b2=new JButton("Submit");
        b1.setText("Click Me");
        b1.setBounds(100,100,100,40);
        b2.setBounds(100,150,100,40);
        frame.add(b1);
        frame.add(b2);
        
        frame.setSize(600, 300);
 frame.setLayout(null);
        frame.setVisible(true);
       
        
    }
}
