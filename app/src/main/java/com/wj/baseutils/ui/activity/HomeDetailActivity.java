package com.wj.baseutils.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.wj.base.base.SimpleActivity;
import com.wj.base.views.TitleBar;
import com.wj.baseutils.R;
import com.wj.baseutils.ui.mj.MWeb;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nicai on 2019-3-19.
 */

public class HomeDetailActivity extends SimpleActivity {
    @BindView(R.id.img_mj_detail)
    ImageView imgMjDetail;
    @BindView(R.id.lay_title)
    TitleBar layTitle;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mj_detail;
    }

    @Override
    protected void initViewAndEvent(Bundle savedInstanceState) {
        String title = getIntent().getStringExtra("title");
        layTitle.setTitle(title);
        layTitle.setBackButton(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        if(TextUtils.isEmpty(title)){
            return;
        }
        if(title.equals("主队")){
            imgMjDetail.setImageResource(R.mipmap.ic_fangan);
            imgMjDetail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(HomeDetailActivity.this, MWeb.class);
                    intent.putExtra("url", "https://m.allwin368.com/scheme.html?id=14656&sport_type=1&bmapp=1");
                    startActivity(intent);
                }
            });
        }else if(title.equals("世界播")){
            imgMjDetail.setImageResource(R.mipmap.ic_shijiebo);
            imgMjDetail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(HomeDetailActivity.this, MWeb.class);
                    intent.putExtra("url", "https://m.allwin368.com/recommend/index/?id=163726&type=3&sport_type=1&bmapp=1");
                    startActivity(intent);
                }
            });
        }else if(title.equals("比分")){
            imgMjDetail.setImageResource(R.mipmap.ic_bifen_a);
            imgMjDetail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(HomeDetailActivity.this, MWeb.class);
                    intent.putExtra("url", "https://m.allwin368.com/recommend/index/?id=163868&type=3&sport_type=1&bmapp=1");
                    startActivity(intent);
                }
            });
        }else if(title.equals("出墙")){
            imgMjDetail.setImageResource(R.mipmap.ic_chuqiang);
            imgMjDetail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(HomeDetailActivity.this, MWeb.class);
                    intent.putExtra("url", "https://m.allwin368.com/recommend/index/?id=163868&type=3&sport_type=1&bmapp=1");
                    startActivity(intent);
                }
            });
        }else if(title.equals("路况")){
            imgMjDetail.setImageResource(R.mipmap.ic_lukuang);
        }else if(title.equals("邀请好友")){
            imgMjDetail.setImageResource(R.mipmap.ic_haoyou);
        }

    }

}
