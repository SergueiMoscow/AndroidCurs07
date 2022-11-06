package com.bytza.androidcurs07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bytza.androidcurs07.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    lateinit var btnExit: Button
    lateinit var binding: FragmentAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(inflater)
        binding.btnExit.setOnClickListener()
        {
//                activity?.supportFragmentManager
//                    ?.beginTransaction()
//                    ?.replace(R.id.frgHolder, LoginFragment())
//                    ?.commit()
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.frgHolder, LoginFragment())
                .commit()

        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = AccountFragment()
    }
}