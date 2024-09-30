import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodike.data.data_source.FakeData
import com.example.foodike.databinding.ItemLayoutCartBinding
import com.example.foodike.domain.model.CartItem

class ViewCartAdapter(
    private var foodItemList: MutableList<CartItem>
) : RecyclerView.Adapter<ViewCartAdapter.ViewCartHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewCartHolder {
        val binding = ItemLayoutCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewCartHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewCartHolder, position: Int) {
        holder.bind(foodItemList[position])
    }

    override fun getItemCount(): Int {
        return foodItemList.size
    }


    inner class ViewCartHolder(private val binding: ItemLayoutCartBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(cartItem: CartItem) {
            binding.apply {
                textViewMenuItemName.text = cartItem.foodItem.name
                imageViewMenuItem.setImageResource(cartItem.foodItem.image)
                quantityTextView.text = cartItem.quantity.toString()

                decrementButton.setOnClickListener {
                    if (cartItem.quantity > 1) {
                        updateQuantity(cartItem, cartItem.quantity - 1)
                    } else {
                        removeCartItem(cartItem)
                    }
                }

                incrementButton.setOnClickListener {
                    updateQuantity(cartItem, cartItem.quantity + 1)
                }

                buttonDelete.setOnClickListener {
                    delete(cartItem)
                }

                buttonAddFav.setOnClickListener {
                    addToFavourite(cartItem)
                }
            }
        }

        fun delete(cartItem: CartItem){
            foodItemList.remove(cartItem)
            notifyDataSetChanged()
        }

        fun addToFavourite(cartItem: CartItem){
          val foodItem = FakeData.getFoodItemList().filter {foodItem ->
                foodItem.itemId == cartItem.foodItem.itemId
            }.get(0)
            foodItem.isFavourite = true
            FakeData.favouriteItemList.add(foodItem)

        }

        private fun updateQuantity(cartItem: CartItem, newQuantity: Int) {
            val index = foodItemList.indexOf(cartItem)
            if (index != -1) {
                foodItemList[index].quantity = newQuantity
                notifyItemChanged(index)
            }
        }

        private fun removeCartItem(cartItem: CartItem) {
            val index = foodItemList.indexOf(cartItem)
            if (index != -1) {
                foodItemList.removeAt(index)
                notifyItemRemoved(index)
            }
        }
    }
}
