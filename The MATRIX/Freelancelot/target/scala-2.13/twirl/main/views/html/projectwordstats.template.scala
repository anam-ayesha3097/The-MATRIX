
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


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/main("Individual Word Stats")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
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
                  HASH: 61401830fc4d8611c3ab16328c4ac4c052bcb72c
                  MATRIX: 932->1|1063->37|1091->40|1128->69|1166->70|1198->76|1529->380|1562->404|1602->406|1656->432|1843->601|1856->606|1895->607|1949->633|2409->1066|2458->1099|2498->1101|2564->1139|2642->1190|2667->1194|2746->1246|2772->1251|2886->1334|2948->1368|3080->1469|3130->1491
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|58->27|58->27|58->27|59->28|60->29|60->29|61->30|61->30|63->32|64->33|67->36|68->37
                  -- GENERATED --
              */
          