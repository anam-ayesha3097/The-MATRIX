// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def freelancer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.freelancer",
      """
        function(searchTerm0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "freelance" + _qS([(searchTerm0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0))])})
        }
      """
    )
  
    // @LINE:11
    def skills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.skills",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills/" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0)])})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
