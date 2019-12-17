import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.*;

public class Histogram_Cumulative_HSV_2 implements PlugInFilter {

    double[] h = new double[360];
    double[] s = new double[100]; // piti vor stex sxal@ lini
    double[] v = new double[100];// u stex
    public int setup (String args, ImagePlus im) {
        return DOES_RGB;
    }
    public void run (ImageProcessor ip) {
        for (int row = 0; row < ip.getWidth(); row++) {
            for (int col = 0; col < ip.getHeight(); col++) {
                Color color = new Color(ip.getPixel(row, col));
                int[] rgb = {(int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()};
                int [] hsv;
                Color.RGBtoHSV((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue(), hsv);

//                float[] hsv = this.RGBtoHSV(rgb);

                h[(int) Math.round(hsv[0])] += 1;
                s[(int) Math.round(hsv[1])] += 1;
                v[(int) Math.round(hsv[2])] += 1;

            }
        }
        h[0] = h[0] / (ip.getWidth() * ip.getHeight());
        s[0] = s[0] / (ip.getWidth() * ip.getHeight());
        v[0] = v[0] / (ip.getWidth() * ip.getHeight());
        for (int i = 1; i < h.length; i++) {
            h[i] = (h[i] / (ip.getWidth() * ip.getHeight())) + h[i - 1];
            s[i] = (s[i] / (ip.getWidth() * ip.getHeight())) + s[i - 1];
            v[i] = (v[i] / (ip.getWidth() * ip.getHeight())) + v[i - 1];
        }
        IJ.log("*** H ***");
        for (int i = 0; i < h.length; i++) {
            IJ.log(Double.toString(h[i]));
        }
        IJ.log("*** V ***");
        for (int i = 0; i < v.length; i++) {
            IJ.log(Double.toString(v[i]));
        }
        IJ.log("*** S ***");
        for (int i = 0; i < s.length; i++) {
            IJ.log(Double.toString(s[i]));
        }
    }

    float[] RGBtoHSV(int[] RGB) {
        int R = RGB[0], G = RGB[1], B = RGB[2];
        int High = Math.max(R,Math.max(G,B)); // max. comp. value
        int Low = Math.min(R,Math.min(G,B)); // min. comp. value
        int Range = High - Low; // component range
        float H=0,S=0,V=0;
        float cMax = 255.0f;
        V=High/cMax;
        if(High>0)
            S = (float) Range / High;
        if (Range > 0) {
            float rr = (float)(High - R)/Range;
            float gg = (float)(High - R)/Range;
            float bb = (float)(High - R)/Range;
            float hh;
            if (R == High)
                hh = bb - gg;
            else if (G == High)
                hh = rr - bb + 2.0f;
            else
                hh = gg - rr + 4.0f;
            if (hh < 0)
                hh = hh + 6;
            H = hh / 6;
        }
        return new float[] {H, S, V};
    }
}