
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

object ownerDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.OwnerInformation,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ownerDetail : models.OwnerInformation):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),_display_(/*2.2*/main("Owner Details")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<html>
        <head>
            <style>
                    p """),format.raw/*6.23*/("""{"""),format.raw/*6.24*/("""text-align: center;"""),format.raw/*6.43*/("""}"""),format.raw/*6.44*/("""
                    """),format.raw/*7.21*/("""div """),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""text-align: center;"""),format.raw/*7.45*/("""}"""),format.raw/*7.46*/("""
            """),format.raw/*8.13*/("""</style>
            <title>Owner Details</title>
        </head>
        <article>
            <body id="OwnerDetailsBody">
                <div id="main-div" class="container">

                    <div id="details" class="projects-main-div">

                        <div class="" id="tableContainerDiv" >
                            <p style="color:blue;"> <b>OWNER DETAILS</b> </p>
                            <p style="color:green;"> <b>Owner Id : </b> """),_display_(/*19.74*/ownerDetail/*19.85*/.getId()),format.raw/*19.93*/(""" """),format.raw/*19.94*/("""</p>
                            <p style="color:green;"> <b>Username : </b> """),_display_(/*20.74*/ownerDetail/*20.85*/.getUsername()),format.raw/*20.99*/(""" """),format.raw/*20.100*/("""</p>
                            <p style="color:green;"> <b> Company : </b> """),_display_(/*21.74*/ownerDetail/*21.85*/.getCompany()),format.raw/*21.98*/(""" """),format.raw/*21.99*/("""</p>
                            <p style="color:green;"> <b> Role : </b> """),_display_(/*22.71*/ownerDetail/*22.82*/.getRole()),format.raw/*22.92*/(""" """),format.raw/*22.93*/("""</p>
                            <p style="color:green;"> <b> Primary Currency: </b> """),_display_(/*23.82*/ownerDetail/*23.93*/.getPrimaryCurrency()),format.raw/*23.114*/(""" """),format.raw/*23.115*/("""</p>
                            <p style="color:green;"> <b> Registration: </b> """),_display_(/*24.78*/ownerDetail/*24.89*/.getRegistrationDate()),format.raw/*24.111*/(""" """),format.raw/*24.112*/("""</p>
                            <p style="color:green;"> <b> Country: </b> """),_display_(/*25.73*/ownerDetail/*25.84*/.getCountry()),format.raw/*25.97*/(""" """),format.raw/*25.98*/("""</p>
                            <p style="color:green;"> <b> Limited Account: </b> """),_display_(/*26.81*/ownerDetail/*26.92*/.getLimitedAccount()),format.raw/*26.112*/(""" """),format.raw/*26.113*/("""</p>
                            <p style="color:green;"> <b> Email Verified: </b> """),_display_(/*27.80*/ownerDetail/*27.91*/.getEmailVerified()),format.raw/*27.110*/(""" """),format.raw/*27.111*/("""</p>
                        </div>

                        <div>

                            <p style="color:blue;" text-align: center;> <b> Below are the top 10 Projects for owner ID : """),_display_(/*32.123*/ownerDetail/*32.134*/.getId()),format.raw/*32.142*/(""" """),format.raw/*32.143*/("""</b></p>
                            <table>
                                <tr>
                                    <th style="font-weight: bold">Owner_id</th>
                                    <th style="font-weight: bold">Date</th>
                                    <th style="font-weight: bold">Title</th>
                                    <th style="font-weight: bold">Type</th>
                                    <th style="font-weight: bold">Skills</th>

                                </tr>
                                """),_display_(/*42.34*/for(result <- ownerDetail.getOwnerProjects_active().get(ownerDetail.getId()).getProjectList()) yield /*42.128*/ {_display_(Seq[Any](format.raw/*42.130*/("""
                                    """),format.raw/*43.37*/("""<tr>
                                        <td><a href=""""),_display_(/*44.55*/routes/*44.61*/.HomeController.ownerInformation(result.getOwner_id())),format.raw/*44.115*/("""" target="_blank"> """),_display_(/*44.135*/result/*44.141*/.getOwner_id),format.raw/*44.153*/(""" """),format.raw/*44.154*/("""</a> </td>
                                        <td>"""),_display_(/*45.46*/result/*45.52*/.getDate()),format.raw/*45.62*/("""</td>
                                        <td><a href="https://www.freelancer.com/projects/"""),_display_(/*46.91*/result/*46.97*/.getProject_ID),format.raw/*46.111*/("""/details">"""),_display_(/*46.122*/result/*46.128*/.getProject_title()),format.raw/*46.147*/("""</a></td>
                                        <td>"""),_display_(/*47.46*/result/*47.52*/.getProject_type()),format.raw/*47.70*/("""</td>
                                        <td><a href=""""),_display_(/*48.55*/routes/*48.61*/.HomeController.skills(result.getSkills())),format.raw/*48.103*/("""">"""),_display_(/*48.106*/result/*48.112*/.getSkills()),format.raw/*48.124*/("""</a></td>
                                    </tr>
                                """)))}),format.raw/*50.34*/("""
                            """),format.raw/*51.29*/("""</table>

                        </div>

                    </div>
                </div>

            </body>
        </article>
    </html>
""")))}))
      }
    }
  }

  def render(ownerDetail:models.OwnerInformation): play.twirl.api.HtmlFormat.Appendable = apply(ownerDetail)

  def f:((models.OwnerInformation) => play.twirl.api.HtmlFormat.Appendable) = (ownerDetail) => apply(ownerDetail)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/ownerDetails.scala.html
                  HASH: 90653a04f5fd42220b10af6334404080d72c8f8e
                  MATRIX: 931->1|1065->40|1093->43|1122->64|1160->65|1192->71|1286->138|1314->139|1360->158|1388->159|1437->181|1468->185|1496->186|1542->205|1570->206|1611->220|2109->691|2129->702|2158->710|2187->711|2293->790|2313->801|2348->815|2378->816|2484->895|2504->906|2538->919|2567->920|2670->996|2690->1007|2721->1017|2750->1018|2864->1105|2884->1116|2927->1137|2957->1138|3067->1221|3087->1232|3131->1254|3161->1255|3266->1333|3286->1344|3320->1357|3349->1358|3462->1444|3482->1455|3524->1475|3554->1476|3666->1561|3686->1572|3727->1591|3757->1592|3980->1787|4001->1798|4031->1806|4061->1807|4639->2358|4750->2452|4791->2454|4857->2492|4944->2552|4959->2558|5035->2612|5083->2632|5099->2638|5133->2650|5163->2651|5247->2708|5262->2714|5293->2724|5417->2821|5432->2827|5468->2841|5507->2852|5523->2858|5564->2877|5647->2933|5662->2939|5701->2957|5789->3018|5804->3024|5868->3066|5899->3069|5915->3075|5949->3087|6067->3174|6125->3204
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|63->32|63->32|63->32|63->32|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|81->50|82->51
                  -- GENERATED --
              */
          