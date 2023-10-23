package pers.chenmo.myapp.Bank;
/* 
1. 银行存取款的流程是人们非常熟悉的事情，用户可在银行对自己的资金账户进行存款、取款、查询余额等操作，极大的便利了人民群众对资金的管理。
本任务要求，使用所  学知识编 写一个银行存取款程序，实现存取款功能。编写一个帐户类实现银行帐户的概念，创建帐户类的对象ba，假设ba的账号为:123456，初始的存款余额为500元。首先向该账户存入1000元，再取出800元。
运行结果
 */

class Bank {
  int init;
  String username;
  String passworld;

  public Bank(int init, String username, String passworld) {
    this.init = init;
    this.username = username;
    this.passworld = passworld;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassworld() {
    return passworld;
  }

  public void setPassworld(String passworld) {
    this.passworld = passworld;
  }

  public int getInit() {
    return init;
  }

  public void setInit(int init) {
    this.init = init;
  }

  Bank() {
    setInit(500);
  }

  void save(int a) {
    setInit(this.init + a);
    System.out.println("存入了" + a + "元,您的余额为:" + cat());

  }

  void get(int b) {
    if (this.init < b) {
      System.out.println("您只剩" + this.init + "不足以您取出" + b + "元");

    }
    setInit(this.init - b);
    System.out.println("取出了" + b + "元,您的余额为:" + cat());
  }

  int cat() {
    return init;
  }
}

public class test3 {
  public static void main(String[] args) {
    Bank ba = new Bank();
    ba.setInit(500);
    System.out.println("初始存款500元");
    ba.setUsername("123456");
    ba.setPassworld("123456");
    System.out.println("初始账户:123456");
    ba.save(1000);
    ba.get(800);
    ba.cat();
  }
}
