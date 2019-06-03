package com.example.recyclerviewtarefa.adapters;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewtarefa.R;
import com.example.recyclerviewtarefa.model.Aluno;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {

    public AlunoAdapter(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    private List<Aluno> listaAlunos;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_lista_alunos, viewGroup, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Aluno aluno = listaAlunos.get(i);
        viewHolder.bind(aluno);
    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomeAluno;
        TextView cursoAluno;
        ImageView fotoAluno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeAluno = itemView.findViewById(R.id.textNome);
            cursoAluno = itemView.findViewById(R.id.textCurso);
            fotoAluno = itemView.findViewById(R.id.circleImageView);

        }

        public void bind(Aluno aluno) {
            nomeAluno.setText(aluno.getNome());
            cursoAluno.setText(aluno.getCurso());
            fotoAluno.setImageResource(aluno.getFotoID());

        }
    }
}
