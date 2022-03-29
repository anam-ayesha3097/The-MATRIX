
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
/*1.2*/import models.Freelancelot
/*2.2*/import models.FreelaancelotList

object skills extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, FreelaancelotList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchForm: Map[String,FreelaancelotList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.45*/("""
    """),_display_(/*4.6*/main("skills")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<article>
        <head>
            <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
        </head>
        <center>
            <body>
                <div>
                """),_display_(/*12.18*/if(searchForm != null)/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                    """),_display_(/*13.22*/for((s,searchvalue) <- searchForm) yield /*13.56*/{_display_(Seq[Any](format.raw/*13.57*/("""
                        """),format.raw/*14.25*/("""<table>
                            <tr>
                                <td>Owner_id</td>
                                <td>Date</td>
                                <td>Title</td>
                                <td>Type</td>
                                <td>Skills</td>
                            </tr>
                            """),_display_(/*22.30*/for(result <- searchvalue.getProjectList()) yield /*22.73*/ {_display_(Seq[Any](format.raw/*22.75*/("""
                                """),format.raw/*23.33*/("""<tr>
                                    <td>"""),_display_(/*24.42*/result/*24.48*/.getOwner_id()),format.raw/*24.62*/("""</td>
                                    <td>"""),_display_(/*25.42*/result/*25.48*/.getDate()),format.raw/*25.58*/("""</td>
                                    <td>"""),_display_(/*26.42*/result/*26.48*/.getProject_title()),format.raw/*26.67*/("""</td>
                                    <td>"""),_display_(/*27.42*/result/*27.48*/.getProject_type()),format.raw/*27.66*/("""</td>
                                    <td><a href=""""),_display_(/*28.51*/routes/*28.57*/.HomeController.skills(result.getSkills())),format.raw/*28.99*/("""">"""),_display_(/*28.102*/result/*28.108*/.getSkills()),format.raw/*28.120*/("""</a></td>
                                </tr>
                            """)))}),format.raw/*30.30*/("""
                        """),format.raw/*31.25*/("""</table>
                    """)))}),format.raw/*32.22*/("""
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</div>
            </body>
        </center>
    </article>
    """)))}),format.raw/*38.6*/("""
"""))
      }
    }
  }

  def render(searchForm:Map[String, FreelaancelotList]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm)

  def f:((Map[String, FreelaancelotList]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/skills.scala.html
                  HASH: 7c0fcf429cea527d13488974fb724cc7e9021650
                  MATRIX: 610->1|644->30|1005->64|1143->107|1175->114|1197->128|1235->129|1267->135|1488->329|1519->351|1559->353|1609->376|1659->410|1698->411|1752->437|2128->786|2187->829|2227->831|2289->865|2363->912|2378->918|2413->932|2488->980|2503->986|2534->996|2609->1044|2624->1050|2664->1069|2739->1117|2754->1123|2793->1141|2877->1198|2892->1204|2955->1246|2986->1249|3002->1255|3036->1267|3146->1346|3200->1372|3262->1403|3312->1422|3358->1440|3457->1509
                  LINES: 23->1|24->2|29->3|34->3|35->4|35->4|35->4|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|61->30|62->31|63->32|64->33|65->34|69->38
                  -- GENERATED --
              */
          