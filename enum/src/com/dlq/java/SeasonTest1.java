package com.dlq.java;

/**
 * @program: Enum_Annotation
 * @description:
 * @author: Hasee
 * @create: 2020-07-22 15:39
 *
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        //toString():
        System.out.println(spring.toString());

//        System.out.println(Season1.class.getSuperclass());

        //values():
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName)：返回枚举类中对象名是objName的对象。
        Season1 winter = Season1.valueOf("WINTER");
        //如果没有objName的枚举类对象，则抛异常：IllegalArgumentException
//        Season1 winter = Season1.valueOf("WINTER1");
        System.out.println(winter);
        winter.show();
    }

}

interface Info{
    void show();
}


//使用enum关键字枚举类
enum Season1 implements Info{
    //1、提供当前枚举类对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天你好");
        }
    },
    SUMME("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天你好");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天你好");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天你好");
        }
    };

    //2、声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2、私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }



    //4、其它诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4、其它诉求2：提供toString()
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}
