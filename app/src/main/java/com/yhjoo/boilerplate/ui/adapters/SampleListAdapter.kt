package com.yhjoo.boilerplate.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yhjoo.boilerplate.R
import com.yhjoo.boilerplate.data.SampleData
import com.yhjoo.boilerplate.databinding.SampleItemBinding

class SampleListAdapter() :
    ListAdapter<SampleData, SampleListAdapter.SampleListViewHolder>(SampleListComparator()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleListViewHolder {
        return SampleListViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.sample_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SampleListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SampleListViewHolder(val binding: SampleItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: SampleData) {
            binding.apply {
                item = data
            }
        }
    }

    class SampleListComparator : DiffUtil.ItemCallback<SampleData>() {
        override fun areItemsTheSame(
            oldItem: SampleData,
            newItem: SampleData
        ): Boolean {
            return oldItem.sampleOne == newItem.sampleTwo
        }

        override fun areContentsTheSame(
            oldItem: SampleData,
            newItem: SampleData
        ): Boolean {
            return oldItem == newItem
        }
    }
}

//class RecipeDetailViewModelFactory(
//    private val recipeRepository: RecipeRepository,
//    private val reviewRepository: ReviewRepository,
//    private val intent: Intent
//) :
//    ViewModelProvider.Factory {
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(RecipeDetailViewModel::class.java)) {
//            return RecipeDetailViewModel(
//                recipeRepository,
//                reviewRepository,
//                intent
//            ) as T
//        }
//        throw IllegalArgumentException("Unknown View Model class")
//    }
//}