package com.example.dell.artravel;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class anFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.an, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Button mapButton;

        super.onActivityCreated(savedInstanceState);
        mapButton = getActivity().findViewById(R.id.map);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            /** public void onClick(View v3) {
             startActivity(new Intent(getActivity(),loginActivity.class));
             }*/
            public void onClick(View v3) {
                startActivity(new Intent(getActivity(),map.class));
            }

        });
    }
}
