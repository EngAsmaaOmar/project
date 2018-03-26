package com.omar.etisaqe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.omar.etisaqe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Omar on 3/5/2018.
 */

public class CallUsFragment extends Fragment {

    @BindView(R.id.callus_txt)
    TextView tvcallus ;

   @OnClick (R.id.btn_close)
    void btn_close(){}

    @OnClick (R.id.card_facebook)
    void card_facebookClick(){}

    @OnClick (R.id.card_tweet)
    void card_tweetClick(){}

    @OnClick (R.id.card_googleplus)
    void card_googleplusClick(){}

    @OnClick (R.id.card_instgram)
    void card_instgramClick(){}

    @OnClick (R.id.card_youtube)
    void card_youtubeClick(){}

    @OnClick (R.id.card_email)
    void card_emailClick(){}

    @OnClick (R.id.card_feedback)
    void card_feedbackClick(){}




    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.callus_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
