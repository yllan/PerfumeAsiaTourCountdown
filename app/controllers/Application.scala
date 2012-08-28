package controllers

import play.api._
import play.api.mvc._

import java.util._

object Application extends Controller {
  
  def secondsToTarget = {
    val targetMillis = new GregorianCalendar(2012, Calendar.OCTOBER, 26, 19, 30, 0).getTime.getTime
    val nowMillis = new Date().getTime
    (targetMillis - nowMillis) / 1000L
  }

  def index = Action {
    
    Ok(views.html.index(secondsToTarget))
  }
  
}