package hyperflux

import scalatags.JsDom._
import scalatags.JsDom.all._
import org.scalajs.dom
import org.scalajs.dom.raw.MouseEvent

object template_helpers {

  // type alias for full documents
  type Document = TypedTag[org.scalajs.dom.html.Html]

  /*
   * Provides a document skeleton which automatically includes the generated
   * JavaScript files
   */
  def document(pageTitle: String, content: Modifier*): Document = html(
    head(
      title := pageTitle,
      script(
        src := "HYPERFLUX_GENERATED_JS"
      )
    ),
    body(content)
  )
}

class Templating {

}
