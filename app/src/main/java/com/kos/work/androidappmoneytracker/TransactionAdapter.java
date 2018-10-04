package com.kos.work.androidappmoneytracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends ArrayAdapter<Transactions>{
    List<Transactions> transactions;

    public TransactionAdapter(@NonNull Context context, List<Transactions> transactions) {
        super(context,0, transactions);
        this.transactions = transactions;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Transactions transactions = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        TextView title = (TextView)convertView.findViewById(R.id.title);
        TextView sum = (TextView)convertView.findViewById(R.id.sum);

        title.setText(transactions.title);
        sum.setText(transactions.sum);
        return convertView;
    }
}
