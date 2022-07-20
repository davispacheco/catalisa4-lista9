package src.exercicio1.metodos.aumentoSalario;

public class Geral {
    private double percentual;
    private double reajuste;
    private double salario;

    public Geral() {
        this.percentual = percentual;
        this.reajuste = reajuste;
        this.salario = salario;
    }

    public void aumentoSalario() {
        reajuste = salario * percentual;
        salario += reajuste;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
