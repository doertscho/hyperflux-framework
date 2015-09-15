package hyperflux

import scalatags.JsDom._
import scalatags.JsDom.all._
import scala.scalajs.js._
import org.scalajs.dom

@native
object js_dom extends GlobalScope {
  val document: dom.raw.HTMLDocument = native
}

object template_helpers {

  // type alias for full documents
  type Document = TypedTag[dom.html.Html]

  /*
   * Provides a document skeleton which automatically includes the generated
   * JavaScript files
   */
  def document(pageTitle: String, contentElems: Modifier*): Document = html(
    head(
      link(rel := "stylesheet", href := "static/bootstrap.min.css"),
      script(src := "js/generated.js")
    ),
    body(
      width := 800,
      margin := "0 auto"
    )(
      contentElems
    )
  )
}
