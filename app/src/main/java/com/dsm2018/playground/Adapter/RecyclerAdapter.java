package com.dsm2018.playground.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dsm2018.playground.Item.RecyclerItem;
import com.dsm2018.playground.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
    ArrayList<RecyclerItem> mItems;

    public RecyclerAdapter(ArrayList<RecyclerItem> items){
        mItems = items;
    }


    // 새로운 뷰 홀더 생성
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        return new ItemViewHolder(view);
    }


    // View 의 내용을 해당 포지션의 데이터로 바꿉니다.
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
//        holder.mSports.setText(mItems.get(position).getSports());
        holder.mTitle.setText(mItems.get(position).getTitle());
        holder.mTime.setText(mItems.get(position).getTime());
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
        private ImageView mSports;
        private TextView mName;
        private TextView mTitle;
        private TextView mTime;
        private TextView mPlace;
        private TextView mPeople;
        public ItemViewHolder(View itemView) {
            super(itemView);
            mSports = itemView.findViewById(R.id.img_sports);
            mName = itemView.findViewById(R.id.tv_name);
            mTitle = itemView.findViewById(R.id.tv_postTitle);
            mTime = itemView.findViewById(R.id.tv_time);
            mPlace = itemView.findViewById(R.id.tv_place);
            mPeople = itemView.findViewById(R.id.tv_people);
        }
    }
}