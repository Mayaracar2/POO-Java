package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Janela {
    public void iniciar() {
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(420, 250);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 1, 10, 10));
        painel.setBorder(new EmptyBorder(20, 20, 20 ,20));
        painel.setBackground(new Color(245, 245, 245));

        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();

        Font fonte = new Font("Arial", Font.PLAIN, 16);

        campo1.setFont(fonte);
        campo2.setFont(fonte);

        JButton botao = new JButton("Somar");
        botao.setFont(fonte);
        botao.setBackground(new Color(66, 133, 244));
        botao.setForeground(Color.WHITE);

        JLabel resultado = new JLabel();
        resultado.setText("Resultado: 0");
        resultado.setFont(new Font("Arial", Font.BOLD, 18));
        resultado.setHorizontalAlignment(SwingConstants.CENTER);

        botao.addActionListener(e -> {
            try {
                int a = Integer.parseInt(campo1.getText());
                int b = Integer.parseInt(campo2.getText());
                resultado.setText("Resultado: " + (a + b));
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(
                        janela,
                        "Digite um valor válido para a soma",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        painel.add(campo1);
        painel.add(campo2);
        painel.add(botao);
        painel.add(resultado);
        janela.add(painel);
        janela.setVisible(true);
    }
}
