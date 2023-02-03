package com.org.ita.kata;

import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveTest {

    public Object[][] combineImplAndGapTestData(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for(Student student : Student.values()) {
            for(Object[] row : testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationFiveKata(),row[0],row[1],row[2],row[3]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    public Object[][] combineImplWithSmallestTests(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student: Student.values()) {
            for (Object[] row: testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationFiveKata(), row[0], row[1]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestSmallest")
    public Object[][] dpTestSmallest() {
        Object[][] data = new Object[][]{
                {"[126235, 2, 0]", 261235},
                {"[29917, 0, 1]", 209917},
                {"[238565, 3, 1]", 285365},
                {"[26945, 3, 0]", 269045},
                {"[239687, 4, 1]", 296837},
                {"[74129253571428736, 5, 0]", 741290253571428736L},
                {"[168295354851387352, 15, 0]", 682953548513873152L},
                {"[37204829253004928, 11, 0]", 372048292530004928L},
                {"[33347802639264248, 15, 0]", 333478026392642048L},
                {"[14629935407393088, 17, 0]", 146299354073930880L},
                {"[151627833382377792, 6, 0]", 516278133382377792L},
                {"[51336779176334336, 5, 0]", 513360779176334336L},
                {"[23158180166961184, 11, 0]", 231581801660961184L},
                {"[51131117248622524, 15, 0]", 511311172486225024L},
                {"[61228783422246656, 9, 0]", 612287834022246656L},
                {"[15141283600694384, 17, 0]", 151412836006943840L},
                {"[18551737240828464, 17, 0]", 185517372408284640L},
                {"[7689811924211776, 5, 0]", 76898011924211776L},
                {"[177283825978142428, 15, 0]", 772838259781424128L},
                {"[75600663662862592, 6, 0]", 756006063662862592L},
                {"[24181262653614336, 9, 0]", 241812626053614336L},
                {"[69770107203364188, 15, 0]", 697701072033641088L},
                {"[148622444896342912, 0, 9]", 814862244496342912L},
                {"[9308982131122552, 16, 0]", 93089821311225520L},
                {"[95413696592786176, 10, 0]", 954136965902786176L},
                {"[31616856467454464, 6, 0]", 316168056467454464L},
                {"[35458797782156928, 5, 0]", 354580797782156928L},
                {"[52499003473684928, 10, 0]", 524990034703684928L},
                {"[79276120004266816, 17, 0]", 792761200042668160L},
                {"[6221926754806632, 14, 0]", 62219267548066032L},
                {"[92906689988556688, 13, 0]", 929066899885506688L},
                {"[62650757554339328, 7, 0]", 626507507554339328L},
                {"[43857697754559456, 12, 0]", 438576977545059456L},
                {"[279635994955567283, 17, 0]", 796359949555672832L},
                {"[136498477895842752, 11, 0]", 364984778951842752L},
                {"[82800556550884188, 15, 0]", 828005565508841088L},
                {"[123952134728974528, 11, 0]", 239521347281974528L},
                {"[94900931139432256, 11, 0]", 949009311390432256L},
                {"[132888132336682496, 5, 0]", 328881132336682496L},
                {"[3048942063855648, 15, 0]", 30489420638556408L},
                {"[78662353697481216, 5, 0]", 786620353697481216L},
                {"[117539233693352896, 3, 0]", 175139233693352896L},
                {"[35852895789978544, 13, 0]", 358528957899708544L},
                {"[78552140731980352, 17, 0]", 785521407319803520L},
                {"[28492207144921632, 8, 0]", 284922070144921632L},
                {"[68819602777985972, 15, 0]", 688196027779859072L},
                {"[35972481969422144, 17, 0]", 359724819694221440L},
                {"[37466705659314096, 14, 0]", 374667056593140096L},
                {"[73270340583127584, 12, 0]", 732703405831027584L},
                {"[12872716741926368, 9, 0]", 128727167041926368L},
                {"[96541298674588288, 4, 0]", 965401298674588288L},
                {"[2420156091274176, 0, 7]", 500242016091274176L},
                {"[39276661996286784, 3, 0]", 392076661996286784L},
                {"[138855637337553984, 9, 0]", 388556373137553984L},
                {"[68434882576227712, 3, 0]", 684034882576227712L},
                {"[46847829796781952, 8, 0]", 468478290796781952L},
                {"[94115453174196160, 16, 0]", 941154531741961600L},
                {"[16769255439291296, 15, 0]", 167692554392912096L},
                {"[87567492140876928, 12, 0]", 875674921408076928L},
                {"[179444266898552892, 15, 0]", 794442668985528192L},
                {"[153187151254247688, 0, 16]", 815318715125424768L},
                {"[68769059416518624, 12, 0]", 687690594165018624L},
                {"[58733589986313112, 14, 0]", 587335899863130112L},
                {"[93234973290263528, 14, 0]", 932349732902630528L},
                {"[276543525865734976, 14, 0]", 765435258657342976L},
                {"[85401368953146752, 6, 0]", 854013068953146752L},
                {"[6745394994631888, 16, 0]", 67453949946318880L},
                {"[6924488948161696, 0, 1]", 60924488948161696L},
                {"[15848460087658874, 16, 0]", 158484600876588704L},
                {"[39103107833975616, 11, 0]", 391031078330975616L},
                {"[88599902539687168, 10, 0]", 885999025309687168L},
                {"[14485131685827712, 17, 0]", 144851316858277120L},
                {"[48472942191283776, 11, 0]", 484729421910283776L},
                {"[44942595051099776, 17, 0]", 449425950510997760L},
                {"[26792846228068384, 17, 0]", 267928462280683840L},
                {"[66687280125311616, 10, 0]", 666872801205311616L},
                {"[93001522527446528, 10, 0]", 930015225207446528L},
                {"[31481092732867756, 15, 0]", 314810927328677056L},
                {"[239892377397377856, 10, 0]", 398923773927377856L},
                {"[11410261093612272, 17, 0]", 114102610936122720L},
                {"[35448661106604512, 17, 0]", 354486611066045120L},
                {"[45226142692030400, 15, 0]", 452261426920304000L},
                {"[94053001058540736, 17, 0]", 940530010585407360L},
                {"[56996696191182144, 3, 0]", 569096696191182144L},
                {"[13728064460577240, 16, 0]", 137280644605772400L},
                {"[36909720275589748, 16, 0]", 369097202755897408L},
                {"[35561843004484288, 8, 0]", 355618430004484288L},
                {"[68996980566594432, 17, 0]", 689969805665944320L},
                {"[73869717187375216, 13, 0]", 738697171873705216L},
                {"[41237419153050464, 15, 0]", 412374191530504064L},
                {"[15687626619918176, 0, 1]", 105687626619918176L},
                {"[50774992680700256, 12, 0]", 507749926807000256L},
                {"[27425009052765984, 17, 0]", 274250090527659840L},
                {"[89791207803095424, 17, 0]", 897912078030954240L},
                {"[262636775542985856, 10, 0]", 626367755422985856L},
                {"[36530569319422176, 17, 0]", 365305693194221760L},
                {"[15959445528185824, 12, 0]", 59594455281815824L},
                {"[80996872926107136, 17, 0]", 809968729261071360L},
                {"[5145746347255272, 3, 0]", 51405746347255272L},
                {"[95930263202276576, 14, 0]", 959302632022760576L},
                {"[42069032442223616, 9, 0]", 420690324042223616L},
                {"[66332379605728640, 16, 0]", 663323796057286400L},
                {"[60876062853587584, 17, 0]", 608760628535875840L},
                {"[57591650062239936, 12, 0]", 575916500622039936L},
                {"[46184930184087756, 15, 0]", 461849301840877056L},
                {"[21614804550139024, 17, 0]", 216148045501390240L},
                {"[71867842286688128, 8, 0]", 718678420286688128L},
                {"[164674247768121264, 13, 0]", 646742477681211264L},
                {"[57154568536584800, 15, 0]", 571545685365848000L},
                {"[222285954239338424, 15, 0]", 222859542393384224L},
                {"[149968245274534464, 2, 0]", 491968245274534464L},
                {"[53747165565649856, 3, 0]", 537047165565649856L},
                {"[21099201061925048, 14, 0]", 210992010619250048L},
                {"[122384367751652224, 10, 0]", 223843677511652224L},
                {"[87536921338573184, 3, 0]", 875036921338573184L},
                {"[70975484797593344, 6, 0]", 709754084797593344L},
                {"[22413884160986896, 17, 0]", 224138841609868960L},
                {"[17487080226936112, 17, 0]", 174870802269361120L},
                {"[25555047448153376, 8, 0]", 255550470448153376L},
                {"[88316994200291072, 17, 0]", 883169942002910720L},
                {"[99359656138006400, 15, 0]", 993596561380064000L},
                {"[11599412554192858, 13, 0]", 15994125541921858L},
                {"[21410443410642112, 12, 0]", 214104434106042112L},
                {"[61090349947472640, 16, 0]", 610903499474726400L},
                {"[51596061249543552, 9, 0]", 515960612049543552L},
                {"[21764872868568800, 15, 0]", 217648728685688000L},
                {"[28632176568934592, 10, 0]", 286321765608934592L},
                {"[44149924023674928, 14, 0]", 441499240236740928L},
                {"[94262704428747488, 13, 0]", 942627044287407488L},
                {"[18231273585149828, 14, 0]", 82312735851498128L},
                {"[82304600613860064, 13, 0]", 823046006138600064L},
                {"[45901076965438784, 5, 0]", 459010076965438784L},
                {"[9820234517374228, 15, 0]", 98202345173742208L},
                {"[82119014427175296, 5, 0]", 821190014427175296L},
                {"[138595982685716152, 14, 0]", 385959826857161152L},
                {"[39561917082493312, 17, 0]", 395619170824933120L},
                {"[76668881918012416, 11, 0]", 766688819180012416L},
                {"[36472979085958784, 11, 0]", 364729790850958784L},
                {"[37480617338096896, 11, 0]", 374806173380096896L},
                {"[82887646458684672, 10, 0]", 828876464508684672L},
                {"[91067217885816256, 12, 0]", 910672178858016256L},
                {"[74356786886929472, 13, 0]", 743567868869209472L},
                {"[65070891617341824, 4, 0]", 650700891617341824L},
                {"[69748168725424256, 2, 0]", 690748168725424256L},
                {"[30899909275655, 12, 0]", 308999092756055L},
                {"[24676227151473536, 9, 0]", 246762271051473536L},
                {"[20434572716298112, 5, 0]", 204340572716298112L},
                {"[64946948281493632, 10, 0]", 649469482801493632L},
                {"[88515966309367552, 13, 0]", 885159663093607552L},
                {"[41668707122097984, 11, 0]", 416687071220097984L},
                {"[918437185332524, 4, 0]", 9184037185332524L},
                {"[11010994585233328, 6, 0]", 110109094585233328L},
                {"[67933178426846528, 17, 0]", 679331784268465280L},
                {"[87790434768281609, 0, 17]", 908779043476828160L},
                {"[84445894012318848, 17, 0]", 844458940123188480L},
                {"[86527294374243712, 9, 0]", 865272943074243712L},
                {"[46967134973858368, 8, 0]", 469671340973858368L},
                {"[14261419503007832, 17, 0]", 142614195030078320L},
                {"[19536707170082464, 13, 0]", 195367071700802464L},
                {"[7682178085367914, 15, 0]", 76821780853679104L},
                {"[169486742253711784, 15, 0]", 694867422537117184L},
                {"[8267028578175172, 14, 0]", 82670285781751072L},
                {"[13936985586007672, 14, 0]", 139369855860070672L},
                {"[19137009483491968, 11, 0]", 191370094830491968L},
                {"[15051618411193152, 2, 0]", 150051618411193152L},
                {"[85770504129892352, 8, 0]", 857705040129892352L},
                {"[67055458683269632, 17, 0]", 670554586832696320L},
                {"[67501509480874624, 10, 0]", 675015094800874624L},
                {"[23845059987346944, 8, 0]", 238450590987346944L},
                {"[46126154486001344, 17, 0]", 461261544860013440L},
                {"[114668974548354656, 1, 3]", 161468974548354656L},
                {"[53650295481772496, 15, 0]", 536502954817724096L},
                {"[85958621511181056, 17, 0]", 859586215111810560L},
                {"[22000647127537632, 8, 0]", 220006470127537632L},
                {"[99342137875533952, 7, 0]", 993421307875533952L},
                {"[46817640554838464, 10, 0]", 468176405504838464L},
                {"[91798871924630592, 17, 0]", 917988719246305920L},
                {"[19450276309161034, 16, 0]", 194502763091610304L},
                {"[31217377306997632, 9, 0]", 312173773006997632L},
                {"[16429769645319628, 14, 0]", 64297696453196128L},
                {"[22928499753838176, 0, 1]", 202928499753838176L},
                {"[197678665119336832, 11, 0]", 976786651191336832L},
                {"[34679706216259528, 14, 0]", 346797062162590528L},
                {"[51631300977177724, 15, 0]", 516313009771777024L},
                {"[19025873758813388, 15, 0]", 190258737588133088L},
                {"[6761343273214224, 5, 0]", 67613043273214224L},
                {"[81481344050339328, 10, 0]", 814813440500339328L},
                {"[44421202001528128, 13, 0]", 444212020015208128L},
                {"[51396479189474816, 3, 0]", 513096479189474816L},
                {"[17392086116136074, 16, 0]", 173920861161360704L},
                {"[84067188151783040, 16, 0]", 840671881517830400L},
                {"[43188600099755808, 17, 0]", 431886000997558080L},
                {"[2558244455874060, 15, 0]", 25582444558740600L},
                {"[42296169433351488, 9, 0]", 422961694033351488L},
                {"[34332591489658720, 16, 0]", 343325914896587200L},
                {"[31310598439098176, 17, 0]", 313105984390981760L},
                {"[85701707188259456, 17, 0]", 857017071882594560L},
                {"[119399547156572832, 12, 0]", 193995471565172832L},
                {"[75696214793435136, 2, 0]", 750696214793435136L},
                {"[75867262389681152, 8, 0]", 758672620389681152L},
                {"[49648835588817792, 10, 0]", 496488355808817792L},
                {"[62661814546537216, 6, 0]", 626618014546537216L},
                {"[32125812947811712, 3, 0]", 321025812947811712L},
                {"[31733387900529184, 17, 0]", 317333879005291840L},
                {"[73404919377766528, 9, 0]", 734049193077766528L},
        };
        return combineImplWithSmallestTests(data);
    }

    @Test(dataProvider = "dpTestSmallest")
    public void testSmallest(Five five, String expected, long input) {
        String actual = Arrays.toString(five.smallest(input));
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dpTestGap")
    public Object[][] dpTestGap() {
        Object[][] data = new Object[][]{
                {"[101, 103]", 2, 100, 110},
                {"[103, 107]", 4, 100, 110},
                {"null", 6, 100, 110},
                {"[359, 367]", 8, 300, 400},
                {"[337, 347]", 10, 300, 400},
        };
        return combineImplAndGapTestData(data);
    }

    @Test(dataProvider = "dpTestGap")
    public void testGap(Five five, String expected, int g, long m, long n) {
        String actual = Arrays.toString(five.gap(g, m, n));
        Assert.assertEquals(actual, expected);
    }
}
