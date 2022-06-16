package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {


    @Test
    void deveLancarReparoParaUmFuncionario() {
        Setor setor = new Setor("sala vermelha", "setor prioritario", 2022);
        Funcionario funcionario = new Funcionario("Funcionario 1");
        funcionario.reparar(setor);
        setor.lancarReparos();
        assertEquals("Funcionario 1, reparo lançado no Setor{nomeSetor=sala vermelha, descricaoSetor=setor prioritario, anoCriacao='2022'}", funcionario.getUltimoReparo());
    }

    @Test
    void deveLancarReparoParaFuncionarios() {
        Setor setor = new Setor("sala amarela", "setor prioritario2", 2022);
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        funcionario1.reparar(setor);
        funcionario2.reparar(setor);
        setor.lancarReparos();
        assertEquals("Funcionario 1, reparo lançado no Setor{nomeSetor=sala amarela, descricaoSetor=setor prioritario2, anoCriacao='2022'}", funcionario1.getUltimoReparo());
        assertEquals("Funcionario 2, reparo lançado no Setor{nomeSetor=sala amarela, descricaoSetor=setor prioritario2, anoCriacao='2022'}", funcionario2.getUltimoReparo());
    }

    @Test
    void naoDeveLancarReparos() {
        Setor setor = new Setor("sala amarela", "setor prioritario2", 2022);
        Funcionario funcionario = new Funcionario("Funcionario 1");
        setor.lancarReparos();
        assertEquals(null, funcionario.getUltimoReparo());
    }


}