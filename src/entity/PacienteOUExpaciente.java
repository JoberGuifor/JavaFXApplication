package entity;

import java.util.ArrayList;

/**
 *
 */
public class PacienteOUExpaciente {

    private String nome;

    private String cpf;

    private ArrayList<String> historico_doenca;
    
    private boolean vivo;

    private Leito leito;


    private Conta conta;

    private ConvenioPaciente convenio;


    private AuxiliarInfermagem auxiliarInfermagem;

    public PacienteOuExpaciente(AuxiliarInfermagem auxiliarInfermagem, Conta conta, ConvenioPaciente convenio, boolean vivo, ArrayList<String> historico_doenca, String cpf, String nome) {
        this.auxiliarInfermagem = auxiliarInfermagem;
        this.conta = conta;
        this.leito = leito;
        this.convenio = convenio;
        this.vivo = vivo;
        this.historico_doenca = historico_doenca;
        this.cpf = cpf;
        this.nome = nome;
    }

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
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

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
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

    public void setLeito(Leito[] leito) {
        this.leito = leito;
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

    public ConvenioPaciente[] getConveniopaciente() {
        return this.convenio;
    }


    public void setConvenioPaciente(ConvenioPaciente convenio) {
        this.convenio = convenio;
    }
}


}
