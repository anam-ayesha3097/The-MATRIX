// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def skills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.skills",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0)])})
        }
      """
    )
  
    // @LINE:7
    def sayHello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sayHello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myName" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:9
    def projectWordStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.projectWordStats",
      """
        function(searchTerm0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "IndvWordStats/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0))})
        }
      """
    )
  
    // @LINE:10
    def wordStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.wordStats",
      """
        function(searchTerm0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wordstats" + _qS([(searchTerm0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0))])})
        }
      """
    )
  
    // @LINE:8
    def ws: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ws",
      """
        function(searchTerm0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ws" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0)])})
        }
      """
    )
  
    // @LINE:6
    def freelancelot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.freelancelot",
      """
        function(searchTerm0,sessionID1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "freelancelot" + _qS([(searchTerm0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0)), (sessionID1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sessionID", sessionID1))])})
        }
      """
    )
  
    // @LINE:12
    def ownerInformation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerInformation",
      """
        function(ownerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ownerInformation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ownerId", ownerId0))})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
