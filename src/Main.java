import jcFigurasGeometricas.CirculoDibujable;
import jcFigurasGeometricas.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CirculoDibujable circulo = new CirculoDibujable(100, 50, 50);
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 200, 50);

        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
        System.out.println("Área del círculo: " + circulo.getArea());

        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());
        System.out.println("Área del cuadrado: " + cuadrado.getArea());

        JFrame frame = new JFrame("Dibujar figuras");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g); // ahora también se dibuja el cuadrado
            }
        };

        panel.setPreferredSize(new Dimension(400, 400));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}















