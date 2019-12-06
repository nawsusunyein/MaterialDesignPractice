package com.example.materialdesigntest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductCardRecyclerViewAdapter extends RecyclerView.Adapter<ProductCardViewHolder> {

    private List<ProductEntry> productList;
    private ImageRequester imageRequester;
    Context context;

    ProductCardRecyclerViewAdapter(List<ProductEntry> productList,Context context){
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card,parent,false);
        ProductCardViewHolder pdViewHolder =  new ProductCardViewHolder(layoutView);
        return pdViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCardViewHolder holder, int position) {
        ProductEntry product = productList.get(position);
        holder.txtTitle.setText(product.title);
        holder.txtSubtitle.setText(product.price);
        Glide.with(context).load(product.url).into(holder.productImage);
        //imageRequester.setImageFromUrl(holder.productImageView,product.url);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
