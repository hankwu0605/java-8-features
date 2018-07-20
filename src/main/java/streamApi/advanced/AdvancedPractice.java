package streamApi.advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import functionalInterface.builtIn.User;

public class AdvancedPractice {

  public static void main(String[] args) {
    List<User> users = User.createList();

    // 計算總共有多少人
    System.out.println(users.stream().count());

    // 計算所有人年齡總和
    System.out.println(users.stream().map(u->u.getAge()).mapToInt(u->u).sum());
    
    // 計算所有人年齡平均數
    System.out.println(users.stream().map(u->u.getAge()).mapToDouble(u->u).average());

    // 找出所有人中最小的年齡
    System.out.println(users.stream().map(u->u.getAge()).mapToInt(u->u).min());

    // 找出年齡最大和最小的人
    System.out.println(users.stream().max(Comparator.comparing(User::getAge)));
    System.out.println(users.stream().min(Comparator.comparing(User::getAge)));

    // 依性別做分類

    // 依是否為女生來做分類

    // 依性別來做分類並以UserBrief物件蒐集

    // 將所有人的名字連結成一個字串並輸出
    System.out.println(users.stream().map(u->u.getName()).collect(Collectors.joining()));
    
    // 將所有人的年齡轉換為Double並計算平均數
    System.out.println(users.stream().map(u->u.getAge()).mapToDouble(u->u).average());
    
    // 請依年齡由大至小進行排序
    System.out.println(users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList()));
    
    // 請先依姓名排序後再以年齡由小至大排序
    
    // 是否所有人的名字中均有b這個字母?
    System.out.println(users.stream().allMatch(u->u.getName().contains("b")));
    
    // 是否有任一個人的名字為Annie?
    System.out.println(users.stream().anyMatch(u->u.getName().equals("Annie")));
  }

}
