package com.dsm2018.playground.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dsm2018.playground.Activity.TournamentActivity;
import com.dsm2018.playground.Item.TournamentRecyclerItem;
import com.dsm2018.playground.R;

import java.util.ArrayList;

public class TournamentListRecyclerAdapter extends RecyclerView.Adapter<TournamentListRecyclerAdapter.ItemViewHolder> {
    ArrayList<TournamentRecyclerItem> mItems;

    public TournamentListRecyclerAdapter(ArrayList<TournamentRecyclerItem> items){
        mItems = items;
    }


    // 새로운 뷰 홀더 생성
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tournament_recycler,parent,false);
        return new ItemViewHolder(view);
    }


    // View 의 내용을 해당 포지션의 데이터로 바꿉니다.
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.mSports.setImageResource(mItems.get(position).getSportsT());
        holder.mTitle.setText(mItems.get(position).getTournamentTitle());
        holder.mHowLong.setText(mItems.get(position).getHowLong());
        holder.mPlace.setText(mItems.get(position).getPlace());
        holder.mPeople.setText(mItems.get(position).getPeople());
    }

    // 데이터 셋의 크기를 리턴해줍니다.
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    // 커스텀 뷰홀더
// item layout 에 존재하는 위젯들을 바인딩합니다.
    class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView mSports;
        private TextView mTitle;
        private TextView mHowLong;
        private TextView mPlace;
        private TextView mPeople;
        private TextView goingHow;
        Button join;
        int num;
        Context context2;

        public ItemViewHolder(View itemView) {
            super(itemView);
            context2 = itemView.getContext();
            mSports = itemView.findViewById(R.id.img_sports_tournamet);
            mTitle = itemView.findViewById(R.id.tv_postTitle);
            mHowLong = itemView.findViewById(R.id.tv_time);
            mPlace = itemView.findViewById(R.id.tv_place);
            mPeople = itemView.findViewById(R.id.tv_people);
            goingHow = itemView.findViewById(R.id.btn_goingHow);
            goingHow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent toTournamentGoing = new Intent(context2, TournamentActivity.class);
                    context2.getApplicationContext().startActivity(toTournamentGoing);
                }
            });
            join = itemView.findViewById(R.id.btn_enjoy);
            num = 0;
            join.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (num % 2 == 0) {
                        join.setBackgroundResource(R.color.joined);
                        join.setText("참여중");
                        mPeople.setText("20/22");
                    } else if (num % 2 == 1) {
                        join.setBackgroundResource(R.color.notJoin);
                        join.setText("참여하기");
                        mPeople.setText("19/22");
                    }
                    num++;
                }
            });
        }
    }
}