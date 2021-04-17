package com.alfaz.assignement.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alfaz.assignement.R
import com.alfaz.assignement.databinding.ItemContainerSliderImageBinding
import com.alfaz.assignement.model.MediaMetadata

class ImageSliderAdapter(private val images: List<MediaMetadata>) :
    RecyclerView.Adapter<ImageSliderAdapter.TravelLocationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TravelLocationViewHolder(
            DataBindingUtil.inflate<ItemContainerSliderImageBinding>
                (
                LayoutInflater.from(parent.context),
                R.layout.item_container_slider_image,
                parent,
                false
            )
        )

    override fun onBindViewHolder(
        holder: TravelLocationViewHolder,
        position: Int
    ) {
        holder.itemContainerBinding.mediaMetadata = images[position]
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class TravelLocationViewHolder(
        val itemContainerBinding: ItemContainerSliderImageBinding
    ) :
        RecyclerView.ViewHolder(itemContainerBinding.root)


}