/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
/**
 *
 * @author Aluno
 */
public class Livros {
    
    private int id;
    private String nome;
    private String editora;
    private int ano;
    private boolean disponivel;
    private int usuario_id;

    public Livros() {
    }

    public Livros(int id, String nome, String editora, int ano, boolean disponivel, int usuario_id) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.ano = ano;
        this.disponivel = disponivel;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public String toString() {
        return "Livros{" + "id=" + id + ", nome=" + nome + ", editora=" + editora + ", ano=" + ano + ", disponivel=" + disponivel + ", usuario_id=" + usuario_id + '}';
    }
    
}
