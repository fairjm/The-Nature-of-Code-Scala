package ch00

import util.FixedSizePApplet

class PerlinNoiseWalker {

  import PerlinNoiseWalkerSketch._

  var x: Float = _
  var y: Float = _

  var tx: Double = 0
  var ty: Double = 10000

  def step = {
    x = map(noise(tx.toFloat), 0, 1, 0, width)
    y = map(noise(ty.toFloat), 0, 1, 0, height)
    tx += 0.01
    ty += 0.01
  }

  def display: Unit = {
    stroke(0)
    point(x, y)
  }
}

object PerlinNoiseWalkerSketch extends FixedSizePApplet {

  override val fixedWidth = 640
  override val fixedHeight = 320

  override def draw(): Unit = {
  }
}