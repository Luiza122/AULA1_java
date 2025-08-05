import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Interface - DDD");
        JButton botao = new JButton("Clique aqui");

        botao.addActionListener(e -> JOptionPane.showMessageDialog(null, "Você clicou!"));

        frame.add(botao);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
