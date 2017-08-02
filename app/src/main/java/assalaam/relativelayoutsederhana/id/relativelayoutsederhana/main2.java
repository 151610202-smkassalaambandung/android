package assalaam.relativelayoutsederhana.id.relativelayoutsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
