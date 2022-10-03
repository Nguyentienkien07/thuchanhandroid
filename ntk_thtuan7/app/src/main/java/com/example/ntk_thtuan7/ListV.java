package com.example.ntk_thtuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.app.AlertDialog;

import java.util.ArrayList;

public class ListV extends AppCompatActivity {

    ListView lvFriend;
    ArrayList<Friend> arrayFriend;
    FriendAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_v);

        ImageView imgBack= (ImageView)
                findViewById(R.id.img_back);
        imgBack.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View v) {
                                                   finish();
                                               }
                                           });


        AnhXa();
        adapter =new FriendAdapter(this, R.layout.dong_friend, arrayFriend);
        lvFriend.setAdapter(adapter);
        lvFriend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListV.this, Detail.class);
               Friend friend = arrayFriend.get(i);
                intent.putExtra("ten",friend.getTen());
                intent.putExtra("moTa",friend.getMoTa());
                intent.putExtra("hinh",friend.getHinh());
                startActivity(intent);
            }
        });


        lvFriend.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder alertDialogBuilder =new AlertDialog.Builder(ListV.this);
                alertDialogBuilder.setMessage("Bán có muốn xóa không !");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // xóa sp đang nhấn giữ
                        arrayFriend.remove(i);
                        //cập nhật lại listview
                        adapter.notifyDataSetChanged();

                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //không làm gì
                    }
                });
                alertDialogBuilder.show();

                return false;
            }
        });
    }
    private void AnhXa () {
        lvFriend = (ListView) findViewById(R.id.listviewFriend);
        arrayFriend = new ArrayList<>();
        arrayFriend.add(new Friend("Thái Trần Duy Hoàng", "07/12/2002", R.drawable.hinh2));
        arrayFriend.add(new Friend("Trần Phước Lục", "08/10/2003", R.drawable.hinh3));
        arrayFriend.add(new Friend("Trần Viết Thịnh", "06/12/2005", R.drawable.hinh4));
        arrayFriend.add(new Friend("Trần Viết Ý", "08/05/2005", R.drawable.hinh5));
        arrayFriend.add(new Friend("Trần Văn Thành", "08/09/2003", R.drawable.h6));

    }

}