
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
        <script src='/assets/javascripts/hello.js' type="text/javascript"></script>
        <script src='/assets/javascripts/prism.js' type="text/javascript"></script>
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
                    <form action ="/freelance" method="GET">
                        <input type="text" name="searchTerm" placeholder="Enter Search Terms"/>
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
                  HASH: b8d0efbacf10905ab30ae086a0b4008e36411e36
                  MATRIX: 998->6
                  LINES: 32->4
                  -- GENERATED --
              */
          