package chronos.ridims.qr_zxing;

/**
 * Created by Ridims on 19/10/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread=new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }
}
