package com.omar.etisaqe.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Omar on 2/28/2018.
 */

public class QraatFragment extends Fragment {

    @BindView(R.id.qraattitle_txt)
    TextView tvqraattitle;


    @OnClick(R.id.imgbtn_settings)
    void btn_setting() {}

    @OnClick(R.id.card_edgam)
    void card_edgamclick() {}


    @OnClick(R.id.card_takfeef_hamz)
    void card_takfeef_hamzclick() {}



    @OnClick(R.id.card_waaf_hamz)
    void card_waaf_hamzclick() {}



    @OnClick(R.id.card_fath)
    void card_fathclick() {}



    @OnClick(R.id.card_letters)
    void card_lettersclick() {}




    @OnClick(R.id.card_aboutusclick)
    void card_aboutusclick() {

    }



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
        View view = inflater.inflate(R.layout.qraat_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
