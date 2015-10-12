package com.kevin.building.activity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import com.kevin.building.R;
import com.kevin.building.base.BaseActivity;

public class UserInfoActivity extends BaseActivity
{

	private Button btn_userinfo_back;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		initView();
	}

	private void initView()
	{
		titleView.setTitleText("好友信息");
		titleView.setRightBtnVisibility(View.GONE);
		btn_userinfo_back = (Button) findViewById(R.id.btn_userinfo_back);
		btn_userinfo_back.setOnClickListener(this);
	}

	@Override
	protected int getLayoutViewResID()
	{
		return R.layout.activity_user_info;
	}

	@Override
	protected void handleMsg(Message msg)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void widgetClick(View v)
	{
		switch (v.getId())
		{
			case R.id.btn_userinfo_back:

				this.finish();
				break;

			default:
				break;
		}

	}

}
