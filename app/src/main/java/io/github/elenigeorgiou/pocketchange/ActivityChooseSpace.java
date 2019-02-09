package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;


public class ActivityChooseSpace extends AppCompatActivity {
    private final int MAX_SPACES = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_space);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID"); //if it's a string you stored.

        // TODO: connect to list of usersfind userID, , pick workspaces from list and display

        String[] groupSpaceNames = {"Group Space 1", "Group Space 2", "Turing Forever"};// //{"John","Jack",...,"Someone"}; // 20 names
        int numSpace = groupSpaceNames.length;
        Button[] buttons = new Button[numSpace];
        for (int i = 0; i < numSpace; i++) {
            Button button = new Button(this);
            button.setTag("groupspace" + (i+1));

            button.setText(groupSpaceNames[i]);
            buttons[i] = button;
        }

        LinearLayout layout = (LinearLayout)findViewById(R.id.chooseLinearLayout);
        for (int i = 0; i < numSpace; i++) {
            layout.addView(buttons[i]);
        }


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
