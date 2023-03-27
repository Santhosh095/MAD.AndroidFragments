package com.example.androidfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class StudentMarkDetails : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragment1 = StudentBasicDetails()
        val fragment2 = StudentMarkDetails()
        view?.findViewById<Button?>(R.id.button2)?.setOnClickListener {
            childFragmentManager.beginTransaction().replace(R.id.fragmentContainerView5, fragment1).commit()
        }
        view?.findViewById<Button?>(R.id.button3)?.setOnClickListener {
            childFragmentManager.beginTransaction().replace(R.id.fragmentContainerView5, fragment2).commit()
        }
        return inflater.inflate(R.layout.fragment_student_mark_details, container, false)
    }

}