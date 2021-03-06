package util

import processing.core.PApplet

trait FixedSizePApplet extends PApplet {

  val fixedHeight: Int
  val fixedWidth: Int
  val title: String = this.getClass.getName

  override def setup(): Unit = {
    size(fixedWidth, fixedHeight)
  }

  def display(resizable: Boolean = false) {
    Sketch.show(this, title, resizable)
  }

  def main(args: Array[String]): Unit = {
    display()
  }

  def map = PApplet.map _
}