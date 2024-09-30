package com.example.foodike.domain.model

data class FoodItem (
    val itemId:Int,
    val image: Int,
    val name: String,
    val ingredient: String,
    val price: String,
    val distance: String,
    val itemRatingInfo: String,
    val deliveryInfo: String,
    val returnPolicy: String,
){
     var isFavourite: Boolean = false

}
