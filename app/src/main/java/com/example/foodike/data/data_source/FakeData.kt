package com.example.foodike.data.data_source

import com.example.foodike.R
import com.example.foodike.domain.model.CartItem
import com.example.foodike.domain.model.FoodItem

object FakeData {
    val cartItemList = mutableListOf<CartItem>()
    val favouriteItemList = mutableListOf<FoodItem>()

    fun filterWithId(itemId: Int): FoodItem {
        return getFoodItemList().filter { foodItem -> foodItem.itemId == itemId }[0]
    }

    fun filterFavouriteItems(): List<FoodItem> {
        return getFoodItemList().filter { foodItem -> foodItem.isFavourite }
    }
    fun getFoodItemList(): MutableList<FoodItem> {
        return mutableListOf<FoodItem>(
            FoodItem(
                itemId = 1,
                image = R.drawable.applepie,
                name = "PineApple Pie",
                price = "900.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 2,
                image = R.drawable.applepie,
                name = "Apple Pie",
                price = "90.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 3,
                image = R.drawable.applepie,
                name = "Coconut Pie",
                price = "40.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 4,
                image = R.drawable.applepie,
                name = "Haldi Pie",
                price = "10.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 5,
                image = R.drawable.applepie,
                name = "Rice Pie",
                price = "10.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 6,
                image = R.drawable.applepie,
                name = "Dala Pie",
                price = "14550.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 7,
                image = R.drawable.applepie,
                name = "Water Pie",
                price = "130.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 8,
                image = R.drawable.applepie,
                name = "Apple Pie",
                price = "233210.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 9,
                image = R.drawable.applepie,
                name = "Apple Pie",
                price = "178780.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 10,
                image = R.drawable.applepie,
                name = "Apple Pie",
                price = "1043.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            ),
            FoodItem(
                itemId = 11,
                image = R.drawable.applepie,
                name = "Apple Pie",
                price = "1560.00",
                ingredient = "Porridge, Rice, Chicken",
                itemRatingInfo = "4.9 400+ratings",
                distance = "12 min . 1 km",
                deliveryInfo = "Delivered between monday aug and thursday 20 from 8pm to 91:32 pm",
                returnPolicy = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately."
            )
        )

    }
}