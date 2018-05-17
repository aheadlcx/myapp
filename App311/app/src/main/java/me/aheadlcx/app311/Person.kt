package me.aheadlcx.app311

/**
 * Description:
 * author: aheadlcx
 * Date:2018/4/8 下午12:19
 */
data class Person(val name: String = "aheadlcx", val email: String = "aheadlcxzhang@gmail", val
age: Int = 0) {
    var number: String = "1"
    fun show(): String {
        return this.name + this.email + this.age;
    }
}
