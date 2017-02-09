package com.example.kurapma.customgridchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String[] items = new String[]{"Section 1", "Section 2", "Section 3", "Section 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid_cards = (GridView) findViewById(R.id.myGridView);
        grid_cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You just cliked: Grid View" ,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
