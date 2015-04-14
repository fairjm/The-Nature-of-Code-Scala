package ch00

import util.Sketch
import scala.util.Random
import util.FixedSizePApplet

class Walker {
  import WalkerSketch._
  var x: Int = width / 2
  var y: Int = height / 2

  def display: Unit = {
    stroke(0)
    point(x, y)
  }

  def step: Unit = {
    if (random(1) < 0.5) {
      x += { if (mouseX > x) 1 else if (mouseX == x) 0 else -1 }
      y += { if (mouseY > y) 1 else if (mouseY == y) 0 else -1 }
    } else {
      x += Random.nextInt(3) - 1
      y += Random.nextInt(3) - 1
    }
  }
}

object WalkerSketch extends FixedSizePApplet {

  override val fixedWidth = 640
  override val fixedHeight = 360

  var w: Walker = _

  override def setup(): Unit = {
    super.setup()
    w = new Walker
    background(255)
  }

  override def draw(): Unit = {
    w.step
    w.display
  }
}