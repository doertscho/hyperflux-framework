package hyperflux

import scala.scalajs.js.annotation._
import org.scalajs.dom._
import org.scalajs.dom.ext._
import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow
import scala.concurrent._
import org.scalajs.dom.alert

@JSExport
object protocol_helpers {
  
  @JSExport
  def callServer(url: String, srv: String, meth: String, args: String) = {
    val req = Ajax.post(s"$url/$srv/$meth", args) map { _.responseText }
    req onFailure { case e => alert(s"connection problem: ${e.getMessage}") }
    req
  }
}