package ads.admob.com.admob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btnBanner, btnInterstitial;

    private static final String TAG = "MainActivity";

    private String advertisingId;
    private boolean optOutEnabled;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnBanner = (Button) findViewById(R.id.btnBanner);
        btnInterstitial = (Button) findViewById(R.id.btnInterstitial);
        btnBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Banner_ads_Activity.class);
                startActivity(intent);

            }
        });
        btnInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,INTERSTIAL_ads_Activity.class);
                startActivity(intent);
            }
        });
        new Thread(new Runnable() {
            public void run() {
                try {
                    AdvertisingIdClient.AdInfo adInfo = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
                    advertisingId = adInfo.getId();
                    optOutEnabled = adInfo.isLimitAdTrackingEnabled();

                    if(!optOutEnabled) {
                        Log.e(TAG, "advertising id is " + advertisingId);
                    } else {
                        Log.e(TAG, "User has opted not to use the advertising Id");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
