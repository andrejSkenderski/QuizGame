package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "In what children's game are participants chased by someone designated as \"It\"?",
            "Tag", "Simon Says", "Charades", "Hopscotch", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "On a radio, stations are changed by using what control?",
            "Tuning", "Volume", "Bass", "Treble", 1
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Which material is most dense?",
            "Silver", "Styrofoam", "Butter", "Gold", 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Which state in the United States is largest by area?",
            "Alaska", "California", "Texas", "Hawaii", 1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What is Aurora Borealis commonly known as?",
            "Fairy Dust", "Northern Lights", "Book of ages",
            "a Game of Thrones main character", 2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Galileo was an Italian astronomer who...",
            "developed the telescope",
            "discovered four satellites of Jupiter",
            "discovered that the movement of pendulum produces a regular time measurement",
            "All of the above", 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Exposure to sunlight helps a person improve his health because...",
            "the infrared light kills bacteria in the body",
            "resistance power increases",
            "the pigment cells in the skin get stimulated and produce a healthy tan",
            "the ultraviolet rays convert skin oil into Vitamin D", 4
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Sir Thomas Fearnley Cup is awarded to...",
            "a club or a local sport association for remarkable achievements",
            "amateur athlete, not necessarily an Olympian",
            "National Olympic Committee for outstanding work",
            "None of the above", 1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Oscar Awards were instituted in...",
            "1968", "1929", "1901", "1965", 2
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "When did Margaret Thatcher became the first female Prime Minister of Britain?",
            "1998", "1989", "1979", "1800", 3
        )
        questionsList.add(que10)

        val que11 = Question(
            11, "When is the International Workers' Day?",
            "15th April",
            "12th December",
            "1st May",
            "1st August", 3
        )
        questionsList.add(que11)

        val que12 = Question(
            12, "When did Commander Robert Peary discover the North Pole?",
            "1904",
            "1905",
            "1908",
            "1909", 4
        )
        questionsList.add(que12)

        val que13 = Question(
            13, "When did China test their first atomic device?",
            "1998", "1989", "1979", "1800", 3
        )
        questionsList.add(que13)

        val que14 = Question(
            14, "In the U.S., if it's not Daylight Saving Time, it's what?",
            "Borrowed time",
            "Overtime",
            "Standard time",
            "Party time", 3
        )
        questionsList.add(que14)

        val que15 = Question(
            15, "\"Which part of the body are you most likely to \"stub\"?",
            "Toe",
            "Knee",
            "Elbow",
            "Brain", 1
        )
        questionsList.add(que15)

        val que16 = Question(
            16, "Which country is largest by area?",
            "UK",
            "Russia",
            "USA",
            "China", 2
        )
        questionsList.add(que16)

        val que17 = Question(
            17, "What does the \"F\" stand for in FBI?",
            "Foreign",
            "Federal",
            "Flappy",
            "Face", 2
        )
        questionsList.add(que17)

        val que18 = Question(
            18, "The US declared war on which country after the bombing of Pearl Harbor?",
            "Japan",
            "Russia",
            "Germany",
            "China", 1
        )
        questionsList.add(que18)

        val que19 = Question(
            19,
            "A guarantee to an exporter that the importer of his goods will pay immediately for the goods ordered by him, is known as",
            "Letter of Credit (L/C)",
            "laissezfaire",
            "inflation",
            "None of the above",
            1
        )
        questionsList.add(que19)


        val que20 = Question(
            20,
            "The ozone layer restricts",
            "Visible light",
            "Infrared radiation",
            "X-rays and gamma rays",
            "Ultraviolet radiation",
            4
        )
        questionsList.add(que20)


        val que21 = Question(
            21,
            "Fa-Hien was",
            "the first Buddhist pilgrim of China to visit India during the reign of Chandragupta Vikramaditya",
            "the discoverer of Puerto Rico and Jamaica",
            "the first Buddhist pilgrim of India to visit China",
            "None of the above",
            1
        )
        questionsList.add(que21)


        val que22 = Question(
            22,
            "An electron volt is",
            "The amount of energy it takes to move an electron through a potential difference of 1 volt",
            "The number of volts it takes to move an electon a meter",
            "The number of electrons it takes to kill a human being",
            "The flux of current through a surface parallel to a capacitor",
            1
        )
        questionsList.add(que22)


        val que23 = Question(
            23,
            "When is the World's Diabetes Day?",
            "14th November",
            "11th December",
            "15th October",
            "1st July",
            1
        )
        questionsList.add(que23)


        val que24 = Question(
            24,
            "What is the S.I. unit of temperature?",
            "Celsius",
            "Kelvin",
            "Centigrade",
            "Fahrenheit",
            2
        )
        questionsList.add(que24)


        val que25 = Question(
            25,
            "Of the blood groups A, B, AB and O, which one is transfused into a person whose blood group is A?",
            "Group A only",
            "Group B only",
            "Group A and O",
            "Group AB only",
            3
        )
        questionsList.add(que25)


        val que26 = Question(
            26,
            "Lhasa airport at Tibet is the World's",
            "largest airport",
            "highest airport",
            "lowest airport",
            "busiest airport",
            2
        )
        questionsList.add(que26)


        val que27 = Question(
            27,
            "Which of these African countries is situated south of the equator?",
            "Ethiopia",
            "Nigeria",
            "Zambia",
            "Chad",
            3
        )
        questionsList.add(que27)


        val que28 = Question(
            28,
            "The headquarters of UN are situated at",
            "Haque (Netherlands)",
            "Geneva",
            "New York, USA",
            "Paris",
            3
        )
        questionsList.add(que28)


        val que29 = Question(
            29,
            "In the U.S., the Sony Walkman personal cassette player was originally marketed in 1979 under what name?",
            "Eardrummer",
            "Stowaway",
            "Listener",
            "Soundabout",
            4
        )
        questionsList.add(que29)


        val que30 = Question(
            30,
            "Who is credited with inventing the first mass-produced helicopter?",
            "Gottlieb Daimler",
            "Ferdinand von Zeppelin",
            "Elmer Sperry",
            "Igor Sikorsky",
            4
        )
        questionsList.add(que30)


        val que31 = Question(
            31,
            "Nephelococcygia is the practice of doing what?",
            "Swimming in freezing water",
            "Sleeping with your eyes open",
            "Finding shapes in clouds",
            "Breaking glass with your voice",
            3
        )
        questionsList.add(que31)


        val que32 = Question(
            32,
            "In addition to his career as an astrologer and \"prophet?\" Nostradamus published a 1555 treatise that included a section on what?",
            "Digging graves",
            "Making jams and jellies",
            "Cheating at card games",
            "Training parrots to talk",
            2
        )
        questionsList.add(que32)

        return questionsList
    }
}