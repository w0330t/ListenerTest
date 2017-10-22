package net.blueness

import javax.servlet.http.HttpSessionBindingEvent
import javax.servlet.http.HttpSessionBindingListener

class Dog(val breed: String) : HttpSessionBindingListener{

    override fun valueUnbound(event: HttpSessionBindingEvent?) {
    }

    override fun valueBound(event: HttpSessionBindingEvent?) {
    }

}
