import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        Container container=jf.getContentPane();
        container.setLayout(null);
        jf.setTitle("Note");
        jf.setSize(240,500);
        jf.setLocation(900,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea jta=new JTextArea();
        jta.setLineWrap(true);
        JScrollPane jsp=new JScrollPane(jta);
        jsp.setBounds(5,5,220,420);
        JButton jb=new JButton("Save");
        jb.setBounds(60,430,120,30);
        Date date=new Date();
        jb.addActionListener(e -> {
            File file=new File("D:\\"+date.getTime()+".txt");
            try{
                FileWriter fw=new FileWriter(file);
                fw.write(jta.getText());
                fw.close();
            }catch (IOException exception){
                exception.printStackTrace();
            }
        });
        container.add(jsp);
        container.add(jb);
        jf.setVisible(true);
    }
}