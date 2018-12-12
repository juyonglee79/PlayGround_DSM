package com.dsm2018.playground.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dsm2018.playground.Activity.LeagueActivity;
import com.dsm2018.playground.Activity.TournamentActivity;
import com.dsm2018.playground.Activity.TournamentListActivity;
import com.dsm2018.playground.R;

public class TournamentFragment extends Fragment {
    TextView applyT, goingT;
    TextView applyL, goingL;

    public TournamentFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = (View) inflater.inflate(R.layout.fragment_tournament, container, false);
        goingT = view.findViewById(R.id.btn_goingTournament);
        goingT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTournamentList = new Intent(getActivity(), TournamentListActivity.class);
                startActivity(toTournamentList);
            }
        });
        applyT = view.findViewById(R.id.btn_apply_tournament);
        applyT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        goingL = view.findViewById(R.id.btn_goingLeague);
        goingL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLeage = new Intent(getActivity(), LeagueActivity.class);
                startActivity(toLeage);
            }
        });
        applyL = view.findViewById(R.id.btn_apply_league);
        applyL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}
