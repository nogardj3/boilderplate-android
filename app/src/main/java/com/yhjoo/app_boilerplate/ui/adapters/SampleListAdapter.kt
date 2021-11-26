package com.yhjoo.app_boilerplate.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yhjoo.app_boilerplate.R
import com.yhjoo.app_boilerplate.data.SampleData
import com.yhjoo.app_boilerplate.databinding.SampleItemBinding

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