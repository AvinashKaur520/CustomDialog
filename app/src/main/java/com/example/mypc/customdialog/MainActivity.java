package com.example.mypc.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setCancelable(false);

        e1= (EditText) dialog.findViewById(R.id.user);
        e2= (EditText) dialog.findViewById(R.id.pass);
        btn= (Button) dialog.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String name = e1.getText().toString();
                String password = e2.getText().toString();

                if(name.equals("Jadu") && password.equals("12345"))
                {
                    dialog.dismiss();
                    Toast.makeText(MainActivity.this,"Hello Mr. Jadu",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    e1.setText("");
                    e2.setText("");
                    Toast.makeText(MainActivity.this,"Go to home",Toast.LENGTH_SHORT).show();
                }

            }
        });

        dialog.show();

    }
}
