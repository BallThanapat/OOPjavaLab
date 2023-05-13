import java.awt.*;
import javax.swing.*;
public class AddProduct {
    private JFrame fr;
    private JPanel p1;
    private JLabel lbEdit, lbName, lbPrice, lbCost;
    private JTextField tfName, tfPrice, tfCost;
    private JButton btPic, btSave, btCancel;
    private JTextArea arPic;
    
    public AddProduct(){
        fr = new JFrame("Edit New Product");
        p1 = new JPanel();
        //lbEdit = new JLabel(" Edit New Product");
        lbName = new JLabel("Name");
        lbName.setBackground(new Color(0,255,255));
        lbName.setOpaque(true);
        lbCost = new JLabel("Cost");
        lbPrice = new JLabel("Price");
        tfName = new JTextField();
        tfCost = new JTextField();
        tfPrice = new JTextField();
        btPic = new JButton("PICTURE");
        btSave = new JButton("SAVE");
        btCancel = new JButton("Cancel");
        arPic = new JTextArea();
        arPic.setEnabled(false);
        
        //lbEdit.setFont(new Font("Arial",Font.PLAIN,25));
        lbName.setFont(new Font("Arial",Font.PLAIN,20));
        lbCost.setFont(new Font("Arial",Font.PLAIN,20));
        lbPrice.setFont(new Font("Arial",Font.PLAIN,20));
        
        p1.setLayout(null);
        //lbEdit.setBounds(0, 0, 400, 20);
        lbName.setBounds(20, 25, 100, 20);
        tfName.setBounds(20, 50, 100, 20);
        lbCost.setBounds(20, 115, 100, 20);
        tfCost.setBounds(20, 140, 100, 20);
        lbPrice.setBounds(20, 205, 100, 20);
        tfPrice.setBounds(20, 230, 100, 20);
        arPic.setBounds(250, 25, 300, 200);
        btPic.setBounds(350, 235, 100, 30);
        btSave.setBounds(210, 300, 80, 30);
        btCancel.setBounds(295, 300, 80, 30);
        p1.add(lbName);
        p1.add(tfName);
        p1.add(lbCost);
        p1.add(tfCost);
        p1.add(lbPrice);
        p1.add(tfPrice);
        p1.add(arPic);
        p1.add(btPic);
        p1.add(btSave);
        p1.add(btCancel);
        
        //fr.add(lbEdit);
        fr.setSize(600, 400);
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setResizable(false);
    }
}
