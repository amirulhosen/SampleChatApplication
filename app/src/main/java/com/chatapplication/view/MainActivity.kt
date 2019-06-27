//package com.chatapplication.view
//
//import android.databinding.DataBindingUtil
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
//import com.chatapplication.R
//import com.chatapplication.databinding.ActivityMainBinding
//import com.chatapplication.model.ChatModel
//import com.chatapplication.viewModel.ChatViewModel
//
//class MainActivity : AppCompatActivity() {
//    val chatModel = ChatModel()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        val layoutManager = LinearLayoutManager(this)
//        binding.mRecycleView.layoutManager = layoutManager as RecyclerView.LayoutManager?
//        val chatViewModel = ChatViewModel(chatModel)
//        binding.viewModel = chatViewModel
//        binding.viewModel!!.addsenderItem()
//        val adapter = ChatAdapter(binding.viewModel!!.mList)
//        binding.mRecycleView.adapter = adapter
//
//
//        adapter.notifyDataSetChanged()
//        binding.sendBtn.setOnClickListener {
//            if (!binding.msgBox.text.toString().trim().isEmpty()) {
//                binding.viewModel!!.addRecieverItem(binding.msgBox.text.toString())
//                binding.msgBox.setText("")
//                binding.mRecycleView.smoothScrollToPosition(binding.viewModel!!.mList.size - 1)
//                adapter.notifyItemInserted(binding.viewModel!!.mList.size - 1)
//            }
//        }
//    }
//}
