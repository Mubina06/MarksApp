package com.example.marksapp.screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.marksapp.R
import com.example.marksapp.database.AppDatabase
import com.example.marksapp.databinding.FragmentLogBinding
import com.example.marksapp.entity.User


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class LogFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentLogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    val appDatabase: AppDatabase by lazy {
        AppDatabase.getInstance(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogBinding.inflate(inflater, container, false)

        binding.textView2.setOnClickListener {
            findNavController().navigate(R.id.action_logFragment_to_regFragment)
        }

        binding.button.setOnClickListener {
            var login = binding.fllLogin.text.toString()
            var password = binding.fllPassword.text.toString()

            var user: User
            if(login != "" && password != ""){
                user = appDatabase.getUserDao().getUser(login,password)
                Log.d("AAA", user.user_login)
                if(user.role.toLowerCase() == "student"){
                    findNavController().navigate(R.id.action_logFragment_to_studentFragment)
                }

                if(user.role.toLowerCase() == "teacher"){
                    findNavController().navigate(R.id.action_logFragment_to_teacherFragment)
                }
            }

        }
        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LogFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}