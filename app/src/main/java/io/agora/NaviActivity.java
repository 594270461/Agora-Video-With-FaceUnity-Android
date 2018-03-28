package io.agora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.faceunity.fulivedemo.MainActivity;
import com.faceunity.fulivedemo.R;

public class NaviActivity extends Activity {

    private EditText edtChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);

        edtChannel = (EditText) findViewById(R.id.edt_channel);
    }

    public void onStartBroadcastClick(View view) {
        if (edtChannel.getText().toString().isEmpty()){
            Toast.makeText(this, "please input the channel name", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra(ConstantsBeauty.ACTION_KEY_ROOM_NAME, edtChannel.getText().toString());

        startActivity(i);
    }

}
