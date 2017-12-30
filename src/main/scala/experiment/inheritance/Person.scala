package experiment.inheritance

case class Person(firstName : String, lastName : String = "", city : String = "", age : Int = 0, personType : String)

case class Doctor(override val firstName : String, override val personType : String = "DOCTOR")
        extends Person(firstName : String, personType = String)

case class Teacher(override val firstName : String, override val personType : String = "TEACHER")
        extends Person(firstName : String, personType = String)

case class Engineer(override val firstName : String, override val personType : String = "ENGINEER")
        extends Person(firstName : String, personType = String)

case class Sportsman(override val firstName : String, override val personType : String = "SPORTSMAN")
        extends Person(firstName : String, personType = String)

/*
case class DoctorTeacher(override val firstName : String, override val personType : String = "DOCTOR-TEACHER")
        extends Person(firstName : String, personType = String)
                with Doctor(firstName : String)*/
