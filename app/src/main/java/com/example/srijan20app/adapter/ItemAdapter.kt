package com.example.srijan20app.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.srijan20app.AlarmActivity
import com.example.srijan20app.EventActivity
import com.example.srijan20app.R
import com.example.srijan20app.model.SampleSrijanApp

class ItemAdapter(private val context: Context,
                  private val dataset: List<SampleSrijanApp>
                  ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView2: TextView = view.findViewById(R.id.item_detail)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val imageView2: ImageView = view.findViewById(R.id.alarm_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceId2)
        holder.imageView.setImageResource(item.imageResourceId)

        holder.imageView2.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, AlarmActivity::class.java)
            context.startActivity(intent)
        }

        holder.textView.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, EventActivity::class.java)
            context.startActivity(intent)
        }

        holder.imageView.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, EventActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}