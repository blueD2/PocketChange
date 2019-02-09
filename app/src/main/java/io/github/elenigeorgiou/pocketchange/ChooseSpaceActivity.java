package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class ChooseSpaceActivity extends AppCompatActivity {

        private final int MAX_SPACES = 3;
        private String userid;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_choose_space);

            Intent intent = getIntent();
            userid = intent.getStringExtra("userId"); //if it's a string you stored.

            // TODO: connect to list of usersfind userID, , pick workspaces from list and display

            View.OnClickListener groupListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(ChooseSpaceActivity.this, Dashboard.class);
                    int groupNum = Integer.parseInt(view.getTag().toString());
                    intent.putExtra("groupNum", groupNum);
                    startActivity(intent);
                }
            };

            String[] groupSpaceNames = {"Group Space 1", "Group Space 2", "Turing Forever"};// //{"John","Jack",...,"Someone"}; // 20 names
            int numSpace = groupSpaceNames.length;
            Button[] buttons = new Button[numSpace];
            for (int i = 0; i < numSpace; i++) {
                Button button = new Button(this);
                button.setTag("groupspace" + (i+1));

                button.setText(groupSpaceNames[i]);
                buttons[i] = button;

                // add listener!!!
                buttons[i].setOnClickListener(groupListener);
            }

            LinearLayout layout = (LinearLayout)findViewById(R.id.chooseLinearLayout);
            for (int i = 0; i < numSpace; i++) {
                layout.addView(buttons[i]);
            }



            View.OnClickListener addGroupListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(ChooseSpaceActivity.this, AddSpaceActivity.class);
                    intent.putExtra("userId", userid);
                    startActivity(intent);

                }
            };
            FloatingActionButton addGroupButton = (FloatingActionButton) findViewById(R.id.addGroup);
            addGroupButton.setOnClickListener(addGroupListener);
        }


}
