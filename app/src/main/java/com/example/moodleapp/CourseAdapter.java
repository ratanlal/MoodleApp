package com.example.moodleapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private List<Course> contactList;

    public CourseAdapter(List<Course> contactList) {
        this.contactList = contactList;
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(CourseViewHolder courseViewHolder, int i) {
        Course ci = contactList.get(i);
        /*CourseViewHolder.vName.setText(ci.name);
        CourseViewHolder.vCredits.setText(ci.surname);
        CourseViewHolder.vLTP.setText(ci.email);
        CourseViewHolder.vCourseCode.setText(ci.name + " " + ci.surname);*/
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.course_card, viewGroup, false);

        return new CourseViewHolder(itemView);
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        protected TextView vName;
        protected TextView vCredits;
        protected TextView vLTP;
        protected TextView vCourseCode;

        public CourseViewHolder(View v) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.txtName);
            vCredits = (TextView)  v.findViewById(R.id.txtSurname);
            vLTP = (TextView)  v.findViewById(R.id.txtEmail);
            vCourseCode = (TextView) v.findViewById(R.id.title);
        }
    }
}
