package com.example.ryousuke.safeargsapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    val args: FragmentBArgs by navArgs()

    //String型のやり取りを確認してくれる?
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        view.textView_tx.text = "Your Name is ${args.currentUser.name}"

        return view
    }

}