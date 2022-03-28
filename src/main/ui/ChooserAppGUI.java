package ui;


import model.*;

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
        initButtonShow();
        initButtonMovie();
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
                    //s.display(s);

                    JOptionPane.showMessageDialog(frame, s.display(s), "Song", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
     }


     private void initButtonShow() {
         JButton buttonShow = new JButton("SHOW");
         buttonShow.setBounds(150, 50, 50, 50);
         buttonShow.setBackground(Color.white);

         frame.add(buttonShow);

         buttonShow.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     showList.addShowsList();
                     int index = random.nextInt(showList.getShowList().size());
                     Show sh = showList.getShowList().get(index);

                     JOptionPane.showMessageDialog(frame, sh.display(sh), "Show", JOptionPane.PLAIN_MESSAGE);
                 } catch (IOException ioException) {
                     ioException.printStackTrace();
                 }
             }
         });
     }

     private void initButtonMovie() {
         JButton buttonMovie = new JButton("SHOW");
         buttonMovie.setBounds(250, 50, 50, 50);
         buttonMovie.setBackground(Color.white);

         frame.add(buttonMovie);

         buttonMovie.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     movieList.addMoviesList();
                     int index = random.nextInt(movieList.getMovieList().size());
                     Movie m = movieList.getMovieList().get(index);

                     JOptionPane.showMessageDialog(frame, m.display(m), "Movie", JOptionPane.PLAIN_MESSAGE);
                 } catch (IOException ioException) {
                     ioException.printStackTrace();
                 }
             }
         });
     }

}

