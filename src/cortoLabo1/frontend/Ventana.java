package cortoLabo1.frontend;

import cortoLabo1.backend.AbstractFactory;
import cortoLabo1.backend.FactoryProducer;
import cortoLabo1.backend.OpDisponibles;
import cortoLabo1.backend.TipoOp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txt1, txt2, txtResult;
    private JButton btnSuma, btnResta, btnMulti,btnDiv,btnBin;

    public Ventana() throws HeadlessException {
        super("Calculadora");
        initialComponents();
    }

    public void initialComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);//layout

        txt1 = new JTextField();
        txt1.setBounds(10,50,50,30);

        txt2 = new JTextField();
        txt2.setBounds(80,50,50,30);

        txtResult = new JTextField();
        txtResult.setBounds(200,50,50,30);


        btnSuma  = new JButton("+");
        btnSuma.setBounds(10,100,50,30);


        btnResta  = new JButton("-");
        btnResta.setBounds(10,150,50,30);

        btnMulti  = new JButton("x");
        btnMulti.setBounds(10,200,50,30);


        btnDiv  = new JButton("/");
        btnDiv.setBounds(10,250,50,30);

        btnBin  = new JButton("bin");
        btnBin.setBounds(10,300,100,30);

        //extrae el layout
        Container container = getContentPane();
        container.add(txt1);
        container.add(txt2);
        container.add(txtResult);

        container.add(btnSuma);
        container.add(btnResta);
        container.add(btnMulti);
        container.add(btnDiv);
        container.add(btnBin);

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFactory factory =  FactoryProducer.getFactory(TipoOp.ARITMETICO);
                txtResult.setText(String.valueOf(factory.getOperacion(OpDisponibles.SUMAR,
                        Float.parseFloat(txt1.getText()),
                        Float.parseFloat(txt2.getText()))));
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFactory factory =  FactoryProducer.getFactory(TipoOp.ARITMETICO);
                txtResult.setText(String.valueOf(factory.getOperacion(OpDisponibles.RESTAR,
                        Float.parseFloat(txt1.getText()),
                        Float.parseFloat(txt2.getText()))));
            }
        });

        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFactory factory =  FactoryProducer.getFactory(TipoOp.ARITMETICO);
                txtResult.setText(String.valueOf(factory.getOperacion(OpDisponibles.MULTIPLICAR,
                        Float.parseFloat(txt1.getText()),
                        Float.parseFloat(txt2.getText()))));
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFactory factory =  FactoryProducer.getFactory(TipoOp.ARITMETICO);
                txtResult.setText(String.valueOf(factory.getOperacion(OpDisponibles.DIVIDIR,
                        Float.parseFloat(txt1.getText()),
                        Float.parseFloat(txt2.getText()))));
            }
        });

        btnBin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFactory factory =  FactoryProducer.getFactory(TipoOp.BINARIO);
                txtResult.setText(factory.getConversor(Integer.parseInt(txt1.getText())));
            }
        });

        setSize(500,500);
    }
    public static void main(String [] args){
        //Permite seguir corriendo en la vida util del programa
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
