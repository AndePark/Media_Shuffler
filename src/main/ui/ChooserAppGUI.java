package ui;


import model.MovieList;
import model.ShowList;
import model.Song;
import model.SongList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class ChooserAppGUI {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private JFrame frame;
    private JFrame frame2;
    private JPanel introPanel;
    private Timer introTimer;

    private MovieList movieList;
    private SongList songList;
    private ShowList showList;
    private Random random = new Random();


    public ChooserAppGUI() {
        runIntroGUI();
        introTimer = new Timer(1500, e -> {
            frame2.setVisible(true);
            runGUI();
        });
        introTimer.setRepeats(false);
        introTimer.start();
    }

    private void runIntroGUI() {
        introPanel = new JPanel();
        introPanel.setBackground(Color.black);

        initFrame2();
        frame2.add(introPanel);
        frame2.setVisible(true);

    }

     private void initFrame2() {
        frame2 = new JFrame();
        frame2.setUndecorated(true);
        frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     private void runGUI() {
        frame = new JFrame();
        movieList = new MovieList();
        songList = new SongList();
        showList = new ShowList();
        initButtonSong();
        initMainFrame();
     }

     private void initMainFrame() {
         frame.setLayout(null);
         frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
         frame.getContentPane().setBackground(new Color(122, 158, 159));
         frame.setTitle("Media Decider");
         frame.setResizable(false);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
     }

     private void initButtonSong() {
        JButton buttonSong = new JButton("SONG");
        buttonSong.setBounds(50, 50, 50, 50);
        buttonSong.setBackground(Color.white);

        frame.add(buttonSong);

        buttonSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    songList.addSongsList();
                    int index = random.nextInt(songList.getSongList().size());
                    Song s = songList.getSongList().get(index);
                    s.display(s);

                    JOptionPane.showMessageDialog(frame, s.display(s), "Song", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
     }

}

