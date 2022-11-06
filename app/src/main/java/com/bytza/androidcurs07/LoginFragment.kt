package com.bytza.androidcurs07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bytza.androidcurs07.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
        //return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.login.setOnClickListener() {
            if (binding.username.text.toString() == "demo"
                && binding.password.text.toString() == "demo")
            {
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.frgHolder, AccountFragment())
                    ?.commit()
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoginFragment()

    }
}