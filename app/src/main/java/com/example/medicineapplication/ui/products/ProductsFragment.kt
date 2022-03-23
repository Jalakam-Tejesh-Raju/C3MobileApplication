package com.example.medicineapplication.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medicineapplication.R
import com.example.medicineapplication.databinding.FragmentProductsBinding
import com.example.medicineapplication.databinding.FragmentUnderconstructionBinding

class ProductsFragment : Fragment() {

    private var _binding: FragmentProductsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val underConstructionViewModel =
//            ViewModelProvider(this).get(UnderConstructionModel::class.java)

        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val img = arrayOf(R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine)

        val texts = arrayOf("Halls", "paracetamol", "Halls", "paracetamol",
            "paracetamol", "Halls", "paracetamol",)

        val desc = arrayOf("tablets cure coughs", "tablets cure fever", "tablets cure coughs",
            "tablets cure fever", "tablets cure coughs",
            "tablets cure fever", "tablets cure coughs")
//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val recyclerView:RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext() )
        recyclerView.adapter = CustomAdapter(img,texts,desc)

//        val textView: TextView = binding.textUnderConstruction
//        underConstructionViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}