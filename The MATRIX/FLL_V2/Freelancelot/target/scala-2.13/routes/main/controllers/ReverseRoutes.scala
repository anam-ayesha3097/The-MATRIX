// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def freelancer(searchTerm:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "freelance" + play.core.routing.queryString(List(if(searchTerm == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)))))
    }
  
    // @LINE:9
    def projectWordStats(searchTerm:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "IndvWordStats" + play.core.routing.queryString(List(if(searchTerm == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)))))
    }
  
    // @LINE:10
    def wordStats(searchTerm:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wordstats" + play.core.routing.queryString(List(if(searchTerm == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchTerm", searchTerm)))))
    }
  
    // @LINE:13
    def skills(s:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "skills" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)))))
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
