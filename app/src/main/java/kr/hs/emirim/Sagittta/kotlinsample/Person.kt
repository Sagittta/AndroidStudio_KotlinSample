package kr.hs.emirim.Sagittta.kotlinsample

class Person(val name: String) {

    var age: Int = 0
    var nickname: String = ""
        set(value) {
            //field 는 Setter의 대상이 되는 field 를 의미
            field = value.toLowerCase()
        }
}