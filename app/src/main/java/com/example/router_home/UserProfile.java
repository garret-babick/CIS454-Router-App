package com.example.router_home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UserProfile extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.user_profile, container, false);
        FragmentTransaction fr = getFragmentManager().beginTransaction();
        fr.replace(R.id.userprofile, new FirstFragment());
        fr.commit();
        Button button1 = (Button) view.findViewById(R.id.bAccount);//get id of button 1
        Button button2 = (Button) view.findViewById(R.id.bSroutes);//get id of button 2
        Button button3 = (Button) view.findViewById(R.id.bProutes);//get id of button 3
        Button button4 = (Button) view.findViewById(R.id.bComments);//get id of button 4
        Button button5 = (Button) view.findViewById(R.id.bLogOut);//get id of button log Out

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.userprofile, new FirstFragment());
                fr.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int2", 1);

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.userprofile, new SecondFragment());
                fr.commit();

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int3", 2);

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.userprofile, new ThirdFragment());
                fr.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int4", 3);

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.userprofile, new FourthFragment());
                fr.commit();
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("some_int4", 3);

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.userprofile, new FourthFragment());
                fr.commit();
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getActivity(), LogIn.class);
                startActivity(intent);
            }

        });
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}