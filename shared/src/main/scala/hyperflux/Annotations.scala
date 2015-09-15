package hyperflux

import scala.annotation.Annotation

object annotation {
  
  class Server(baseURL: String, port: Int, path: String = "")
    extends Annotation

  class Client extends Annotation
  
  class Interface extends Annotation
  class Page(path: String = "__HF_AUTO") extends Annotation
  class Element extends Annotation
}