package com.example.lr9_jo_android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnCreateContextMenuListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.second:
                Toast.makeText(this, "Second item selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.home:
                Toast.makeText(this, "Home selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.context_menu_1, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_1:
                Toast.makeText(this, "Item 1 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.BLUE);
                return true;
            case R.id.menu_2:
                Toast.makeText(this, "Item 2 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.GREEN);
                return true;
            case R.id.menu_3:
                Toast.makeText(this, "Item 3 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.RED);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}
