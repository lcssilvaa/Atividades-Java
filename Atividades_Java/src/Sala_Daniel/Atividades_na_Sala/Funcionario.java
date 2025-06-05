package Sala_Daniel.Atividades_na_Sala;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funcionario extends JFrame implements ActionListener {

    Usuario u = new Usuario();
    private java.util.List<Usuario> listaUsuarios = new java.util.ArrayList<>();
    

    private String usuario;
    private String senha;
    private CampoTextoArredondado campoTexto;
    private CampoSenhaArredondado campoSenha;
    private JLabel title;

    public Funcionario() {
        

        setTitle("Login");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(new Color(7, 7, 28));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();
            }
        };

        painel.setLayout(null);

        JLabel label = new JLabel("<html>Sempre<br>conectado</html>");
        label.setFont(new Font("Arial", Font.BOLD, 60));
        label.setForeground(Color.WHITE);
        label.setBounds(140, 70, 300, 120);
        painel.add(label);

        campoTexto = new CampoTextoArredondado(20);
        campoTexto.setBounds(140, 240, 300, 40);
        painel.add(campoTexto);

        // Placeholder para campo de texto (usuário)
        campoTexto.setText("Digite seu usuário...");
        campoTexto.setForeground(Color.GRAY);
        campoTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (campoTexto.getText().equals("Digite seu usuário...")) {
                    campoTexto.setText("");
                    campoTexto.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (campoTexto.getText().isEmpty()) {
                    campoTexto.setText("Digite seu usuário...");
                    campoTexto.setForeground(Color.GRAY);
                }
            }
        });

        campoSenha = new CampoSenhaArredondado(20);
        campoSenha.setBounds(140, 320, 300, 40);
        painel.add(campoSenha);

        // Placeholder para campo de senha
        campoSenha.setText("Digite sua senha...");
        campoSenha.setEchoChar((char) 0); // Mostrar texto
        campoSenha.setForeground(Color.GRAY);
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (String.valueOf(campoSenha.getPassword()).equals("Digite sua senha...")) {
                    campoSenha.setText("");
                    campoSenha.setEchoChar('•'); // Mostrar asteriscos reais
                    campoSenha.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (String.valueOf(campoSenha.getPassword()).isEmpty()) {
                    campoSenha.setText("Digite sua senha...");
                    campoSenha.setEchoChar((char) 0); // Mostrar texto novamente
                    campoSenha.setForeground(Color.GRAY);
                }
            }
        });

        BotaoRedondo botaoEntrar = new BotaoRedondo("Login");
        botaoEntrar.setBounds(190, 400, 200, 50);
        botaoEntrar.addActionListener(this);
        painel.add(botaoEntrar);

        setContentPane(painel);
        setVisible(true);
    }

    public class CampoTextoArredondado extends JTextField {
        public CampoTextoArredondado(int tamanhoColunas) {
            super(tamanhoColunas);
            setOpaque(false);
            setBorder(new BordaArredondada());
            setFont(new Font("Arial", Font.PLAIN, 18));
            setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
            super.paintComponent(g);
            g2.dispose();
        }

        private static class BordaArredondada implements Border {
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }

            public boolean isBorderOpaque() {
                return false;
            }

            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.GRAY);
                g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30);
            }
        }
    }

    public class CampoSenhaArredondado extends JPasswordField {
        public CampoSenhaArredondado(int colunas) {
            super(colunas);
            setOpaque(false);
            setBorder(new BordaArredondada());
            setFont(new Font("Arial", Font.PLAIN, 18));
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
            super.paintComponent(g);
            g2.dispose();
        }

        private static class BordaArredondada implements Border {
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }

            public boolean isBorderOpaque() {
                return false;
            }

            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.GRAY);
                g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30);
            }
        }
    }

    public class BotaoRedondo extends JButton {
        public BotaoRedondo(String texto) {
            super(texto);
            setOpaque(false);
            setBorder(new BordaArredondada());
            setFont(new Font("Impact", Font.LAYOUT_LEFT_TO_RIGHT, 26));
            setForeground(Color.WHITE);
            setBackground(new Color(12, 70, 135));
            setFocusPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
            super.paintComponent(g);
            g2.dispose();
        }

        private static class BordaArredondada implements Border {
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }

            public boolean isBorderOpaque() {
                return false;
            }

            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.GRAY);
                g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30);
            }
        }
    }

    
    @Override
public void actionPerformed(ActionEvent e) {


    usuario = campoTexto.getText().equals("Digite seu usuário...") ? "" : campoTexto.getText();
    senha = String.valueOf(campoSenha.getPassword()).equals("Digite sua senha...") ? "" : String.valueOf(campoSenha.getPassword());

    listaUsuarios.add(new Usuario(usuario, senha));

    boolean loginValido = false;

    for (Usuario u : listaUsuarios) {
        if (u.getNome().equals(usuario) && u.getSenha().equals(senha)) {
            loginValido = true;
            break;
        }
    }

    if (loginValido) {
        JOptionPane.showMessageDialog(null,
            "Usuário: " + usuario + "\nSenha: " + senha,
            "Login realizado com sucesso",
            JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null,
            "Usuário ou senha incorretos.",
            "Erro de login",
            JOptionPane.ERROR_MESSAGE);
    }
}


}