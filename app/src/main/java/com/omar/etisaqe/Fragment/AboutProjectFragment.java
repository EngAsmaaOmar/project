package com.omar.etisaqe.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.omar.etisaqe.Activity.MainActivity;
import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Omar on 2/28/2018.
 */

public class AboutProjectFragment  extends Fragment {


    @OnClick(R.id.imgbtn_settings)
    void btn_setting() {}

    @BindView(R.id.mainproject_txt)
    TextView tvmainproject;


    @BindView(R.id.projectDescription_txt)
    TextView tvprojectDescription;

    @BindView(R.id.roaya_txt)
    TextView tvroaya;

    @BindView(R.id.roayaDescription_txt)
    TextView tvroayaDescription;

    @BindView(R.id.resalaDescription_txt)
    TextView tvresalaDescription;

    @OnClick(R.id.card_aboutusclick)
    void card_aboutusclick() {}


    @OnClick(R.id.card_projectclick)
    void card_projectclick() {}

    @OnClick(R.id.card_sheikhsclick)
    void card_sheikhsclick() {}

    @OnClick(R.id.card_tagweedclick)
    void card_tagweedclick() {}

    @OnClick(R.id.card_qraatclick)
    void card_qraatclick() {}


    @BindView(R.id.qraatclick_txt)
    TextView tv_qraatclick;

    @BindView(R.id.tagweedclick_txt)
    TextView tv_tagweedclick;

    @BindView(R.id.sheikhsclick_txt)
    TextView tv_sheikhsclick;

    @BindView(R.id.projectclick_txt)
    TextView tv_projectclick;

    @BindView(R.id.aboutusclick_txt)
    TextView tv_aboutusclick;







    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutproject_fragment, container, false);
        ButterKnife.bind(this, view);
         return view;
    }
}
