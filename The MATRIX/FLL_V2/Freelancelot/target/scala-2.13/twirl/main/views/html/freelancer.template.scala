
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


Seq[Any](_display_(/*3.2*/main("FreeLancelot")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
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
                  HASH: 4b5de7429c6ceebb48083366d44f63575372808f
                  MATRIX: 610->1|975->34|1112->79|1140->99|1178->100|1209->105|1650->519|1681->541|1721->543|1770->565|1829->608|1868->609|1921->634|1966->652|1997->662|2026->663|2130->740|2145->746|2203->783|2896->1449|2955->1492|2995->1494|3056->1527|3129->1573|3144->1579|3179->1593|3253->1640|3268->1646|3299->1656|3418->1748|3433->1754|3469->1768|3508->1779|3524->1785|3565->1804|3643->1855|3658->1861|3697->1879|3780->1935|3795->1941|3858->1983|3889->1986|3905->1992|3939->2004|4026->2064|4041->2070|4126->2133|4314->2290|4367->2315|4428->2345|4477->2363|4522->2380
                  LINES: 23->1|28->2|33->3|33->3|33->3|34->4|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|48->18|48->18|48->18|59->29|59->29|59->29|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|65->35|65->35|65->35|66->36|66->36|66->36|69->39|70->40|71->41|72->42|73->43
                  -- GENERATED --
              */
          