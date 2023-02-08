package com.org.ita.kata.providers;

import java.math.BigInteger;
import org.testng.annotations.DataProvider;

public class DataProviderFive extends StudentProvider {
    @DataProvider(name = "dpTestPerimeter")
    public Object[][] dpTestPerimeter() {
        Object[][] data = new Object[][]{
                {new BigInteger("80"), new BigInteger("5")},
                {new BigInteger("216"), new BigInteger("7")},
                {new BigInteger("14098308"), new BigInteger("30")},
                {new BigInteger("6002082144827584333104"), new BigInteger("100")},
                {new BigInteger("2362425027542282167538999091770205712168371625660854753765546783141099308400948230006358531927265833165504"), new BigInteger("500")},
                {new BigInteger("152467067678714344550524537734048271292998503813135785368931005658076829046963774643119313960229304408318247360987566578090176167485340181341361709933516042529578379112120112962631894567810086406231602573932868160929376213041661498480943253395021550621182362105277485176295738321101710948351961009012594652842380867059966969631756276231140524001869105787846796813037345164982598790500698617780113219734383095995810914090764695873245124229512429026250772069366410216470644940748911822502058928476848844508932338336229831811885905050556304326036694088088161928446478115938029636600371731752151085333010288712539728176329592633599939031994638969667100553042160167953573136494478791335826926709706137173353165027355705640131864937338674044244090288036583933605392206696119949898321808205167547679898050479607725787257016454352015055603042116117079467904267815707313631192261929927428256319975263775559138567955601804907695509295974532540809024882354618261323472657923958426457617295665433769251027249446428284277742570841413660666093767415592676695242755162506601637091169211249818556147062960167641267790049567696135761977601854293523192238770718842587207304298176986679821956161621630921802478876092348181893158731950203318719110289970562924920927956856859662532046625064154494614530673042196504076305700030491919351324420912980743899922272048858486951542483245563149314766959314468663506492050349499105693599596128921222572100335613719172343087102810202398849533128182576480137652317145700347600887136783820730147623121496848283495923412613006458182461048145268666160543490681238628526922972791465044028746560696967637282622110371289190247854238385770720249637535060809697877202371087339246519659737994281014119438800987783686415385357403485577341926675554586390958424449916673033898662437564199285672892171061671359230955818372957009193267534683060669272011575083455834991982504548114782386964641273737605111785526744365285145530694368960707825778043272703526134820184945879543909719198733388224456365563480290827353456573571200586202697887344723445599393512821466078181550067109476886662601255470556727218730065128145820221688132646828059460507400077722508649437597923876744240040837146864934224521005870017814084289023470284047257951991804423436151293235760051561388507972887266398500553486727243310300315727060919657994638700477524911303354226722234852736309492312775815945261735624901435327344107142483244305743348438744213184709642303825808995313128689235879184740906547146073216510769291671312375493179120660366067517621400665174060232341744683327552518724245073980558212874516589770581931359548782079801503784549545282606987650999966943362092360971658052416503595606960945379910117247457792796248684694833005449138156882307676017770722913688667353052879205966880428103111971012071120411759800913109050553432800184814954416578924641503649566340756899159899999202828804502500917447277054495718459889465003802135171651551109472546873609161423242417397003899091069738453681016071070823620519771673366575154580414583019234052284676042936885984661709877527391308565507193621620538226082979912118609856915792131544798929900612280641402912021172486232189619185643602563021024337110190656298028706049262628668059321527168524906823862474544726638544435406686530903034194416921464315235402578008539152534681125110411865691138214830876533463124271303193960561458140688781376984158371353400255795352982603840440355064796126704274920059338036962441589698754734596049413622540278514673729973198860012455811847671500054105163568156862097276868694180450983061829952737083392163081548791400358078249404089554687154765655910923299770717838460320890803297252542275460021912911667481424177970898635595085044177170544475341933617756111509244862525627521109292022037642149193716272879852321232431266137147850629091026581964205146225844902937193075623780031903263290368949826968662774543975025147329579403286643951945713269479758616443550495912980669150618783183715552860072751556077398892957937414828224057803157523543198719729885433224965916362937758333204592431336426529313309664249264722605544715531399746915956669580887896884442079207428520131356177104111208467288154467777545829210094182736126815223384282527289758703214004925509621044271629766036590261869137759465851525324782202389853725625831550230588227354624026689635325950240107826735662329829124733002481616900130674636677652767510732746592695164297506888443844844317003480509690147433747177247882139859703463322300765582755171803713045424573465750842401769712717440373708062522486897739861201605153149999890315871155393369472929843174148278194696169612573697984230099837342901495801438752013152142814021754400513968952543453395799015577864144331299852363711475483037497468801351639940587112694354916128708078982429921364127835111332987415172477742239014172503291544053665324969777803879810644081166448642495125073495928654773348304011047435295813322042528173470125208370698401376570787963055319712160238758442600010501442813964602405968262106695443947354281296552413122554743350409847062201827356589154996237850117018128675501578200541711175295680858328426815178537856245955525582347165661255419956438407943915687425915973056814559167765430363674015116009465265394497002052792069565981846121903528557394186935278839449511006575221748196501711292730503141309990420640030006654587984632191323310502409642365730162570729910669495348406106959202924207708618126558122591006741899826932385827596188507304299453871828402163251153572623912590241595560317793258987235785514002428578154858803786404583299471929666208456372188416878577213263292100768598013305447966350028452403701047405058081018957585100797046248528854611516066678367582850129704503595123056545044892047228644258079272223654058623127387413192192236463905594173391273345672564150089680586406411821795099781383031469511379109974392684495001230400948000378702334028284613580832270002000803304625624696877589350035683915392060809699075950631603638295029334522023454672313259423828139700766580706638704774987733200769902193662474409112003424364319138156748626867566063116968561321109601374327264026976496269637508917076493949460197255635555965184810436811883049965947317093892694881744160354189836806322103659548452493896670994222805168820932118996841731751643097159595988594906786354039689913247398811540072730159078415881587498844361697701973305473550766293921759783653569309689314631420312816512939524388991378151688286850618078211543145572536202877524439995003133158399212960808394726389044888964097405970027815887273679657499675169960899425600724597512133154628099764841229338444439319587932639540683034819363641686745793245765796132167469045157289233321219307285450130561250566495764411012171825797901336767163088235046648798954282621755428339380149488556054687307672399233691890947892598702348259728792126586247093260152305653417903302185938393578222704634464232425406863511808386952704917761665047081984588603450629444056590302873473309772712694326915410330754241697515072898091685505114788734866838859859826983990301451560040477180039110725376393529248660022611251396912961852590377664283899651220595568996113611932721860911288013325771248593574240641263475571806614688873586267400161814752654791385180638246486392172293019328665999612954923214398423949205444976226856127940906907228959425875062132387775530956579016589226773991064541085919080724758745155045563594043180054142288099413899611600038075169509302812583771695525590469423247163790510791438316760946169853561511493312392664262401318381386112465425213692204504078180442942691874102367376901718414509661034738804214246298747300168862065972550695063888648073969401299250257947336063752791376138815176048656967384944497124388616202202692068828320966831625661558023441975458969869908748504366210770952762495306903991454119730895644423315134662924178107438632260596409040950692253828372763657334622426687430236562872490943069110242320155978557441079674027951995503498178964371479451604767571372653232987352472609218686507890253080269723875836744827532384881548368833190411388416278007459708860141118573450119098045346258782692006280693551417507411091127270405603863930858204349526646867668955450088875464118158181637194786465560908563005313891476706763894730160633363568240013622430773518139329978462115209594281032313934630713428393309804554706912"), new BigInteger("39755")},
                {new BigInteger("39560704273712155395072979352549551164544022711559589073135629505477540462342971907785190424637752991290228884590790735179901253263617990919383384059378028904689932984874250319265750988050889515951300291576674690552950474086439811261132526487977323760132273384852077268983060720685920724513033303535630129820881289661050552738425658158807356022484733524165290632257963066709762844568025081188804212284440369711599398020844101140112043316200620462647084527482367918319698682739315644607682916504476667548244057659777006150891362492363124645146254174483910104563306780398148778150754555573003987864836048257246617123383869090349960968147693789771116861416040279927207605055479631665266060639569772935862611804892300729160271272924159790038402000053509428882966455367355156595517548469951586080775098155458956318548198544217429639343026681156706431461216405758383679598721238776146579736984577345472629857552509194507471439030505161213405384829465689473528973361091719961126897988991296608189279419864346444546761423283142514746816133400598789468770287482024346912233786917744650035776603552000628942724818935528122634165930682187571905019175707097543574464006463108220265842537907345472600162833609384343132828410949388442706473031729088359463461199058095567510808626046871670533241898672245332976973895429051720236946776162431190839071754677292229808307974860433198487398246251854674008048357624364595293034053739196034355358963192524356431979227614566371869129573376142121331511827125605131618199788031755265398595959225684933897100952661238958100717017997395642389713099979866011041700641324289130191798954647604411538303181605173418070629543353522619606869871122861105334185097661771449829779137401191613195064761418255653191108105259154972085660160076839300703513873330605263951588024932222741260686266211354819754972449438220083014959032104820784284961645445286988378166452073099328809373611968464235040536935452097642585393675333409885507750681703964843510778826921496409455474508887866921064961761467092033458884370145152442300399350154514503978733849309258362517181430371692776626741231339431535051890025263237974420192621324469948111376472230707724704082026150476091777161489245489721493292308044165106459983019591245295584153645301487291894970614614503917175504564517966862255371689726968482255061934958340267808254487434233859045430234563887043664055467885239892405871863314242382949335380764925244958470518762687743700883524907992102435972759066808186484142684637642172358878751863863750164469901754480225539340969530282171976120879070637712891558290575830202307623878477958204334371693799527170878748637365138741505861357850915256920575433027140013392589679300201529160899929634243556364554474387891807852418319653383005163584766455016705008458778837479511479059125750245874808648050621223390497377542741468306743428899354589859818546325724347128638854615335120973732915111129342761596509558678418980989523297667486107627028184639177401378457351905320886858590360914536618381517010185847386808883247710185949761903099526969272670565144279404445320118691206798645950623569726394144844944630278802794934990773220055206389593863060245390350774666279673605174224775623581991816143358713178847231360433155008634571937167537931157923101888694888743164733367757736650927018412024629066100089114073957422028285795645083841420912132237223521026733929066723056347396682411591101387603430802006150821065255643877960961313515331544282398783741393982158748682905580116808711475727017496557111642861014371115973046476620228057192524913379057923503545038672375773964980266284872930252818787149303844766348568775660635246363136283614594414135192479421717122087468885306660687455884678174893668266271003119756041855557264677301816178609242067355506407304491228701404519395762005205955077171508126361933318192570118522806341801289154425991414800271192527244851214217987907737324007348071683976109308574368868125234729025701925285861570009488443439699105251451155747857705523488290888185449493832176544973873242805663480361568555955777434796997548058422686628843853034862657236934237611867179280797385744114224353400051716161354724821286358312275711727283117749869114997387918731627724964459191615487542417318277380370549644755035247677737055357686623899164442387283454609774223465931059416233276339401778511936754786470242263393628966943044509406867757020414776785304962850779128793894613992298077052838770490977458725916973087921985498091824"), new BigInteger("21220")},
                {new BigInteger("10715208569751710632469086013745241239590185481411012485019492563660693590727568598015645877906672804599385022610114339224534106423958145979348330493035627786061336474416168800893792274574240554592692675336756927065290966810893363284889356983333664602134940892648888198056056871392421138749593342156189455327122611133104573948539098342864560947516409465354257992362552321726326582493491024686304612243723651190081837821807461236294288161455616781223268603479613598522592902274414796654221542119779448577042800747032483926352096538150873349281627545029234178344188896898482611736982774169621196688084572110326583672110004691775557656611498170585381505741506261731346537442453158128775397263984444544762187322936921968945052703383971854227659636995539598150022914133104720431980080375620714023806400431546938465644328003866364792951996618357141628379981272815949781784889138111675430143671092680460864317444137630609415505837950719678188988004976041530483196950074905990418703535108432275171295591109049052967862154569084033996329990719591132190229787689230326119576463640380016074279409984630889458230208499601032177992233329696725587305837965533808798621162345896671624938065116726261462216117321398378036077759159853492435895228699139845082581119520905139250599762354159488375722020254382324098403209196599623796362947456728344694653862912694098659731505392575787884781604782774872876121866234461790043221535243789451119182422985078633139590178496574377084468455326547335788616883855268703816653534310370769837615493874951908015866939300186262889037109298215780446742407411593067630289961605896685466985267988196724939039344840845382503592812349082192462085572280257942584602381032145953733852383400768302501450646901510512149918559651254650600226880680237544713007151462701997888044219079580239268247884716255972125583584699516423175513728426650201861376579510992881135602408769276906746957331973007052997242164782324766024803465983170690471043519770611790998811772477408269356278522149283214089063432875618382662714157766444048929305574677500611052284711272117110879552648082482285686887674767083694116338837580268562331516456545149488161568811621252404096981234739239516198388212304883999370452377439726849749735032817282522911863040805899251715984008559803720049404729710594124844780724866037472437650222338741029805765270481745852815052749352745756415392818132273461358680117310655920089993818599493804621113041371424368330013439677799785952295724843409675826825110269877267126289231950240002198718476080194735126466248947512485878485968420957616334270720130306363974513899659469368678803255234796645442284704845933339720721214169895830024621900617781149669229986325480909276494548864084060819691005788578474600743956676671042649531796933404544774438669262569746127475406369998753153379042668452990981403125874329913041265053574330393380733181757163530982723292515436193795241896578041037240489014293812142764755528324761506185181435938835973463860984307618819472396558540173449272215012358994076850548238236573629845865114193087913892828214010564833030188807707722083538691070950555502265315373192928382919810481519746688247472470842506249583969930057453571193972198314776530671633555349882721819869649054626173606096645142129552423245920231369706875220519382073734308477774056607389886622782066504593360859749081947906071009226511970087100710477105508041136146934087031945063276750462620477079202276651370763944086011266059720073102921129222870624808126596401934487782415579783994233817610926971351915158902847407361007629040940894706796404510240561417800541574559457639423477637136159082912552398327442632432423088770368569220696375283650444812371129333664372826323181729906920105331052291585588915013818153585469062303542279509145188647855758296207045059645624169356044846897938691915621566772064406990138461965043876502592088662350937722322925250527847623383334944854019278492321279900267477950646928088499063545166366323496411599187949534677424593217056847103153441528394988121287469152396008434884881640890883953094252859026145172820951877790458706646668576726043889134999252149234167866778716553656005182453046775071512348893617529894057883196856790250001015746860542940091773498010738196378105564605985379732120447814642492702229131449224525661935977740438611229431750148515219011761648316544861692280103190460597778931680737536048964386769301275680187976449164501944488885388030914159866132659021170844539152544071066219504539858697354948593347084404098485705225516284551090077196570262571974603333434006626814011413704115364194320807411864811041332688838854433217180077641719487381582328690942929636470555026328284786740304004644249367838086753036474326205736045831374347486864397032944534492414428499121800730812569323977632929498641373360750219540444970501142319939285645998180104221888851098397558237220356156017925541401036205800116216252768007925789673461739358022790121416549558294907630744962704434983471465361084447525665898880891170792449380403663126208694014097213781181485770284663256945834473028477741431833291004698936863868393138448243769331217986276808512176993866486512837415057680820561660319206202190638815585770314119685428246485787839092791893102542120344666710212051520855024911411710478293228572543232207306248267897946131992255424663843576262450165126328036269246538288205695784246435724598436421067097761000951846389145556894583873909684461895315817955950637793257717296122891805306695811943190289605919139198727598054200996950292869625888594884362163868978439520973040060068282273425847961579626636371966725608555186660846072061321414415935116639598911618491380985395542768549924323385831257160212512670691295201383972298038507904327897668540224841595753764094442552148204968976063438370330733056510437276307489550618407278100691624712821443536034383967463619473064311919463853334669300734309634328488196738733188524954138219687673639081195113911996600481222678332288814377985061428831402364828625527755767388061731230102818099198200014714583049056885512987443758540631017787197817702488761215746377626256418859448597988167419861886271179769490700002248509877533533304037353839588490680001825946804095901497692878333503524183191352752657169123550659081748838531013489435239682304836926917155602745794767695032997629495506789189554370400980115564721514824340153707108853514589386432103291939050853653044303441926929240691312231916045723915254434309694699882325130870443728244409906368955810413968021165396240449163187179867816710411906835455702700041789782371876525220101118192138282203467817214427863485910829261350543829930178240119259162092443946009580109486762410845379908178756416298781174833997506771680309438380911476306396002033194084615780050513448995797561095412968716100524705415454969938090590419459042939156431027634794424268810112035855948932428137106506571449773726490178499989357266370533733284019015571366492276405484674262660201621763386472875793018444997520152159053169762304518214141793028719723325292470803227913764290167772186702484084524372690964413307630690542826224484485708667948435542759695175931314434109144645863592868797163063249422430592710144734536875375191261592857893526257030089741408850424908188190046107037140002301155613117992709953360469597120128841474828021807163063800711395718834464319813654262458691329498275436221221812516873620217470877384271939102257913177566902195960155347565106482782046263132344953813449192475139315755198261308276277210674001214151785221678882627690628275989053859283473456547545479786321167713442333348293555734518144361914437084109695286733801631647144036110407448399356583269286467043220644028710674396166391249577104314515380305219894058133027717294155507457219238944366004238980837462087535420688032419571754695887741811528476070797129078391423441003827748484577869560754992843265291718094735476249886744569920600536638176727096577727914249801259184915133324160339342680372587844669798760426268106685605158760714184869023526176882646495893807957016373768038803758473206470398162363080740096305127496683332028268052728251665337092592248167600703510470978143924011117886889487044793244015827503898817739635485167163287784086456273154267850484039092762084029289393173260602877159115004535153953688705348243835719806334704767382532495315713241964663714506983086916188069116103853142133944846411943811959758530076660396538329831353368434788649064949320083477328267381557116759839518689716531754465120481227355996241428036969337295514149247802672687382480311612640968038355376940665266733064976569081576473709764378775078396691151074484938739898017595675780989923373885375886709664647157577715553292854303629940007354368783539848360280868249442444778670599805277035357845428124702182238482981408960654773830908068415847457042560382484950984916637566738488283148273766102676855651849271885623425612002666352246745991290836718129841499970663820786805820850766035785686638369667849108822460739913318508939824705551337669968552201725480915812350472538836890254569447118096923732317317241283843511869040506154898259193101908920691928883289277824901433505245232512207499031967068260026355376830601560949525519946684006327969508978433032143655108390339846032112833409915350564537753036692742607048485049005443380282094117503339748154354586355129839103491933891783168721483145610154361652271265367388050719976823476948692527257160844046783346695662818682419896364937059643219789919050624618501763286279205752116530903665349472569824068971198386231752743571815356111711331341473798403203051569415080743593806146253962493388668207210263223335329183466184369199841619772937080218061363305081049272313600055744089580390355999796682260484"), new BigInteger("46080")},
        };
        return combineDataWithStudent(data);
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
                {"[73404919377766528, 9, 0]", 734049193077766528L}
        };
        return combineDataWithStudent(data);
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
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestZeros")
    public Object[][] dpTestZeros() {
        Object[][] data = new Object[][]{
                {0, 0},
                {6, 1},
                {14, 2},
        };
        return combineDataWithStudent(data);
    }
}
