
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
/*1.2*/import service.Freelancelot
/*2.2*/import service.FreelaancelotList

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
                <div>
                """),_display_(/*12.18*/if(searchForm != null)/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                    """),_display_(/*13.22*/for((s,searchvalue) <- searchForm) yield /*13.56*/{_display_(Seq[Any](format.raw/*13.57*/("""
                        """),format.raw/*14.25*/("""<table>
                            <tr>
                                <td>Owner_id</td>
                                <td>Date</td>
                                <td>Title</td>
                                <td>Type</td>
                                <td>Skills</td>
                            </tr>
                            """),_display_(/*22.30*/for(result <- searchvalue.getProjectList()) yield /*22.73*/ {_display_(Seq[Any](format.raw/*22.75*/("""
                                """),format.raw/*23.33*/("""<tr>
                                    <td>"""),_display_(/*24.42*/result/*24.48*/.getOwner_id()),format.raw/*24.62*/("""</td>
                                    <td>"""),_display_(/*25.42*/result/*25.48*/.getDate()),format.raw/*25.58*/("""</td>
                                    <td>"""),_display_(/*26.42*/result/*26.48*/.getProject_title()),format.raw/*26.67*/("""</td>
                                    <td>"""),_display_(/*27.42*/result/*27.48*/.getProject_type()),format.raw/*27.66*/("""</td>
                                    <td><a href=""""),_display_(/*28.51*/routes/*28.57*/.HomeController.skills(result.getSkills())),format.raw/*28.99*/("""">"""),_display_(/*28.102*/result/*28.108*/.getSkills()),format.raw/*28.120*/("""</a></td>
                                </tr>
                            """)))}),format.raw/*30.30*/("""
                        """),format.raw/*31.25*/("""</table>
                    """)))}),format.raw/*32.22*/("""
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</div>
            </body>
        </center>
    </article>
    """)))}),format.raw/*38.6*/("""
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
                  HASH: 2cec986582163310a0f3d8fc154fac129f348b41
                  MATRIX: 610->1|645->31|1007->66|1145->109|1177->116|1199->130|1237->131|1269->137|1490->331|1521->353|1561->355|1611->378|1661->412|1700->413|1754->439|2130->788|2189->831|2229->833|2291->867|2365->914|2380->920|2415->934|2490->982|2505->988|2536->998|2611->1046|2626->1052|2666->1071|2741->1119|2756->1125|2795->1143|2879->1200|2894->1206|2957->1248|2988->1251|3004->1257|3038->1269|3148->1348|3202->1374|3264->1405|3314->1424|3360->1442|3459->1511
                  LINES: 23->1|24->2|29->3|34->3|35->4|35->4|35->4|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|61->30|62->31|63->32|64->33|65->34|69->38
                  -- GENERATED --
              */
          