package com.dsm2018.playground.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dsm2018.playground.Adapter.RecyclerAdapter;
import com.dsm2018.playground.Item.RecyclerItem;
import com.dsm2018.playground.R;

import java.util.ArrayList;

public class PostFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<RecyclerItem> arrayList = new ArrayList<>();

    public PostFragment()
    {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_post, container, false);
        mRecyclerView = view.findViewById(R.id.post_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(0);
        mAdapter = new RecyclerAdapter(arrayList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }
    private void initDataset() {
        //for Test
        arrayList = new ArrayList<>();
        arrayList.add(new RecyclerItem((R.drawable.ic_basketball), "이주용", "키 크고 싶은 사람?", "5:50 ~ 6:40", "청죽관", "1/12"));
        arrayList.add(new RecyclerItem((R.drawable.ic_baseball), "김영찬", "야구할 파티원 구함", "6:00 ~ 6:30", "운동장", "7/8"));
        arrayList.add(new RecyclerItem((R.drawable.ic_pingpong), "황신우", "나루토처럼 놀아볼 사람 구함", "12:00 ~ 12:30", "탁구장", "1/5"));
        arrayList.add(new RecyclerItem((R.drawable.ic_soccer), "문준협", "축구할 솨람~~", "6:10 ~ 6:40", "운동장", "18/22"));
        arrayList.add(new RecyclerItem((R.drawable.ic_esports), "홍순찬", "롤 할 사람?", "12:00 ~ 12:30", "새롬홀", "3/5"));
    }

}
