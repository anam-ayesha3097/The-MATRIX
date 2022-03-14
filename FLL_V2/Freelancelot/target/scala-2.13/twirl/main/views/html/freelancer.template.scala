
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

object freelancer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, FreelaancelotList],play.twirl.api.HtmlFormat.Appendable] {

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
                    """),_display_(/*17.22*/for((searchterm,searchvalue) <- searchForm) yield /*17.65*/{_display_(Seq[Any](format.raw/*17.66*/("""
                        """),format.raw/*18.25*/("""<p> search term: """),_display_(/*18.43*/searchterm),format.raw/*18.53*/(""" """),format.raw/*18.54*/(""": Flesh reading Ease Index ## FKLG #.#</p>
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
                        """),_display_(/*30.26*/for(result <- searchvalue.getProjectList()) yield /*30.69*/ {_display_(Seq[Any](format.raw/*30.71*/("""
                            """),format.raw/*31.29*/("""<tr>
                                <td>"""),_display_(/*32.38*/result/*32.44*/.getOwner_id()),format.raw/*32.58*/("""</td>
                                <td>"""),_display_(/*33.38*/result/*33.44*/.getDate()),format.raw/*33.54*/("""</td>
                                <td>"""),_display_(/*34.38*/result/*34.44*/.getProject_title()),format.raw/*34.63*/("""</td>
                                <td>"""),_display_(/*35.38*/result/*35.44*/.getProject_type()),format.raw/*35.62*/("""</td>
                                <td><a href=""""),_display_(/*36.47*/routes/*36.53*/.HomeController.skills(result.getSkills())),format.raw/*36.95*/("""">"""),_display_(/*36.98*/result/*36.104*/.getSkills()),format.raw/*36.116*/("""</a></td>
                                <td><a href=#>Stats</a></td>
                                <td><a href=#>Readability</a></td>
                            </tr>
                        """)))}),format.raw/*40.26*/("""
                        """),format.raw/*41.25*/("""</table>
                    """)))}),format.raw/*42.22*/("""
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</div>
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
                  HASH: bbd050e10175c3a82f218cf3772d486b37110da3
                  MATRIX: 610->1|644->30|1009->64|1147->107|1175->110|1203->130|1241->131|1273->137|1685->522|1716->544|1756->546|1806->569|1865->612|1904->613|1958->639|2003->657|2034->667|2063->668|2622->1200|2681->1243|2721->1245|2779->1275|2849->1318|2864->1324|2899->1338|2970->1382|2985->1388|3016->1398|3087->1442|3102->1448|3142->1467|3213->1511|3228->1517|3267->1535|3347->1588|3362->1594|3425->1636|3455->1639|3471->1645|3505->1657|3737->1858|3791->1884|3853->1915|3903->1934|3945->1948
                  LINES: 23->1|24->2|29->3|34->3|35->4|35->4|35->4|36->5|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|71->40|72->41|73->42|74->43|75->44
                  -- GENERATED --
              */
          