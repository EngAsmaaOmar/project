package com.omar.etisaqe.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Omar on 3/1/2018.
 */

public class SecondUserHelperFragment extends Fragment {


    @BindView(R.id.help_scr2_txt)
    TextView tvHelp_scr2;

    @BindView(R.id.help_scr2_img)
    ImageView imgHelp_scr2;

    @OnClick(R.id.btn_close)
    void btn_close(){}


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.seconduser_helper_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
