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
        menu.add(1, 1, 0, "Blue");
        menu.add(1, 2, 2, "Green");
        menu.add(1, 3, 1, "Red");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, "Blue color selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.BLUE);
                return true;
            case 2:
                Toast.makeText(this, "Green color selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.GREEN);
                return true;
            case 3:
                Toast.makeText(this, "Red color selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.RED);
                return true;
            case R.id.menu_1:
                Toast.makeText(this, "Item 1 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.YELLOW);
                return true;
            case R.id.menu_2:
                Toast.makeText(this, "Item 2 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.rgb(25,176,150));
                return true;
            case R.id.menu_3:
                Toast.makeText(this, "Item 3 selected",
                        Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.text)).setTextColor(Color.rgb(200, 40, 50));
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}
