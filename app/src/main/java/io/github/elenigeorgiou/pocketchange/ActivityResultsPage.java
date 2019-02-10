package io.github.elenigeorgiou.pocketchange;

import java.util.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityResultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        Intent intent = getIntent();
//        int price = intent.getIntExtra("price", 0);
//        HashSet<Integer> categories = (HashSet<Integer>) intent.getSerializableExtra("categories");
//        String groupid = intent.getStringExtra("groupid");

//        GroupSpace currentGS = GroupSpace.getGroupFromID(groupid);
//        if (currentGS != null) {
//            ArrayList<ListItem> filteredList = currentGS.generateList(price, categories);
//            //now, display that list
//            ArrayAdapter<ListItem> filteredListAdapter = new ArrayAdapter(null,
//                    android.R.layout.simple_list_item_multiple_choice,
//                    filteredList);
//            ListView filteredListView = (ListView) findViewById(R.id.filteredList);
//            filteredListView.setAdapter(filteredListAdapter);
//        }
    }
}
