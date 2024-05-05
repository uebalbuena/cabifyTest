package com.example.cabifytest.models

import com.google.gson.annotations.SerializedName

class Product {
    @SerializedName("products")
    lateinit var productsResults: List<ProductsResults>
}

class ProductsResults(
    val code: String,
    val name: String,
    val price: Double
)