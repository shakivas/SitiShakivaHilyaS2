package com.example.sitishakivahilyas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Foods> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodsAdapter listFoodsAdapter = new ListFoodsAdapter(list);
        rvFoods.setAdapter(listFoodsAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onCreateOptionsMenu((Menu) item);
    }

    private void showRecyclerGrid(){
        rvFoods.setLayoutManager(new GridLayoutManager(this,2));
        GridFoodsAdapter gridFoodsAdapter = new GridFoodsAdapter(list);
        rvFoods.setAdapter(gridFoodsAdapter);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_cardview:

                break;
        }
    }
}