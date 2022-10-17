package com.example.ntk_th_bai9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvLaptop;
    private  LaptopAdapter laptopAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvLaptop = findViewById(R.id.rcv_laptop);
        laptopAdapter =new LaptopAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvLaptop.setLayoutManager(linearLayoutManager);

        laptopAdapter.setData(getListlaptop());
        rcvLaptop.setAdapter(laptopAdapter);
    }
    private List<Laptop> getListlaptop(){
        List<Laptop> list =new ArrayList<>();
        list.add(new Laptop(R.drawable.laptop1, "Acer nitro"));
        list.add(new Laptop(R.drawable.laptop2, "Acer vivo book"));
        list.add(new Laptop(R.drawable.laptop3, "Hp game"));
        list.add(new Laptop(R.drawable.laptop4, "Asus game"));

        list.add(new Laptop(R.drawable.laptop1, "Acer nitro"));
        list.add(new Laptop(R.drawable.laptop2, "Acer vivo book"));
        list.add(new Laptop(R.drawable.laptop3, "Hp game"));
        list.add(new Laptop(R.drawable.laptop4, "Asus game"));

        list.add(new Laptop(R.drawable.laptop1, "Acer nitro"));
        list.add(new Laptop(R.drawable.laptop2, "Acer vivo book"));
        list.add(new Laptop(R.drawable.laptop3, "Hp game"));
        list.add(new Laptop(R.drawable.laptop4, "Asus game"));

        return list;
    }
}