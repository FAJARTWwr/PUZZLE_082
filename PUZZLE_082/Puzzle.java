import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Puzzle extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next;

    Puzzle() {
        super("Puzzle Game");
        b1 = new JButton("1");
        b2 = new JButton(" ");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("2");
        next = new JButton("NEXT");

        // Create a label for the title
        JLabel titleLabel = new JLabel("PUZZLE GAME", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        titleLabel.setForeground(new Color(0, 0, 154));

        // Set background color for the title label
        titleLabel.setOpaque(true); // Enable background painting
        titleLabel.setBackground(new Color(224,224,224)); // Background color

        // Set modern font for buttons with a larger size (24)
        Font buttonFont = new Font("showcard gothic", Font.BOLD, 100);
        Color buttonColor = new Color(55, 94, 200);
        Color fontColor = new Color(255, 255, 255);

        b1.setFont(buttonFont);
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setBackground(buttonColor);
        b1.setForeground(fontColor);

        b2.setFont(buttonFont);
        b2.setHorizontalAlignment(SwingConstants.CENTER);
        b2.setVerticalAlignment(SwingConstants.CENTER);
        b2.setBackground(buttonColor);
        b2.setForeground(fontColor);

        b3.setFont(buttonFont);
        b3.setHorizontalAlignment(SwingConstants.CENTER);
        b3.setVerticalAlignment(SwingConstants.CENTER);
        b3.setBackground(buttonColor);
        b3.setForeground(fontColor);

        b4.setFont(buttonFont);
        b4.setHorizontalAlignment(SwingConstants.CENTER);
        b4.setVerticalAlignment(SwingConstants.CENTER);
        b4.setBackground(buttonColor);
        b4.setForeground(fontColor);

        b5.setFont(buttonFont);
        b5.setHorizontalAlignment(SwingConstants.CENTER);
        b5.setVerticalAlignment(SwingConstants.CENTER);
        b5.setBackground(buttonColor);
        b5.setForeground(fontColor);

        b6.setFont(buttonFont);
        b6.setHorizontalAlignment(SwingConstants.CENTER);
        b6.setVerticalAlignment(SwingConstants.CENTER);
        b6.setBackground(buttonColor);
        b6.setForeground(fontColor);

        b7.setFont(buttonFont);
        b7.setHorizontalAlignment(SwingConstants.CENTER);
        b7.setVerticalAlignment(SwingConstants.CENTER);
        b7.setBackground(buttonColor);
        b7.setForeground(fontColor);

        b8.setFont(buttonFont);
        b8.setHorizontalAlignment(SwingConstants.CENTER);
        b8.setVerticalAlignment(SwingConstants.CENTER);
        b8.setBackground(buttonColor);
        b8.setForeground(fontColor);

        b9.setFont(buttonFont);
        b9.setHorizontalAlignment(SwingConstants.CENTER);
        b9.setVerticalAlignment(SwingConstants.CENTER);
        b9.setBackground(buttonColor);
        b9.setForeground(fontColor);

        // Set font for 'NEXT' button
        Font buttonnext = new Font("showcard gothic", Font.BOLD, 30);
        next.setFont(buttonnext);
        next.setHorizontalAlignment(SwingConstants.CENTER);
        next.setVerticalAlignment(SwingConstants.CENTER);
        next.setBackground(Color.blue);
        next.setForeground(Color.white);
        next.setPreferredSize(new Dimension(150, 75));

        // Set layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Create a panel for the puzzle buttons
        JPanel puzzlePanel = new JPanel(new GridLayout(3, 3, 5, 5));
        puzzlePanel.setBackground(new Color(0, 0, 154));
        puzzlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        puzzlePanel.add(b1);
        puzzlePanel.add(b2);
        puzzlePanel.add(b3);
        puzzlePanel.add(b4);
        puzzlePanel.add(b5);
        puzzlePanel.add(b6);
        puzzlePanel.add(b7);
        puzzlePanel.add(b8);
        puzzlePanel.add(b9);

        // Create a panel for the 'Next' button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(55, 94, 200));
        buttonPanel.add(next);

        // Add panels to the frame
        add(puzzlePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        add(titleLabel, BorderLayout.NORTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        // Set frame properties
        setSize(550, 600); // Set size to 450x600
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);


    }

public void actionPerformed(ActionEvent e){
    if (e.getSource()==next) {
        String s=b4.getLabel();
        b4.setLabel(b9.getLabel());
        b9.setLabel(s);
        s=b1.getLabel();
        b1.setLabel(b5.getLabel());
        b5.setLabel(s);
        s=b2.getLabel();
        b2.setLabel(b7.getLabel());
        b7.setLabel(s);
    }

    if (e.getSource()==b1) {
        String s=b1.getLabel();
        if (b2.getLabel().equals(" ")) { 
            b2.setLabel(s); b1.setLabel(" ");
        } else if (b4.getLabel().equals(" ")) {
            b4.setLabel(s); b1.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b3) {
        String s=b3.getLabel();
        if (b2.getLabel().equals(" ")) {
            b2.setLabel(s); b3.setLabel(" ");
        } else if (b6.getLabel().equals(" ")) {
            b6.setLabel(s); b3.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b2) {
        String s=b2.getLabel();
        if (b1.getLabel().equals(" ")) {
            b1.setLabel(s); b2.setLabel(" ");
        } else if (b3.getLabel().equals(" ")) {
            b3.setLabel(s); b2.setLabel(" ");
        } else if (b5.getLabel().equals(" ")) {
            b5.setLabel(s); b2.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b4) {
        String s=b4.getLabel();
        if (b1.getLabel().equals(" ")) {
            b1.setLabel(s); b4.setLabel(" ");
        } else if (b7.getLabel().equals(" ")) {
            b7.setLabel(s); b4.setLabel(" ");
        } else if (b5.getLabel().equals(" ")) {
            b5.setLabel(s); b4.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b5) {
        String s=b5.getLabel();
        if (b2.getLabel().equals(" ")) {
            b2.setLabel(s); b5.setLabel(" ");
        } else if (b4.getLabel().equals(" ")) {
            b4.setLabel(s); b5.setLabel(" ");
        } else if (b6.getLabel().equals(" ")) {
            b6.setLabel(s); b5.setLabel(" ");
        } else if (b8.getLabel().equals(" ")) {
            b8.setLabel(s); b5.setLabel(" ");
        }
    }//end of if

    if(e.getSource()==b6) {
    String s=b6.getLabel();
        if (b9.getLabel().equals(" ")) {
            b9.setLabel(s); b6.setLabel(" ");
        } else if (b3.getLabel().equals(" ")) {
            b3.setLabel(s); b6.setLabel(" ");
        } else if (b5.getLabel().equals(" ")) {
            b5.setLabel(s); b6.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b7) {
        String s=b7.getLabel();
        if (b4.getLabel().equals(" ")) {
            b4.setLabel(s); b7.setLabel(" ");
        } else if (b8.getLabel().equals(" ")) {
            b8.setLabel(s); b7.setLabel(" ");
        }
    }//end of if

    if(e.getSource()==b8) {
        String s=b8.getLabel();
        if (b7.getLabel().equals(" ")) {
            b7.setLabel(s); b8.setLabel(" ");
        } else if (b9.getLabel().equals(" ")) {
            b9.setLabel(s); b8.setLabel(" ");
        } else if (b5.getLabel().equals(" ")) {
            b5.setLabel(s); b8.setLabel(" ");
        }
    }//end of if

    if (e.getSource()==b9) {
        String s=b9.getLabel();
        if (b6.getLabel().equals(" ")) {
            b6.setLabel(s); b9.setLabel(" ");
        } else if (b8.getLabel().equals(" ")) {
            b8.setLabel(s); b9.setLabel(" ");
        }
        if (b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")) { 
            // Custom font and color for the message
            Font customFont = new Font("Showcard Gothic", Font.BOLD, 20);
            Color customColor = new Color(0, 0, 154); // Gold color
 
            // Custom icon/image for the dialog
            String imagePath = "D:\\UNIVERSITAS AHMAD DAHLAN\\SEMESTER 3\\PBO\\PUZZLE_082\\piala.png";
            ImageIcon icon = new ImageIcon(imagePath);
            icon.setImage(icon.getImage().getScaledInstance(90, 145, Image.SCALE_DEFAULT)); // Resize the image

            // Create a custom JLabel for the message
            JLabel messageLabel = new JLabel("<html><center>Congratulations!<br>You won the game!</center></html>");
            messageLabel.setFont(customFont);
            messageLabel.setForeground(customColor);
 
            // Create a custom JOptionPane with a custom message and icon
            JOptionPane.showMessageDialog(
                    this,
                    messageLabel,
                    "Victory!",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon
            );
        }
    }//end of if

}//end of actionPerformed
 

public static void main(String[] args){
        new Puzzle();
}//end of main

}//end of class