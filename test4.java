package pers.chenmo.myapp.Phone;

/* 2.随着科技的发展，手机的使用已经普及到每个家庭甚至个人，手机的属性越来越强大，功能也越来越多，因此人们在生活中越来越依赖于手机。
任务要求，使用所学知识编写一个手机属性及功能分析程序设计，测试各个手机的属性及功能。使用手机时，输出当前手机的各个属性参数以及正在使用的功能。
 */
class Phone {
  String brand;
  String type;
  String os;
  int price;
  int ram;

  public Phone(String brand, String type, String os, int price, int ram) {
    this.brand = brand;
    this.type = type;
    this.os = os;
    this.price = price;
    this.ram = ram;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  void show() {
    System.out.println("品牌:" + brand);
    System.out.println("型号:" + type);
    System.out.println("操作系统:" + os);
    System.out.println("价格:" + price);
    System.out.println("内存:" + ram);

  }

  void call(int a) {
    System.out.println("使用自动拨号功能:");
    numChoice(a);
  }

  void numChoice(int a) {
    switch (a) {
      case 1:
        System.out.println("爷爷的号。");

        break;
      case 2:
        System.out.println("奶奶爷的号。");
        break;
      default:
        System.out.println("空号。");
        break;
    }
  }

  void playgame() {
    System.out.println("玩扫雷游戏。");

  }

  void music(String mcName) {
    System.out.println("播放歌曲:" + mcName);

  }

}

public class test4 {
  public static void main(String[] args) {
    Phone p1 = new Phone("苹果", "iPhonex", "ios", 8888, 16);
    p1.show();
    System.out.println();
    p1.call(1);
    p1.playgame();
    p1.music("我的中国心");
    System.out.println("********************");
    Phone p2 = new Phone("华为", "华为荣耀20", "Android", 6666, 16);
    p2.show();
    System.out.println();
    p2.call(2);
    p2.playgame();
    p2.music("北京欢迎您");
    System.out.println("********************");
  }
}
