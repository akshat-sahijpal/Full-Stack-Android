package com.akshatsahijpal.fullstackkotlin.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.akshatsahijpal.fullstackkotlin.databinding.UserCardBinding

class ListAdap constructor(
    private var lis: List<UserData>,
) : RecyclerView.Adapter<ListAdap.Holder>() {
    inner class Holder(private val _bind: UserCardBinding) : RecyclerView.ViewHolder(_bind
        .root) {
        fun binder(set: UserData) {
            _bind.apply {
                userName.text = set.userName
                time.text = set.dateOfJoining
                profilePicture.load(set.imageURL)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = UserCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binder(lis[position])
    }

    override fun getItemCount(): Int {
        return lis.size
    }
}