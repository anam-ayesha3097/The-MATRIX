
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
  def apply/*2.2*/(searchForm: Map[String,FreelaancelotList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.45*/("""
"""),_display_(/*3.2*/main("FreeLancelot")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<article>
        <head>
            <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
        </head>
        <center>
            <body>
                <form action ="/freelance" method="GET">
                    <input type="text" name="searchTerm" placeholder="Enter search Terms"/>
                    <input type="submit" value="Go!">
                </form>
                <div>
                """),_display_(/*15.18*/if(searchForm != null)/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
                    """),_display_(/*16.22*/for((searchterm,searchvalue) <- searchForm) yield /*16.65*/{_display_(Seq[Any](format.raw/*16.66*/("""
                        """),format.raw/*17.25*/("""<p> search term: """),_display_(/*17.43*/searchterm),format.raw/*17.53*/(""" """),format.raw/*17.54*/(""": Flesh reading Ease Index ## FKLG #.#</p>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.HomeController.wordStats(searchterm)),format.raw/*18.78*/("""">Global Stats</a>
                        <table>
                            <tr>
                                <th style="font-weight: bold">Owner_id</th>
                                <th style="font-weight: bold">Date</th>
                                <th style="font-weight: bold">Title</th>
                                <th style="font-weight: bold">Type</th>
                                <th style="font-weight: bold">Skills</th>
                                <th style="font-weight: bold">Stats</th>
                                <th style="font-weight: bold">Readability</th>
                            </tr>
                            """),_display_(/*29.30*/for(result <- searchvalue.getProjectList()) yield /*29.73*/ {_display_(Seq[Any](format.raw/*29.75*/("""
                                """),format.raw/*30.33*/("""<tr>
                                    <td>"""),_display_(/*31.42*/result/*31.48*/.getOwner_id()),format.raw/*31.62*/("""</td>
                                    <td>"""),_display_(/*32.42*/result/*32.48*/.getDate()),format.raw/*32.58*/("""</td>
                                    <td><a href="https://www.freelancer.com/projects/"""),_display_(/*33.87*/result/*33.93*/.getProject_ID),format.raw/*33.107*/("""/details">"""),_display_(/*33.118*/result/*33.124*/.getProject_title()),format.raw/*33.143*/("""</a></td>
                                    <td>"""),_display_(/*34.42*/result/*34.48*/.getProject_type()),format.raw/*34.66*/("""</td>
                                    <td><a href=""""),_display_(/*35.51*/routes/*35.57*/.HomeController.skills(result.getSkills())),format.raw/*35.99*/("""">"""),_display_(/*35.102*/result/*35.108*/.getSkills()),format.raw/*35.120*/("""</a></td>
                                    <td><a href=""""),_display_(/*36.51*/routes/*36.57*/.HomeController.projectWordStats(result.getProject_description)),format.raw/*36.120*/("""">Stats</a></td>
                                    <td><a href="#">Readability</a></td>
                                </tr>
                            """)))}),format.raw/*39.30*/("""
                        """),format.raw/*40.25*/("""</table>
                    """)))}),format.raw/*41.22*/("""
                """)))}),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""</div>
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
                  HASH: fc7aee1bfe76154da529e7fda945ea6f1df9a58e
                  MATRIX: 610->1|975->35|1113->78|1141->81|1169->101|1207->102|1239->108|1691->533|1722->555|1762->557|1812->580|1871->623|1910->624|1964->650|2009->668|2040->678|2069->679|2174->757|2189->763|2247->800|2951->1477|3010->1520|3050->1522|3112->1556|3186->1603|3201->1609|3236->1623|3311->1671|3326->1677|3357->1687|3477->1780|3492->1786|3528->1800|3567->1811|3583->1817|3624->1836|3703->1888|3718->1894|3757->1912|3841->1969|3856->1975|3919->2017|3950->2020|3966->2026|4000->2038|4088->2099|4103->2105|4188->2168|4379->2328|4433->2354|4495->2385|4545->2404|4591->2422
                  LINES: 23->1|28->2|33->2|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|70->39|71->40|72->41|73->42|74->43
                  -- GENERATED --
              */
          