package com.bytza.androidcurs07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.bytza.androidcurs07.databinding.FragmentPetBinding
import com.bytza.androidcurs07.databinding.FragmentPetsBinding
import com.bytza.androidcurs07.model.PetRepository

class PetsFragment(val mainSupportFragmentManager: FragmentManager) : Fragment() {

    //lateinit var bindingPet: FragmentPetBinding
    lateinit var bindingPets: FragmentPetsBinding
    var repository = PetRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //bindingPet = FragmentPetBinding.inflate(inflater)
        bindingPets = FragmentPetsBinding.inflate(inflater)

        val viewPager = bindingPets.frgViewPager2
        val adapter = PetViewPageAdapter(mainSupportFragmentManager, lifecycle, repository.getAll())
        viewPager.adapter = adapter

        return bindingPets.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingPets.btnNext.setOnClickListener() {
            var nextId = bindingPets.txtId.text.toString().toInt() + 1
            if (nextId > repository.getCount()-1) nextId = 0
            bindingPets.frgViewPager2.setCurrentItem(nextId, true)
            //bindingPets.txtId.text = nextId.toString()
        }
        bindingPets.btnPrevious.setOnClickListener() {
            var nextId = bindingPets.txtId.text.toString().toInt() - 1
            if (nextId < 0) nextId = repository.getCount() -1
            bindingPets.frgViewPager2.setCurrentItem(nextId, true)
            //bindingPets.txtId.text = nextId.toString()
        }

    }
}