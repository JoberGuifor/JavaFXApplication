package entity;

import java.util.ArrayList;

/**
 *
 */
public class PacienteOUExpaciente {

    private String nome;

    private String cpf;

    private ArrayList<String> historico_doenca = new ArrayList<>();

    private Leito leito;
    
    private Conta conta;

    private ConvenioPaciente convenio;

    public PacienteOUExpaciente(Leito leito, ConvenioPaciente convenio, String cpf, String nome) {

        this.leito = leito;
        this.convenio = convenio;
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



