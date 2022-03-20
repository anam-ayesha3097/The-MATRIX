
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

object projectwordstats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(wordsHashMap: Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Individual Word Stats")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
    """),format.raw/*3.5*/("""<html>
        <head>
            <title>Individual Word Stats</title>
        </head>
        <article>
            <body id="wordStatsPageBody">
                <div id="main-div" class="container">

                    <div id="allProjectsDiv" class="projects-main-div">
                    """),_display_(/*12.22*/if(wordsHashMap.isEmpty)/*12.46*/ {_display_(Seq[Any](format.raw/*12.48*/("""
                        """),format.raw/*13.25*/("""<div class="alert alert-warning" role="alert" id="userMsgDiv">
                            No projects as of now
                        </div>
                    """)))}/*16.23*/else/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
                        """),format.raw/*17.25*/("""<div class="" id="tableContainerDiv" >

                        </div>
                        <table>
                            <tr>
                                <th style="font-weight: bold">Words</th>
                                <th style="font-weight: bold">Frequency</th>
                        <tr/>
                            <tbody>
                                <div>
                                """),_display_(/*27.34*/for((word,count) <- wordsHashMap) yield /*27.67*/ {_display_(Seq[Any](format.raw/*27.69*/("""
                                    """),format.raw/*28.37*/("""<tr>
                                        <td>"""),_display_(/*29.46*/word),format.raw/*29.50*/("""</td>
                                        <td>"""),_display_(/*30.46*/count),format.raw/*30.51*/("""</td>
                                    </tr>
                                """)))}),format.raw/*32.34*/("""
                                """),format.raw/*33.33*/("""</div>
                            </tbody>
                        </table>
                    """)))}),format.raw/*36.22*/("""
                    """),format.raw/*37.21*/("""</div>
                </div>

            </body>
        </article>
    </html>
""")))}))
      }
    }
  }

  def render(wordsHashMap:Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(wordsHashMap)

  def f:((Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (wordsHashMap) => apply(wordsHashMap)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/projectwordstats.scala.html
                  HASH: 1dcd543b65cf7574cb2885d42d88e90a83e1c1d4
                  MATRIX: 932->1|1062->39|1099->68|1137->69|1168->74|1490->369|1523->393|1563->395|1616->420|1800->586|1813->591|1852->592|1905->617|2355->1040|2404->1073|2444->1075|2509->1112|2586->1162|2611->1166|2689->1217|2715->1222|2827->1303|2888->1336|3017->1434|3066->1455
                  LINES: 27->1|32->2|32->2|32->2|33->3|42->12|42->12|42->12|43->13|46->16|46->16|46->16|47->17|57->27|57->27|57->27|58->28|59->29|59->29|60->30|60->30|62->32|63->33|66->36|67->37
                  -- GENERATED --
              */
          