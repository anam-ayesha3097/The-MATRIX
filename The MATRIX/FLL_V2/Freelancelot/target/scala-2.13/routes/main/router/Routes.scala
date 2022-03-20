// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_0: controllers.HomeController,
  // @LINE:12
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_0: controllers.HomeController,
    // @LINE:12
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """freelance""", """controllers.HomeController.freelancer(searchTerm:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """IndvWordStats""", """controllers.HomeController.projectWordStats(searchTerm:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wordstats""", """controllers.HomeController.wordStats(searchTerm:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills""", """controllers.HomeController.skills(s:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_freelancer0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("freelance")))
  )
  private[this] lazy val controllers_HomeController_freelancer0_invoker = createInvoker(
    HomeController_0.freelancer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "freelancer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """freelance""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_projectWordStats1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("IndvWordStats")))
  )
  private[this] lazy val controllers_HomeController_projectWordStats1_invoker = createInvoker(
    HomeController_0.projectWordStats(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projectWordStats",
      Seq(classOf[String]),
      "GET",
      this.prefix + """IndvWordStats""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_wordStats2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wordstats")))
  )
  private[this] lazy val controllers_HomeController_wordStats2_invoker = createInvoker(
    HomeController_0.wordStats(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "wordStats",
      Seq(classOf[String]),
      "GET",
      this.prefix + """wordstats""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_skills4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills")))
  )
  private[this] lazy val controllers_HomeController_skills4_invoker = createInvoker(
    HomeController_0.skills(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "skills",
      Seq(classOf[String]),
      "GET",
      this.prefix + """skills""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_HomeController_freelancer0_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", Some(""))) { (searchTerm) =>
        controllers_HomeController_freelancer0_invoker.call(HomeController_0.freelancer(searchTerm))
      }
  
    // @LINE:9
    case controllers_HomeController_projectWordStats1_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", Some(""))) { (searchTerm) =>
        controllers_HomeController_projectWordStats1_invoker.call(HomeController_0.projectWordStats(searchTerm))
      }
  
    // @LINE:10
    case controllers_HomeController_wordStats2_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", Some(""))) { (searchTerm) =>
        controllers_HomeController_wordStats2_invoker.call(HomeController_0.wordStats(searchTerm))
      }
  
    // @LINE:12
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_HomeController_skills4_route(params@_) =>
      call(params.fromQuery[String]("s", None)) { (s) =>
        controllers_HomeController_skills4_invoker.call(HomeController_0.skills(s))
      }
  }
}
