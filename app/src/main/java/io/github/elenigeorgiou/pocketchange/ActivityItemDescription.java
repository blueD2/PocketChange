package io.github.elenigeorgiou.pocketchange;

import java.util.HashMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ActivityItemDescription extends AppCompatActivity {

    private TextView itemName;
    private TextView price;
    private TextView category;
    private TextView description;
    private TextView url;
    private TextView expirationDate;
    private TextView location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);

        itemName = (TextView)findViewById(R.id.itemName);
        price = (TextView)findViewById(R.id.price);
        category = (TextView)findViewById(R.id.category);
        description = (TextView)findViewById(R.id.description);
        url = (TextView)findViewById(R.id.url);
        expirationDate = (TextView)findViewById(R.id.expirationDate);
        location = (TextView)findViewById(R.id.location);

        Intent intent = getIntent();
        ListItem item = (ListItem)intent.getSerializableExtra("itemClicked");

        itemName.setText(item.getName());

        HashMap<Integer,String> dollars = new HashMap<Integer,String>();
        dollars.put(0,"FREE");
        dollars.put(1,"$");
        dollars.put(2,"$$");
        dollars.put(3,"$$$");

        price.setText(dollars.get(item.getPrice()));

        HashMap<Integer,String> categories = new HashMap<Integer,String>();
        categories.put(0,"Other");
        categories.put(1,"Food");
        categories.put(2,"Media");
        categories.put(3,"Outdoors");

        category.setText(categories.get(item.getCategory()));
        description.setText(item.getDescription());
        url.setText(item.getUrl().toString());
        expirationDate.setText(item.getExpireDate().toString());
        location.setText(item.getLocation());

    }
}
