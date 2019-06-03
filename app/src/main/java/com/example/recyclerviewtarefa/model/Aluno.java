package com.example.recyclerviewtarefa.model;

import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Aluno {
    private String nome;
    private String curso;
    private int fotoID;
    //busca imagem pelo numero dela

    public Aluno(String nome, String curso, int fotoID) {
        this.nome = nome;
        this.curso = curso;
        this.fotoID = fotoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFotoID() {
        return fotoID;
    }

    public void setFotoID(int fotoID) {
        this.fotoID = fotoID;
    }


}