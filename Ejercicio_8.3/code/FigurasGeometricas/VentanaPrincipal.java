package FigurasGeometricas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;

    private JLabel tituloCilindro, labelRadioCilindro, labelAlturaCilindro;
    private JTextField campoRadioCilindro, campoAlturaCilindro;
    private JButton calcularCilindro;
    private JLabel resultadoVolumenCilindro, resultadoSuperficieCilindro;

    private JLabel tituloEsfera, labelRadioEsfera;
    private JTextField campoRadioEsfera;
    private JButton calcularEsfera;
    private JLabel resultadoVolumenEsfera, resultadoSuperficieEsfera;

    private JLabel tituloPiramide, labelBasePiramide, labelAlturaPiramide, labelApotema;
    private JTextField campoBasePiramide, campoAlturaPiramide, campoApotema;
    private JButton calcularPiramide;
    private JLabel resultadoVolumenPiramide, resultadoSuperficiePiramide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Cálculo de Figuras Geométricas");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        tituloCilindro = new JLabel("CILINDRO");
        tituloCilindro.setBounds(20, 20, 200, 25);
        tituloCilindro.setFont(new Font("Arial", Font.BOLD, 14));

        labelRadioCilindro = new JLabel("Radio (cm):");
        labelRadioCilindro.setBounds(20, 50, 100, 23);
        campoRadioCilindro = new JTextField();
        campoRadioCilindro.setBounds(120, 50, 100, 23);

        labelAlturaCilindro = new JLabel("Altura (cm):");
        labelAlturaCilindro.setBounds(20, 80, 100, 23);
        campoAlturaCilindro = new JTextField();
        campoAlturaCilindro.setBounds(120, 80, 100, 23);

        calcularCilindro = new JButton("Calcular");
        calcularCilindro.setBounds(20, 110, 100, 23);
        calcularCilindro.addActionListener(this);

        resultadoVolumenCilindro = new JLabel("Volumen = ");
        resultadoVolumenCilindro.setBounds(20, 145, 220, 23);

        resultadoSuperficieCilindro = new JLabel("Superficie = ");
        resultadoSuperficieCilindro.setBounds(20, 170, 220, 23);

        tituloEsfera = new JLabel("ESFERA");
        tituloEsfera.setBounds(260, 20, 200, 25);
        tituloEsfera.setFont(new Font("Arial", Font.BOLD, 14));

        labelRadioEsfera = new JLabel("Radio (cm):");
        labelRadioEsfera.setBounds(260, 50, 100, 23);
        campoRadioEsfera = new JTextField();
        campoRadioEsfera.setBounds(360, 50, 100, 23);

        calcularEsfera = new JButton("Calcular");
        calcularEsfera.setBounds(260, 110, 100, 23);
        calcularEsfera.addActionListener(this);

        resultadoVolumenEsfera = new JLabel("Volumen = ");
        resultadoVolumenEsfera.setBounds(260, 145, 220, 23);

        resultadoSuperficieEsfera = new JLabel("Superficie = ");
        resultadoSuperficieEsfera.setBounds(260, 170, 220, 23);

        tituloPiramide = new JLabel("PIRÁMIDE");
        tituloPiramide.setBounds(20, 230, 200, 25);
        tituloPiramide.setFont(new Font("Arial", Font.BOLD, 14));

        labelBasePiramide = new JLabel("Base (cm):");
        labelBasePiramide.setBounds(20, 260, 100, 23);
        campoBasePiramide = new JTextField();
        campoBasePiramide.setBounds(120, 260, 100, 23);

        labelAlturaPiramide = new JLabel("Altura (cm):");
        labelAlturaPiramide.setBounds(20, 290, 100, 23);
        campoAlturaPiramide = new JTextField();
        campoAlturaPiramide.setBounds(120, 290, 100, 23);

        labelApotema = new JLabel("Apotema (cm):");
        labelApotema.setBounds(20, 320, 100, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 320, 100, 23);

        calcularPiramide = new JButton("Calcular");
        calcularPiramide.setBounds(20, 350, 100, 23);
        calcularPiramide.addActionListener(this);

        resultadoVolumenPiramide = new JLabel("Volumen = ");
        resultadoVolumenPiramide.setBounds(260, 350, 220, 23);

        resultadoSuperficiePiramide = new JLabel("Superficie = ");
        resultadoSuperficiePiramide.setBounds(260, 375, 220, 23);

        contenedor.add(tituloCilindro);
        contenedor.add(labelRadioCilindro);
        contenedor.add(campoRadioCilindro);
        contenedor.add(labelAlturaCilindro);
        contenedor.add(campoAlturaCilindro);
        contenedor.add(calcularCilindro);
        contenedor.add(resultadoVolumenCilindro);
        contenedor.add(resultadoSuperficieCilindro);

        contenedor.add(tituloEsfera);
        contenedor.add(labelRadioEsfera);
        contenedor.add(campoRadioEsfera);
        contenedor.add(calcularEsfera);
        contenedor.add(resultadoVolumenEsfera);
        contenedor.add(resultadoSuperficieEsfera);

        contenedor.add(tituloPiramide);
        contenedor.add(labelBasePiramide);
        contenedor.add(campoBasePiramide);
        contenedor.add(labelAlturaPiramide);
        contenedor.add(campoAlturaPiramide);
        contenedor.add(labelApotema);
        contenedor.add(campoApotema);
        contenedor.add(calcularPiramide);
        contenedor.add(resultadoVolumenPiramide);
        contenedor.add(resultadoSuperficiePiramide);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        // Evento del botón Calcular Cilindro
        if (evento.getSource() == calcularCilindro) {
            double radio = Double.parseDouble(campoRadioCilindro.getText());
            double altura = Double.parseDouble(campoAlturaCilindro.getText());

            Cilindro cilindro = new Cilindro(radio, altura);

            resultadoVolumenCilindro.setText("Volumen = " + String.format("%.2f", cilindro.calcularVolumen()) + " cm³");
            resultadoSuperficieCilindro.setText("Superficie = " + String.format("%.2f", cilindro.calcularSuperficie()) + " cm²");
        }

        if (evento.getSource() == calcularEsfera) {
            double radio = Double.parseDouble(campoRadioEsfera.getText());

            Esfera esfera = new Esfera(radio);

            resultadoVolumenEsfera.setText("Volumen = " + String.format("%.2f", esfera.calcularVolumen()) + " cm³");
            resultadoSuperficieEsfera.setText("Superficie = " + String.format("%.2f", esfera.calcularSuperficie()) + " cm²");
        }

        if (evento.getSource() == calcularPiramide) {
            double base = Double.parseDouble(campoBasePiramide.getText());
            double altura = Double.parseDouble(campoAlturaPiramide.getText());
            double apotema = Double.parseDouble(campoApotema.getText());

            Piramide piramide = new Piramide(base, altura, apotema);

            resultadoVolumenPiramide.setText("Volumen = " + String.format("%.2f", piramide.calcularVolumen()) + " cm³");
            resultadoSuperficiePiramide.setText("Superficie = " + String.format("%.2f", piramide.calcularSuperficie()) + " cm²");
        }
    }
}
