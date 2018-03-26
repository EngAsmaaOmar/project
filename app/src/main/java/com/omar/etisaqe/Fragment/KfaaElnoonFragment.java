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

public class KfaaElnoonFragment extends Fragment {


    @BindView(R.id.kfaa_noon_elgeen_txt)
    TextView tvkfaa_noon_elgeen;

    @BindView(R.id.main_menu_back)
    ImageView Imgmain_menu_back;

    @BindView(R.id.bab_egzam_txt)
    TextView tvbab_egzam;

    @OnClick(R.id.card_koof)
    void card_koofclick() {}

    @OnClick(R.id.card_gil)
    void card_gilclick() {}






    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.kfaa_elnoon, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
