package net.blueness

import javax.servlet.ServletContext
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ListenerTester : HttpServlet(){

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {

        resp?.contentType = "text/html"
        val out = resp?.writer

        out?.println("Test context attributes set by listener<br><br>")
        val dog = getServletContext().getAttribute("dog") as Dog
        out?.println("Dog's breed is: " + dog.breed)
    }
}