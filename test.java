package com.msb.test01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("欢迎来到【老马书城】");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //根据键盘输入执行相关指令
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入指令序号");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("【老马书城】<<<<<<1.展示书籍");
                //从文件读取list
                File f = new File("d:\\demo.text");
                book b = null;
                if (f.exists() == true) {
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    //将集合读取
                    ArrayList list = (ArrayList) (ois.readObject());
                    b = null;
                    list.add(b);
                    for (int i = 0; i <= list.size(); i++) {
                        b = (book) list.get(i);

                        System.out.println(b.getId());
                        System.out.println(b.getName());
                        System.out.println(b.getAuthor());
                        System.out.println(b.getPrice());
                    }
                } else {
                    ArrayList list = new ArrayList();
                    list.add(b);
                }


            }

            if (choice == 2) {
                System.out.println("【老马书城】<<<<<<2.上新书籍");
                System.out.println("请输入书籍编号");
                int id = sc.nextInt();
                System.out.println("请输入书籍名称");
                String name = sc.next();
                System.out.println("请输入书籍作者");
                String author = sc.next();
                System.out.println("请输入书籍价格");//从键盘录入书籍信息
                int price = sc.nextInt();
                book b = new book(id, name, author, price);
                b.setId(id);
                b.setName(name);
                b.setAuthor(author);
                b.setPrice(price);
                //创建一个各种书的集合
                ArrayList list = new ArrayList();//书的集合
                list.add(b);//添加个体到集合去
                //将集合文件写入到硬盘符文件去
                File f = new File("D:\\demo.txt");
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);//将list写出
                oos.close();//关闭流
                fos.close();

            }
            if (choice == 3) {
                System.out.println("【老马书城】<<<<<<3.下架书籍");
                //录入要下架的书籍
                //下架书籍


            }

            if (choice == 4) {
                System.out.println("【老马书城】<<<<<<4.退出应用");
                break;//
            }
        }
        }
        }





