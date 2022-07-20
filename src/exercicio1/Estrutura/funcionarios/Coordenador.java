package src.exercicio1.Estrutura.funcionarios;

public class Coordenador extends Funcionario {
    private int professoresSupervisionados;

    public Coordenador() {
        this.professoresSupervisionados = 0;
    }
    public void adicionaProfessor() {
        if (professoresSupervisionados == 10) {
            System.out.println("Limite de professores supervisionados excedido.");
        } else {
            professoresSupervisionados++;
        }
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
