package assalaam.relativelayoutsederhana.id.relativelayoutsederhana;

import java.io.IOException;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class playingaudio extends AppCompatActivity {
    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;
    Button btnPause;
    Button btnStop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingaudio);
        keterangan = (TextView) findViewById(R.id.ket);
        keterangan.setText("Silahkan klik tombol play");
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        mainkan = (ImageButton) findViewById(R.id.putarMusik);
        stateAwal();
        mainkan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mainkan.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
                keterangan.setText("Tombol play tidak aktif");
                go();

            }
        });
    btnPause.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View arg0) {
            pause();
        }
    });
        btnStop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stop();



            }
        });
    }
    public void stateAwal(){
        mainkan.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }
        public void go(){
        mp=MediaPlayer.create(playingaudio.this, R.raw.pp);
        try {
            mp.prepare();
        } catch (IllegalStateException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                mainkan.setEnabled(true);
                keterangan.setText("Silahkan klik tombol play");
            }
        });
    }
    public void pause(){
        if (mp.isPlaying()){
            if(mp!=null){
                mp.pause();
            }
        }else{
            if(mp!=null){
                mp.start();
            }
        }
    }
    public void stop(){
        mp.stop();
        try {
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable e) {
            e.printStackTrace();
        }
        stateAwal();
    }
}
