import ij.*;
import ij.process.*;
import ij.gui.*;

import java.awt.*;

import ij.plugin.filter.*;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;

import java.awt.Color;

public class Histogram_Matching_HSV implements PlugInFilter {


    public int setup(String args, ImagePlus im) {
        return DOES_ALL;
    }

    public void run(ImageProcessor ip) {

        double width = ip.getWidth();
        double height = ip.getHeight();



        double[] BestH = new double[]{

                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7533440170940171,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                0.7968910256410257,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
        };
        double[] BestS = new double[]{
                0.039038461538461536,
                0.045683760683760684,
                0.05778846153846154,
                0.07139957264957265,
                0.10792735042735044,
                0.19135683760683764,
                0.25394230769230774,
                0.26883547008547015,
                0.2756089743589744,
                0.2804700854700855,
                0.2848824786324787,
                0.2891239316239317,
                0.293440170940171,
                0.29866452991452996,
                0.3037606837606838,
                0.30873931623931633,
                0.3123824786324787,
                0.3177670940170941,
                0.3234615384615385,
                0.3283226495726496,
                0.33506410256410263,
                0.3409935897435898,
                0.3475106837606838,
                0.3542948717948718,
                0.36020299145299145,
                0.36780982905982906,
                0.37439102564102567,
                0.38018162393162397,
                0.3866132478632479,
                0.3942841880341881,
                0.40056623931623936,
                0.409198717948718,
                0.41744658119658123,
                0.43094017094017095,
                0.4398397435897436,
                0.4526282051282051,
                0.46992521367521367,
                0.48455128205128206,
                0.5098611111111111,
                0.5347435897435897,
                0.5606944444444444,
                0.5854700854700854,
                0.608034188034188,
                0.6276388888888889,
                0.6475,
                0.6673290598290598,
                0.6855982905982906,
                0.7055128205128205,
                0.7239743589743589,
                0.7387499999999999,
                0.7600427350427349,
                0.7729380341880341,
                0.7869978632478631,
                0.7993055555555555,
                0.8106837606837606,
                0.8213461538461537,
                0.8324999999999999,
                0.8429700854700853,
                0.8547435897435897,
                0.8664636752136752,
                0.8797222222222222,
                0.8919764957264957,
                0.9022649572649573,
                0.9149038461538461,
                0.9262713675213675,
                0.936923076923077,
                0.9450534188034189,
                0.9526602564102564,
                0.9578525641025641,
                0.9615064102564103,
                0.9644230769230769,
                0.9668803418803419,
                0.9681303418803419,
                0.9696688034188033,
                0.970534188034188,
                0.9715491452991453,
                0.9728632478632478,
                0.9735897435897436,
                0.974508547008547,
                0.9759508547008547,
                0.9768589743589744,
                0.9783333333333334,
                0.9800961538461539,
                0.982542735042735,
                0.9850534188034188,
                0.9872649572649572,
                0.989775641025641,
                0.9917094017094017,
                0.9948397435897436,
                0.9964102564102564,
                0.9976388888888889,
                0.9985897435897435,
                0.9989529914529913,
                0.9994444444444444,
                0.9996153846153846,
                0.9997970085470085,
                0.9998504273504273,
                0.9998824786324786,
                0.9999038461538461,
                0.9999038461538461,
                0.9999999999999999,
        };
        double[] BestV = new double[]{
                0.0,
                4.05982905982906E-4,
                0.002713675213675214,
                0.006217948717948719,
                0.01763888888888889,
                0.036741452991453,
                0.04912393162393163,
                0.06589743589743591,
                0.07807692307692309,
                0.09759615384615386,
                0.11088675213675216,
                0.13138888888888892,
                0.14429487179487183,
                0.16213675213675216,
                0.17336538461538464,
                0.18779914529914532,
                0.20118589743589746,
                0.21021367521367523,
                0.22415598290598293,
                0.2336965811965812,
                0.2464423076923077,
                0.25369658119658123,
                0.26304487179487185,
                0.2688675213675214,
                0.2770726495726496,
                0.28532051282051285,
                0.290982905982906,
                0.29928418803418805,
                0.3046688034188034,
                0.313215811965812,
                0.31966880341880344,
                0.33032051282051283,
                0.3378632478632479,
                0.34893162393162397,
                0.35654914529914533,
                0.36762820512820515,
                0.37691239316239317,
                0.38377136752136753,
                0.3936752136752137,
                0.3998076923076923,
                0.4098611111111111,
                0.41724358974358977,
                0.4279273504273505,
                0.43565170940170944,
                0.44683760683760687,
                0.45819444444444446,
                0.46571581196581197,
                0.4782905982905983,
                0.48756410256410254,
                0.5044123931623932,
                0.5158760683760684,
                0.5335042735042735,
                0.5463034188034188,
                0.5644230769230769,
                0.5749465811965812,
                0.5903525641025641,
                0.6048076923076923,
                0.6153418803418803,
                0.6308974358974359,
                0.6416987179487179,
                0.6589529914529915,
                0.6708760683760684,
                0.6918696581196582,
                0.7045833333333333,
                0.7209508547008547,
                0.7361004273504274,
                0.7460683760683761,
                0.7573824786324787,
                0.7633012820512821,
                0.7708226495726497,
                0.7750641025641026,
                0.7804594017094018,
                0.7841880341880343,
                0.7890491452991454,
                0.7917841880341882,
                0.7955128205128207,
                0.8007692307692309,
                0.8062820512820514,
                0.8189636752136754,
                0.8279166666666669,
                0.8428846153846156,
                0.8561858974358976,
                0.8868589743589745,
                0.9096367521367523,
                0.9418910256410258,
                0.9587286324786326,
                0.962371794871795,
                0.9633226495726497,
                0.9634508547008548,
                0.9637393162393163,
                0.9637713675213676,
                0.963974358974359,
                0.9640918803418804,
                0.9642948717948718,
                0.9643803418803419,
                0.9645192307692309,
                0.9646688034188035,
                0.9648717948717949,
                0.9651068376068376,
                0.9653311965811966,
                1.0,
        };


        double[] red = new double[256];
        double[] green = new double[256];
        double[] blue = new double[256];

        double[] h = new double[361];
        double[] s = new double[101];
        double[] v = new double[101];

        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++) {
                Color color = new Color(ip.getPixel(col, row));
                float[] rgb = {(float) color.getRed(), (float) color.getGreen(), (float) color.getBlue()};
                float[] hsv = this.RGBtoHSV(rgb);
                h[(int) Math.round(hsv[0] * 360)] += 1;
                s[(int) Math.round(hsv[1] * 100)] += 1;
                v[(int) Math.round(hsv[2] * 100)] += 1;
            }

        h[0] = h[0] / (ip.getWidth() * ip.getHeight());
        s[0] = s[0] / (ip.getWidth() * ip.getHeight());
        v[0] = v[0] / (ip.getWidth() * ip.getHeight());
        for (int i = 1; i < h.length; i++) {
            h[i] = (h[i] / (ip.getWidth() * ip.getHeight())) + h[i - 1];
        }
        for (int i = 1; i < s.length; i++) {
            s[i] = (s[i] / (ip.getWidth() * ip.getHeight())) + s[i - 1];
        }
        for (int i = 1; i < v.length; i++) {
            v[i] = (v[i] / (ip.getWidth() * ip.getHeight())) + v[i - 1];
        }




        double[] newH = matchHistograms(h, BestH);
        double[] newS = matchHistograms(s, BestS);
        double[] newV = matchHistograms(v, BestV);






        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++) {
                Color color = new Color(ip.getPixel(col, row));


                float[] rgb = {(float) color.getRed(), (float) color.getGreen(), (float) color.getBlue()};
                float[] hsv = this.RGBtoHSV(rgb);


                double H = newH[(int) Math.round(hsv[0])];
                double S = newS[(int) Math.round(hsv[1])];
                double V = newV[(int) Math.round(hsv[2])];

                hsv[0] = (float) H/360;
                hsv[1] = (float) S/100;
                hsv[2] = (float) V/100;

                float RGB = this.HSVtoRGB(hsv);


                double[] value = {RGB[0], RGB[1], RGB[2]};
                ip.putPixel(col,row, value);

            }

    }


    double[] matchHistograms(double[] toBeModifiedHistogram, double[] referenceHistogram) {
        // hA . . . histogram hA of the target image IA (to be modified)
//        toBeModifiedHistogram
        // hR . . . reference histogram hR
//        referenceHistogram
        // returns the mapping fhs() to be applied to image IA

        int K = toBeModifiedHistogram.length;
        double[] toBeModifiedCDF = Cdf(toBeModifiedHistogram); // get CDF of histogram hA // PA
        double[] referenceCDF = Cdf(referenceHistogram); // get CDF of histogram hR // PR
        double[] fhs = new double[K]; // mapping fhs()

        // compute mapping function fhs():
        for (int a = 0; a < K; a++) {
            int j = K - 1;
            do {
                fhs[a] = j;
                j--;
            } while (j >= 0 && toBeModifiedCDF[a] <= referenceCDF[j]);
        }
        return fhs;
    }

    double[] Cdf(double[] h) {
        // returns the cumul. distribution function for histogram h
        int K = h.length;


        double[] P = new double[K]; // create CDF table P
        P[0] = h[0];
        for (int i = 1; i < K; i++) {
            P[i] = P[i-1] + h[i];
        }

        P[0] = P[0] / P[255];
    

        for (int i = 1; i < 256; i++) {
            P[i] = (P[i] / P[255]);
        }

        return P;
    }

    float[] RGBtoHSV(float[] RGB) {
        float R = RGB[0], G = RGB[1], B = RGB[2];
        float High = Math.max(R,Math.max(G,B)); // max. comp. value
        float Low = Math.min(R,Math.min(G,B)); // min. comp. value
        float Range = High - Low; // component range
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


    float[] HSVtoRGB (float[] HSV) {
        float H = HSV[0], S = HSV[1], V = HSV[2]; // H, S, V ∈ [0, 1]
        float r = 0, g = 0, b = 0;
        float hh = (6 * H) % 6;
        int c1 = (int) hh;
        float c2 = hh - c1;
        float x = (1 - S) * V;
        float y = (1 - (S * c2)) * V;
        float z = (1 - (S * (1 - c2))) * V;
        switch (c1) {
            case 0: r = V; g = z; b = x; break;
            case 1: r = y; g = V; b = x; break;
            case 2: r = x; g = V; b = z; break;
            case 3: r = x; g = y; b = V; break;
            case 4: r = z; g = x; b = V; break;
            case 5: r = V; g = x; b = y; break;
            }
        int R = Math.min((int)(r * 255), 255);
        int G = Math.min((int)(g * 255), 255);
        int B = Math.min((int)(b * 255), 255);
        return new float[] {R, G, B};
        }


}