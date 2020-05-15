package com.azp.refactorrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.azp.refactorrecyclerview.adapter.RecyclerAdapter
import com.azp.refactorrecyclerview.model.InputText
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = RecyclerAdapter()

        btnAdd.setOnClickListener {
            if (!txtInput.text.isEmpty()){
                var inputText = InputText(txtInput.text.toString())
                recyclerAdapter.data.add(inputText)
            }
        }

        recyclerView.adapter = recyclerAdapter

    }

}
