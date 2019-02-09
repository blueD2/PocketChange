package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        GroupSpace currentGS = null
        ArrayList<ListItem> bucketList = currentGS.getBucketList();
        ArrayAdapter<ListItem> bucketListAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_multiple_choice,
                bucketList);
    }
}
