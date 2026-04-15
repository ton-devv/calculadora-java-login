import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        String usuario;
        String senha;

        int tentativas = 3;

        while (tentativas > 0) {

            usuario = JOptionPane.showInputDialog("Digite o usuário:");
            if (usuario == null) return;

            senha = JOptionPane.showInputDialog("Digite a senha:");
            if (senha == null) return;

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso liberado!");
                break;
            } else {
                tentativas--;
                JOptionPane.showMessageDialog(null,
                        "Usuário ou senha incorretos!\nTentativas restantes: " + tentativas);
            }
        }

        if (tentativas == 0) {
            JOptionPane.showMessageDialog(null, "Sistema bloqueado!");
            return;
        }
        // INICIO DA CALCULADORA
        while (true) {
            String num1 = JOptionPane.showInputDialog("Digite o número 1:");
            String num2 = JOptionPane.showInputDialog("Digite o número 2:");

            double numero1 = Double.parseDouble(num1);
            double numero2 = Double.parseDouble(num2);


            // opções de operação
            String[] operacoes = {"+", "-", "*", "/"};
            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha a operação:",
                    "Operações",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    operacoes,
                    operacoes[0]
            );

            double resultado = 0;

            switch (escolha) {
                case "+":
                    resultado = numero1 + numero2;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    break;

                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero");
                        return;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida");
                    return;
            }

            JOptionPane.showMessageDialog(null,
                    "Resultado: " + resultado);
            int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}