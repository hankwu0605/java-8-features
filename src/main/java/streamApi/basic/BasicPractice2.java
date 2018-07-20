package streamApi.basic;

import java.util.List;
import java.util.stream.Collectors;

import functionalInterface.builtIn.User;

public class BasicPractice2 {

  public static void main(String[] args) {

    List<User> users = User.createList();

    // 印出所有人所有資訊
    users.stream().forEach(u->System.out.println(u.toString()));

    // 印出所有人的年齡
    users.stream().forEach(u->System.out.println(u.getAge()));

    // 蒐集所有人的ID並存成List
    List<String> collect = users.stream().map(u->u.getId()).collect(Collectors.toList());
    collect.stream().forEach(System.out::println);

    // 蒐集所有年齡>=18的人並存成List
    List<User> collect2 = users.stream().filter(u->u.getAge()>=18).collect(Collectors.toList());
    collect2.stream().forEach(u->System.out.println(u.toString()));
    
    // 蒐集所有年齡>=18的人的id並存成List
    List<String> collect3 = users.stream().filter(u->u.getAge()>=18).map(u->u.getId()).collect(Collectors.toList());
    collect3.stream().forEach(System.out::println);

  }
}
