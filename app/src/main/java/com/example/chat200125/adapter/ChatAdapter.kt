package com.example.chat200125.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.chat200125.R
import com.example.chat200125.model.ChatModel

class ChatAdapter(
    var lista: MutableList<ChatModel>,
    private val emailUsuarioLogeado: String
) : RecyclerView.Adapter<ChatViewHolder>() {

    fun updateAdapter(listaNueva: MutableList<ChatModel>) {
        lista = listaNueva
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chat_layout, parent, false)
        return ChatViewHolder(v)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.render(lista[position], emailUsuarioLogeado)
    }
}