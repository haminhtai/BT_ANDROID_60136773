package cntt61.mssv60136773.baithuchanh29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {
    EditText edtusername, edtpass, edtmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ánh xạ các biến
        edtusername = (EditText) findViewById(R.id.edtUsername);
        edtpass = (EditText) findViewById(R.id.edtPass);
        edtmail = (EditText) findViewById(R.id.edtMail);
    }
    public void loGin(View v) {
        String username = "minhtai";
        String password = "222";
        String mail = "minhtai@gmail.com";
        if (edtusername.getText().toString().equals(username) && edtpass.getText().toString().equals(password) && edtmail.getText().toString().equals(mail)){
            Toast.makeText(getApplicationContext(),"Đăng Nhập Thành Công",Toast.LENGTH_LONG).show();
            Intent iManhinhHome = new Intent(ActivityLogin.this, ActivityHome.class);
            startActivity(iManhinhHome);
        }
        else{
            Toast.makeText(getApplicationContext(),"Tài Khoản Hoặc Mật Khẩu Sai",Toast.LENGTH_LONG).show();
        }
    }
}