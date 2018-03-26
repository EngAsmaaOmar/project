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
 * Created by Omar on 3/4/2018.
 */

public class AboutUsFragment extends android.support.v4.app.Fragment
{


    @BindView(R.id.ourInf_img)
    ImageView img_ourInformation;

    @OnClick(R.id.card_moassasa)
    void card_moassasaClick() {}

    @OnClick(R.id.card_markaz)
    void card_markazClick() {}

    @OnClick(R.id.card_aboutmaqraa)
    void card_aboutmaqraaClick() {}

    @OnClick(R.id.card_taaseel)
    void card_taaseelClick() {}

    @OnClick(R.id.card_AboutApp)
    void card_AboutAppClick() {}


    @OnClick(R.id.card_contactus)
    void card_contactusClick() {}


  /*  @OnClick(R.id.card_aboutusclick)
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
    TextView tv_aboutusclick;   */


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutus_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
