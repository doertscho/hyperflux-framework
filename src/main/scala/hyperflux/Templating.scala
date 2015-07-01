package hyperflux

import scalatags.Text._
import scalatags.Text.all._
import org.scalajs.dom
import org.scalajs.dom.raw.MouseEvent

object template_helpers {
  
  // type alias for full documents
  type Document = TypedTag[String]
  
  /*
   * Provides a document skeleton which automatically includes the generated
   * JavaScript files
   */
  def document(pageTitle: String, content: Frag*): Document = html(
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