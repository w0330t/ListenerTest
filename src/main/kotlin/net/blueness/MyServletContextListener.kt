package net.blueness

import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener


class MyServletContextListener : ServletContextListener {

    override fun contextInitialized(sce: ServletContextEvent?) {
        val sc = sce?.servletContext
        val dogBreed = sc?.getInitParameter("breed")
        val d = Dog(dogBreed!!)
        sc.setAttribute("dog", d)
    }

    override fun contextDestroyed(sce: ServletContextEvent?) {}
}