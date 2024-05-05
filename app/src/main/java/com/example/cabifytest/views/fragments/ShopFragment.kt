package com.example.cabifytest.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabifytest.adapters.ShopListAdapter
import com.example.cabifytest.databinding.FragmentShopBinding

class ShopFragment : Fragment() {

    private var adapter: ShopListAdapter? = null
    private lateinit var binding: FragmentShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentShopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.shopRecyclerView.adapter
    }

//    private fun prepareListView(productList: List<Products>){
//        adapter = ShopListAdapter(productList, this)
//    }
}