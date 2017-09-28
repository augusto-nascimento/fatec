/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau
    (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
    equação possue2 raízes).
    F = (9*C +160)/5
*/
import javax.swing.JOptionPane;
public class Lt01Ex5 {
    public static void main (String args[]) {
        float a, b, c;
        double delta, x1, x2;
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do coeficiente A"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do coeficiente B"));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do coeficiente C"));
        delta = Math.pow(b,2) - 4 * a * c;
        if (delta<0) {
            System.out.format("A equação (%f)x^2 + (%f)x + %f = 0, não possui raízes reais %n", a,b,c);
        } else if (delta == 0){
            x1 = (((-1) * b) + Math.sqrt(delta)) / (2 * a);
            System.out.format("A raíz para a equação (%f)x^2 + (%f)x + %f = 0 é: "
                                + "%n x2 = %f %n", a,b,c, x1);            
        }
        else {
            x1 = (((-1) * b) + Math.sqrt(delta)) / (2 * a);
            x2 = (((-1) * b) - Math.sqrt(delta)) / (2 * a);
            System.out.format("As raízes para a equação (%f)x^2 + (%f)x + %f = 0 são: "
                                + "%n x1 = %f"
                                + "%n x2 = %f %n", a,b,c, x1, x2);
        }
    }
}