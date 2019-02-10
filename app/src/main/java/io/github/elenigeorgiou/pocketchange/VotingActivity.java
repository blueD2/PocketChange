package io.github.elenigeorgiou.pocketchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class VotingActivity extends AppCompatActivity {
    private String[] options = {
            "Media", "Food", "Outdoors", "Entertainment", "Events"
    };
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);


        Button vote = (Button) findViewById(R.id.voteButton);

        listview = findViewById(R.id.list);
        listview.setChoiceMode(listview.CHOICE_MODE_MULTIPLE);


        listview.setTextFilterEnabled(true);

        listview.setAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_checked,options));

        listview.getCheckedItemPositions();

        vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ArrayList<Boolean> checked = listview.getCheckedItemPositions();
            }
        });

    }


}
