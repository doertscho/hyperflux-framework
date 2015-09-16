package hyperflux

import org.http4s._
import org.http4s.headers._
import scala.util.hashing.MurmurHash3

object session_helpers { 

  def SID(implicit hfImpReq: Request) = {

    val remoteAddr = hfImpReq.remoteAddr
    val agent = hfImpReq.headers.get(`User-Agent`.name) match {
      case Some(str) => str
      case _ => "empty"
    }

    val arr = List(remoteAddr, agent).toArray

    new SessionID(MurmurHash3.arrayHash(arr, 16092015))
  }
}

case class SessionID(id: Int)
