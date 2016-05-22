package entity;

public class Conta {
    private char data;
    private float total;
    private Paciente_ou_expaciente paciente;
    private boolean paga;
    private char descricao;
    private Medicamento_paciente listamedicamento
    private int qtdfuncionarios;
    private float preçofuncionario;
    private Paciente_ou_expaciente paciente_ou_expaciente;
    private Leito leito;
    private Leito leito;
    private Medicamento_paciente medicamento_paciente;
    private Paciente_ou_expaciente paciente_ou_expaciente;
    private Medicamento_paciente medicamento_paciente;

    public Conta(char data, float total, Paciente_ou_expaciente paciente, boolean paga, char descricao, Medicamento_paciente listamedicamento, int qtdfuncionarios, float preçofuncionario, Paciente_ou_expaciente paciente_ou_expaciente, Leito leito, Medicamento_paciente medicamento_paciente) {
        this.data = data;
        this.total = total;
        this.paciente = paciente;
        this.paga = paga;
        this.descricao = descricao;
        this.listamedicamento = listamedicamento;
        this.qtdfuncionarios = qtdfuncionarios;
        this.preçofuncionario = preçofuncionario;
        this.paciente_ou_expaciente = paciente_ou_expaciente;
        this.leito = leito;
        this.medicamento_paciente = medicamento_paciente;
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

    public Paciente_ou_expaciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente_ou_expaciente paciente) {
        this.paciente = paciente;
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

    public Medicamento_paciente getListamedicamento() {
        return listamedicamento;
    }

    public void setListamedicamento(Medicamento_paciente listamedicamento) {
        this.listamedicamento = listamedicamento;
    }

    public int getQtdfuncionarios() {
        return qtdfuncionarios;
    }

    public void setQtdfuncionarios(int qtdfuncionarios) {
        this.qtdfuncionarios = qtdfuncionarios;
    }
    :ArrayList;

    public float getPreçofuncionario() {
        return preçofuncionario;
    }

    public void setPreçofuncionario(float preçofuncionario) {
        this.preçofuncionario = preçofuncionario;
    }

    public Paciente_ou_expaciente getPaciente_ou_expaciente() {
        return paciente_ou_expaciente;
    }

    public void setPaciente_ou_expaciente(Paciente_ou_expaciente paciente_ou_expaciente) {
        this.paciente_ou_expaciente = paciente_ou_expaciente;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Medicamento_paciente getMedicamento_paciente() {
        return medicamento_paciente;
    }

    public void setMedicamento_paciente(Medicamento_paciente medicamento_paciente) {
        this.medicamento_paciente = medicamento_paciente;
    }

}
