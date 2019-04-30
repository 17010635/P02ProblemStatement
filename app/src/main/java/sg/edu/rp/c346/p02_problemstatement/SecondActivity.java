package sg.edu.rp.c346.p02_problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lvholiday;
    TextView tvType;
    ArrayList<Holiday> alHoliday;
    ArrayAdapter<Holiday> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvholiday = findViewById(R.id.lvholidays);
        tvType = findViewById(R.id.textViewtype);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected", 0);

        alHoliday = new ArrayList<Holiday>();

        if (selected == 1) {
            tvType.setText("Secular");
            alHoliday.add(new Holiday("New Year's Day", "1 Jan 2017", "new_year"));
            alHoliday.add(new Holiday("Labour Day", "1 May 2017" ,"labour_day"));

            aa = new HolidayAdapter(this, R.layout.row, alHoliday);
            lvholiday.setAdapter(aa);

            lvholiday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selected = alHoliday.get(position);
                    Toast.makeText(SecondActivity.this, selected.getHoliday()+ " Date " + selected.getDate(), Toast.LENGTH_LONG).show();
                    
                }
            });

        } else if (selected == 2) {

            tvType.setText("Ethnic & Religion");
            alHoliday.add(new Holiday("Chinese New Year", "28-29 Jan 2017" ,"cny_day"));
            alHoliday.add(new Holiday("Good Friday", "14 April 2017" ,"good_friday"));

            aa = new HolidayAdapter(this, R.layout.row, alHoliday);
            lvholiday.setAdapter(aa);

            lvholiday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selected = alHoliday.get(position);
                    Toast.makeText(SecondActivity.this, selected.getHoliday()+ " Date " + selected.getDate(), Toast.LENGTH_LONG).show();

                }
            });
        }
    }
}
