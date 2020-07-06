package com.example.moodleapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Coursesfrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Coursesfrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView recyclerView;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Coursesfrag() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
   /* public static Coursesfrag newInstance(String param1, String param2) {
        Coursesfrag fragment = new Coursesfrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/
    public static Coursesfrag newInstance() {
        Coursesfrag fragment = new Coursesfrag();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }


    private List<Course> createList(int size) {

        List<Course> result = new ArrayList<Course>();
        for (int i=1; i <= size; i++) {
            Course ci = new Course();
            ci.name = Course.NAME_PREFIX + " ";
            ci.credits = Course.CREDITS_PRIFIX + " ";
            ci.l_t_p = Course.LTP_PRIFIX + " ";

            ci.code = Course.CODE_PRIFIX +" ";

            result.add(ci);

        }

        return result;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coursesfrag, container, false);

        recyclerView = view.findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        CourseAdapter ca = new CourseAdapter(createList(10));
        recyclerView.setAdapter(ca);

        //recyclerView.setAdapter(new CourseAdapter(10));

        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Courses");
    }
}