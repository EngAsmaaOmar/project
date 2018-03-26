package com.omar.etisaqe.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omar.etisaqe.Activity.MainActivity;
import com.omar.etisaqe.Activity.SplashActivity;
import com.omar.etisaqe.R;

import butterknife.ButterKnife;

/**
 * Created by Omar on 3/1/2018.
 */

public class FristUserHelperFragment extends Fragment {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fristuser_helper_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
