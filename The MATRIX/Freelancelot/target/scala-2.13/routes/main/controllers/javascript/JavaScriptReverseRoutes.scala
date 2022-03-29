// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def skills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.skills",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0)])})
        }
      """
    )
  
    // @LINE:9
    def projectWordStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.projectWordStats",
      """
        function(searchTerm0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "IndvWordStats" + _qS([(searchTerm0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0))])})
        }
      """
    )
  
    // @LINE:8
    def freelancer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.freelancer",
      """
        function(searchTerm0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "freelance" + _qS([(searchTerm0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchTerm", searchTerm0))])})
          }
        
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
  
    // @LINE:15
    def ownerInformation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerInformation",
      """
        function(ownerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ownerInformation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ownerId", ownerId0))})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
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
