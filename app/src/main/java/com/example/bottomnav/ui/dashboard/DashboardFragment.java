package com.example.bottomnav.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnav.Kenma;
import com.example.bottomnav.KenmaAdapter;
import com.example.bottomnav.KenmaData;
import com.example.bottomnav.R;
import com.example.bottomnav.databinding.FragmentDashboardBinding;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private RecyclerView rvKenma;
    private ArrayList<Kenma> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvKenma = view.findViewById(R.id.recyclerView);
        rvKenma.setHasFixedSize(true);


        rvKenma = view.findViewById(R.id.recyclerView);
        rvKenma.setHasFixedSize(true);

        list.addAll(KenmaData.getListData());
        showRecyclerGrid();
    }

    private void showRecyclerGrid() {
        rvKenma.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        KenmaAdapter kenmaAdapter = new KenmaAdapter(list);
        rvKenma.setAdapter(kenmaAdapter);
    }
}