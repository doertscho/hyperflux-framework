package hyperflux

import hyperflux.template_helpers._
import scala.async.Async.async
import scala.concurrent.ExecutionContext.Implicits.global
import java.io.File

import org.http4s._
import org.http4s.dsl._
import org.http4s.server.HttpService
import scalaz.concurrent.Task

object routing_helpers {
  
  def findJSFile() = {
    new File("./.js/target/scala-2.11/").listFiles find { f =>
      f.toString() endsWith "-fastopt.js"
    }
  }
   
  val jsService = HttpService {
    case req @ (GET -> Root / "generated.js") =>
      findJSFile() match {
        case Some(file) =>
          StaticFile.
            fromFile(file, Some(req)).
            fold(NotFound())(Task.now)
        case None => NotFound()
      }
  }

  val staticService = HttpService {
    case req @ (GET -> Root / path) =>
      StaticFile.
        fromFile(new File(s"./static/$path"), Some(req)).
        fold(NotFound())(Task.now)
  }
    
  def redirect(doc: Document) = {
    
  }
}
