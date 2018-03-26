package com.omar.etisaqe.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.omar.etisaqe.Fragment.AboutProjectFragment;
import com.omar.etisaqe.Fragment.FristUserHelperFragment;
import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Omar on 3/4/2018.
 */

public class SettingActivity extends AppCompatActivity {

    Button btn_close  , btn_deletvideo ;



   @OnClick(R.id.btn_close)
   void closeClick(){}

    @OnClick(R.id.deletevideo_btn)
    void deletevideoClick(){}

    @BindView(R.id.setting_txt)
    TextView tvsetting;

    @OnClick(R.id.card_savevideo)
    void card_savevideoClick() {}

    @OnClick(R.id.card_userHelper)
    void card_userHelperClick() {}




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_fragment);
    }
}
