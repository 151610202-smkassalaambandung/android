package assalaam.relativelayoutsederhana.id.relativelayoutsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button linear = (Button) findViewById(R.id.button);
        linear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),LinearLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button relative = (Button) findViewById(R.id.button2);
        relative.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button auto = (Button) findViewById(R.id.button3);
        auto.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button dialog = (Button) findViewById(R.id.button4);
        dialog.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button picker = (Button) findViewById(R.id.button5);
        picker.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),picker.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button radio = (Button) findViewById(R.id.button6);
        radio.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),RadioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button list = (Button) findViewById(R.id.button7);
        list.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),seleksi.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button gambar = (Button) findViewById(R.id.button8);
        gambar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),GambarAndroid.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button tabel = (Button) findViewById(R.id.button9);
        tabel.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),LayoutTabel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button check = (Button) findViewById(R.id.button10);
        check.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button audio = (Button) findViewById(R.id.button11);
        audio.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),playingaudio.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button call = (Button) findViewById(R.id.button12);
        call.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),memanggilactivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

}
