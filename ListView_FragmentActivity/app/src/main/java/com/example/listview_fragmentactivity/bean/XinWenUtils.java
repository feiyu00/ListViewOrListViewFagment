package com.example.listview_fragmentactivity.bean;

import com.example.listview_fragmentactivity.R;

import java.util.ArrayList;
import java.util.List;

public class XinWenUtils {
    private static List<News> list;
    private static final  String[] title={"茶叶","西红柿","菠菜"
           };
    private static final  String[] content={"茶（学名：Camellia sinensis(L.) O. Ktze.），山茶科山茶属植物，分布于中国长江以南各省的山区，茶按制作工序分为绿茶、白茶、红茶等六大类。茶叶可作饮品，含有多种有益成分，并有保健功效。\n" +
            "茶叶呈长圆形或椭圆形，先端钝或尖锐，基部楔形，上面发亮，下面无毛或初时有柔毛，边缘有锯齿，叶柄无毛。花白色，花瓣阔卵形；萼片阔卵形至圆形；花期10月至翌年2月。",
            "番茄（学名：Lycopersicon esculentumMill.），别称为西红柿。茄科番茄属一年生或多年生草本植物，原产南美洲，现全世界广泛栽培。果实营养丰富，具特殊风味，可以生食、煮食、加工番茄酱、汁或整果罐藏。\n" +
                    "番茄体高0.6-2米，全体生粘质腺毛，有强烈气味，茎易倒伏，叶羽状复叶或羽状深裂，花序总梗长2-5厘米，常3-7朵花，花萼辐状，花冠辐状，浆果扁球状或近球状，肉质而多汁液，种子黄色，花果期夏秋季。","菠菜（Spinacia oleracea L.）又名波斯菜、赤根菜、鹦鹉菜等 [1]  ，属藜科菠菜属，一年生草本植物。植物高可达1米，根圆锥状，带红色，较少为白色，叶戟形至卵形，鲜绿色，全缘或有少数牙齿状裂片。 [2]  菠菜的种类很多，按种子形态可分为有刺种与无刺种两个变种。\n" +
            "菠菜原产伊朗，中国普遍栽培，为极常见的蔬菜之一。"};
    private static  final  int[] titleImage={R.mipmap.tea,R.mipmap.tomato,R.mipmap.spinach};
    private static  final  int[] contentImage={R.mipmap.content_tea,R.mipmap.content_tomato,R.mipmap.content_spinach};
    private static final  String[] contentTitle = {"茶 （中国传统饮品）","番茄 （茄科茄属植物）","菠菜 （藜科菠菜属草本植物）"};
    public static List<News> getAllFoodList(){
        list=new ArrayList<>();
        for (int i = 0; i <title.length ; i++) {
            News bean=new News(title[i],content[i],titleImage[i],contentImage[i],contentTitle[i]);
            list.add(bean);
        }
        return list;
    }
}
