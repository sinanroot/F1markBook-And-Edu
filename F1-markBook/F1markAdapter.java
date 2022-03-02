package com.example.f1markbook;

import static com.example.f1markbook.MainActivity.chosenF1mark;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.f1markbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class F1markAdapter extends RecyclerView.Adapter<F1markAdapter.F1markHolder> {

    ArrayList<F1mark> f1markArrayList;

    public F1markAdapter(ArrayList<F1mark> f1markArrayList) {
        this.f1markArrayList = f1markArrayList;

    }

    @NonNull
    @Override
    public F1markHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new F1markHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull F1markAdapter.F1markHolder holder, int position) {

        holder.binding.recycleViewTextView.setText(f1markArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                //chosenF1mark = f1markArrayList.get(position);
                //intent.putExtra("f1mark", f1markArrayList.get(position));
                Singleton singleton = Singleton.getInstance();
                singleton.setSendF1mark(f1markArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return f1markArrayList.size();
    }

    public class F1markHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;


        public F1markHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }


}
