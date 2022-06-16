package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Funcionario implements Observer {

    private String nome;
    private String ultimoReparo;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getUltimoReparo() {
        return this.ultimoReparo;
    }

    public void reparar(Setor setor) {
        setor.addObserver(this);
    }

    public void update(Observable setor, Object arg1) {
        this.ultimoReparo = this.nome + ", reparo lançado no " + setor.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
