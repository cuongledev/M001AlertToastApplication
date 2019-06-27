package com.hstc.lengoccuong.m001alerttoastapplication;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast extends Toast {
    private Context mContext;
    private ImageView ivIcon;
    private TextView tvContent;

    public MyToast(Context context) {
        super(context);
        mContext = context;
        
        initViews();
    }

    private void initViews() {
        setDuration(Toast.LENGTH_LONG);
        setGravity(Gravity.TOP | Gravity.RIGHT ,0,0);
        View view = View.inflate(mContext,R.layout.item_toast,null);
        ivIcon = (ImageView) view.findViewById(R.id.iv_icon);
        tvContent = (TextView) view.findViewById(R.id.tv_content);
        setView(view);

    }


}
