package com.example.listdata

import java.lang.StringBuilder

class Model() {
    var name:String? = null
    var Id:String? = null
    var course:String? = null
    var Time:String? = null

    constructor(name:String?,Id:String?,course:String?,Time:String?) : this() {
        this.name=name
        this.Id=Id
        this.course=course
        this.Time=Time

    }

}