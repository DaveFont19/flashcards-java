package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlashcardAdapter extends RecyclerView.Adapter<FlashcardAdapter.FlashcardViewHolder>{
    private final List<Flashcard> flashcards;

    public FlashcardAdapter(List<Flashcard> flashcards){
        this.flashcards = flashcards;
    }

    @NonNull
    @Override
    public FlashcardViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flashcard, parent, false);
        return new FlashcardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlashcardViewHolder holder, int position){
        Flashcard card = flashcards.get(position);
        holder.tvQuestion.setText(card.getQuestion());

        holder.itemView.setOnClickListener(v ->{
            Intent intent = new Intent(v.getContext(), StudyActivity.class);
            intent.putExtra("position", position);
            v.getContext().startActivity(intent);
        });
    }
    @Override
    public int getItemCount(){
        return flashcards.size();
    }

    static class FlashcardViewHolder extends RecyclerView.ViewHolder{
        TextView tvQuestion;

        FlashcardViewHolder(@NonNull View itemView){
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tvQuestion);
        }
    }
}
