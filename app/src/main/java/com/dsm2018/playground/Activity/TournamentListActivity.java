package com.dsm2018.playground.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.dsm2018.playground.Adapter.TournamentListRecyclerAdapter;
import com.dsm2018.playground.Item.TournamentRecyclerItem;
import com.dsm2018.playground.R;

import java.util.ArrayList;

public class TournamentListActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    TextView howGoing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournamentlist);

        mRecyclerView = findViewById(R.id.tournamentlist);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<TournamentRecyclerItem> ArrayList = new ArrayList<>();
        ArrayList.add(new TournamentRecyclerItem((R.drawable.ic_soccer),"희명's 축구리그","12/20 ~ 12/30","운동장", "19/22"));
        ArrayList.add(new TournamentRecyclerItem((R.drawable.ic_pingpong),"성욱배 탁구대회", "12/10 ~ 12/20","탁구장", "4/4"));
        ArrayList.add(new TournamentRecyclerItem((R.drawable.ic_baseball),"영찬 배 통통 야구", "12/27 ~ 12/13","운동장", "6/20"));

        TournamentListRecyclerAdapter Adapter = new TournamentListRecyclerAdapter(ArrayList);

        mRecyclerView.setAdapter(Adapter);

    }
}
