package entity;

import java.util.ArrayList;

/**
 *
 */
public class PacienteOUExpaciente {

    private String nome;

    private String cpf;

    private ArrayList<String> historico_doenca;

    private Leito leito;


    private Conta conta;

    private ConvenioPaciente convenio;

    private AuxiliarInfermagem auxiliarInfermagem;

    public PacienteOUExpaciente(AuxiliarInfermagem auxiliarInfermagem, Conta conta,Leito leito, ConvenioPaciente convenio, ArrayList<String> historico_doenca, String cpf, String nome) {
        this.auxiliarInfermagem = auxiliarInfermagem;
        this.conta = conta;
        this.leito = leito;
        this.convenio = convenio;
        this.historico_doenca = historico_doenca;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<String> getHistorico_doença() {
        return historico_doenca;
    }

    public void addHistorico_doença(String doenca) {
        this.historico_doenca.add(doenca);
    }

    public ConvenioPaciente getConvenio() {
        return convenio;
    }

    public void setConvenio(ConvenioPaciente convenio) {
        this.convenio = convenio;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public AuxiliarInfermagem getAuxiliarInfermagem() {
        return auxiliarInfermagem;
    }

    public void setAuxiliarInfermagem(AuxiliarInfermagem auxiliarInfermagem) {
        this.auxiliarInfermagem = auxiliarInfermagem;
    }

    public void setConvenioPaciente(ConvenioPaciente convenio) {
        this.convenio = convenio;
    }
      public ArrayList<String> getHistorico_doenca() {
        return historico_doenca;
    }

    public void setHistorico_doenca(ArrayList<String> historico_doenca) {
        this.historico_doenca = historico_doenca;
    }

    public ConvenioPaciente getGetConvenioPaciente() {
        return convenio;
    }

}



