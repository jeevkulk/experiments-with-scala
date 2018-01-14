package experiment.inheritance

class Person(firstName : String, lastName : String = "", city : String = "", age : Int = 0, personType : String)

class Doctor(val firstName : String, val personType : String = "DOCTOR")
        extends Person(firstName : String, personType = "DOCTOR")

class Teacher(val firstName : String, val personType : String = "TEACHER")
        extends Person(firstName : String, personType = "TEACHER")

class Engineer(val firstName : String, val personType : String = "ENGINEER")
        extends Person(firstName : String, personType = "ENGINEER")

class Sportsman(val firstName : String, val personType : String = "SPORTSMAN")
        extends Person(firstName : String, personType = "SPORTSMAN")

/*
case class DoctorTeacher(override val firstName : String, override val personType : String = "DOCTOR-TEACHER")
        extends Person(firstName : String, personType = String)
                with Doctor(firstName : String)*/
