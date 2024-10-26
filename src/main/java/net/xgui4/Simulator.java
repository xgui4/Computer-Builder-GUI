package net.xgui4;

import net.xgui4.GUI.PlayButtonAction;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Ceci est l'ébauche de l'applis/jeux
 */
public class Simulator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Computer Simulator Prototype GUI");
        frame.setSize(500, 500);
        JButton playButton = new JButton("Play");
        ActionListener playButtonAction = new PlayButtonAction();
        playButton.addActionListener(playButtonAction);
        playButton.setSize(30, 30);
        frame.add(playButton);
        frame.setVisible(true);
    }
}