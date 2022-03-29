
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
/*1.2*/import models.FreelaancelotList

object freelancer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, FreelaancelotList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(searchForm : Map[String,FreelaancelotList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.46*/("""
"""),_display_(/*3.2*/main("FreeLancelot")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<article>
        <head>
            <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
        </head>
        <center>
            <body>
                <form action ="/freelance" method="GET">
                    <input type="text" name="searchTerm" placeholder="Enter Search Terms"/>
                    <input type="submit" value="Go!" style="background-color: #1874CD;color: white">
                </form>
                <div>
                """),_display_(/*15.18*/if(searchForm != null)/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
                    """),_display_(/*16.22*/for((searchterm,searchvalue) <- searchForm) yield /*16.65*/{_display_(Seq[Any](format.raw/*16.66*/("""
                        """),format.raw/*17.25*/("""<p style = "font-weight: bold" >Job Search : """),_display_(/*17.71*/searchterm),format.raw/*17.81*/("""  """),format.raw/*17.83*/("""Flesh Reading Ease Index:  """),_display_(/*17.111*/searchvalue/*17.122*/.getAvgReadability(searchterm)),format.raw/*17.152*/("""  """),format.raw/*17.154*/("""FKLG: """),_display_(/*17.161*/searchvalue/*17.172*/.getAvgEducationalLevel(searchterm)),format.raw/*17.207*/(""" """),format.raw/*17.208*/("""</p>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.HomeController.wordStats(searchterm)),format.raw/*18.78*/("""" >Global Stats</a>
                        <table>
                            <tr>
                                <th style="font-weight: bold">Owner_id</th>
                                <th style="font-weight: bold">Date</th>
                                <th style="font-weight: bold">Title</th>
                                <th style="font-weight: bold">Type</th>
                                <th style="font-weight: bold">Skills</th>
                                <th style="font-weight: bold">Stats</th>
                                <th style="font-weight: bold">Readability</th>
                                <th style="font-weight: bold">Education Level</th>
                            </tr>
                            """),_display_(/*30.30*/for(result <- searchvalue.getProjectList()) yield /*30.73*/ {_display_(Seq[Any](format.raw/*30.75*/("""
                                """),format.raw/*31.33*/("""<tr>
                                    <td><a href=""""),_display_(/*32.51*/routes/*32.57*/.HomeController.ownerInformation(result.getOwner_id())),format.raw/*32.111*/("""" target="_blank"> """),_display_(/*32.131*/result/*32.137*/.getOwner_id),format.raw/*32.149*/(""" """),format.raw/*32.150*/("""</a> </td>
                                    <td>"""),_display_(/*33.42*/result/*33.48*/.getDate()),format.raw/*33.58*/("""</td>
                                    <td><a href="https://www.freelancer.com/projects/"""),_display_(/*34.87*/result/*34.93*/.getProject_ID),format.raw/*34.107*/("""/details">"""),_display_(/*34.118*/result/*34.124*/.getProject_title()),format.raw/*34.143*/("""</a></td>
                                    <td>"""),_display_(/*35.42*/result/*35.48*/.getProject_type()),format.raw/*35.66*/("""</td>
                                    <td><a href=""""),_display_(/*36.51*/routes/*36.57*/.HomeController.skills(result.getSkills())),format.raw/*36.99*/("""">"""),_display_(/*36.102*/result/*36.108*/.getSkills()),format.raw/*36.120*/("""</a></td>
                                    <td><a href=""""),_display_(/*37.51*/routes/*37.57*/.HomeController.projectWordStats(result.getProject_description())),format.raw/*37.122*/("""">Stats</a></td>
                                    <td>"""),_display_(/*38.42*/result/*38.48*/.getReadability()),format.raw/*38.65*/("""</td>
                                    <td>"""),_display_(/*39.42*/result/*39.48*/.getEducationalLevel()),format.raw/*39.70*/("""</td>
                                </tr>
                            """)))}),format.raw/*41.30*/("""
                        """),format.raw/*42.25*/("""</table>
                    """)))}),format.raw/*43.22*/("""
                """)))}),format.raw/*44.18*/("""
                """),format.raw/*45.17*/("""</div>
            </body>
        </center>
    </article>
""")))}))
      }
    }
  }

  def render(searchForm:Map[String, FreelaancelotList]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm)

  def f:((Map[String, FreelaancelotList]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/freelancer.scala.html
                  HASH: b1970254c9b54e3a739f0b41191f1b25922dc34c
                  MATRIX: 610->1|975->35|1114->79|1142->82|1170->102|1208->103|1240->109|1739->581|1770->603|1810->605|1860->628|1919->671|1958->672|2012->698|2085->744|2116->754|2146->756|2202->784|2223->795|2275->825|2306->827|2341->834|2362->845|2419->880|2449->881|2516->921|2531->927|2589->964|3378->1726|3437->1769|3477->1771|3539->1805|3622->1861|3637->1867|3713->1921|3761->1941|3777->1947|3811->1959|3841->1960|3921->2013|3936->2019|3967->2029|4087->2122|4102->2128|4138->2142|4177->2153|4193->2159|4234->2178|4313->2230|4328->2236|4367->2254|4451->2311|4466->2317|4529->2359|4560->2362|4576->2368|4610->2380|4698->2441|4713->2447|4800->2512|4886->2571|4901->2577|4939->2594|5014->2642|5029->2648|5072->2670|5178->2745|5232->2771|5294->2802|5344->2821|5390->2839
                  LINES: 23->1|28->2|33->2|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|61->30|61->30|61->30|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|72->41|73->42|74->43|75->44|76->45
                  -- GENERATED --
              */
          