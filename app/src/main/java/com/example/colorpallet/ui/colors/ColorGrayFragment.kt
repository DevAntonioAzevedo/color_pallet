package com.example.colorpallet.ui.colors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.colorpallet.R
import com.example.colorpallet.databinding.FragmentColorGrayBinding
import com.example.colorpallet.util.initToolBar

class ColorGrayFragment : Fragment() {

    private var _binding: FragmentColorGrayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentColorGrayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolBar(binding.toolBar)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}