package com.pastibisa.smarttajwidapp

object QuizData {

//    const val name:String="name"
    const val score:String="score"
    const val nilai:String="score"
    const val hasil:String="score"

   fun getquestion():ArrayList<QuestionEasy>{
       var que:ArrayList<QuestionEasy> = arrayListOf()

       var question1 = QuestionEasy(
           1,
           "Hukum nun sukun ada...",
//            R.drawable.img1,
           "3",
           "4",
           "5",
           "6",
           2
       )
       var question2 = QuestionEasy(
           2,
           "Hukum mim sukun ada berapa?",

           "1",
           "2",
           "3",
           "4",
           3
       )
       var question3 = QuestionEasy(
           3,
           "Apa yang disebut dg idgham bighunnah?",

           "Nun sukun atau tanwin bertemu huruf ل _ ر ",
           "Nun sukun atau tanwin bertemu huruf ب ",
           "Nun sukun atau tanwin bertemu ن _ م _ ي _ و ",
           "Nun sukun atau tanwin bertemu _ خ _ ح _ ا _ ع _ غ _ ء",
           3
       )
       var question4 = QuestionEasy(
           4,
           "Yang disebut dg idgham bilaghunnah adalah...",

           "Nun sukun atau tanwin bertemu dg م _ ي _ ن _ و ",
           "Nun sukun atau tanwin bertemu dg ر _ ل ",
           "Nun sukun atau tanwin bertemu ب ",
           "Nun sukun atau tanwin bertemu _ خ _ ح _ ا ع",
           2
       )

       var question5 = QuestionEasy(
           5,
           "Berapa jumlah huruf ikhfa'?",

           "12",
           "13",
           "14",
           "15",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }

   fun get_question():ArrayList<QuestionMedium>{
       var ques:ArrayList<QuestionMedium> = arrayListOf()

       var ques1 = QuestionMedium(
           1,
           "Who was the first Indian woman in Space ?",

           "Kalpana Chawla",
           "Sunita Williams",
           "Koneru Humpy",
           "None of the above",
           1
       )
       var ques2 = QuestionMedium(
           2,
           "what is capital of India ?",
//            R.drawable.img1,
           "Uttar Pradesh",
           "Madhya Pradesh",
           "Kanpur",
           "New Delhi",
           4
       )
       var ques3 = QuestionMedium(
           3,
           "Who wrote the Indian National Anthem ?",

           "Bakim Chandra Chatterji",
           "Rabindranath Tagore",
           "Swami Vivekanand",
           "None of the above",
           2
       )
       var ques4 = QuestionMedium(
           4,
           "Who was the first President of India ?",

           "Abdul Kalam",
           "Lal Bahadur Shastri",
           "Dr. Rajendra Prasad",
           "Zakir Hussain",
           3
       )

       var ques5 = QuestionMedium(
           5,
           "Who built the Jama Masjid ?",

           "Jahangir",
           "Akbar",
           "Imam Bukhari",
           "Shah Jahan",
           4
       )

       ques.add(ques1)
       ques.add(ques2)
       ques.add(ques3)
       ques.add(ques4)
       ques.add(ques5)
       return ques
   }

    fun getQuestion():ArrayList<QuestionHard>{
        var quiz:ArrayList<QuestionHard> = arrayListOf()

        var quiz1 = QuestionHard(
            1,
            "Who was the first Indian woman in Space ?",

            "Kalpana Chawla",
            "Sunita Williams",
            "Koneru Humpy",
            "None of the above",
            1
        )
        var quiz2= QuestionHard(
            2,
            "what is capital of India ?",
//            R.drawable.img1,
            "Uttar Pradesh",
            "Madhya Pradesh",
            "Kanpur",
            "New Delhi",
            4
        )
        var quiz3 = QuestionHard(
            3,
            "Who wrote the Indian National Anthem ?",

            "Bakim Chandra Chatterji",
            "Rabindranath Tagore",
            "Swami Vivekanand",
            "None of the above",
            2
        )
        var quiz4 = QuestionHard(
            4,
            "Who was the first President of India ?",

            "Abdul Kalam",
            "Lal Bahadur Shastri",
            "Dr. Rajendra Prasad",
            "Zakir Hussain",
            3
        )

        var quiz5 = QuestionHard(
            5,
            "Who built the Jama Masjid ?",

            "Jahangir",
            "Akbar",
            "Imam Bukhari",
            "Shah Jahan",
            4
        )

        quiz.add(quiz1)
        quiz.add(quiz2)
        quiz.add(quiz3)
        quiz.add(quiz4)
        quiz.add(quiz5)
        return quiz
    }
}


