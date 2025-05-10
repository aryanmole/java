import javax.swing.*;

public class GenderSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        JButton submit = new JButton("Submit");
        JLabel result = new JLabel();

        ButtonGroup group = new ButtonGroup();
        group.add(male); group.add(female); group.add(other);

        frame.setLayout(null);
        male.setBounds(30, 30, 100, 20);
        female.setBounds(30, 60, 100, 20);
        other.setBounds(30, 90, 100, 20);
        submit.setBounds(30, 120, 100, 30);
        result.setBounds(30, 160, 200, 30);

        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : other.isSelected() ? "Other" : "None";
            result.setText("Selected: " + gender);
        });

        frame.add(male); frame.add(female); frame.add(other);
        frame.add(submit); frame.add(result);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

