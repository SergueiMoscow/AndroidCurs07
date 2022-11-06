package com.bytza.androidcurs07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bytza.androidcurs07.databinding.FragmentPetBinding
import com.bytza.androidcurs07.databinding.FragmentPetsBinding
import com.bytza.androidcurs07.model.Pet

class PetFragment(val pet: Pet) : Fragment() {
    lateinit var binding: FragmentPetBinding
    lateinit var bindingPets: FragmentPetsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPetBinding.inflate(inflater)
        bindingPets = FragmentPetsBinding.inflate(inflater)
        return binding.root
        //return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.pet = pet
        //bindingPets.pet = pet
        //bindingPets.txtId.text = pet.id.toString()
        val currentId = activity?.findViewById<TextView>(R.id.txtId)?.text
        activity?.findViewById<TextView>(R.id.txtId)?.text  = pet.id.toString()
        binding.imageView.setImageResource(pet.resImage)
    }
}