package io.github.elenigeorgiou.pocketchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button  = (Button) findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseSpaceActivity.class);
                String userid = ((EditText) findViewById(R.id.email)).getText().toString();
                intent.putExtra("userid", userid);
                startActivity(intent);

            }
        });


    }
}
