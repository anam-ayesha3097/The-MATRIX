
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
"""),_display_(/*4.2*/main("FreeLancelot")/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<article>
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
                                    <td>"""),_display_(/*36.42*/result/*36.48*/.getSkills()),format.raw/*36.60*/("""</td>
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
                  SOURCE: app/views/skills.scala.html
                  HASH: c18abc2308a9e23526af97c1df16aa5dca74ef20
                  MATRIX: 610->1|644->30|1005->64|1143->107|1171->110|1199->130|1237->131|1269->137|1721->562|1752->584|1792->586|1842->609|1892->643|1931->644|1985->670|2030->688|2052->689|2081->690|2680->1262|2739->1305|2779->1307|2841->1341|2915->1388|2930->1394|2965->1408|3040->1456|3055->1462|3086->1472|3161->1520|3176->1526|3216->1545|3291->1593|3306->1599|3345->1617|3420->1665|3435->1671|3468->1683|3712->1896|3766->1922|3828->1953|3878->1972|3924->1990
                  LINES: 23->1|24->2|29->3|34->3|35->4|35->4|35->4|36->5|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|71->40|72->41|73->42|74->43|75->44
                  -- GENERATED --
              */
          