package com.achach.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.achach.myapplication.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        /*showToolbar(getResources().getString(R.string.toolbar_title_createaccount),true);*/

    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}
/* aqui se manda a llamar el id del toolbar*/
 /* esta linea tiene soporte para versiones anteriores*/
  /* en caso de el titulo se obtiene el soporte*/
  /* se pasa el boton aqui*/
  /* llamar con el archivo R pero si es un string */