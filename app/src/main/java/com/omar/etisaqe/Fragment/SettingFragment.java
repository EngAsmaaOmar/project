package com.omar.etisaqe.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Omar on 3/4/2018.
 */

public class SettingFragment extends Fragment {

    Button btn_close  , btn_deletvideo ;


    @BindView(R.id.setting_txt)
    TextView tvsetting;

    @OnClick(R.id.card_savevideo)
    void card_savevideoClick() {}

    @OnClick(R.id.card_userHelper)
    void card_userHelperClick() {}




    public static AboutProjectFragment newInstance(int type) {
        AboutProjectFragment firstFragment = new AboutProjectFragment();
        Bundle args = new Bundle();
        args.putInt("type", type);
        firstFragment.setArguments(args);
        return firstFragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

   /* public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setting_Fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }*/
}
