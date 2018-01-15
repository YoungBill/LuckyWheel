package com.example.bigwheeldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private LuckyView mLuckyPanView;
    private ImageView mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLuckyPanView = (LuckyView) findViewById(R.id.id_luckypan);
        mStartBtn = (ImageView) findViewById(R.id.id_start_btn);

        mStartBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!mLuckyPanView.isStart())
                {
                    mStartBtn.setImageResource(R.drawable.stop);
                    mLuckyPanView.luckyStart(1);
                } else
                {
                    if (!mLuckyPanView.isShouldEnd())

                    {
                        mStartBtn.setImageResource(R.drawable.start);
                        mLuckyPanView.luckyEnd();
                    }
                }
            }
        });
    }
}
