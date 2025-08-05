import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Contato");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel comentarioLabel = new JLabel("Comentário:");
        JTextArea comentarioArea = new JTextArea(5, 20);
        comentarioArea.setLineWrap(true);
        comentarioArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(comentarioArea);

        JCheckBox interesseAWS = new JCheckBox("Tem interesse em AWS?");
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.WHITE);
        radioPanel.add(radioSim);
        radioPanel.add(radioNao);

        JButton enviarButton = new JButton("Enviar");

        // Posicionamento dos componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nomeLabel, gbc);
        gbc.gridx = 1;
        panel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(comentarioLabel, gbc);
        gbc.gridx = 1;
        panel.add(scroll, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(interesseAWS, gbc);

        gbc.gridx = 1;
        panel.add(radioPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(enviarButton, gbc);

        // Action Listener
        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String comentario = comentarioArea.getText();
            System.out.println("Nome: " + nome + ", Comentário: " + comentario);
        });

        // Mouse Listener (hover no botão)
        enviarButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                enviarButton.setText("Clique para Enviar");
            }

            public void mouseExited(MouseEvent e) {
                enviarButton.setText("Enviar");
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

