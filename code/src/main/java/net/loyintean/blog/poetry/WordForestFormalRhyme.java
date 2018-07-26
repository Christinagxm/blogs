/**
 * All Rights Reserved
 */
package net.loyintean.blog.poetry;

import java.util.ArrayList;
import java.util.List;

/**
 * 词林正韵
 *
 * @author linjun
 * @since 2018年2月5日
 */
class WordForestFormalRhyme implements Rhyme {

    private List<Node> rhymes;

    /**
     * 初始化词林正韵
     */
    public WordForestFormalRhyme() {
        this.rhymes = new ArrayList<>(33);
        this.rhymes.add(new Node("一部：韵-平声",
            "东中重从纵供同童僮铜桐峒筒瞳衷忠盅虫冲终忡悰崇嵩崧菘戎绒弓躬宫穹融雄熊穷冯风枫疯丰充隆窿空公功工攻釭蒙蒙朦瞢笼胧栊咙聋珑砻泷蓬篷洪荭红虹鸿丛翁嗡匆葱聪骢通棕烘崆冬咚彤农侬宗淙锺钟龙茏舂松淞冲容榕蓉溶庸佣慵封胸凶匈汹雍邕痈浓脓逢缝峰锋丰蜂烽葑踪茸蛩邛筇跫蚣喁濛倥璁懵"));

        this.rhymes.add(new Node("一部：韵-仄声",
            "偬中重从纵供笼空缝鞚董懂动孔总拢桶捅蓊蠓汞肿踵宠垅陇拥冗冢捧勇甬踊涌俑蛹恐拱竦懵悚耸巩怂奉送梦凤洞众瓮贡弄冻痛栋恸仲粽讽控哄赣宋用颂诵统讼种汹综俸共倥"));

        this.rhymes.add(new Node("二部：韵-平声",
            "韁怆江缸窗邦双降飏望相长行量藏将创彷强慷丧抢吭傍当撞亢泷庞豇扛杠腔梆桩幢阳扬杨洋羊徉佯芳妨方坊防肪房亡忘忙茫芒妆庄装奘香乡湘厢箱釭镶芗襄骧光昌堂唐糖棠塘章张王常嫦裳凉粮梁粱良霜肠场尝偿床央鸯秧殃郎廊狼榔踉浆疆僵姜缰觞娘黄皇遑惶徨煌仓苍舱沧伤殇商帮汤疮墙樯嫱蔷康囊狂糠冈刚钢纲匡筐荒慌杭航桁翔详祥庠桑彰璋漳獐猖倡凰邙臧赃昂浪阊戕羌枪锵蜣跄篁簧璜潢攘瓤旁孀裆珰铛泱炀蝗隍怏肓汪鞅滂螂缃琅颃桄螳"));

        this.rhymes.add(new Node("二部：韵-仄声",
            "怆讲港项棒蚌耩降飏望相长量藏将创彷强慷丧抢吭傍当撞亢养痒象像橡仰朗桨奖蒋敞氅厂躺枉往颡惘两曩丈杖仗响掌党想鲞榜爽广享向飨幌莽纺网荡壤赏仿罔谠倘魍魉谎蟒漭嗓盎恍沆襁镪肮犷绛巷戆漾上状帐唱让浪酿旷壮放向忘畅葬匠障瘴谤尚涨饷样舫访贶嶂抗桁妄宕怅酱况亮恙谅胀鬯脏砀伉圹纩桄挡旺炕阆防坱晌"));

        this.rhymes.add(new Node("三部：韵-平声",
            "呢晞摛为骑菲几儡妻衣隋支枝肢迤移罍垂吹陂碑奇宜仪皮槐儿离施知驰池规危夷师姿迟差龟眉悲之芝时诗涯棋旗辞词期祠基疑姬丝司葵医帷思滋持随痴维卮麾墀弥慈遗肌脂雌披嬉尸狸炊湄篱兹疲茨卑亏蕤歧岐谁斯厮澌私窥熙欺疵赀羁彝髭颐资糜饥衰锥姨夔祗伊追缁萁箕治咨尼而推匙陲魑锤缡璃骊羸帔罴糜蘼脾芪畸牺羲曦欹漪猗崎崖萎筛狮蛳鸱绥虽粢瓷椎饴嫠痍惟唯机耆逵岿丕毗枇貔楣霉辎蚩嗤媸埘莳鲥鹚笞漓怡贻禧噫其琪祺麒嶷螭栀鹂累踟琵嵋微薇晖辉徽挥韦围帏违闱霏妃飞非扉肥威祈畿笄机讥玑稀希依归饥矶欷诽绯葳巍沂圻颀齐縻黎犁梨萋凄堤低题提蹄啼鸡稽兮倪霓西栖犀嘶撕梯鼙赍迷泥溪蹊圭闺携畦嵇跻奚脐醯黧蠡醍鹈奎批砒睽荑篦齑藜猊鲵羝氐灰恢魁隈回徊梅枚玫媒煤雷颓崔催摧堆陪杯醅嵬诙裴培盔偎煨瑰茴追胚徘坯桅傀莓来"));

        this.rhymes.add(new Node("三部：韵-仄声",
            "砌琲珥为骑菲几己儡妻衣殢泗施否遗纸只咫吹积泥是思识说靡彼毁委帔诡溉髓累易敦邃技绮萎觜此泚蕊徙尔弭婢侈弛豕紫旨指视美痞兕姊比水轨止徵市喜已纪跪妓蚁鄙晷子仔梓矢雉死履垒癸趾址以已似耜祀史驶耳使里理李起杞圯士仕俟始齿矣耻麂枳峙鲤迩氏玺巳滓苡倚匕迤逦旖旎舣蚍秕芷拟你企诔捶屣棰揣豸祉恃尾苇鬼岂卉伟斐匪篚娓悱榧韪炜虺玮虮荠礼体米启陛洗邸底抵弟坻柢涕悌澧醴诋眯娣递昵治睨蠡贿悔罪馁每块汇猥璀磊蕾傀腿寘置事地意志泪吏赐自字义利器位戏至次伪寺瑞智记异致备肆翠试类弃饵媚鼻辔坠醉议翅避笥帜炽粹莳谊帅厕寄睡忌贰萃穗二臂嗣遂恣四骥季刺驷寐魅被懿觊冀愧匮恚馈蒉篑柜暨庇豉莉腻秘鸷毖啻示嗜饲伺薏祟值惴屣眦詈企渍譬跛挚燧隧悴尿稚雉莅悸肄泌侍踬未味气贵费沸尉畏慰蔚魏纬胃谓渭卉讳毅既蜚翡诽霁制计势世丽岁济第艺惠慧币弟滞际涕厉契敝弊毙帝蔽髻锐戾裔袂系祭卫隶闭逝缀翳替细桂税婿例誓筮蕙诣砺励瘗噬继脆睿毳曳蒂睇递逮蓟蚋薜荔唳捩粝媲嬖彗睨剂嚏谛缔剃屉悌俪锲贳掣羿棣蟪娣赘憩鳜彘呓谜挤会旆最贝沛霈绘脍荟狈侩桧蜕酹外兑队内辈佩退碎背秽对废悔诲晦昧配妹喙溃吠肺耒块碓刈悖焙淬"));

        this.rhymes.add(new Node("四部：韵-平声",
            "鱼渔初书舒居裾琚渠蕖誉余舆胥狙锄据疏蔬梳躇虚嘘污铺墟徐猪闾庐驴予诸储除滁蜍如畲淤呕妤苴菹沮徂龉茹榈於祛蘧疽蛆醵纾樗欤虞愚娱隅无芜巫于衢癯瞿氍儒襦濡须需朱珠株诛铢蛛殊俞瑜榆愉逾渝窬谀腴区躯驱岖趋扶符凫芙雏敷麸夫肤纡输枢厨俱驹模谟摹蒲逋胡湖瑚乎壶狐弧孤辜姑觚菰徒途涂荼图屠奴吾梧吴租卢鲈炉芦颅垆蚨孥帑苏酥乌枯粗都茱侏姝禺拘嵎蹰桴俘臾萸吁滹瓠糊醐呼沽酤泸舻轳鸬驽匍葡菟诬呜迂盂竽趺毋孺酴鸪骷刳蛄晡葫呱蝴劬殂猢郛孚"));

        this.rhymes.add(new Node("四部：韵-仄声",
            "屡语圉圄吕侣旅杼伫与仆茹恶誉渚煮疏狙富度暑否鼠汝贾黍杵著处贮莽女许污铺拒炬距所予楚车础阻俎沮叙绪序屿墅巨去苣举龉讵溆浒钜醑咀诅苎抒楮雨宇舞府鼓虎古股估土吐圃庾户树煦诩努辅组乳弩补鲁橹睹腐数簿竖普侮斧聚午伍釜缕部柱矩武五苦抚浦主杜坞祖愈堵扈父甫禹羽怒腑拊俯罟赌卤姥鹉拄栩窭脯妩庑麈褛篓偻酤牡谱怙肚踽虏孥诂瞽牯祜沪雇仵母某亩蛊琥御去虑署据驭曙助絮箸豫恕遽庶预踞倨蓣淤锯觑翥薯遇路辂赂露鹭渡赋布步固素具务雾鹜附兔故顾句墓慕暮募注住注驻炷祚裕误悟寤戍库护屦诉妒惧趣娶铸绔傅付谕喻妪芋捕哺互孺寓赴冱吐晤煦酤讣赙驸婺锢蛀飓怖塑愫蠹溯镀璐雇瓠迕妇负阜副醋措"));

        this.rhymes.add(new Node("五部：韵-平声",
            "佳街鞋牌柴钗崖涯偕阶皆谐骸排乖怀淮豺侪埋霾槐斋睚差崽楷秸揩挨俳开哀埃台苔抬该才材财裁栽哉来莱灾猜孩徕骀胎唉垓陔挨皑呆腮"));

        this.rhymes.add(new Node("五部：韵-仄声",
            "蟹解洒拐矮摆买骇海改塞采彩楷在宰醢铠大恺待殆怠乃凯倍蓓迨亥泰太带外盖濑赖籁蔡害蔼艾丐奈柰汰癞霭懈廨邂隘卖派债怪坏诫戒界介芥械薤拜快迈败稗晒瀣湃寨疥届蒯篑蒉喟聩块惫爱代载态菜碍戴贷黛概岱溉慨耐鼐玳再袋逮埭赉赛忾暧咳嗳睐"));

        this.rhymes.add(new Node("六部：韵-平声",
            "蘋真因茵辛新薪晨辰臣泯论人仁神分亲申裀身汶宾滨槟缤囤邻鳞麟珍尘陈春津秦频苹颦濒银垠筠巾民岷珉贫莼淳醇纯唇伦轮沦抡匀旬巡驯钧均榛遵循甄宸纶椿鹑嶙辚磷呻伸绅寅姻荀询洵峋氤恂嫔彬皴娠闽纫湮肫逡菌臻豳文闻纹蚊云氛纷芬焚坟群裙君军勤斤筋勋薰曛醺芸耘芹欣氲荤汶汾殷雯贲纭昕熏魂浑温孙门尊樽存敦墩炖暾蹲豚村屯盆奔昏痕根恩吞荪扪裈昆鲲坤仑婚阍髡馄喷狲饨臀跟瘟飧怨粼嗔"));

        this.rhymes.add(new Node("六部：韵-仄声",
            "轸敏允引尹尽忍准隼笋泯论闻喷盾菌闵悯分蚓牝拚殒紧汶蠢陨哂诊疹赈肾蜃膑黾泯窘吮缜吻粉蕴愤隐谨近忿刎搵槿瑾恽韫抆混棍阃悃捆衮滚鲧稳本畚笨损忖囤遁很沌恳垦龈震信印进润阵镇刃顺慎鬓晋骏闰峻衅振俊舜赆吝烬讯仞迅汛趁衬仅觐蔺浚赈龀认殡摈缙躏廑谆瞬韧浚殉馑问汶运晕韵训粪忿酝郡紊愠近抆奋郓捃靳恨寸困顿遁钝闷逊嫩溷诨巽褪艮搵"));

        this.rhymes.add(new Node("七部：韵-平声",
            "漙元原源沅翰鼋园袁猿垣便难看鲜烦蕃卷樊喧冠拚厌萱暄燕冤言钿间轩藩溅叹媛嬛拌援患辕番繁翻幡璠鸳殷鹓蜿湲扁爰汗掀燔圈谖寒韩丹单纶安鞍餐檀坛滩弹残干肝竿阑栏澜兰刊丸完桓纨端湍酸团攒官鸾銮峦欢宽盘蟠漫邯郸摊玕拦珊狻鼾杆跚姗殚箪瘅谰獾倌棺剜潘盘般蹒瘢磐瞒谩馒鳗钻抟邗删潸关弯湾还环鬟寰班斑蛮颜奸攀顽山闲艰悭孱潺擐圜菅般颁鬘疝讪斓娴鹇鳏先前千阡笺天坚肩贤弦烟莲怜连田填巅鬈宣年颠牵妍眠渊涓捐娟边编悬泉迁仙钱煎然延筵毡旃蝉缠廛联篇偏绵全镌穿川缘鸢旋船涎鞭专圆员乾虔愆权拳椽传焉嫣鞯褰搴铅舷跹鹃筌痊诠悛禅婵躔颛燃涟琏翩骈癫阗沿蜒胭芊鳊胼滇佃畋咽湮狷蠲蔫骞膻扇棉拴荃籼砖挛儇璇犍"));

        this.rhymes.add(new Node("七部：韵-仄声",
            "翦撚罥炼阮翰远晚苑返反便难看鲜饭研卷偃蹇琬拚冠沅圈宛婉畹菀钿间念观蜿绻叹挽堰旱暖管琯禅满短传馆缓盥碗懒伞伴卵散弹伴诞罕瀚浣断侃算款但坦袒纂缎拌懑干谰莞潸眼简版板阪盏产限绾柬拣撰馔赧皖汕铲羼楝栈铣善遣浅典转衍犬选冕辇免展茧辨篆勉剪显饯践喘藓软蹇演兖件腆跣缅缱殄扁匾蚬岘畎燹隽键变泫癣阐颤膳鳝舛娩辗脔辫捻愿怨万饭献健建宪劝蔓券远侃键贩畈曼瑗媛瀚岸汉断乱散旦算玩烂贯半案按炭汗赞灌爨窜幔粲灿璨换焕唤涣悍惮段判叛绊鹳伴畔锻腕惋馆旰捍疸但罐盥婉缎缦侃蒜钻谰谏雁患涧宦晏慢盼篆栈惯串绽幻瓣苋办谩铲绾孪篡裥扮霰殿面县变箭战扇煽膳见砚院练链碾燕宴贱馔荐绢彦掾眷倦羡奠遍恋啭眩钏倩卞汴片谴溅饯善转甸电咽茜单眄淀靛佃镟漩拣缮现狷炫绚绽线煎选旋颤擅撰唁谚媛忭弁援"));

        this.rhymes.add(new Node("八部：韵-平声",
            "蛴巣萧箫貂刁凋姣漂挑泡要料调雕迢条操瞭夭炮挠研髫蜩枭刨了教跳浇聊辽寥撩寮僚尧宵消霄绡号销超朝潮嚣骄娇蕉焦椒饶硝烧遥徭摇谣瑶韶昭招镳瓢苗猫腰桥乔娆妖飘逍潇鸮骁祧鹪鹩缭獠嘹幺邀姚樵谯憔标飚嫖剽佻龆苕岧噍哓跷侥魈峣描钊轺桡铫鹞翘枵侨窑礁肴巢交郊茅嘲钞包胶苞梢庖匏坳敲胞抛蛟崤鵁鞘抄蝥咆哮凹淆跑艄捎爻咬铙茭鲛抓豪劳毫髦绦刀萄猱褒桃糟旄袍稍蒿涛皋陶鳌曹遭羔糕高搔毛艘滔骚韬缫膏牢醪逃濠壕饕洮淘叨啕篙熬遨翱嗷臊嗥尻鏖螯獒敖牦漕嘈槽掏唠涝捞痨芼"));

        this.rhymes.add(new Node("八部：韵-仄声",
            "筱小表鸟晓少姣漂挑泡要调扰绕绍杪瞭夭炮挠沼眇矫皎刨了教杳钞窈窕袅铫敲劳缭掉肇缥獠缈渺淼茑赵兆缴悄舀侥蓼娆硗剿晁藐秒殍巧饱卯狡爪鲍搅绞拗咬炒吵佼昴茆皓宝藻早枣老好道稻造脑恼岛倒祷捣抱讨考燥扫嫂保鸨稿草昊浩镐杲缟槁堡皂瑙媪燠袄懊葆褓芼澡套涝蚤拷栲啸笑照庙窍妙诏召邵曜耀钓吊叫眺诮料疗潦峤徼跳嘹镣廖尿肖峭哨俏醮燎鹩鹞轿骠票效貌校孝闹豹罩棹较窖爆稍拗淖号帽报导盗噪灶奥告诰到蹈傲暴躁冒悼倒燥犒靠懊瑁燠耄糙套潦耗"));

        this.rhymes.add(new Node("九部：韵-平声",
            "它她歌多罗河戈阿波科柯陀娥蛾鹅萝何螺禾珂蓑婆坡呵哥轲沱鼍拖驼跎和佗磨他峨俄摩么娑莎迦疴苛蹉嵯驮箩逻锣哪挪锅诃窠蝌髁倭涡窝讹陂鄱皤魔梭唆骡挼靴瘸搓哦瘥酡"));

        this.rhymes.add(new Node("九部：韵-仄声",
            "涴亸哿火舸舵我躲拖娜荷可合左果裹朵锁琐堕惰妥坐裸跛夥大颗祸桠婀逻卵那坷簸叵垛哆娑硪个贺佐饿座和挫课唾播破卧货簸驮磋作做剁廓磨懦糯缚锉挼"));

        this.rhymes.add(new Node("十部：韵-平声",
            "佳娲蜗蛙娃哇麻花霞家茶华沙牙涯蛇瓜斜邪芽车差嘉瑕纱鸦遮叉奢巴咱耶嗟遐加笳赊槎蟆骅虾葭袈裟砂衙呀琶耙芭杷笆疤爬葩佘鲨查茬楂渣爹挝咤拿椰珈跏枷迦痂茄桠丫哑划哗夸胯抓洼呱"));

        this.rhymes.add(new Node("十部：韵-仄声",
            "马灺下者野雅瓦寡傻社写泻夏也把厦贾惹冶假且玛姐舍喏赭洒嘏剐打耍那卦挂祃驾夜谢榭罢霸暇灞嫁赦蔗化价射骂稼架诈亚麝怕借卸帕坝靶鹧贳炙嗄乍咤诧罅吓娅哑讶迓桦话跨衩柘"));

        this.rhymes.add(new Node("十一部：韵-平声",
            "汀庚羹盲觥彭亨英烹平行评凭拼枰京惊荆明盟鸣荣兵听兄醒卿生更甥笙牲擎鲸迎衡耕徵萌甍宏闳茎罂莺樱泓橙争筝清情晴精睛菁晶旌盈楹瀛嬴赢营婴缨贞成城诚呈程酲声征轻名倾萦琼峥嵘撑粳坑铿撄鹦黥蘅澎膨棚浜坪苹钲伧檠嘤轰嬛铮狰宁狞瞪绷怦璎砰氓鲭侦柽蛏茔茕赓黉瞠青经泾形陉亭庭廷霆蜓停丁仃馨星腥惺俜灵龄玲铃伶零冥溟铭瓶屏萍荧萤荣扃蜻硎苓聆瓴翎娉婷宁瞑螟猩疔叮厅町泠棂囹羚蛉咛型邢蒸烝承丞惩澄陵凌绫菱冰膺鹰蝇绳升坰缯仍兢矜征登灯僧憎增曾层能朋鹏弘肱薨腾藤恒罾崩滕誊崚嶒姮塍冯症簦瞢凝棱楞"));

        this.rhymes.add(new Node("十一部：韵-仄声",
            "梗影景井岭领境警请饼凭行永骋逞颖颍顷整静省幸颈郢醒猛丙更炳杏秉耿矿冷靖哽绠荇艋蜢皿儆悻婧阱靓打瘿犷眚憬鲠迥炯茗挺艇梃酩酊等鼎顶肯拯謦刭敬命证性政镜圣咏姓庆映病柄劲竞靓净竟孟诤聘硬炳泳迸摒阱檠迎郑獍径定听罄磬赠佞邓证秤孕剩迳甑宁胫订饤锭謦泞瞪蹭蹬亘镫滢凳磴泾"));

        this.rhymes.add(new Node("十二部：韵-平声",
            "忧毬蝤尤邮优尤流旒留骝榴刘由油游猷悠攸牛修羞秋周州洲舟酬雠柔逑俦畴筹稠丘邱抽瘳遒呕收鸠搜驺愁休囚求裘仇浮谋牟眸侔矛侯喉猴讴鸥楼陬偷头投钩沟幽纠啾楸蚯踌绸惆勾娄琉疣犹邹兜呦咻貅球蜉蝣辀帱阄瘤硫浏庥湫泅酋瓯啁飕鍪篌抠篝诌骰偻蝼髅搂欧彪掊虬抔不瓿缪鞦"));

        this.rhymes.add(new Node("十二部：韵-仄声",
            "甃媾有酒首口否後柳友斗狗久厚手富叟守右受牖读偶走九后咎薮吼副帚垢舅纽藕朽臼肘韭剖诱仆缶酉苟丑糗扣叩某莠寿绶玖授溲纣钮扭呕殴纠耦掊瓿拇姆擞绺抖陡蚪篓黝赳宥候就售寿秀绣宿奏兽漏陋狩昼寇茂旧胄宙袖岫柚覆救厩臭佑右囿豆饾窦瘦漱咒究疚谬皱逅嗅遘溜镂逗透骤复又侑幼堠锈鹫绉咮灸籀酎诟蔻僦构扣购彀戊懋贸袤嗽凑鼬"));

        this.rhymes.add(new Node("十三部：韵-平声",
            "沉侵寻任禁沈占浔临林霖针箴斟心簪深琴禽擒衾钦吟淫今襟衿金音阴岑壬歆森祲喑琛涔骎忱淋妊掺参椹郴芩檎琳愔喑黔嵚砧"));

        this.rhymes.add(
            new Node("十三部：韵-仄声", "寝饮锦任禁沈占品枕审甚廪衽稔凛懔朕荏婶葚禀噤谂怎恁饪覃沁荫浸谮谶噤甚鸩赁喑渗窨妊"));

        this.rhymes.add(new Node("十四部：韵-平声",
            "覃潭参骖忺颔嵌南楠男谙庵含涵函岚蚕探贪耽眈龛堪谈甘三酣柑惭蓝担簪谭昙坛婪戡痰篮褴蚶憨泔聃邯蟫盐檐廉帘嫌严髯谦奁纤恹签瞻蟾炎添兼缣沾尖潜阎镰黏淹钳甜恬拈砭詹蒹歼黔钤佥觇崦渐鹣腌毵襜阉咸缄岩谗衔帆衫杉监凡馋芟搀喃掺巉"));

        this.rhymes.add(new Node("十四部：韵-仄声",
            "感紞览揽胆颔嵌澹啖坎惨探敢撼毯糁湛菡萏罱椠喊橄榄俭焰敛险检脸三染渐掩点簟贬冉苒陕谄俨闪剡忝琰奄歉芡崭堑罨捡崦玷槛范减舰犯湛斩黯范勘暗滥啖担憾暂绀憨澹瞰淡缆艳剑念验堑赡店敛厌焰垫欠僭酽潋滟俺砭坫陷鉴泛梵忏赚蘸站馅"));

        this.rhymes.add(new Node("十五部韵-入声",
            "簇屋木竹目服福禄谷熟菽肉族鹿漉腹菊陆轴逐苜蓿宿牧伏夙蔌读犊渎牍椟黩毂复粥肃碌鬻育国六缩哭幅斛戮仆畜蓄叔淑倏独卜馥沐速祝麓辘镞蹙筑穆睦秃覆辐瀑郁舳掬踘蹴茯袱鹆髑槲扑匐簌蔟煜蝠菔孰塾矗竺曝鞠嗾谡簏副沃俗玉足曲粟烛属录辱狱绿毒局欲束鹄蜀促触续浴酷躅褥旭欲笃督赎渌纛碡北瞩嘱勖溽缛梏醁"));

        this.rhymes.add(new Node("十六部韵-入声",
            "觉角桷榷岳乐捉朔数卓啄琢剥驳雹璞朴壳确浊擢濯渥幄握学龌龊槊搦镯喔邈荦药薄恶作落阁鹤爵弱约脚雀幕洛壑索郭错跃若酌托削铎凿箔鹊诺萼度橐钥龠瀹着著虐掠获泊搏藿嚼勺谑廓绰霍镬莫箨缚貉各略骆寞膜鄂博昨柝格拓轹铄烁灼疟蒻箬芍躇却噱矍攫醵踱魄酪络烙珞膊粕簿柞漠摸酢怍涸郝垩谔鳄噩锷颚缴扩椁陌"));

        this.rhymes.add(new Node("十七部韵-入声",
            "拍质日笔出室实疾术一乙壹吉橘秩率律逸易积识佚失漆栗毕恤密蜜桔溢瑟膝匹述黜弼跸七叱卒虱悉戌嫉帅蒺侄踬怵蟋筚篥必泌荜秫栉唧帙溧谧昵轶聿诘耋垤捽茁鹬窒苾陌石客白泽伯迹宅席策册碧籍格役帛戟璧驿麦额柏魄脉夕液尺隙逆画百辟赤革脊翮屐获适索厄隔益窄核舄掷责坼惜癖僻掖腋释译峄择摘弈奕迫疫昔赫瘠谪亦硕貊跖碛只炙踯斥穸鬲骼舶珀吓磔拆喀蚱舴剧檗擘栅啧帻箦扼划蜴辟帼蝈刺嵴汐藉螫蓦摭襞虢哑绎射锡壁历枥击绩绩笛敌滴镝檄激寂觌溺觅狄荻幂戚涤的吃沥雳霹惕剔砾翟籴倜析晰淅蜥劈甓嫡轹栎阋菂踢迪皙裼逖蜺阒汨职国德食蚀色力翼墨极殛息熄直值得北黑侧贼饰刻则塞式轼域蜮殖植敕亟棘惑忒默织匿慝亿忆臆薏特勒幅仄昃稷逼克即唧弋拭陟恻测翊洫啬穑鲫抑或匐缉辑戢立集邑急入泣湿习给十拾袭及级涩楫粒汁蛰执笠隰汲吸絷挹浥悒岌熠葺什芨廿揖煜歙笈圾褶翕"));

        this.rhymes.add(new Node("十八部韵-入声",
            "窣鹖物佛拂屈郁乞掘吃讫绂弗勿迄不怫绋沸茀厥倔黻崛尉蔚契纥屹熨绂月惙骨发阙越谒没伐罚卒竭窟笏钺歇突忽袜曰阀筏鹘蹶蕨殁橛核蝎勃渤悖孛揭碣粤樾鳜脖饽鹁捽猝惚兀讷呐羯凸咄曷达末阔钵脱夺褐割沫拔葛闼渴拨豁括抹遏挞跋撮泼秣掇聒獭刺喝磕蘖瘌袜活鸹斡怛钹捋黠拔八察杀刹轧戛瞎刮刷滑辖铩猾捌叭札扎帕茁鹘揠萨捺屑节雪绝列烈结穴说血舌洁别缺裂热决铁灭折拙切悦辙诀泄锲咽轶噎彻澈哲鳖设啮劣玦截窃孽浙孑桔颉拮撷揭褐缬碣挈抉亵薛拽爇冽瞥迭跌阅餮耋垤捏页阕觖谲鴂撇蹩篾楔辍啜缀撤绁杰桀涅霓蜺批叶烨帖贴牒接猎妾蝶叠箧惬涉鬣捷颊楫聂摄慑镊蹑协侠荚挟铗浃睫厌靥蹀躞燮摺辄婕谍堞霎嗫喋碟鲽捻晔躐笈靼"));

        this.rhymes.add(new Node("十九部韵-入声",
            "合塔答纳榻閤杂腊匝阖蛤衲沓鸽踏拓拉盍塌咂盒卅搭褡飒磕榼遢蹋蜡溘邋趿洽狭峡法甲业邺匣压鸭乏怯劫胁插锸押狎夹恰蛱硖掐札袷眨胛呷歃闸霎"));

    }

    /**
     * @author linjun
     * @since 2018年2月5日
     * @return
     * @see net.loyintean.blog.poetry.Rhyme#getRhymeName()
     */
    @Override
    public String getRhymeName() {
        return "词林正韵";
    }

    @Override
    public Node getNode(int i) {
        return this.rhymes.get(i % this.rhymes.size());
    }
}