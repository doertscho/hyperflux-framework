package hyperflux

object session_helpers {

  val sid = new SessionID(1)
  def SID() = sid
}

class SessionID(id: Int) {
  
}
