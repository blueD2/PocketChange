package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddSpaceActivity extends AppCompatActivity {
    private String userid;
    private EditText groupName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_space);
        Intent intent = getIntent();
        userid = intent.getStringExtra("userid"); //if it's a string you stored.


        groupName = (EditText) findViewById(R.id.groupName);
        Button saveButton = (Button)findViewById(R.id.saveGroup);

        View.OnClickListener saveGroupListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // SEND DATA HERE TODO:
                //create new Group with groupname
                String newGroupName = groupName.getText().toString();
                ///
                Intent intent = new Intent(AddSpaceActivity.this, ChooseSpaceActivity.class);
                intent.putExtra("userid", userid);
                startActivity(intent);

            }
        };


        saveButton.setOnClickListener(saveGroupListener);
    }
}
