package com.svgobjects

import org.specs._

import dispatch._

object PopIdolSpec extends Specification with unfiltered.spec.jetty.Served {
  
  import dispatch._
  
  def setup = { _.filter(new App) }
  
  val http = new Http
  
  "The example app" should {
    "serve unfiltered requests" in {
      val status = http x (host as_str) {
        case (code, _, _, _) => code
      }
      status must_== 200
    }
  }
}