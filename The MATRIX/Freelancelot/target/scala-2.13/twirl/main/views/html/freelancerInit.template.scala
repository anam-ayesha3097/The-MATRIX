
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

object freelancerInit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <title>FreeLancelot</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href='/assets/stylesheets/main.css'>
        <link rel="stylesheet" media="screen" href='/assets/stylesheets/prism.css'>
        <link rel="shortcut icon" type="image/png" href='/assets/images/favicon.png'>
    </head>

    <body>
        <section id="top">
    </section>

        <article>
            <head>
                <h1 style= text-align:center;>Welcome to FreeLancelot</h1>
            </head>
            <center>
                <body>
                    <form action ="/freelancelot" method="GET">
                        <input type="text" name="searchTerm" placeholder="Enter Search Terms"/>
                        <input type = "hidden" id= "sessionID" name="sessionID" value="" MAXLENGTH=16 SIZE=16>
                        <script>
                        function randomNumber(len) """),format.raw/*29.52*/("""{"""),format.raw/*29.53*/("""
                            """),format.raw/*30.29*/("""var randomNumber;
                            var n = '';

                            for (var count = 0; count < len; count++) """),format.raw/*33.71*/("""{"""),format.raw/*33.72*/("""
                                """),format.raw/*34.33*/("""randomNumber = Math.floor(Math.random() * 10);
                                n += randomNumber.toString();
                            """),format.raw/*36.29*/("""}"""),format.raw/*36.30*/("""
                            """),format.raw/*37.29*/("""return n;
                        """),format.raw/*38.25*/("""}"""),format.raw/*38.26*/("""

                        """),format.raw/*40.25*/("""document.getElementById("sessionID").value = randomNumber(9);
                       </script>
                        <input type="submit" value="Go!" style="background-color: #1874CD;color: white">
                    </form>
                    <div>

                </div>
                </body>
            </center>
        </article>

    </body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/freelancerInit.scala.html
                  HASH: 9b9e74f3e91511d806c09b8e80e1ad6aca4f09be
                  MATRIX: 998->6|2062->1042|2091->1043|2149->1073|2309->1205|2338->1206|2400->1240|2567->1379|2596->1380|2654->1410|2717->1445|2746->1446|2802->1474
                  LINES: 32->4|57->29|57->29|58->30|61->33|61->33|62->34|64->36|64->36|65->37|66->38|66->38|68->40
                  -- GENERATED --
              */
          