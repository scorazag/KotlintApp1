package com.example.notekeeper

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("andoird_intents","Android programming with intentns")
        courses.set(course.courseId,course)

        course = CourseInfo("android_async","Android Async Programming and Services")
        courses.set(course.courseId,course)

        course = CourseInfo("java_core","Java Fundamentals")
        courses.set(course.courseId,course)
    }
}