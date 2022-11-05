import java.awt.*;
import javax.swing.*;
public class window{
    public static void main(String[] arg){
        JFrame jf = new JFrame();//新窗口
        Container container=jf.getContentPane();//获取主容器
        container.setLayout(null);//布局方式
        JButton bl=new JButton("exit");//新按钮
        jf.setTitle("window");//窗体标题
        jf.setSize(300,150);//窗体宽高
        jf.setLocation(320,240);//窗体坐标
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//退出
        jf.setVisible(true);//显示窗体
        bl.setBounds(100,50,100,21);//按钮坐标和宽高
        //按钮事件
        bl.addActionListener(e -> {
            int answer=JOptionPane.showConfirmDialog(null,
                    "确定离开吗？",
                    "window",
                    JOptionPane.YES_NO_OPTION);
            if (answer==0){
                jf.dispose();
            }
        });
        container.add(bl);//将按钮添加至主容器
    }
}
