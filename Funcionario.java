package model;

public class Funcionario {

    public Funcionario(
            Short chapa,
            String nome,
            float valorHora) {
    }

    public float calcularSalarioLiquido(int i) {
        float horaTrabalhada = (8);
        float diaTrabalhado = (28);

        double descontoIr = (7.5);
        float descontoInss = (12);

        float valorLiquidoSemDesc = (i * horaTrabalhada) * diaTrabalhado;

        float calcularDescontoInss = valorLiquidoSemDesc/descontoInss;
        double calcularDescontoIr = valorLiquidoSemDesc/descontoIr;

        return (float) (valorLiquidoSemDesc - (calcularDescontoInss + calcularDescontoIr));

    }
}