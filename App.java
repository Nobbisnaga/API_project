package view;
import java.util.Scanner;
import model.Funcionario;

public class App {

    public static void main(String[]args)
    throws Exception {
        Scanner entrada = new Scanner(System.in);
        Funcionario funcionario = new Funcionario(
            (short) 1, "Marcos", 5
        );

       float salario = funcionario.calcularSalarioLiquido(10);
       System.out.println(salario);
    }
}