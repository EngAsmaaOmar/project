package com.omar.etisaqe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
 * Created by Omar on 3/6/2018.
 */

public class AboutApplicationFragment extends Fragment {

    @BindView(R.id.about_application_txt)
    TextView tvAbout_application;

    @OnClick(R.id.btn_close)
    void btn_closeclick() {}

    @BindView(R.id.logo_app_img)
    ImageView imglogo_app;

    @BindView(R.id.esdar_txt)
    TextView tvEsdar;

    @BindView(R.id.esdar_data_txt)
    TextView tvEsdar_data;

    @BindView(R.id.appDesc_frtxt)
    TextView tvFristappDesc;

    @BindView(R.id.appDesc_sctxt)
    TextView tvSecondappDesc;

    @BindView(R.id.about_ittisaq_logo2_img)
    ImageView imgAbout_ittisaq_logo2;

    @BindView(R.id.about_king_khaled_logo1_img)
    ImageView imgAbout_king_khaled_logo1;

    @BindView(R.id.rules_txt)
    TextView tvRules;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_application_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
