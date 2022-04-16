
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

object myHTMLPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(date: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<section>
    <h1>"""),_display_(/*3.10*/{date}),format.raw/*3.16*/("""</h1>
</section>"""))
      }
    }
  }

  def render(date:Date): play.twirl.api.HtmlFormat.Appendable = apply(date)

  def f:((Date) => play.twirl.api.HtmlFormat.Appendable) = (date) => apply(date)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/myHTMLPage.scala.html
                  HASH: 6fff69f9562ba8dcaf792c95373520e49916b458
                  MATRIX: 910->1|1017->13|1045->15|1091->35|1117->41
                  LINES: 27->1|32->1|33->2|34->3|34->3
                  -- GENERATED --
              */
          