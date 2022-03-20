
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

object wordstats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(wordsHashMap: Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/main("Global Word Stats")/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""
    """),format.raw/*3.5*/("""<html>
<head>
    <title>Global Word Stats</title>
</head>
<article>
<body id="wordStatsPageBody">
    <div id="main-div" class="container">

        <div id="allProjectsDiv" class="projects-main-div">
            """),_display_(/*12.14*/if(wordsHashMap.isEmpty)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-warning" role="alert" id="userMsgDiv">
                    No projects as of now
                </div>
            """)))}/*16.15*/else/*16.20*/{_display_(Seq[Any](format.raw/*16.21*/("""
                """),format.raw/*17.17*/("""<div class="" id="tableContainerDiv" >

                </div>
                <table>
                        <tr>
                            <th style="font-weight: bold">Words</th>
                            <th style="font-weight: bold">Frequency</th>
                    <tr/>
                    <tbody>
                        <div>
                        """),_display_(/*27.26*/for((word,count) <- wordsHashMap) yield /*27.59*/ {_display_(Seq[Any](format.raw/*27.61*/("""
                            """),format.raw/*28.29*/("""<tr>
                                <td>"""),_display_(/*29.38*/word),format.raw/*29.42*/("""</td>
                                <td>"""),_display_(/*30.38*/count),format.raw/*30.43*/("""</td>
                            </tr>
                        """)))}),format.raw/*32.26*/("""
                        """),format.raw/*33.25*/("""</div>
                    </tbody>
                </table>
            """)))}),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</div>
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
                  SOURCE: app/views/wordstats.scala.html
                  HASH: c3acdfa922446e6fd006dc5c4efdf572652f472c
                  MATRIX: 925->1|1056->37|1084->40|1117->65|1155->66|1187->72|1438->296|1471->320|1511->322|1557->340|1720->485|1733->490|1772->491|1818->509|2222->886|2271->919|2311->921|2369->951|2439->994|2464->998|2535->1042|2561->1047|2659->1114|2713->1140|2821->1217|2858->1227
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|58->27|58->27|58->27|59->28|60->29|60->29|61->30|61->30|63->32|64->33|67->36|68->37
                  -- GENERATED --
              */
          