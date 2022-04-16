
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import service.FreelaancelotList

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[play.mvc.Http.Request,String,Map[String, FreelaancelotList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(request: play.mvc.Http.Request, keyWord: String, searchForm : Map[String,FreelaancelotList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
"""),_display_(/*4.2*/main("Welcome to Freelancelot")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
  """),format.raw/*5.3*/("""<html>
    <article>
      <head>
        <title>Freelancelot</title>
        <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
        <script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
        <script type='text/javascript' src='"""),_display_(/*11.46*/routes/*11.52*/.Assets.at("javascripts/index.js")),format.raw/*11.86*/("""'></script>
      </head>
      <body>
        <form id="searchForm" class="needs-validation">
          <div class="form-group">
            <div class="input-group mb-1">
              <input id="keyword" type="text" placeholder="Search Keyword" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Search</button>
          </div>
        </form>
      </hr>

        <div id="webSocketData" data-ws-url=""""),_display_(/*24.47*/routes/*24.53*/.HomeController.ws("").webSocketURL(request)),format.raw/*24.97*/("""">
          <div id="data"> </div>
        </div>
      </body>
    </article>
  </html>
""")))}))
      }
    }
  }

  def render(request:play.mvc.Http.Request,keyWord:String,searchForm:Map[String, FreelaancelotList]): play.twirl.api.HtmlFormat.Appendable = apply(request,keyWord,searchForm)

  def f:((play.mvc.Http.Request,String,Map[String, FreelaancelotList]) => play.twirl.api.HtmlFormat.Appendable) = (request,keyWord,searchForm) => apply(request,keyWord,searchForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: a5fa2d266c477ff4bd4f60ac7a3f8fd4b2089596
                  MATRIX: 610->1|1000->35|1187->129|1229->146|1268->177|1307->179|1336->182|1644->463|1659->469|1714->503|2205->967|2220->973|2285->1017
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|41->11|41->11|41->11|54->24|54->24|54->24
                  -- GENERATED --
              */
          