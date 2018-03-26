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

/**
 * Created by Omar on 3/5/2018.
 */

public class MoassasaFragment  extends Fragment {

    @BindView(R.id.aboutmoassasa_txt)
    TextView tvAboutmoassasa;

    @BindView(R.id.aboutmoassasa_img)
    ImageView imgAboutmoassasa;

    @BindView(R.id.moassa_king_khaled_logo_img)
    ImageView imgMoassa_king_khaled_logo;

    @BindView(R.id.moassas_desc_txt)
    TextView tvMoassas_desc;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.moassasa_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
