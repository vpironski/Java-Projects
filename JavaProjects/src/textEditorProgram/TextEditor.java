package textEditorProgram;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor extends JFrame implements ActionListener {
    JTextArea textArea ;
    JLabel fontLabel;
    JScrollPane scrollPane;
    JSpinner fontSizeSpinner;
    JButton fontColorButton;
    JComboBox fontBox;
    JButton setItalic;
    JButton setBold;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;


    TextEditor(){
        // to close with x
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // title
        this.setTitle("FirstTextEditor");
        //size of the window
        this.setSize(600,600);
        // the layout of the window
        this.setLayout(new FlowLayout());
        // to appear
        this.setVisible(true);
        // to appear in the middle
        this.setLocationRelativeTo(null);

        // ------------ Main Components and Layout --------- //

        // The part, were the textArea is defined
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman",Font.PLAIN,20));


        // scroll bar
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400,400));
        // when to show
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        fontLabel = new JLabel("Font size: ");


        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,20));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener()
        //Logic to Font Size menu
        {
            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int) fontSizeSpinner.getValue()));
            }
        });

//        //Italic and Bold
//        setItalic = new JButton("set to Italic");
//        setItalic.setPreferredSize(new Dimension(50,20));
//        setItalic.setVisible(true);
//
//
//        setBold = new JButton("set to Bold");
//
//




        fontColorButton = new JButton("Color");
        fontColorButton.addActionListener(this);


        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

//        for (int i = 0; i < fonts.length; i++) {
//            System.out.println(fonts[i]);
//
//        }


        fontBox = new JComboBox(fonts);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Times New Roman");


        // ------------ /Main Components and Layout --------- //



        // ------------ menubar (FILE) --------- //

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        // ------------ /menubar --------- //

        // ------------ Generating Components --------- //

        this.setJMenuBar(menuBar);
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(fontBox);
        this.add(fontColorButton);
        this.add(scrollPane);
        this.setVisible(true);

        // ------------ /Generating Components --------- //


    }

    // ------------ Logic to Buttons and Menues (without Font Size menu) --------- //

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == fontColorButton){
            JColorChooser colorChooser = new JColorChooser();
            Color color = colorChooser.showDialog(null,"Choose a color",Color.BLACK);

            textArea.setForeground(color);
        }

        if(e.getSource() == fontBox){
            textArea.setFont(new Font((String)fontBox.getSelectedItem(), Font.PLAIN ,textArea.getFont().getSize()));
        }

        if(e.getSource() == openItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("/Users/vihrenpironski/Dropbox/Mac/Desktop"));

            FileNameExtensionFilter filter = new FileNameExtensionFilter( "Text files","txt");
            fileChooser.setFileFilter(filter);

            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner fileIn = null;

                try {
                    fileIn = new Scanner(file);
                    if (file.isFile()){
                        while(fileIn.hasNextLine()){
                            String line = fileIn.nextLine()+"\n";
                            textArea.append(line);
                        }
                    }
                }
                catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                finally {
                    fileIn.close();
                }

            }

        }
        if(e.getSource() == saveItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("/Users/vihrenpironski/Dropbox/Mac/Desktop"));

            int response = fileChooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());


                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(textArea.getText());
                }
                catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                finally {
                    fileOut.close();
                }
            }


        }
        if(e.getSource() == exitItem){
            System.exit(0);

        }

    }
    // ------------ /Logic to Buttons --------- //
}
