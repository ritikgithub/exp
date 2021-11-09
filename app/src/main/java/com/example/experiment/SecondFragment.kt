package com.example.experiment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class SecondFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ritik","Fragment 2 onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ritik","Fragment 2 onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ritik","Fragment 2 onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ritik","Fragment 2 onViewCreated")
        view.findViewById<Button>(R.id.f2btn).setOnClickListener {
            activity?.findViewById<TextView>(R.id.f1tv)?.text = "Hii Hello"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ritik","Fragment 2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ritik","Fragment 2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ritik","Fragment 2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ritik","Fragment 2 onStop")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("ritik","Fragment 2 onSaveInstanceState")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ritik","Fragment 2 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ritik","Fragment 2 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ritik","Fragment 2  onDetach")
    }

}