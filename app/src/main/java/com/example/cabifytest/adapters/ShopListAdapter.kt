package com.example.cabifytest.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cabifytest.databinding.ShopRowBinding
import com.example.cabifytest.models.ProductsResults

class ShopListAdapter(private val list: List<ProductsResults>): RecyclerView.Adapter <ShopListAdapter.ShopViewHolder>()  {

    private lateinit var binding: ShopRowBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val productsResults: ProductsResults = list[position]
        holder.bind(productsResults)
    }

    inner class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var name: TextView = binding.productNameTv
        private var price: TextView = binding.priceTv


        fun bind (productsResults: ProductsResults){
            name.text = productsResults.name
            price.text = productsResults.price.toString()
        }


    }

}