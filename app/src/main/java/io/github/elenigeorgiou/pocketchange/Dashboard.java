package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    private String userid;
    private String groupid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent intent = getIntent();
        userid = intent.getStringExtra("userid"); //if it's a string you stored.
        groupid = intent.getStringExtra("groupid"); //if it's a string you stored.
        if(groupid == null) {
            groupid = "0";
        }

        GroupSpace currentGS = GroupSpace.getGroupFromID(groupid);

        if(currentGS != null) {
            String currentGroupName = currentGS.getGroupName();
            TextView groupNameLabel = (TextView) findViewById(R.id.groupName);
            groupNameLabel.setText(currentGroupName);
            ArrayList<ListItem> bucketList = currentGS.getBucketList();
            ArrayAdapter<ListItem> bucketListAdapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_multiple_choice,
                    bucketList);
            ListView bucketListView = (ListView) findViewById(R.id.bucketList);
            bucketListView.setAdapter(bucketListAdapter);
        }



        View.OnClickListener addListListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //SAVE THE LIST THINGY .TODO:


                Intent intent = new Intent(Dashboard.this, ListItemAddActivity.class);
                intent.putExtra("userid", userid);
                intent.putExtra("groupid", groupid);
                startActivity(intent);

            }
        };
        FloatingActionButton addListButton = (FloatingActionButton) findViewById(R.id.fab);
        addListButton.setOnClickListener(addListListener);



        View.OnClickListener addVoteListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //SAVE THE LIST THINGY .TODO:


                Intent intent = new Intent(Dashboard.this, VotingActivity.class);
                intent.putExtra("userid", userid);
                intent.putExtra("groupid", groupid);
                startActivity(intent);

            }
        };

        Button addVoteButton = (Button) findViewById(R.id.vote);
        addVoteButton.setOnClickListener(addVoteListener);



    }

}
