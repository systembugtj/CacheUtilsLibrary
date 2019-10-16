package com.lifeofcoding.cacheutilslibrary_sample

/**
 * Created by Wesley Lin on 9/6/15.
 */
class MyClass(var text: String?, var id: Int) {
    var isIdZero: Boolean = false

    init {
        this.isIdZero = id == 0
    }

    override fun toString(): String {
        return "{text: $text, id: $id, isIdZero: $isIdZero}"
    }

    companion object {

        var SAMPLE_MYCLASS_1 = MyClass("MyClass Sample1", 0)
        var SAMPLE_MYCLASS_2 = MyClass("MyClass Sample2", 1)
        var SAMPLE_MYCLASS_3 = MyClass("MyClass Sample3", 1)
    }
}
