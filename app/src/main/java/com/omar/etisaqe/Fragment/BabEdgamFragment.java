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
 * Created by Omar on 3/7/2018.
 */

public class BabEdgamFragment extends Fragment {

    @BindView(R.id.bab_edgam_txt)
    TextView tvbab_edgam;

    @BindView(R.id.img_main_menu_back)
    ImageView img_main_menu_back;

    @BindView(R.id.bab_egzam_desc_text)
    TextView tvbab_edgamDesc;


    @OnClick(R.id.card_eshmal)
    void card_eshmalclick() {}

    @OnClick(R.id.card_edgam_elnon)
    void card_edgam_elnonclick() {}

    @OnClick(R.id.card_kafaa_elnoon)
    void card_kafaa_elnoonclick() {}

    @OnClick(R.id.card_edgam_elnon_tanween)
    void card_edgam_elnon_tanweenclick() {}







    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bab_edgam_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


}
