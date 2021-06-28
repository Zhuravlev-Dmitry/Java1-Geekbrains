package HomeWork7ZhuravlevD;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame {
    private int WidthWin = 720;
    private int HeightWin = 600;
    private int PosX = 300;
    private int PosY = 200;
    private int minSizeMap = 3;
    private int maxSizeMap = 8;
    private int minWinSizeMap = 3;
    private JPanel panelUpr;
    private JPanel panelControl;
    private JButton StartButton;
    private JButton ExitButton;
    private JButton SafeExitButton;
    private JButton ClearLogButton;
    private JTextArea gameLog;
    private JScrollPane scrollPane;
    private JLabel labelSize;
    private String mapSize = "Map size:";
    private JLabel labelWinLength;
    private String mapWinLength = "Win length:";
    private JSlider sliderMapSize;
    private JSlider sliderWinLength;
    private Map Map;
    private int round = 0;
    public NewWindow(){
        WindowSettings();
        preparePanelUpr();
        prepareButtons ();
        gameLog ();
        panControl ();

        Map = new Map();
        panelUpr.add(panelControl, BorderLayout.NORTH);
        panelUpr.add(scrollPane,BorderLayout.SOUTH);
        add(panelUpr, BorderLayout.EAST);
        add(Map);

        setVisible(true);
    }
    private void preparePanelUpr(){
        panelUpr = new JPanel();
        panelUpr.setLayout(new GridLayout(2,1));
    }
    private void panControl () {
        panelControl = new JPanel();
        panelControl.setLayout(new GridLayout(10,1));
        labelSize = new JLabel(mapSize + minSizeMap);
        sliderMapSize = new JSlider(minSizeMap,maxSizeMap,minWinSizeMap);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValueMapSize = sliderMapSize.getValue();
                labelSize.setText(mapSize + currentValueMapSize);
                sliderWinLength.setMaximum(currentValueMapSize);
            }
        });
        labelWinLength = new JLabel(mapWinLength + minWinSizeMap);
        sliderWinLength = new JSlider(minWinSizeMap,minSizeMap,minSizeMap);
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(mapWinLength + sliderWinLength.getValue());
            }
        });
        panelControl.add(labelSize);
        panelControl.add(sliderMapSize);
        panelControl.add(labelWinLength);
        panelControl.add(sliderWinLength);
        panelControl.add(StartButton);
        panelControl.add(ExitButton);
        panelControl.add(SafeExitButton);
        panelControl.add(ClearLogButton);
    }
    private void WindowSettings (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WidthWin, HeightWin);
        setLocation(PosX,PosY);
        setTitle("Hello User!!!");
        setResizable(false);

    }
    private void prepareButtons () {
        StartButton = new JButton("Start");
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                safeAllActionUser();
            }
        });
        ExitButton = new JButton("Exit");
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        SafeExitButton = new JButton("Safe and Exit");
        SafeExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(4);
            }
        });

        ClearLogButton = new JButton("Clear Log");
        ClearLogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLog.setText("");
            }
        });
    }
    private void gameLog() {
        System.out.println("Hello");
        gameLog = new JTextArea();
        scrollPane = new JScrollPane(gameLog);
        gameLog.setEnabled(false);
        gameLog.setLineWrap(true);

    }
    void Record(String text) {
        gameLog.append(text +"\n");
    }
    private void safeAllActionUser() {
        int mapSize = sliderMapSize.getValue();
        int winLength = sliderWinLength.getValue();
        ++round;
        Record("**** Round " + round + "****");
        Record("User Map" + mapSize + "x" + mapSize);
        Record("User WinLength" + winLength);
    }

}
