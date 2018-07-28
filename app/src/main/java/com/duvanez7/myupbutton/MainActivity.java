package com.duvanez7.myupbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageReciver> imageReciverArray;
    RecyclerView recyclerfotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //support toolbar
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerfotos = findViewById(R.id.rvfoto);

        GridLayoutManager glm = new GridLayoutManager(this,2);

        recyclerfotos.setLayoutManager(glm);

        /*
        recyclerfotos.setLayoutManager(new LinearLayoutManager(this));
        */
        llenarFotos();
        startAdaptador();


    }

    private void startAdaptador() {
        ImageAdapter adapter = new ImageAdapter(imageReciverArray,this);
        recyclerfotos.setAdapter(adapter);

    }

    private void llenarFotos() {
        imageReciverArray = new ArrayList<>();
        imageReciverArray.add(new ImageReciver(R.drawable.closely, "Close"));
        imageReciverArray.add(new ImageReciver(R.drawable.eye, "Eye"));
        imageReciverArray.add(new ImageReciver(R.drawable.face_dark_forest_tattoo_on_shoulder_510x510, "Forest"));
        imageReciverArray.add(new ImageReciver(R.drawable.gon, "Gon"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
                return true;


            case R.id.item3:
                Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
                return true;


        }
        return super.onOptionsItemSelected(item);

    }

    public void favoritos(View v) {
        Intent intent = new Intent(this, Favoritos.class);
        startActivity(intent);

    }

}
