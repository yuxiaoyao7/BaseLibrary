package com.bailiangjin.simpleim.sdk.leancloud;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.avos.avoscloud.im.v2.AVIMClient;
import com.avos.avoscloud.im.v2.AVIMException;
import com.avos.avoscloud.im.v2.callback.AVIMClientCallback;
import com.bailiangjin.simpleim.R;
import com.bailiangjin.simpleim.engine.logicutils.AccountUtils;

import cn.leancloud.chatkit.LCChatKit;

/**
 * 登陆页面
 */
public class LcLoginActivity extends AppCompatActivity {

  protected EditText nameView;
  protected Button loginButton;

  public static void start(Context context){
    Intent intent = new Intent(context,LcLoginActivity.class);
    context.startActivity(intent);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login_lc);

    nameView = (EditText) findViewById(R.id.activity_login_et_username);
    loginButton = (Button) findViewById(R.id.activity_login_btn_login);
    loginButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        onLoginClick();
      }
    });
    loginButton.callOnClick();
  }

  public void onLoginClick() {
//    String clientId = nameView.getText().toString();
    String clientId = AccountUtils.getUserName();
    if (TextUtils.isEmpty(clientId.trim())) {
      Toast.makeText(this, "不能为空", Toast.LENGTH_SHORT).show();
      return;
    }

    LCChatKit.getInstance().open(clientId, new AVIMClientCallback() {
      @Override
      public void done(AVIMClient avimClient, AVIMException e) {
        if (null == e) {
          finish();
          Intent intent = new Intent(LcLoginActivity.this, LcMainActivity.class);
          startActivity(intent);
        } else {
          Toast.makeText(LcLoginActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
        }
      }
    });
  }
}
