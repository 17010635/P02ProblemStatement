package sg.edu.rp.c346.p02_problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvHoliday;
    private ImageView ivHoliday;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHoliday = rowView.findViewById(R.id.tvHoliday);
        ivHoliday = rowView.findViewById(R.id.ivHoliday);
        Holiday current = holidays.get(position);
        tvHoliday.setText(current.getHoliday() + "\n" + current.getDate());
        if(current.getIcon() == "new_year") {
            ivHoliday.setImageResource(R.drawable.new_year);
        }
        else if (current.getIcon() == "labour_day"){
            ivHoliday.setImageResource(R.drawable.labour_day);
        } else if (current.getIcon() == "cny_day") {
            ivHoliday.setImageResource(R.drawable.cny);
        } else if (current.getIcon() == "good_friday"){
            ivHoliday.setImageResource(R.drawable.good_friday);
        } else {
            ivHoliday.setImageResource(R.drawable.ic_launcher_background);
        }
        return rowView;
    }
}
