package controllers

import play.api._
import play.api.mvc._

import java.util._

object Application extends Controller {
  
  def secondsToTarget = {
  	val taipeiTimeZone = new SimpleTimeZone(28800000, "Asia/Taipei") // +8
    val gregCal = new GregorianCalendar(taipeiTimeZone)
    gregCal.set(2012, Calendar.OCTOBER, 26, 19, 30, 0)
    val targetMillis = gregCal.getTime.getTime
    val nowMillis = new Date().getTime
    (targetMillis - nowMillis) / 1000L
  }

  def index = Action {
    
    Ok(views.html.index(secondsToTarget))
  }
  
}