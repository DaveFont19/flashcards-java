package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class StudyActivity extends AppCompatActivity {

    private List<Flashcard> flashcards;
    private int currentIndex;
    private boolean showingAnswer = false;

    private TextView tvCardText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        flashcards = FlashcardData.getSampleFlashcards();
        currentIndex = getIntent().getIntExtra("position", 0);

        tvCardText = findViewById(R.id.tvCardText);
        Button btnPrevious = findViewById(R.id.btnPrevious);
        Button btnNext = findViewById(R.id.btnNext);

        updateCardText();

        tvCardText.setOnClickListener(v -> {
            showingAnswer = !showingAnswer;
            updateCardText();
        });

        btnNext.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % flashcards.size();
            showingAnswer = false;
            updateCardText();
        });

        btnPrevious.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + flashcards.size()) % flashcards.size();
            showingAnswer = false;
            updateCardText();
        });
    }

    private void updateCardText() {
        Flashcard card = flashcards.get(currentIndex);
        tvCardText.setText(showingAnswer ? card.getAnswer() : card.getQuestion());
    }
}