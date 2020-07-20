package com.example.helloworld.ui.navviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.helloworld.R
import com.example.helloworld.databinding.FragmentHome3Binding
import com.example.helloworld.ui.navviewmodel.viewmodel.NavViewModel

class HomeFragment : Fragment() {

    private lateinit var mBinding: FragmentHome3Binding

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val mViewModel: NavViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home3, container, false)
        mBinding.data = mViewModel
        mBinding.lifecycleOwner = activity
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.seekBar2.progress = mViewModel.getLiveNumber().value ?: 0
        mBinding.seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                mViewModel.getLiveNumber().setValue(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        mBinding.button.setOnClickListener{ view ->
            val controller = Navigation.findNavController(view)
            controller.navigate(R.id.action_homeFragment3_to_detailFragment3)
        }
    }
}