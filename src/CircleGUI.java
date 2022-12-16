import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

    public CircleGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
    }

    public void compute(){
        String radius = tfRadius.getText();
        double a = Math.pow(Integer.parseInt(radius),2)*Math.PI;
        tfArea.setText(String.format("%.2f",a));
        double c = (double) (Integer.parseInt(radius) * Math.PI) * 2;
        tfCircumference.setText(String.format("%.2f", c));
    }

    public void clear(){
        tfArea.setText("");
        tfCircumference.setText("");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("CircleGUI");
        frame.setContentPane(new CircleGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
