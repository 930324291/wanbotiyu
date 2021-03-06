package com.wj.baseutils.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wj.base.base.SimpleActivity;
import com.wj.base.utils.NumAnim;
import com.wj.base.utils.StatusBarUtil;
import com.wj.base.views.TitleBar;
import com.wj.baseutils.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyBalanceActivity extends SimpleActivity {

    @BindView(R.id.lay_title)
    TitleBar layTitle;
    @BindView(R.id.tv_balance)
    TextView tvBalance;

    public static void show(Context context) {
        Intent intent = new Intent(context, MyBalanceActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void initViewAndEvent(Bundle savedInstanceState) {
        layTitle.setBackButton(v -> {
            finish();
        });
        layTitle.setTitle("我的余额");
        NumAnim.startAnim(tvBalance, 0f, 500);
    }

    @Override
    protected int getLayoutId() {
//        StatusBarUtil.setColor(this, getResources().getColor(R.color.white));
        return R.layout.activity_my_balance;
    }


}
