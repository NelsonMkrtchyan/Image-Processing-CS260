import ij.*;
import ij.process.*;
import ij.gui.*;

import java.awt.*;

import ij.plugin.filter.*;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;

import java.awt.Color;

public class Histogram_Matching_1 implements PlugInFilter {


    public int setup(String args, ImagePlus im) {
        return DOES_ALL;
    }

    public void run(ImageProcessor ip) {

        double width = ip.getWidth();
        double height = ip.getHeight();
        int l = 256;



        double[] BestRed = new double[]{

                0.2777777777777778,
                0.27778846153846154,
                0.2777991452991453,
                0.2777991452991453,
                0.27784188034188034,
                0.27798076923076925,
                0.278258547008547,
                0.2788568376068376,
                0.2803205128205128,
                0.2825,
                0.2855021367521367,
                0.2893910256410256,
                0.2946901709401709,
                0.3005021367521367,
                0.3054700854700854,
                0.3100961538461538,
                0.31452991452991447,
                0.3190811965811965,
                0.3232158119658119,
                0.32748931623931615,
                0.3321474358974358,
                0.3370192307692307,
                0.3419658119658119,
                0.347094017094017,
                0.35262820512820503,
                0.35784188034188025,
                0.36331196581196573,
                0.36882478632478627,
                0.37402777777777774,
                0.37947649572649567,
                0.3847115384615384,
                0.38959401709401703,
                0.3943803418803418,
                0.3989209401709401,
                0.4039423076923076,
                0.4086752136752136,
                0.41292735042735035,
                0.41695512820512814,
                0.42076923076923073,
                0.4243055555555555,
                0.42769230769230765,
                0.43068376068376063,
                0.43323717948717944,
                0.4361538461538461,
                0.4387072649572649,
                0.44145299145299144,
                0.44384615384615383,
                0.44629273504273503,
                0.44900641025641025,
                0.45126068376068373,
                0.4537179487179487,
                0.45638888888888884,
                0.4589850427350427,
                0.46144230769230765,
                0.4635790598290598,
                0.46567307692307686,
                0.4678952991452991,
                0.46977564102564096,
                0.47192307692307683,
                0.47373931623931614,
                0.4755235042735042,
                0.4771794871794871,
                0.47868589743589735,
                0.48034188034188025,
                0.4820619658119657,
                0.48400641025641017,
                0.4856517094017093,
                0.4873824786324786,
                0.48927350427350424,
                0.49092948717948715,
                0.49251068376068374,
                0.4937713675213675,
                0.4954594017094017,
                0.49694444444444447,
                0.49808760683760683,
                0.4996047008547008,
                0.5012393162393162,
                0.5028418803418803,
                0.5044978632478632,
                0.505844017094017,
                0.5074786324786325,
                0.5088675213675213,
                0.510352564102564,
                0.5118376068376067,
                0.5132692307692306,
                0.5148290598290597,
                0.5160897435897435,
                0.5174893162393162,
                0.5188141025641024,
                0.5202777777777776,
                0.5218055555555554,
                0.5232799145299144,
                0.5248290598290597,
                0.5262499999999999,
                0.5279594017094016,
                0.5293910256410255,
                0.5311431623931622,
                0.532713675213675,
                0.5344017094017092,
                0.5358974358974357,
                0.537713675213675,
                0.5394871794871793,
                0.5411645299145297,
                0.5430021367521365,
                0.545074786324786,
                0.5470299145299142,
                0.548600427350427,
                0.5507051282051278,
                0.552617521367521,
                0.5545512820512817,
                0.5566666666666663,
                0.5587713675213671,
                0.560833333333333,
                0.5630341880341877,
                0.5648290598290595,
                0.5673824786324783,
                0.569358974358974,
                0.5712179487179483,
                0.5733547008547004,
                0.5752991452991448,
                0.5775747863247859,
                0.5798931623931619,
                0.582072649572649,
                0.5845833333333328,
                0.5869017094017088,
                0.5893376068376063,
                0.5922222222222217,
                0.5949999999999994,
                0.597831196581196,
                0.6012072649572644,
                0.6041452991452986,
                0.6079487179487174,
                0.6124679487179482,
                0.6163461538461533,
                0.6202884615384611,
                0.6243589743589739,
                0.6280876068376064,
                0.6315384615384612,
                0.6348717948717945,
                0.6382692307692304,
                0.6417735042735039,
                0.6451709401709398,
                0.6484188034188031,
                0.6515170940170937,
                0.6549679487179484,
                0.6585256410256407,
                0.6623717948717945,
                0.6662713675213672,
                0.6696901709401706,
                0.6732692307692304,
                0.6773290598290594,
                0.681057692307692,
                0.6852243589743586,
                0.6893696581196578,
                0.6938461538461536,
                0.6986111111111108,
                0.7030876068376066,
                0.708653846153846,
                0.714145299145299,
                0.7196474358974357,
                0.724818376068376,
                0.7301602564102563,
                0.734722222222222,
                0.7393696581196579,
                0.7436431623931622,
                0.7482371794871793,
                0.7527670940170939,
                0.757136752136752,
                0.761602564102564,
                0.7660363247863247,
                0.7702243589743588,
                0.7734188034188033,
                0.7759401709401709,
                0.7786645299145298,
                0.7812713675213674,
                0.7835576923076921,
                0.7860576923076921,
                0.7884401709401707,
                0.7906837606837605,
                0.7926816239316237,
                0.7947435897435895,
                0.7966452991452989,
                0.7985683760683758,
                0.8007158119658118,
                0.8031196581196579,
                0.8056303418803417,
                0.8085683760683758,
                0.8121581196581195,
                0.8163995726495724,
                0.8206303418803417,
                0.8249358974358972,
                0.829412393162393,
                0.8340811965811964,
                0.838429487179487,
                0.8429059829059827,
                0.848386752136752,
                0.8560470085470083,
                0.8658440170940169,
                0.8765384615384614,
                0.888119658119658,
                0.8994444444444443,
                0.9110363247863246,
                0.9216987179487177,
                0.9323611111111109,
                0.9422435897435895,
                0.9503632478632476,
                0.9570512820512818,
                0.9606410256410254,
                0.9619764957264955,
                0.9624786324786322,
                0.9628525641025638,
                0.9630021367521364,
                0.963108974358974,
                0.9631837606837603,
                0.9632478632478629,
                0.9633012820512817,
                0.9633440170940167,
                0.963376068376068,
                0.9634294871794868,
                0.9634722222222218,
                0.9635149572649568,
                0.9635363247863243,
                0.9636217948717944,
                0.963728632478632,
                0.9637606837606834,
                0.9638141025641022,
                0.9638995726495723,
                0.9639316239316236,
                0.9639957264957262,
                0.9640277777777775,
                0.9640811965811963,
                0.9641559829059826,
                0.9641773504273501,
                0.9642521367521364,
                0.9642948717948714,
                0.9643803418803415,
                0.964401709401709,
                0.9644230769230765,
                0.9644658119658115,
                0.9645833333333329,
                0.9646153846153842,
                0.9646794871794868,
                0.9647115384615381,
                0.9647970085470082,
                0.9648717948717945,
                0.9649358974358971,
                0.9650213675213672,
                0.965117521367521,
                0.9651388888888885,
                0.9651709401709399,
                0.9652350427350425,
                0.9652777777777775,
                0.9653739316239313,
                0.966143162393162,
                0.9695512820512817,
                0.9999999999999997,

        };
        double[] BestGreen = new double[]{
                0.2777777777777778,
                0.2777777777777778,
                0.2778098290598291,
                0.27785256410256415,
                0.27795940170940175,
                0.27809829059829066,
                0.27846153846153854,
                0.2791773504273505,
                0.2804166666666667,
                0.2827350427350428,
                0.2864209401709402,
                0.29048076923076926,
                0.2960470085470086,
                0.30274572649572656,
                0.3101495726495727,
                0.31647435897435905,
                0.3234294871794873,
                0.33044871794871805,
                0.3379914529914531,
                0.34589743589743605,
                0.35399572649572664,
                0.3626709401709403,
                0.37070512820512835,
                0.3790064102564104,
                0.3863675213675215,
                0.3939209401709403,
                0.40045940170940186,
                0.4075427350427352,
                0.4146260683760685,
                0.42086538461538475,
                0.42701923076923093,
                0.43247863247863266,
                0.43770299145299163,
                0.44247863247863267,
                0.447061965811966,
                0.45173076923076944,
                0.45629273504273526,
                0.4609081196581199,
                0.4654273504273507,
                0.4694123931623934,
                0.47334401709401736,
                0.4771901709401712,
                0.4804807692307695,
                0.48378205128205154,
                0.4868162393162396,
                0.4897756410256413,
                0.4925854700854704,
                0.495459401709402,
                0.4977457264957268,
                0.500010683760684,
                0.5020833333333335,
                0.504519230769231,
                0.5064316239316241,
                0.5088354700854703,
                0.5111111111111113,
                0.5133760683760685,
                0.515587606837607,
                0.5177350427350429,
                0.5197863247863249,
                0.5217200854700856,
                0.5238888888888891,
                0.5260256410256412,
                0.5279594017094019,
                0.5299252136752138,
                0.5319871794871797,
                0.534337606837607,
                0.536388888888889,
                0.5383547008547009,
                0.5403525641025642,
                0.5422008547008548,
                0.5442094017094018,
                0.5462179487179488,
                0.5483333333333335,
                0.5503418803418805,
                0.5520726495726497,
                0.5541025641025642,
                0.5562820512820513,
                0.5582905982905983,
                0.5604273504273505,
                0.5623290598290599,
                0.5645405982905983,
                0.5667841880341881,
                0.5689850427350428,
                0.5709508547008547,
                0.5731837606837606,
                0.5753205128205128,
                0.5772435897435897,
                0.5791239316239316,
                0.5812072649572649,
                0.5834081196581197,
                0.585491452991453,
                0.5879380341880341,
                0.5904914529914529,
                0.5929807692307691,
                0.5956623931623931,
                0.5988888888888888,
                0.602628205128205,
                0.6067414529914529,
                0.611292735042735,
                0.6168162393162392,
                0.6219551282051281,
                0.6265491452991452,
                0.6310149572649572,
                0.635395299145299,
                0.6393376068376068,
                0.643034188034188,
                0.6466666666666666,
                0.6504059829059828,
                0.6542307692307692,
                0.6583333333333333,
                0.6624038461538462,
                0.6665811965811966,
                0.6711217948717949,
                0.6749679487179487,
                0.6789957264957265,
                0.6831837606837606,
                0.6877350427350427,
                0.6922435897435897,
                0.6976816239316239,
                0.7032264957264958,
                0.7084615384615385,
                0.7137606837606838,
                0.7188888888888889,
                0.7236431623931624,
                0.729017094017094,
                0.7336217948717949,
                0.7378952991452992,
                0.7415384615384616,
                0.745491452991453,
                0.7489529914529915,
                0.7526602564102565,
                0.7561858974358975,
                0.7598076923076924,
                0.7634294871794873,
                0.7666452991452993,
                0.7692841880341882,
                0.7720085470085472,
                0.774647435897436,
                0.7776282051282052,
                0.7802029914529915,
                0.7827136752136753,
                0.7851388888888889,
                0.7867521367521368,
                0.7878205128205129,
                0.7886538461538463,
                0.7890384615384617,
                0.7894337606837608,
                0.7897329059829061,
                0.7899786324786326,
                0.7901923076923079,
                0.7903952991452993,
                0.7906196581196583,
                0.7908760683760685,
                0.7910149572649574,
                0.7912713675213676,
                0.7914957264957266,
                0.7917414529914532,
                0.792019230769231,
                0.7922756410256412,
                0.7924465811965814,
                0.7926388888888891,
                0.7928098290598293,
                0.7929594017094019,
                0.793183760683761,
                0.7935256410256413,
                0.7938034188034191,
                0.7940170940170943,
                0.7943482905982909,
                0.7946901709401712,
                0.7949679487179491,
                0.7953632478632482,
                0.7957371794871798,
                0.7960363247863251,
                0.796356837606838,
                0.7967200854700858,
                0.7970833333333336,
                0.7974786324786327,
                0.7978846153846156,
                0.7983012820512823,
                0.7987500000000002,
                0.7992735042735044,
                0.7997115384615386,
                0.8002136752136754,
                0.8007692307692309,
                0.8012927350427351,
                0.8018482905982907,
                0.8023611111111112,
                0.8029273504273505,
                0.80357905982906,
                0.8044551282051283,
                0.8052136752136754,
                0.8063354700854702,
                0.8076175213675215,
                0.809113247863248,
                0.8110363247863249,
                0.8134294871794873,
                0.8165277777777779,
                0.8201175213675215,
                0.824423076923077,
                0.8294337606837608,
                0.8342200854700856,
                0.839561965811966,
                0.8458867521367522,
                0.8538354700854702,
                0.8660897435897438,
                0.8808653846153848,
                0.8969123931623934,
                0.9123611111111113,
                0.9260470085470087,
                0.939380341880342,
                0.9497435897435899,
                0.9567948717948719,
                0.9606196581196582,
                0.9621581196581197,
                0.962863247863248,
                0.963130341880342,
                0.9632371794871796,
                0.9632905982905984,
                0.9633226495726497,
                0.9633653846153847,
                0.963440170940171,
                0.9634935897435898,
                0.9635149572649573,
                0.9636004273504274,
                0.9636965811965812,
                0.9637393162393162,
                0.9637820512820512,
                0.96383547008547,
                0.9638675213675213,
                0.9639316239316239,
                0.9639743589743589,
                0.9640170940170939,
                0.9641132478632477,
                0.964145299145299,
                0.9642200854700853,
                0.9642628205128203,
                0.9643482905982904,
                0.9643803418803417,
                0.964455128205128,
                0.9645085470085468,
                0.9646047008547006,
                0.9646260683760681,
                0.9646794871794869,
                0.9647435897435895,
                0.9648397435897433,
                0.964903846153846,
                0.9649572649572647,
                0.9650427350427349,
                0.965128205128205,
                0.9651388888888888,
                0.9651709401709401,
                0.9652350427350427,
                0.9652991452991453,
                0.9657799145299145,
                0.9687286324786325,
                1.0,
        };
        double[] BestBlue = new double[]{
                0.27784188034188034,
                0.27787393162393165,
                0.2779380341880342,
                0.2781303418803419,
                0.2786538461538462,
                0.2799679487179488,
                0.28223290598290607,
                0.28683760683760695,
                0.2940598290598292,
                0.3027991452991454,
                0.3120726495726497,
                0.32118589743589754,
                0.33066239316239326,
                0.3403205128205129,
                0.3499679487179488,
                0.35862179487179496,
                0.36726495726495734,
                0.37568376068376075,
                0.3843482905982907,
                0.39236111111111116,
                0.40021367521367524,
                0.4078311965811966,
                0.4144017094017094,
                0.42167735042735044,
                0.42814102564102563,
                0.4344017094017094,
                0.4405555555555556,
                0.4462393162393163,
                0.4517521367521368,
                0.4571367521367522,
                0.462190170940171,
                0.4671153846153847,
                0.47199786324786336,
                0.47651709401709413,
                0.4808440170940172,
                0.4856517094017095,
                0.4897329059829061,
                0.4938141025641027,
                0.49770299145299157,
                0.5018055555555557,
                0.505138888888889,
                0.5082692307692309,
                0.511923076923077,
                0.515277777777778,
                0.5187179487179489,
                0.522019230769231,
                0.5254273504273507,
                0.5290064102564105,
                0.532286324786325,
                0.535138888888889,
                0.5384508547008549,
                0.5413675213675215,
                0.5444658119658121,
                0.5471794871794873,
                0.5502777777777779,
                0.5530448717948718,
                0.5558974358974359,
                0.5586645299145299,
                0.5619017094017094,
                0.5647435897435897,
                0.567991452991453,
                0.5709081196581197,
                0.5741025641025642,
                0.5775106837606839,
                0.5804700854700856,
                0.5837179487179489,
                0.5869871794871797,
                0.5907799145299147,
                0.5943376068376071,
                0.5983653846153848,
                0.6028311965811968,
                0.6075320512820515,
                0.61232905982906,
                0.616794871794872,
                0.6214102564102566,
                0.625811965811966,
                0.6300641025641027,
                0.6342094017094019,
                0.6381196581196583,
                0.6419444444444447,
                0.6457371794871797,
                0.6492735042735045,
                0.6530982905982908,
                0.6569444444444447,
                0.6603632478632481,
                0.6642094017094019,
                0.6682585470085473,
                0.6716239316239319,
                0.6752243589743592,
                0.6786858974358977,
                0.6820833333333336,
                0.6859401709401712,
                0.6899893162393166,
                0.6941987179487183,
                0.6988034188034192,
                0.702745726495727,
                0.7072329059829064,
                0.7117521367521372,
                0.716805555555556,
                0.7218803418803423,
                0.7269337606837611,
                0.7317841880341885,
                0.7359722222222227,
                0.7396901709401714,
                0.7437500000000005,
                0.747254273504274,
                0.7504273504273509,
                0.7532478632478636,
                0.7558119658119662,
                0.7582585470085473,
                0.760641025641026,
                0.762959401709402,
                0.7652564102564106,
                0.7672115384615388,
                0.7694978632478635,
                0.7718803418803422,
                0.7742628205128208,
                0.7763888888888891,
                0.7781517094017096,
                0.779561965811966,
                0.7811538461538463,
                0.7822115384615386,
                0.7834188034188035,
                0.784113247863248,
                0.7846260683760685,
                0.7851495726495727,
                0.7855235042735044,
                0.7858226495726497,
                0.7861752136752138,
                0.7863782051282052,
                0.7865705128205129,
                0.7867735042735043,
                0.7871260683760685,
                0.7872756410256411,
                0.7873931623931625,
                0.7875961538461539,
                0.7877670940170941,
                0.7879273504273505,
                0.7880662393162394,
                0.7882585470085471,
                0.7884294871794874,
                0.788536324786325,
                0.7886858974358976,
                0.7887820512820514,
                0.788888888888889,
                0.7890277777777779,
                0.7891880341880343,
                0.7893055555555557,
                0.7895192307692309,
                0.7896688034188035,
                0.7898397435897437,
                0.790010683760684,
                0.7901709401709404,
                0.7903846153846156,
                0.7906089743589746,
                0.7908547008547011,
                0.791036324786325,
                0.7912500000000002,
                0.7914102564102566,
                0.7916239316239319,
                0.7917948717948721,
                0.7920085470085473,
                0.7921260683760687,
                0.7923504273504277,
                0.7924786324786328,
                0.7926282051282054,
                0.7928739316239319,
                0.7931303418803421,
                0.7933760683760687,
                0.7935897435897439,
                0.7937820512820516,
                0.7939636752136755,
                0.7941773504273507,
                0.7943803418803421,
                0.79482905982906,
                0.7951602564102567,
                0.7955876068376071,
                0.7959722222222225,
                0.7963354700854703,
                0.7966880341880345,
                0.7971153846153849,
                0.7973611111111114,
                0.797777777777778,
                0.7982585470085473,
                0.7988354700854703,
                0.7992841880341882,
                0.7997649572649574,
                0.8002884615384617,
                0.8008226495726497,
                0.801431623931624,
                0.8022008547008548,
                0.8029380341880342,
                0.8035897435897437,
                0.8045192307692308,
                0.8055448717948719,
                0.806880341880342,
                0.8085256410256411,
                0.8104273504273505,
                0.8128846153846154,
                0.8162606837606838,
                0.8200534188034189,
                0.8243376068376069,
                0.8282799145299147,
                0.8331303418803421,
                0.8378739316239319,
                0.8429807692307695,
                0.8486752136752139,
                0.8562072649572652,
                0.8655128205128207,
                0.8760790598290601,
                0.8868803418803421,
                0.8977670940170943,
                0.9096367521367524,
                0.9207905982905986,
                0.9322542735042738,
                0.941891025641026,
                0.9497970085470089,
                0.9550961538461542,
                0.9587286324786328,
                0.9608974358974363,
                0.9623717948717952,
                0.9630235042735047,
                0.9631944444444449,
                0.96332264957265,
                0.963365384615385,
                0.9634508547008551,
                0.9635363247863252,
                0.9636431623931628,
                0.9637393162393166,
                0.9637500000000004,
                0.9637713675213679,
                0.9638354700854705,
                0.9638888888888894,
                0.9639743589743595,
                0.9640384615384621,
                0.9640918803418809,
                0.9641880341880347,
                0.9642094017094022,
                0.9642948717948723,
                0.9643269230769236,
                0.9643803418803424,
                0.9644337606837612,
                0.9644551282051287,
                0.9645192307692313,
                0.9646153846153851,
                0.9646581196581201,
                0.9646688034188039,
                0.9647435897435902,
                0.9648717948717953,
                0.9649572649572654,
                0.9650534188034192,
                0.9651282051282055,
                0.9654594017094021,
                0.9667948717948722,
                0.9684294871794876,
                1.0000000000000004,
        };


        double[] red = new double[256];
        double[] green = new double[256];
        double[] blue = new double[256];


        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++) {
                Color color = new Color(ip.getPixel(col, row));
                red[color.getRed()] += 1;
                blue[color.getBlue()] += 1;
                green[color.getGreen()] += 1;
            }



//        ImagePlus imp2= IJ.openImage("D:\\AUA\\Image Processing\\Image_Processing\\Final_Project\\Stage2\\2_full.jpg");
//        ImageProcessor ip2= imp2.getProcessor();
//
//        double[] red1 = new double[256];
//        double[] green1 = new double[256];
//        double[] blue1 = new double[256];
//
//
//        for (int row = 0; row < height; row++)
//            for (int col = 0; col < width; col++) {
//                Color color = new Color(ip2.getPixel(col, row));
//                red1[color.getRed()] += 1;
//                blue1[color.getBlue()] += 1;
//                green1[color.getGreen()] += 1;
//            }

//      r,g,b chanels arrays
        
//      We have cumulative histograms in red, green, blue



        double[] newRed = matchHistograms(red, BestRed);
        double[] newGreen = matchHistograms(green, BestGreen);
        double[] newBlue = matchHistograms(blue, BestBlue);


        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++) {
                Color color = new Color(ip.getPixel(col, row));

                int[] value = {(int) (newRed[color.getRed()]), (int)(newGreen[color.getGreen()]), (int) (newBlue[color.getBlue()])};
                ip.putPixel(col,row, value);

            }


//        new ImagePlus("ColorChanged", ip).show();

        //return ip;

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

}