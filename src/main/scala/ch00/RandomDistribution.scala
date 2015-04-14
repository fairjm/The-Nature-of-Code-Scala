package ch00

import util.FixedSizePApplet
import processing.core.PApplet

object RandomDistribution extends FixedSizePApplet {

  override val fixedWidth = 640
  override val fixedHeight = 240

  var randomCounts: Array[Float] = _

  override def setup(): Unit = {
    super.setup()
    randomCounts = Array.fill(20)(0)
  }

  override def draw(): Unit = {
    background(255)
    val index = random(randomCounts.size).toInt
    randomCounts(index) += 1
    stroke(0)
    fill(127)
    val w = width / randomCounts.size
    for (i <- 0 until randomCounts.size) {
      val h = randomCounts(i)
      rect(i * w, height - h, w, h)
    }
  }

}