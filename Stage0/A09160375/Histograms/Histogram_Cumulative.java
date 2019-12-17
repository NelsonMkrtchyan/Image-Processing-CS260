import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.*;

public class Histogram_Cumulative implements PlugInFilter {

    double[] red = new double[256];
    double[] green = new double[256];
    double[] blue = new double[256];
    public int setup (String args, ImagePlus im) {
        return DOES_RGB;
    }
    public void run (ImageProcessor ip) {
        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++) {
                Color color = new Color(ip.getPixel(col, row));
                red[color.getRed()] += 1;
                blue[color.getBlue()] += 1;
                green[color.getGreen()] += 1;
            }
        red[0] = red[0] / (ip.getWidth() * ip.getHeight());
        green[0] = green[0] / (ip.getWidth() * ip.getHeight());
        blue[0] = blue[0] / (ip.getWidth() * ip.getHeight());
        for (int i = 1; i < red.length; i++) {
            red[i] = (red[i] / (ip.getWidth() * ip.getHeight())) + red[i - 1];
            green[i] = (green[i] / (ip.getWidth() * ip.getHeight())) + green[i - 1];
            blue[i] = (blue[i] / (ip.getWidth() * ip.getHeight())) + blue[i - 1];
        }
        IJ.log("*** Red ***");
        for (int i = 0; i < red.length; i++) {
            IJ.log(Double.toString(red[i])+ ",");
        }
        IJ.log("*** Green ***");
        for (int i = 0; i < green.length; i++) {
            IJ.log(Double.toString(green[i])+ ",");
        }
        IJ.log("*** Blue ***");
        for (int i = 0; i < blue.length; i++) {
            IJ.log(Double.toString(blue[i])+ ",");
        }
    }
}