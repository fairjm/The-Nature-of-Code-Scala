

package util

import processing.core.PApplet
import javax.swing.WindowConstants

object Sketch {

  def show(app: FixedSizePApplet, title: String = "test", resizable: Boolean = false): Unit = {
    val frame = new javax.swing.JFrame(title)
    frame.getContentPane.add(app)
    frame.setSize(app.fixedWidth, app.fixedHeight)
    frame.setVisible(true)
    frame.setResizable(resizable)
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

    app.init
  }
}