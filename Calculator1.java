
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator1 extends Applet implements ActionListener
{
    //vaiable for Holind Value for textfield
    int a,b,c;
    String button_value,field_value,opretion,holding_value_of_textfield,holding_final_value_of_textfield;

    TextField t1 = new TextField(12);
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button bdot = new Button(".");
    Button bplus = new Button("+");
    Button bminus = new Button("-");
    Button bmultification = new Button("x");
    Button bdevide = new Button("/");
    Button bmod = new Button("%");
    Button bCE = new Button("CE");
    Button bC = new Button("C");
    Button bdelete = new Button("<-");
    Button b_by_x = new Button("1/x");
    Button b_x_squar = new Button("x2");
    Button b_root = new Button("2√x");
    Button b_plus_minus = new Button("+/-");
    Button bequal = new Button("=");
    public void init()
    {

        setLayout(new BorderLayout(20,10));
        add(t1,BorderLayout.NORTH);
        GridLayout g1 = new GridLayout(6,4,5,5);
        Panel p = new Panel();
        p.setLayout(g1);

        //For Font Color -
        //setForeground(Color.WHITE);

        //1 row
        
        p.add(bmod);
        p.add(bCE);
        p.add(bC);
        p.add(bdelete);
        
        //2 row

        p.add(b_by_x);
        p.add(b_x_squar);
        p.add(b_root);
        p.add(bdevide);

        //setBackground(Color.black);

        //3 row

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bmultification);

        //4 row

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bminus);

        //5 row

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bplus);

        //6 row

        p.add(b_plus_minus);
        p.add(b0);
        p.add(bdot);
        p.add(bequal);
        bequal.setBackground(Color.cyan);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        //operation like + , - , / , * , %
        bplus.addActionListener(this);
        bdevide.addActionListener(this);
        bminus.addActionListener(this);
        bmultification.addActionListener(this);

        //for equal
        bequal.addActionListener(this);
        add(p,BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button_value = e.getActionCommand();
                if (button_value.equals("7")|| button_value.equals("8")|| button_value.equals("9")||
                    button_value.equals("4")|| button_value.equals("5")|| button_value.equals("6")||
                    button_value.equals("1")|| button_value.equals("2")|| button_value.equals("3")||
                    button_value.equals("0") )
                {
                    field_value = t1.getText() + button_value;
                    t1.setText(field_value);
                }

                //For Operation like + , - , / , *

                if(button_value.equals("+"))
                {
                    holding_value_of_textfield = t1.getText();
                    t1.setText("");
                    opretion = "+";
                }
                if(button_value.equals("-"))
                {
                    holding_value_of_textfield = t1.getText();
                    t1.setText("");
                    opretion = "-";
                }
                if(button_value.equals("/"))
                {
                    holding_value_of_textfield = t1.getText();
                    t1.setText("");
                    opretion = "/";
                }
                if(button_value.equals("x"))
                {
                    holding_value_of_textfield = t1.getText();
                    t1.setText("");
                    opretion = "x";
                }

        //for equal operation

        if(button_value.equals("="))
        {
            holding_final_value_of_textfield = t1.getText();
            a = Integer.parseInt(holding_value_of_textfield);
            b = Integer.parseInt(holding_final_value_of_textfield);
            if(opretion.equals("+"))
                c = a + b ;
            if(opretion.equals("-"))
                c = a - b ;
            if(opretion.equals("/"))
                c = a / b ;
            if(opretion.equals("x"))
                c = a * b ;

            t1.setText(String.valueOf(c));

        }

    }

}
