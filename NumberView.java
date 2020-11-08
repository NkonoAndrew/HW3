import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(Numbers model) {
        // NumberView -> Model -> GraphView
        this.model = model;

        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(10);
        redNumber.setText("");
        add(redNumber);


        add(new JLabel("Yellow"));
        JTextField yellowNumber = new JTextField(10);
        yellowNumber.setText("");
        add(yellowNumber);

        add(new JLabel("Green"));
        JTextField greenNumber = new JTextField(10);
        greenNumber.setText("");
        add(greenNumber);


        JButton submit = new JButton("Submit");
        add(submit);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            int number2 = Integer.parseInt(yellowNumber.getText());
            int number3 = Integer.parseInt(greenNumber.getText());
            model.updateValues(number1, number2, number3);

        });


    }
}