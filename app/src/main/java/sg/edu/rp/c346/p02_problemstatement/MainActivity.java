package sg.edu.rp.c346.p02_problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvHolidays;
    ArrayList<String> typesOfHoliday;
    ArrayAdapter<String> aaHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHolidays = findViewById(R.id.lvHolidays);

        typesOfHoliday = new ArrayList<>();
        typesOfHoliday.add("Secular");

        aaHoliday = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,typesOfHoliday);
        lvHolidays.setAdapter(aaHoliday);

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("selected", i+1);
                startActivity(intent);
            }
        });


    }
}
