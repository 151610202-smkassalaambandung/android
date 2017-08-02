package assalaam.relativelayoutsederhana.id.relativelayoutsederhana;

import java.text.DateFormat;
import java.util.Calendar;

import android.support.v7.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class picker extends AppCompatActivity implements OnClickListener {
    DateFormat fmtDateAndTime =
            DateFormat.getDateTimeInstance();
    TextView dateAndTimeLabel;
    Calendar dateAndTime = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d =
            new DatePickerDialog.OnDateSetListener(){
                public void onDateSet(DatePicker view, int year, int month, int day) {

                    dateAndTime.set(Calendar.YEAR, year);
                    dateAndTime.set(Calendar.MONTH, month);
                    dateAndTime.set(Calendar.DAY_OF_MONTH, day);
                    updateLabel();
                }
            };
    TimePickerDialog.OnTimeSetListener t =
            new TimePickerDialog.OnTimeSetListener() {
                public void onTimeSet(TimePicker view, int jam, int menit){
                    dateAndTime.set(Calendar.HOUR_OF_DAY, jam);
                    dateAndTime.set(Calendar.MINUTE, menit);
                    updateLabel();
                }
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        Button dayBtn=(Button) findViewById(R.id.dayBtn);
        dayBtn.setOnClickListener(this);
        Button timeBtn = (Button) findViewById(R.id.timeBtn);
        timeBtn.setOnClickListener(this);
        dateAndTimeLabel = (TextView)
                findViewById(R.id.dateAndTime);
        updateLabel();
    }
    public  void onClick(View v) {
        switch (v.getId()) {
            case R.id.dayBtn:
                settingTanggal();
                break;
            case R.id.timeBtn:
                setJam();
                break;
        }
    }
    private void updateLabel() {
        dateAndTimeLabel.setText(
                fmtDateAndTime.format(dateAndTime.getTime()));

    }
    private void settingTanggal() {
        new DatePickerDialog(picker.this, d,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH)).show();

    }
    private void setJam() {
        new TimePickerDialog(picker.this, t,
                dateAndTime.get(Calendar.HOUR_OF_DAY),
                dateAndTime.get(Calendar.MINUTE), true).show();

    }
}
