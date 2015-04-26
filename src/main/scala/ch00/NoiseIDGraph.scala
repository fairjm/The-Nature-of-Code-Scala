package ch00

import processing.core.PApplet
import util.FixedSizePApplet

object NoiseIDGraph extends FixedSizePApplet {
  override val fixedHeight = 200
  override val fixedWidth = 320

  var time = 0.0
  var xPoint: Float = 0
  var yPoint: Float = noise(time.toFloat) * height

  var lastXPoint: Float = xPoint
  var lastYPoint: Float = yPoint

  override def setup(): Unit = {
    super.setup()
    background(255)
  }

  override def draw(): Unit = {
    yPoint = noise(time.toFloat) * height
    xPoint += 1
    line(xPoint, yPoint, lastXPoint, lastYPoint)
    if (xPoint >= width) {
      xPoint = 0
      background(255)
    }
    lastXPoint = xPoint
    lastYPoint = yPoint
    time += 0.01
  }
}