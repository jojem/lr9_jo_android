package com.example.lr9_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewAdded;
    LinearLayout linearLayout;

    List<ImageView> arrayImageViews =new ArrayList<ImageView>();
    int arrayLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.linear_layout);
    }

    public void figureOutput(){
        linearLayout.removeAllViews();
        arrayLength = arrayImageViews.size();
        for (int i=0; i<arrayLength; i++){
            linearLayout.addView(arrayImageViews.get(i));
        }
    }

    private void setDrawable(ImageView img){
        img.setImageResource(R.drawable.purple_rectangle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.rect_add:
                imageViewAdded = new ImageView(this);
                setDrawable(imageViewAdded);
                imageViewAdded.setOnCreateContextMenuListener(this);

                arrayImageViews.add(imageViewAdded);
                figureOutput();
                Toast.makeText(this, "Rectangle added", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.rect_delete:
                arrayImageViews.remove(arrayLength-1);
                figureOutput();

                Toast.makeText(this, "Rectangle deleted", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    ImageView viewSelected;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.context_menu_1, menu);

        viewSelected = (ImageView)v;
    }



    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.make_red:
                viewSelected.setImageResource(R.drawable.red_rectangle);
                Toast.makeText(this, "Red color selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.make_yellow:
                viewSelected.setImageResource(R.drawable.yellow_rectangle);
                Toast.makeText(this, "Yellow color selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.make_blue:
                viewSelected.setImageResource(R.drawable.blue_rectangle);
                Toast.makeText(this, "Yellow color selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.make_green:
                viewSelected.setImageResource(R.drawable.green_rectangle);
                Toast.makeText(this, "Yellow color selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.make_purple:
                viewSelected.setImageResource(R.drawable.purple_rectangle);
                Toast.makeText(this, "Yellow color selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}
