
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


Seq[Any](_display_(/*2.2*/main("Global Word Stats")/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""
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
                  HASH: 9d96226516291578529a6d4724c451dd7565b0f1
                  MATRIX: 925->1|1055->39|1088->64|1126->65|1157->70|1399->285|1432->309|1472->311|1517->328|1677->470|1690->475|1729->476|1774->493|2168->860|2217->893|2257->895|2314->924|2383->966|2408->970|2478->1013|2504->1018|2600->1083|2653->1108|2758->1182|2794->1191
                  LINES: 27->1|32->2|32->2|32->2|33->3|42->12|42->12|42->12|43->13|46->16|46->16|46->16|47->17|57->27|57->27|57->27|58->28|59->29|59->29|60->30|60->30|62->32|63->33|66->36|67->37
                  -- GENERATED --
              */
          