package padroescomportamentais.observer;

import java.util.Observable;

public class Setor extends Observable {

    private String nomeSetor;
    private String descricaoSetor;
    private Integer anoCriacao;


    public Setor(String nomeSetor, String descricaoSetor, Integer anoCriacao) {
        this.nomeSetor = nomeSetor;
        this.descricaoSetor = descricaoSetor;
        this.anoCriacao = anoCriacao;

    }

    public void lancarReparos() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Setor{" +
                "nomeSetor=" + nomeSetor +
                ", descricaoSetor=" + descricaoSetor +
                ", anoCriacao='" + anoCriacao + '\''+
                '}';
    }
}
