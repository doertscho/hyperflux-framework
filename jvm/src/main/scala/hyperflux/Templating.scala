package hyperflux

import scalatags.Text._
import scalatags.Text.all._

object js_dom {
  // only here to avoid import errors
}

object template_helpers {

  // type alias for full documents
  type Document = TypedTag[String]

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
      maxWidth := 800,
      margin := "0 auto"
    )(
      contentElems
    )
  )
}
