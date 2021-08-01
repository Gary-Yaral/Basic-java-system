
package example;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Window extends JFrame {
    JPanel panel = new JPanel();
    int panelWidth = 350;
    int panelHeight = 550;
    public Window(){
        setSize(panelWidth,panelHeight);
        setTitle("Registrar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Color background = new Color(250,250,250);
        getContentPane().setBackground(background);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
        addLabels();
        addTextFields();
        addButton();
        
    }
    private void addLabels(){
        //Title label
        JLabel title = new JLabel();
        title.setText("Nuevo cliente");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(0,0,panelWidth,40);
        title.setOpaque(true);
        title.setBackground(new Color(0,0,0));
        title.setFont(new Font("arial",Font.BOLD,20));
        title.setForeground(new Color(255,255,255));
        panel.add(title);
        
        //Inputs labels
        int leftMargin = 20;
        int labelWidth = 100;
        JLabel ID = new JLabel();
        ID.setText("Cédula:");
        ID.setBounds(leftMargin,50,labelWidth,20);
        panel.add(ID);
        //---------------
        JLabel name = new JLabel();
        name.setText("Nombres:");
        name.setBounds(leftMargin,120,labelWidth,20);
        panel.add(name);
        
        //---------------
        JLabel lastname = new JLabel();
        lastname.setText("Apellidos:");
        lastname.setBounds(leftMargin,190,labelWidth,20);
        panel.add(lastname);
        //---------------
        JLabel address = new JLabel();
        address.setText("Dirección:");
        address.setBounds(leftMargin,260,labelWidth,20);
        panel.add(address);
        //---------------
        JLabel cellphone = new JLabel();
        cellphone.setText("Celular:");
        cellphone.setBounds(leftMargin,330,labelWidth,20);
        panel.add(cellphone);
        //---------------
        JLabel copywrite = new JLabel();
        copywrite.setText("Powered by: Gary Yaral 2021");
        copywrite.setBounds(0,480,350,25);
        copywrite.setHorizontalAlignment(SwingConstants.CENTER);
        copywrite.setForeground(new Color(130,130,130));
        panel.add(copywrite);
    }
    
    private void addTextFields(){
        
        JTextField inputID = new JTextField(10);
        JTextField inputName = new JTextField(250);
        JTextField inputLastName = new JTextField(250);
        JTextField inputAddress = new JTextField(900);
        JTextField inputCellphone = new JTextField(10);
        //------------------------------------------
        int inputWidth = 300;
        int inputHeight = 40;
        Color inputColor = new Color(240,240,240);
        int horizontalAlignment = 17;
        int padding = 15;
        //------------------------------------------
        inputID.setLocation(horizontalAlignment,75);
        inputID.setSize(inputWidth,inputHeight);
        inputID.setBackground(inputColor);
        inputID.setBorder(null);
        inputID.setBorder(BorderFactory.createEmptyBorder(0,padding,0,padding));
         panel.add(inputID);
        //------------------------------------------
        inputName.setLocation(horizontalAlignment,145);
        inputName.setSize(inputWidth,inputHeight);
        inputName.setBackground(inputColor);
        inputName.setBorder(null);
        inputName.setBorder(BorderFactory.createEmptyBorder(0,padding,0,padding));
        panel.add(inputName);
        //------------------------------------------
        inputLastName.setSize(inputWidth,inputHeight);
        inputLastName.setLocation(horizontalAlignment,215);
        inputLastName.setBackground(inputColor);
        inputLastName.setBorder(null);
        inputLastName.setBorder(BorderFactory.createEmptyBorder(0,padding,0,padding));
        panel.add(inputLastName);
        //------------------------------------------
        inputAddress.setSize(inputWidth,inputHeight);
        inputAddress.setLocation(horizontalAlignment,285);
        inputAddress.setBackground(inputColor);
        inputAddress.setBorder(null);
        inputAddress.setBorder(BorderFactory.createEmptyBorder(0,padding,0,padding));
        panel.add(inputAddress);
        //------------------------------------------
        inputCellphone.setSize(inputWidth,inputHeight);
        inputCellphone.setLocation(horizontalAlignment,355);
        inputCellphone.setBackground(inputColor);
        inputCellphone.setBorder(null);
        inputCellphone.setBorder(BorderFactory.createEmptyBorder(0,padding,0,padding));
        panel.add(inputCellphone);
   
    }
    
    private void addButton(){
        Color backgroundButton = (Color.ORANGE);
        Color colorButton = (Color.BLACK);
        
        JButton sendButton = new JButton();
        sendButton.setSize(300,40);
        sendButton.setText("Guardar");
        sendButton.setBackground(backgroundButton);
        sendButton.setForeground(colorButton);
        sendButton.setBorder(null);
        sendButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sendButton.setLocation(17,420);
        panel.add(sendButton);
        
    }
}
