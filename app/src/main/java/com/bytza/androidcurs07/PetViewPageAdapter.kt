package com.bytza.androidcurs07

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.bytza.androidcurs07.model.Pet

class PetViewPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    var list: MutableList<Pet>
    ): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        val pet = list[position]
        return PetFragment(pet)
    }
}