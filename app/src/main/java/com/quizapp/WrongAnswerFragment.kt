package com.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_wrong_answer.*


class WrongAnswerFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wrong_answer, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val correct = requireArguments().getString("correctAns")
        val wrong = requireArguments().getString("wrongAns")
        val correctAnsTotal = requireArguments().getString("CorrectAnsTotal")
        val userName = requireArguments().getString("userName")
        val totalQuestions = requireArguments().getString("TotalQuestions")
        tv_Correct.text = correct
        tv_Wrong.text = wrong
        btn_ponatamu.setOnClickListener() {
            val intent = Intent(getActivity(), ResultActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            intent.putExtra(Constants.CORRECT_ANSWERS, correctAnsTotal?.toIntOrNull())
            intent.putExtra(Constants.TOTAL_QUESTIONS, totalQuestions?.toIntOrNull())
            startActivity(intent)
            dismiss()
        }
    }
}