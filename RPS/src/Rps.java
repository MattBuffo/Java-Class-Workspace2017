// Chapter 7 Question 21

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rps extends JFrame
    implements ActionListener
{
  private final char moves[] = {'R', 'P', 'S'};
  private JRadioButton rock, paper, scissors;
  private JTextField display;

  public Rps()
  {
    super("Rock, paper, Scissors");

    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");

    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);

    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.yellow);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(go);
    c.add(display);
  }

  /**
   *  returns -1 if the player wins,
   *  0 if it's a tie, and 1 if the computer wins
   */
  private int nextPlay(char computerMove, char playerMove)
  {
    int result = 0; 
   
    if (computerMove == playerMove){
    	result = 0;
    }
    else if (playerMove == 'R' && computerMove == 'S')
    {
    	result = -1;
    }
    else if (playerMove == 'R' && computerMove == 'P'){
    	result = 1;
    }
    else if (playerMove == 'P' && computerMove == 'S')
    {
    	result = 1;
    }
    else if (playerMove == 'P' && computerMove == 'R'){
    	result = -1;
    }
    else if (playerMove == 'S' && computerMove == 'R')
    {
    	result = 1;
    }
    else if (playerMove == 'S' && computerMove == 'P'){
    	result = -1;
    }
    return result;
  }

  public void actionPerformed(ActionEvent e)
  {
    char playerMove, computerMove;
    if (rock.isSelected())
      playerMove = 'R';
    else if (paper.isSelected())
      playerMove = 'P';
    else // if (scissors.isSelected())
      playerMove = 'S';

    int k = (int)(Math.random() * 3);
    computerMove = moves[k];
    int result = nextPlay(computerMove, playerMove);

    String msg = "  You said " + makeWord(playerMove) + ", I said " +
                 makeWord(computerMove);
    if (result < 0)
      msg += " -- you win.";
    else if (result == 0)
      msg += " -- tie.";
    else // if (result > 0)
      msg += " -- I win.";
    display.setText(msg);
  }

  private String makeWord(char move)
  {
    String word = "";

    switch (move)
    {
      case 'R': word = "ROCK"; break;
      case 'P': word = "PAPER"; break;
      case 'S': word = "SCISSORS"; break;
    }
    return word;
  }

  public static void main(String[] args)
  {
    Rps window = new Rps();
    window.setBounds(300, 300, 300, 140);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

