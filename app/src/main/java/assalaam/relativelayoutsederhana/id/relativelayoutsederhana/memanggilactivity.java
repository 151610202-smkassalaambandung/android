package assalaam.relativelayoutsederhana.id.relativelayoutsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class memanggilactivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memanggilactivity);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(),main2.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
