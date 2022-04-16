// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def skills(s:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "skills" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)))))
    }
  
    // @LINE:7
    def sayHello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myName" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:9
    def projectWordStats(searchTerm:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "IndvWordStats/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("searchTerm", searchTerm)))
    }
  
    // @LINE:10
    def wordStats(searchTerm:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wordstats" + play.core.routing.queryString(List(if(searchTerm == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)))))
    }
  
    // @LINE:8
    def ws(searchTerm:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ws" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)))))
    }
  
    // @LINE:6
    def freelancelot(searchTerm:String = "", sessionID:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "freelancelot" + play.core.routing.queryString(List(if(searchTerm == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)), if(sessionID == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sessionID", sessionID)))))
    }
  
    // @LINE:12
    def ownerInformation(ownerId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ownerInformation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ownerId", ownerId)))
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:15
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
