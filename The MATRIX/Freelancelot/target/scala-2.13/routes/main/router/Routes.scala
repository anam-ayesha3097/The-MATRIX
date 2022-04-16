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
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:14
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """freelancelot""", """controllers.HomeController.freelancelot(request:Request, searchTerm:String ?= "", sessionID:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myName""", """controllers.HomeController.sayHello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ws""", """controllers.HomeController.ws(searchTerm:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """IndvWordStats/""" + "$" + """searchTerm<[^/]+>""", """controllers.HomeController.projectWordStats(searchTerm:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wordstats""", """controllers.HomeController.wordStats(searchTerm:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills""", """controllers.HomeController.skills(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ownerInformation/""" + "$" + """ownerId<[^/]+>""", """controllers.HomeController.ownerInformation(ownerId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_freelancelot0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("freelancelot")))
  )
  private[this] lazy val controllers_HomeController_freelancelot0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.freelancelot(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "freelancelot",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String]),
      "GET",
      this.prefix + """freelancelot""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_sayHello1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myName")))
  )
  private[this] lazy val controllers_HomeController_sayHello1_invoker = createInvoker(
    HomeController_0.sayHello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sayHello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """myName""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_ws2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ws")))
  )
  private[this] lazy val controllers_HomeController_ws2_invoker = createInvoker(
    HomeController_0.ws(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ws",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ws""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_projectWordStats3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("IndvWordStats/"), DynamicPart("searchTerm", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_projectWordStats3_invoker = createInvoker(
    HomeController_0.projectWordStats(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projectWordStats",
      Seq(classOf[String]),
      "GET",
      this.prefix + """IndvWordStats/""" + "$" + """searchTerm<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_wordStats4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wordstats")))
  )
  private[this] lazy val controllers_HomeController_wordStats4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_skills5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills")))
  )
  private[this] lazy val controllers_HomeController_skills5_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_HomeController_ownerInformation6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ownerInformation/"), DynamicPart("ownerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_ownerInformation6_invoker = createInvoker(
    HomeController_0.ownerInformation(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ownerInformation",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ownerInformation/""" + "$" + """ownerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_freelancelot0_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", Some("")), params.fromQuery[String]("sessionID", Some(""))) { (searchTerm, sessionID) =>
        controllers_HomeController_freelancelot0_invoker.call(
          req => HomeController_0.freelancelot(req, searchTerm, sessionID))
      }
  
    // @LINE:7
    case controllers_HomeController_sayHello1_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_sayHello1_invoker.call(HomeController_0.sayHello(name))
      }
  
    // @LINE:8
    case controllers_HomeController_ws2_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", None)) { (searchTerm) =>
        controllers_HomeController_ws2_invoker.call(HomeController_0.ws(searchTerm))
      }
  
    // @LINE:9
    case controllers_HomeController_projectWordStats3_route(params@_) =>
      call(params.fromPath[String]("searchTerm", None)) { (searchTerm) =>
        controllers_HomeController_projectWordStats3_invoker.call(HomeController_0.projectWordStats(searchTerm))
      }
  
    // @LINE:10
    case controllers_HomeController_wordStats4_route(params@_) =>
      call(params.fromQuery[String]("searchTerm", Some(""))) { (searchTerm) =>
        controllers_HomeController_wordStats4_invoker.call(HomeController_0.wordStats(searchTerm))
      }
  
    // @LINE:11
    case controllers_HomeController_skills5_route(params@_) =>
      call(params.fromQuery[String]("s", None)) { (s) =>
        controllers_HomeController_skills5_invoker.call(HomeController_0.skills(s))
      }
  
    // @LINE:12
    case controllers_HomeController_ownerInformation6_route(params@_) =>
      call(params.fromPath[String]("ownerId", None)) { (ownerId) =>
        controllers_HomeController_ownerInformation6_invoker.call(HomeController_0.ownerInformation(ownerId))
      }
  
    // @LINE:14
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_at8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_1.at(path, file))
      }
  }
}
