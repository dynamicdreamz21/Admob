package ads.admob.com.admob;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
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
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import ads.admob.com.admob.utils.ElaineAnimated;

import static ads.admob.com.admob.R.id.btnBanner;
import static ads.admob.com.admob.R.id.btnInterstitial;
import static ads.admob.com.admob.R.id.imgAnimation;

public class MainActivity extends Activity {
//    private Button btnBanner, btnInterstitial;
//
//    private static final String TAG = "MainActivity";
//
//    private String advertisingId;
//    private boolean optOutEnabled;

    private ImageView imgAnimation;
    private AnimationDrawable animationDrawable;
    private ElaineAnimated elaineAnimated;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_animation);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imgAnimation = (ImageView) findViewById(R.id.imgAnimation);
        imgAnimation.setBackgroundResource(R.drawable.frame_animation);
        animationDrawable = (AnimationDrawable) imgAnimation.getBackground();

        imgAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
                animationDrawable.start();
            }
        });


//        btnBanner = (Button) findViewById(btnBanner);
//        btnInterstitial = (Button) findViewById(btnInterstitial);
//        btnBanner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,Banner_ads_Activity.class);
//                startActivity(intent);
//
//            }
//        });
//        btnInterstitial.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,INTERSTIAL_ads_Activity.class);
//                startActivity(intent);
//            }
//        });
//        new Thread(new Runnable() {
//            public void run() {
//                try {
//                    AdvertisingIdClient.AdInfo adInfo = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
//                    advertisingId = adInfo.getId();
//                    optOutEnabled = adInfo.isLimitAdTrackingEnabled();
//
//                    if(!optOutEnabled) {
//                        Log.e(TAG, "advertising id is " + advertisingId);
//                    } else {
//                        Log.e(TAG, "User has opted not to use the advertising Id");
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

    }


}
