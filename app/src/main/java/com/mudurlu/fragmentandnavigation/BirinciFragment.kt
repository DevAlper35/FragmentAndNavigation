package com.mudurlu.fragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mudurlu.fragmentandnavigation.databinding.FragmentBirinciBinding

class BirinciFragment : Fragment() {

    private var _binding : FragmentBirinciBinding? = null
    private val binding  get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBirinciBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val gidecekVeri = binding.editTextText.text.toString()
            val aksiyon = BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment(gidecekVeri)
            Navigation.findNavController(view).navigate(aksiyon)
        }
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }


}