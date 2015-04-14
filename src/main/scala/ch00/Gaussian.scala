package ch00

import java.util.Random
import processing.core.PApplet
import util.FixedSizePApplet

object Gaussian extends FixedSizePApplet {

  override val fixedHeight = 200
  override val fixedWidth = 640

  val generator = new Random()
  val mean = 320
  val sd = 60

  override def setup(): Unit = {
    super.setup()
  }

  override def draw(): Unit = {
    val num = generator.nextGaussian()

    val x = sd * num + mean

    noStroke()
    fill(255, 10)
    ellipse(x.toFloat, height / 2, 16, 16)
  }
}