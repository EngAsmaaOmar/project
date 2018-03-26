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
 * Created by Omar on 3/5/2018.
 */

public class MarkazFragment  extends Fragment {

    @BindView(R.id.aboutmarkaz_txt)
    TextView tvAboutmarkaz;

    @BindView (R.id.aboutmarkaz_img)
    ImageView imgAboutmarkaz;

    @BindView(R.id.aboutmarkaz_desc_txt)
    TextView tvAboutmarkaz_des;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.markaz_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
