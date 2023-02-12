package com.shuklaaalind.a7minutesworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingjacks = ExerciseModel(
            1,
            "Jumping Jacks",
        R.drawable.jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingjacks)

        val burpee = ExerciseModel(
            2,
            "Burpee",
            R.drawable.burpee,
            false,
            false
        )
        exerciseList.add(burpee)

        val squat = ExerciseModel(
            3,
            "Squats",
            R.drawable.bw_squat,
            false,
            false
        )
        exerciseList.add(squat)



        val lunge = ExerciseModel(
            4,
            "Lunge",
            R.drawable.lunge,
            false,
            false
        )
        exerciseList.add(lunge)


        val jumpsq = ExerciseModel(
            5,
            "Jump Squats",
            R.drawable.jump_squat,
            false,
            false
        )
        exerciseList.add(jumpsq)


        val pushup = ExerciseModel(
            6,
            "Push-Up",
            R.drawable.push_up,
            false,
            false
        )
        exerciseList.add(pushup)


        val stepup = ExerciseModel(
            7,
            "Step Up",
            R.drawable.step_up,
            false,
            false
        )
        exerciseList.add(stepup)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.plank,
            false,
            false
        )
        exerciseList.add(plank)

        val tricepdip = ExerciseModel(
            9,
            "Triceps-Dip",
            R.drawable.triceps_dip,
            false,
            false
        )
        exerciseList.add(tricepdip)

        val wallsit = ExerciseModel(
            10,
            "Wall Sit",
            R.drawable.wall_sit,
            false,
            false
        )
        exerciseList.add(wallsit)



        return exerciseList
    }
}