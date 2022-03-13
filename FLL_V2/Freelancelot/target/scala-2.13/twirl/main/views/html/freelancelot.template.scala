
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

object freelancelot extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Search],MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[Search])(implicit messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.73*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
<head>
    <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
</head>

    <body>
       """),_display_(/*10.9*/helper/*10.15*/.form(action = routes.HomeController.explore())/*10.62*/ {_display_(Seq[Any](format.raw/*10.64*/("""
          """),_display_(/*11.12*/helper/*11.18*/.inputText(searchForm("searchInput"))),format.raw/*11.55*/("""

           """),format.raw/*13.12*/("""<input type="submit" value="Go!">

       """)))}),format.raw/*15.9*/("""
    """),format.raw/*16.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(searchForm:Form[Search],messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(searchForm)(messagesProvider)

  def f:((Form[Search]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (searchForm) => (messagesProvider) => apply(searchForm)(messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/freelancelot.scala.html
                  HASH: 4e9a8c4a1cb6b793dfb4751474f2a7f0f857ab45
                  MATRIX: 937->1|1081->75|1126->72|1154->92|1182->94|1319->205|1334->211|1390->258|1430->260|1470->273|1485->279|1543->316|1586->331|1661->376|1694->382
                  LINES: 27->1|30->2|33->1|34->3|35->4|41->10|41->10|41->10|41->10|42->11|42->11|42->11|44->13|46->15|47->16
                  -- GENERATED --
              */
          