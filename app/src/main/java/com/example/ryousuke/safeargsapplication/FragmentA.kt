package com.example.ryousuke.safeargsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.ryousuke.safeargsapplication.models.User
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.coroutines.internal.RemoveFirstDesc


class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a,container,false)

        //ここで編集したやつを渡す nullチェックがわからん

        //ここで作成しない
        //val editText =view.editText_et.text.toString()

        view.next_btn.setOnClickListener {

            val name = view.editText_et.text.toString()

            val user = User(name)

            //ここでRebuild
            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            findNavController().navigate(action)
        }

        return view
    }

}