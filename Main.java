import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String[] cs={
                "少壮不努力，老大徒悲伤。",
                "生命有如铁砧，愈被敲打，愈能发出火花。",
                "志向和热爱是伟大行为的双翼。",
                "顽强的毅力可以征服世界上任何一座高峰。",
                "时间抓起来说是金子，抓不住就是流水。"
        };
        JFrame jf=new JFrame();
        Container container=jf.getContentPane();
        container.setLayout(null);
        jf.setTitle("Note");
        jf.setSize(240,520);
        jf.setLocation(900,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea jta=new JTextArea();
        jta.setLineWrap(true);
        JScrollPane jsp=new JScrollPane(jta);
        String str=cs[new Random().nextInt(4)];
        JLabel jl=new JLabel(str,JLabel.CENTER);
        jl.setBounds(0,455,240,30);
        jl.setForeground(Color.lightGray);
        jsp.setBounds(5,5,220,420);
        JButton jb=new JButton("Save");
        jb.setBounds(60,430,120,30);
        jb.addActionListener(e -> {
            File file = new File("D:\\" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".txt");
            try {
                FileWriter fw = new FileWriter(file);
                fw.write(jta.getText());
                fw.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });
        container.add(jsp);
        container.add(jb);
        container.add(jl);
        jf.setVisible(true);
    }
}
