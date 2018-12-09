package com.dsm2018.playground.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dsm2018.playground.Activity.TournamentActivity;
import com.dsm2018.playground.R;

public class TournamentFragment extends Fragment {
    TextView tournament;
    TextView league;

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
        tournament = view.findViewById(R.id.btn_tournament);
        tournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTournament = new Intent(getActivity(), TournamentActivity.class);
            }
        });
        league = view.findViewById(R.id.btn_league);
        return view;
    }
}
