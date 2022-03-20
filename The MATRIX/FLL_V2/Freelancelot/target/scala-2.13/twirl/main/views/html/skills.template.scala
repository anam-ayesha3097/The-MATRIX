
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
"""),format.raw/*11.61*/("""
"""),format.raw/*12.96*/("""
"""),format.raw/*13.58*/("""
"""),format.raw/*14.28*/("""
                """),format.raw/*15.17*/("""<div>
                """),_display_(/*16.18*/if(searchForm != null)/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
                    """),_display_(/*17.22*/for((s,searchvalue) <- searchForm) yield /*17.56*/{_display_(Seq[Any](format.raw/*17.57*/("""
                        """),format.raw/*18.25*/("""<p> search term: """),_display_(/*18.43*/s),format.raw/*18.44*/(""" """),format.raw/*18.45*/(""": Flesh reading Ease Index ## FKLG #.#</p>
                        <a href="">Global Stats</a>
                        <table>
                            <tr>
                                <td>Owner_id</td>
                                <td>Date</td>
                                <td>Title</td>
                                <td>Type</td>
                                <td>Skills</td>
                                <td>Stats</td>
                                <td>Readability</td>
                            </tr>
                            """),_display_(/*30.30*/for(result <- searchvalue.getProjectList()) yield /*30.73*/ {_display_(Seq[Any](format.raw/*30.75*/("""
                                """),format.raw/*31.33*/("""<tr>
                                    <td>"""),_display_(/*32.42*/result/*32.48*/.getOwner_id()),format.raw/*32.62*/("""</td>
                                    <td>"""),_display_(/*33.42*/result/*33.48*/.getDate()),format.raw/*33.58*/("""</td>
                                    <td>"""),_display_(/*34.42*/result/*34.48*/.getProject_title()),format.raw/*34.67*/("""</td>
                                    <td>"""),_display_(/*35.42*/result/*35.48*/.getProject_type()),format.raw/*35.66*/("""</td>
                                    <td><a href=""""),_display_(/*36.51*/routes/*36.57*/.HomeController.skills(result.getSkills())),format.raw/*36.99*/("""">"""),_display_(/*36.102*/result/*36.108*/.getSkills()),format.raw/*36.120*/("""</a></td>
                                    <td><a href=#>Stats</a></td>
                                    <td><a href=#>Readability</a></td>
                                </tr>
                            """)))}),format.raw/*40.30*/("""
                        """),format.raw/*41.25*/("""</table>
                    """)))}),format.raw/*42.22*/("""
                """)))}),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""</div>
            </body>
        </center>
    </article>
    """)))}),format.raw/*48.6*/("""
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
                  HASH: 8260d48fe991bb0c220617f10a2e55f2714ce076
                  MATRIX: 610->1|644->30|1005->64|1143->107|1175->114|1197->128|1235->129|1267->135|1449->349|1479->446|1509->505|1539->534|1585->552|1636->576|1667->598|1707->600|1757->623|1807->657|1846->658|1900->684|1945->702|1967->703|1996->704|2595->1276|2654->1319|2694->1321|2756->1355|2830->1402|2845->1408|2880->1422|2955->1470|2970->1476|3001->1486|3076->1534|3091->1540|3131->1559|3206->1607|3221->1613|3260->1631|3344->1688|3359->1694|3422->1736|3453->1739|3469->1745|3503->1757|3751->1974|3805->2000|3867->2031|3917->2050|3963->2068|4062->2137
                  LINES: 23->1|24->2|29->3|34->3|35->4|35->4|35->4|36->5|42->11|43->12|44->13|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|71->40|72->41|73->42|74->43|75->44|79->48
                  -- GENERATED --
              */
          