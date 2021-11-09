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

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ritik","Fragment 1 onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ritik","Fragment 1 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ritik","Fragment 1 onCreateView")
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
//        var textView = view.findViewById<TextView>(R.id.f1tv)
//        Log.d("ritik",textView?.text.toString())
        return  view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ritik","Fragment 1 onViewCreated")
        var text = activity?.findViewById<Button>(R.id.f2btn)?.text
        Log.d("ritik",text.toString())

    }

    override fun onStart() {
        super.onStart()
        Log.d("ritik","Fragment 1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ritik","Fragment 1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ritik","Fragment 1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ritik","Fragment 1 onStop")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("ritik","Fragment 1 onSaveInstanceState")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ritik","Fragment 1 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ritik","Fragment 1 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ritik","Fragment 1  onDetach")
    }


}