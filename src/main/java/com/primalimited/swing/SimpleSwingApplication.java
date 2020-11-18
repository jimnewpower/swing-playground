package com.primalimited.swing;

import javax.swing.*;
import java.awt.*;

public class SimpleSwingApplication implements Runnable {
    private static final String TITLE = "Swing Playground";
    private static final Dimension FRAME_SIZE = new Dimension(600, 400);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new SimpleSwingApplication(args));
    }

    public SimpleSwingApplication(String[] args) {
        processProgramArguments(args);
    }

    private void processProgramArguments(String[] args) {
        //TODO
    }

    @Override
    public void run() {
        JFrame frame = createFrame();
        doLayoutAndAddComponents(frame);
        frame.setVisible(true);
    }

    private JFrame createFrame() {
        JFrame frame = new JFrame();
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    private void doLayoutAndAddComponents(JFrame frame) {
        frame.setLayout(new BorderLayout());
        frame.setSize(FRAME_SIZE);
    }
}
