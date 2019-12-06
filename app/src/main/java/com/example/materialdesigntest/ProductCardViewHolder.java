package com.example.materialdesigntest;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import androidx.recyclerview.widget.RecyclerView;

public class ProductCardViewHolder extends RecyclerView.ViewHolder {
    
    ImageView productImage;
    TextView txtTitle;
    TextView txtSubtitle;

    public ProductCardViewHolder(View itemView){
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtSubtitle = itemView.findViewById(R.id.txtSecondaryText);
        productImage = itemView.findViewById(R.id.productImage);
    }
}
