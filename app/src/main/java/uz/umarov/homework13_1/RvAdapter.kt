package uz.umarov.homework13_1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.umarov.homework13_1.databinding.RvItemBinding

class RvAdapter(private val movieList: ArrayList<MoviesData>) :
    RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(moviesData: MoviesData) {
            binding.imageView.setImageResource(moviesData.image)
            binding.name.text = moviesData.name
            binding.desc.text = moviesData.desc
            binding.date.text = moviesData.date
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}