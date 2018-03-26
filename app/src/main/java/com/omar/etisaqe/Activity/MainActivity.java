package com.omar.etisaqe.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.omar.etisaqe.Fragment.AboutProjectFragment;
import com.omar.etisaqe.Fragment.QraatFragment;
import com.omar.etisaqe.Fragment.SettingFragment;
import com.omar.etisaqe.Fragment.SkiekhFragment;
import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

 //   @OnClick(R.id.btnimg_settings)
  //  void btn_settingClick(){}

    @BindView(R.id.ourInf_txt)
    TextView tv_ourInformation;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
      /*  toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      //  showFragment(new MainActivityFragment());
    }

    protected void showFragment(Fragment fragment) {

        String TAG = fragment.getClass().getSimpleName();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainContainer, fragment, TAG);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
    }

    protected void backstackFragment() {
       // Log.d("Stack count", getSupportFragmentManager().getBackStackEntryCount() + "");
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
        }
        getSupportFragmentManager().popBackStack();
        removeCurrentFragment();
    }

    private void removeCurrentFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment currentFrag = getSupportFragmentManager()
                  .findFragmentById(R.id.mainContainer);

        if (currentFrag != null) {
            transaction.remove(currentFrag);
        }
        transaction.commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
        }
    }

    protected void enableNavigationIcon() {

        toolbar.setNavigationIcon(R.drawable.main_menu_arrow); //we need arrow icon here ok ?
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backstackFragment();
            }
        });
    }

    protected void disableNavigationIcon() {
        toolbar.setNavigationIcon(null);
    }

    protected void setToolbarTitle(int resID) {
        toolbar.setTitle(resID);
    }*/

}
