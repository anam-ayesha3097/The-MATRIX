
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
/*1.2*/import service.FreelaancelotList

object free extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.mvc.Http.Request,String,Map[String, FreelaancelotList],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(request: play.mvc.Http.Request, keyWord: String, searchForm : Map[String,FreelaancelotList], sessionID:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.113*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
"""),_display_(/*4.2*/main("Freelancelot")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<html>
        <article>
            <head>
                <title>Freelancelot</title>
                <script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
                <script type='text/javascript' src='"""),_display_(/*10.54*/routes/*10.60*/.Assets.at("javascripts/index.js")),format.raw/*10.94*/("""'></script>
                <script>
                        init()
                        var webSocket;
                        function init() """),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""
                            """),format.raw/*15.29*/("""initWebSocket();

                        """),format.raw/*17.25*/("""}"""),format.raw/*17.26*/("""
                        """),format.raw/*18.25*/("""async function initWebSocket() """),format.raw/*18.56*/("""{"""),format.raw/*18.57*/("""
                            """),_display_(/*19.30*/for( (keyword, searchValue) <- searchForm ) yield /*19.73*/{_display_(Seq[Any](format.raw/*19.74*/("""
                            """),_display_(/*20.30*/if(request.session().get(keyword+ "-result").isPresent() || keyword==keyWord)/*20.107*/{_display_(Seq[Any](format.raw/*20.108*/("""
                            """),format.raw/*21.29*/("""webSocket = new WebSocket(""""),_display_(/*21.57*/routes/*21.63*/.HomeController.ws(keyWord:String).webSocketURL(request)),format.raw/*21.119*/("""");
                            console.log("WebSocket -> ",webSocket)
                            webSocket.onopen = onOpen;
                            """)))}),format.raw/*24.30*/("""
                            """)))}),format.raw/*25.30*/("""
                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""
                        """),format.raw/*27.25*/("""async function onOpen(evt) """),format.raw/*27.52*/("""{"""),format.raw/*27.53*/("""
                            """),format.raw/*28.29*/("""console.log("WebSocket -> CONNECTED");
                        """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""
                """),format.raw/*30.17*/("""</script>
            </head>
            <body data-ws-url=""""),_display_(/*32.33*/routes/*32.39*/.HomeController.ws(keyWord:String).webSocketURL(request)),format.raw/*32.95*/("""">
                <center>
                <div class ="main">
                    <h1>Welcome to FreeLancelot</h1>
                    <main class ="main-class">
                    <div class = "search-Form" id = "searchForm">
                        <form action ="/freelancelot" method="GET">
                        <input type="text" name="searchTerm" placeholder="Enter Search Terms"/>
                            <input type="hidden" name="sessionID" id="sessionID" value= '"""),_display_(/*40.91*/sessionID),format.raw/*40.100*/("""'/>
                        <input type="submit" value="Go!" style="background-color: #1874CD;color: white">
                </form>
            </div>
                    </main>
                </div>
                    <div id = "time">
                    </div>
                    <div class="search-body" id="search-body">
                    """),_display_(/*49.22*/if(searchForm != null)/*49.44*/ {_display_(Seq[Any](format.raw/*49.46*/("""
                        """),_display_(/*50.26*/for((searchterm,searchvalue) <- searchForm) yield /*50.69*/{_display_(Seq[Any](format.raw/*50.70*/("""
                            """),format.raw/*51.29*/("""<p style = "font-weight: bold" >Job Search : """),_display_(/*51.75*/searchterm),format.raw/*51.85*/("""  """),format.raw/*51.87*/("""Flesh Reading Ease Index:  """),_display_(/*51.115*/searchvalue/*51.126*/.getAvgReadability(searchterm)),format.raw/*51.156*/("""  """),format.raw/*51.158*/("""FKLG: """),_display_(/*51.165*/searchvalue/*51.176*/.getAvgEducationalLevel(searchterm)),format.raw/*51.211*/(""" """),format.raw/*51.212*/("""</p>
                            <a href=""""),_display_(/*52.39*/routes/*52.45*/.HomeController.wordStats(searchterm)),format.raw/*52.82*/("""" >Global Stats</a>
                            <table>
                                <tr>
                                    <th style="font-weight: bold">Owner_id</th>
                                    <th style="font-weight: bold">Date</th>
                                    <th style="font-weight: bold">Title</th>
                                    <th style="font-weight: bold">Type</th>
                                    <th style="font-weight: bold">Skills</th>
                                    <th style="font-weight: bold">Stats</th>
                                    <th style="font-weight: bold">Readability</th>
                                    <th style="font-weight: bold">Education Level</th>
                                </tr>
                                """),_display_(/*64.34*/for(result <- searchvalue.getProjectList()) yield /*64.77*/ {_display_(Seq[Any](format.raw/*64.79*/("""
                                    """),format.raw/*65.37*/("""<tr>
                                        <td><a href=""""),_display_(/*66.55*/routes/*66.61*/.HomeController.ownerInformation(result.getOwner_id())),format.raw/*66.115*/("""" target="_blank"> """),_display_(/*66.135*/result/*66.141*/.getOwner_id),format.raw/*66.153*/(""" """),format.raw/*66.154*/("""</a> </td>
                                        <td>"""),_display_(/*67.46*/result/*67.52*/.getDate()),format.raw/*67.62*/("""</td>
                                        <td><a href="https://www.freelancer.com/projects/"""),_display_(/*68.91*/result/*68.97*/.getProject_ID),format.raw/*68.111*/("""/details">"""),_display_(/*68.122*/result/*68.128*/.getProject_title()),format.raw/*68.147*/("""</a></td>
                                        <td>"""),_display_(/*69.46*/result/*69.52*/.getProject_type()),format.raw/*69.70*/("""</td>
                                        <td><a href=""""),_display_(/*70.55*/routes/*70.61*/.HomeController.skills(result.getSkills())),format.raw/*70.103*/("""">"""),_display_(/*70.106*/result/*70.112*/.getSkills()),format.raw/*70.124*/("""</a></td>
                                        <td><a href=""""),_display_(/*71.55*/routes/*71.61*/.HomeController.projectWordStats(result.getProject_description())),format.raw/*71.126*/("""">Stats</a></td>
                                        <td>"""),_display_(/*72.46*/result/*72.52*/.getReadability()),format.raw/*72.69*/("""</td>
                                        <td>"""),_display_(/*73.46*/result/*73.52*/.getEducationalLevel()),format.raw/*73.74*/("""</td>
                                    </tr>
                                """)))}),format.raw/*75.34*/("""
                            """),format.raw/*76.29*/("""</table>
                        """)))}),format.raw/*77.26*/("""
                    """)))}),format.raw/*78.22*/("""
                    """),format.raw/*79.21*/("""</div>
                </center>
                <br><br><br>
                <script src=""""),_display_(/*82.31*/routes/*82.37*/.Assets.versioned("javascripts/search.js")),format.raw/*82.79*/(""""></script>
            </body>
        </article>
    </html>
""")))}))
      }
    }
  }

  def render(request:play.mvc.Http.Request,keyWord:String,searchForm:Map[String, FreelaancelotList],sessionID:String): play.twirl.api.HtmlFormat.Appendable = apply(request,keyWord,searchForm,sessionID)

  def f:((play.mvc.Http.Request,String,Map[String, FreelaancelotList],String) => play.twirl.api.HtmlFormat.Appendable) = (request,keyWord,searchForm,sessionID) => apply(request,keyWord,searchForm,sessionID)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/free.scala.html
                  HASH: 9bbc6797d9eb7e93568f972d54429334ad406349
                  MATRIX: 610->1|1006->36|1213->147|1241->149|1284->167|1312->187|1351->189|1383->195|1663->448|1678->454|1733->488|1912->639|1941->640|1999->670|2071->714|2100->715|2154->741|2213->772|2242->773|2300->804|2359->847|2398->848|2456->879|2543->956|2583->957|2641->987|2696->1015|2711->1021|2789->1077|2978->1235|3040->1266|3094->1292|3123->1293|3177->1319|3232->1346|3261->1347|3319->1377|3411->1441|3440->1442|3486->1460|3577->1524|3592->1530|3669->1586|4188->2078|4219->2087|4607->2448|4638->2470|4678->2472|4732->2499|4791->2542|4830->2543|4888->2573|4961->2619|4992->2629|5022->2631|5078->2659|5099->2670|5151->2700|5182->2702|5217->2709|5238->2720|5295->2755|5325->2756|5396->2800|5411->2806|5469->2843|6306->3653|6365->3696|6405->3698|6471->3736|6558->3796|6573->3802|6649->3856|6697->3876|6713->3882|6747->3894|6777->3895|6861->3952|6876->3958|6907->3968|7031->4065|7046->4071|7082->4085|7121->4096|7137->4102|7178->4121|7261->4177|7276->4183|7315->4201|7403->4262|7418->4268|7482->4310|7513->4313|7529->4319|7563->4331|7655->4396|7670->4402|7757->4467|7847->4530|7862->4536|7900->4553|7979->4605|7994->4611|8037->4633|8151->4716|8209->4746|8275->4781|8329->4804|8379->4826|8501->4921|8516->4927|8579->4969
                  LINES: 23->1|28->2|33->2|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|45->14|45->14|46->15|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|55->24|56->25|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|63->32|63->32|63->32|71->40|71->40|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|95->64|95->64|95->64|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|106->75|107->76|108->77|109->78|110->79|113->82|113->82|113->82
                  -- GENERATED --
              */
          