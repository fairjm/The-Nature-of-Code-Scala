package ch00

import util.FixedSizePApplet

object Noise2D extends FixedSizePApplet {

  override val fixedHeight = 200
  override val fixedWidth = 320

  override def setup(): Unit = {
    super.setup()
  }

  override def draw(): Unit = {
    var xoff = 0.0
    var yoff = 0.0
    loadPixels()
    for {
      x <- 0 until width
      y <- 0 until height
    } {
      //      val bright = random(255)
      //      val bright = map(noise(x,y),0,1,0,255);
      val bright = map(noise(xoff.toFloat, yoff.toFloat), 0, 1, 0, 255);
      pixels(x + y * width) = color(bright)
      yoff += 0.02
      if (y == 0) yoff = 0
      if (x == 0) xoff += 0.02
    }
    updatePixels()

  }
}