package com.example.apurva.customdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Dialog dialog=new Dialog(this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.custom_dialog_layout);
        dialog.show();


        user=dialog.findViewById(R.id.user);
        password=dialog.findViewById(R.id.password);
        login=dialog.findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals("apurva") && password.getText().toString().equals("123")){
                    dialog.dismiss();
                }
                else {
                    AlertDialog.Builder alertdialog=new AlertDialog.Builder(MainActivity.this);
                    alertdialog.setMessage("Password is wrong please try again");

                    alertdialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    alertdialog.show();
                }

            }
        });

    }
}
