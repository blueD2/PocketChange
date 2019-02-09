package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ListItemAddActivity extends AppCompatActivity {
    private String groupid, userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_add);

        Intent intent = getIntent();
        userid = intent.getStringExtra("userid"); //if it's a string you stored.
        groupid = intent.getStringExtra("groupid");

        EditText name = (EditText) findViewById(R.id.listName);
        EditText desc = (EditText) findViewById(R.id.listDescription);
        EditText date = (EditText) findViewById(R.id.listDescription);
        EditText url = (EditText) findViewById(R.id.listUrl);
        EditText price = (EditText) findViewById(R.id.listPrice);
        Spinner category = (Spinner) findViewById(R.id.listCategories);


        String[] items = new String[]{"Food", "Entertainment", "Outdoors", "Event", "Media"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        category.setAdapter(adapter);



        Button saveButton = (Button)findViewById(R.id.saveItem);

        View.OnClickListener saveGroupListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                         //TODO ADD LIST

                        Intent intent = new Intent(ListItemAddActivity.this, Dashboard.class);
                        intent.putExtra("userId", userid);
                        intent.putExtra("groupId", groupid);
                        startActivity(intent);

            }
        };


        saveButton.setOnClickListener(saveGroupListener);



    }
}
