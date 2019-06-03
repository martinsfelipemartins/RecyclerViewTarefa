package com.example.recyclerviewtarefa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtarefa.adapters.AlunoAdapter;
import com.example.recyclerviewtarefa.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    AlunoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.listaAlunosRecyclerView);
        adapter= new AlunoAdapter(listaAlunos());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private List<Aluno> listaAlunos() {
        List<Aluno> alunoList=new ArrayList<>();

alunoList.add(new Aluno("Jéssica Milena", "Mobile Android", R.drawable.monicageller ));
alunoList.add(new Aluno("Fábio Tadashi", "Mobile Android", R.drawable.srmiyagi));
alunoList.add(new Aluno("Guilherme Sartori", "Mobile Android", R.drawable.josesartori));
alunoList.add(new Aluno("Victor Caldas", "Mobile Android", R.drawable.pessoax));
alunoList.add(new Aluno("Tairo Roberto", "Mobile Android",R.drawable.tairoroberto));


return alunoList;
    }
}