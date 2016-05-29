package entity;

/**
 *
 */
public class Conta {
    private char data;
    private float total;
    private boolean paga;
    private char descricao;
    private int qtdfuncionarios;
    private float preçofuncionario;
    private Leito leito;
    private Medicamento MedicamentoPaciente;
    private PacienteOUExpaciente PacienteOUExpaciente;

    /**
     * @param data
     * @param total
     * @param paga
     * @param descricao
     * @param qtdfuncionarios
     * @param preçofuncionario
     * @param leito
     * @param medicamentoPaciente
     * @param pacienteOUExpaciente
     */
    public Conta(char data, float total, boolean paga, char descricao, int qtdfuncionarios, float preçofuncionario, Leito leito, Medicamento medicamentoPaciente, PacienteOUExpaciente pacienteOUExpaciente) {
        this.data = data;
        this.total = total;
        this.paga = paga;
        this.descricao = descricao;
        this.qtdfuncionarios = qtdfuncionarios;
        this.preçofuncionario = preçofuncionario;
        this.leito = leito;
        MedicamentoPaciente = medicamentoPaciente;
        PacienteOUExpaciente = pacienteOUExpaciente;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public char getDescricao() {
        return descricao;
    }

    public void setDescricao(char descricao) {
        this.descricao = descricao;
    }

    public int getQtdfuncionarios() {
        return qtdfuncionarios;
    }

    public void setQtdfuncionarios(int qtdfuncionarios) {
        this.qtdfuncionarios = qtdfuncionarios;
    }

    public float getPreçofuncionario() {
        return preçofuncionario;
    }

    public void setPreçofuncionario(float preçofuncionario) {
        this.preçofuncionario = preçofuncionario;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Medicamento getMedicamentoPaciente() {
        return MedicamentoPaciente;
    }

    public void setMedicamentoPaciente(Medicamento medicamentoPaciente) {
        MedicamentoPaciente = medicamentoPaciente;
    }

    public PacienteOUExpaciente getPacienteOUExpaciente() {
        return PacienteOUExpaciente;
    }

    public void setPacienteOUExpaciente(PacienteOUExpaciente pacienteOUExpaciente) {
        PacienteOUExpaciente = pacienteOUExpaciente;
    }
}
