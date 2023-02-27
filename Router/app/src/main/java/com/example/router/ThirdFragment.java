package com.example.router;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Routes> routesArrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.thrid_fragment, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        recyclerView = view.findViewById(R.id.recyclerview2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        MyAdapter myAdapter = new MyAdapter(getContext(), routesArrayList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialize(){

        routesArrayList = new ArrayList<>();

        String[] type = new String[]{
                getString(R.string.type1),
                getString(R.string.type2),
                getString(R.string.type3),
                getString(R.string.type4),
                getString(R.string.type5),
                getString(R.string.type6),
                getString(R.string.type7),
                getString(R.string.type8)
        };

        String[] start = new String[]{
                getString(R.string.s1),
                getString(R.string.s2),
                getString(R.string.s3),
                getString(R.string.s4),
                getString(R.string.s5),
                getString(R.string.s6),
                getString(R.string.s7),
                getString(R.string.s8),

        };

        String[] end = new String[]{
                getString(R.string.e1),
                getString(R.string.e2),
                getString(R.string.e3),
                getString(R.string.e4),
                getString(R.string.e5),
                getString(R.string.e6),
                getString(R.string.e7),
                getString(R.string.e8),

        };

        String[] time = new String[]{
                getString(R.string.t1),
                getString(R.string.t2),
                getString(R.string.t3),
                getString(R.string.t4),
                getString(R.string.t5),
                getString(R.string.t6),
                getString(R.string.t7),
                getString(R.string.t8),

        };

        for (int i = 0; i < type.length; i++){
            Routes route = new Routes(type[i], start[i], end[i], time[i]);
            routesArrayList.add(route);
        }
    }


}
