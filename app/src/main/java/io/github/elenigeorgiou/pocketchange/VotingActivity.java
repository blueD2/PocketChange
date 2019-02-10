package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class VotingActivity extends AppCompatActivity {
    private String[] options = {
            "Media", "Food", "Outdoors", "Entertainment", "Events"
    };
    ListView listview;
    String userid;
    String groupid;
    Spinner price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        Intent intent = getIntent();
        userid = intent.getStringExtra("userid"); //if it's a string you stored.
        groupid = intent.getStringExtra("groupid"); //if it's a string you stored.
        if(groupid == null) {
            groupid = "0";
        }

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
              /*  Intent intent = new Intent(VotingActivity.this, AcivityResultsPage.class);
                intent.putExtra("userid", userid);
                intent.putExtra("groupid", groupid);
                startActivity(intent); */
            }
        });

        price = (Spinner) findViewById(R.id.price);
        String[] price_items = new String[]{"Free", "$", "$$", "$$$"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, price_items);
        price.setAdapter(adapter2);

      //  price.setOnItemSelectedListener(this);


    }




}
