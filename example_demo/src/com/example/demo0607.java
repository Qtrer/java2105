package com.example;

import java.util.Scanner;

class Student{
    int sno;
    int age;
    char sex;
    int cno;
    int cScore;
    int mScore;
    int eScore;
}

public class demo0607 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Scanner ss = new Scanner(System.in);
        boolean main_menu = true;
        int stu_count = 0;
        while (main_menu){
            System.out.println("1.录入信息  2.查询信息  3.查询均分  4.查询不及格信息   5.查询男女比例    6.退出");
            System.out.println("请输入相应的操作序号：");
            int a = ss.nextInt();
            switch (a){
                case 1:
                    boolean error_flag = false;
                    System.out.println("请输入录入学生的学号");
                    int in_sno = ss.nextInt();
                    for (int i=0;i<students.length;i++){
                        if (in_sno == students[i].sno){
                            error_flag = true;
                            break;
                        }
                    }
                    if (error_flag){
                        System.out.println("错误：该学生已有成绩");
                    }
                    System.out.println("请输入录入学生的年龄");
                    int in_age = ss.nextInt();
                    System.out.println("请输入录入学生的性别");
                    char in_sex = ss.next().charAt(0);
                    System.out.println("请输入录入学生的班级");
                    int in_cno = ss.nextInt();
                    System.out.println("请输入录入学生的语文成绩");
                    int in_cScore = ss.nextInt();
                    System.out.println("请输入录入学生的数学成绩");
                    int in_mScore = ss.nextInt();
                    System.out.println("请输入录入学生的英语成绩");
                    int in_eScore = ss.nextInt();
                    Student in_student = new Student();
                    in_student.sno = in_sno;
                    in_student.age = in_age;
                    in_student.sex = in_sex;
                    in_student.cno = in_cno;
                    in_student.cScore = in_cScore;
                    in_student.mScore = in_mScore;
                    in_student.eScore = in_eScore;
                    stu_count++;
                    if (stu_count>=students.length){
                        Student[] temp_students = new Student[2*students.length];
                        for (int i=0;i<students.length;i++){
                            temp_students[i] = students[i];
                        }
                        students = temp_students;
                    }
                    students[stu_count-1] = in_student;
                    break;
                case 2:
                    boolean search_menu = true;
                    while (search_menu){
                        System.out.println("1.学号查询  2.性别查询  3.班级查询  4.年龄查询   5.返回上一级");
                        System.out.println("请输入相应的查询条件序号：");
                        int b = ss.nextInt();
                        switch (b){
                            case 1:
                                System.out.println("请输入要查询的学号");
                                int search_sno = ss.nextInt();
                                Student search_student = new Student();
                                for (int i=0;i<students.length;i++){
                                    if (search_sno == students[i].sno){
                                        search_student = students[i];
                                        break;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                System.out.println(search_student.sno + "\t" + search_student.age
                                        + "\t" + search_student.sex + "\t" + search_student.cno
                                        + "\t" + search_student.cScore + "\t" + search_student.mScore + "\t" + search_student.eScore);
                                break;
                            case 2:
                                System.out.println("请输入要查询的性别");
                                char search_sex = ss.next().charAt(0);
                                Student[] search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (search_sex == students[i].sex){
                                        search_students[j] = students[i];
                                        j++;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 3:
                                System.out.println("请输入要查询的班级");
                                int search_cno = ss.nextInt();
                                search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (search_cno == students[i].cno){
                                        search_students[j] = students[i];
                                        j++;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 4:
                                System.out.println("请输入要查询的年龄");
                                int search_age = ss.nextInt();
                                System.out.println("1.>=  2.=  3.<=");
                                System.out.println("请输入相应的查询条件序号：");
                                int c = ss.nextInt();
                                if (c<1 || c>3){
                                    System.out.println("错误：输入序号无效");
                                    break;
                                }
                                search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (c == 1){
                                        if (search_age >= students[i].age){
                                            search_students[j] = students[i];
                                            j++;
                                        }
                                    }
                                    else if (c == 2){
                                        if (search_age == students[i].age){
                                            search_students[j] = students[i];
                                            j++;
                                        }
                                    }
                                    else {
                                        if (search_age <= students[i].age){
                                            search_students[j] = students[i];
                                            j++;
                                        }
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 5:
                                search_menu = false;
                                break;
                            default:
                                System.out.println("错误：输入序号无效");
                                break;
                        }
                    }
                    break; 
                case 3:
                    boolean third_menu = true;
                    while (third_menu){
                        System.out.println("1.总均分  2.班级均分  3.性别均分   4.返回上一级");
                        System.out.println("请输入相应的查询条件序号：");
                        int d = ss.nextInt();
                        switch (d){
                            case 1:
                                int total_cScore = 0;
                                int total_mScore = 0;
                                int total_eScore = 0;
                                for (int i=0;i<students.length;i++){
                                    total_cScore+=students[i].cScore;
                                    total_mScore+=students[i].mScore;
                                    total_eScore+=students[i].eScore;
                                }
                                System.out.println("语文总均分为：" + (float)(total_cScore/stu_count));
                                System.out.println("数学总均分为：" + (float)(total_mScore/stu_count));
                                System.out.println("英语总均分为：" + (float)(total_eScore/stu_count));
                                break;
                            case 2:
                                System.out.println("请输入要查询均分的班级：");
                                int search_cno = ss.nextInt();
                                total_cScore = 0;
                                total_mScore = 0;
                                total_eScore = 0;
                                int stu_num = 0;
                                for (int i=0;i<students.length;i++){
                                    if (search_cno == students[i].cno){
                                        total_cScore+=students[i].cScore;
                                        total_mScore+=students[i].mScore;
                                        total_eScore+=students[i].eScore;
                                        stu_num++;
                                    }
                                }
                                System.out.println("该班语文均分为：" + (float)(total_cScore/stu_num));
                                System.out.println("该班数学均分为：" + (float)(total_mScore/stu_num));
                                System.out.println("该班英语均分为：" + (float)(total_eScore/stu_num));
                                break;
                            case 3:
                                int male_cScore = 0;
                                int male_mScore = 0;
                                int male_eScore = 0;
                                int female_cScore = 0;
                                int female_mScore = 0;
                                int female_eScore = 0;
                                int male_num = 0;
                                int female_num = 0;
                                for (int i=0;i<students.length;i++){
                                    if (students[i].sex == '男'){
                                        male_cScore+=students[i].cScore;
                                        male_mScore+=students[i].mScore;
                                        male_eScore+=students[i].eScore;
                                        male_num++;
                                    }
                                    else {
                                        female_cScore+=students[i].cScore;
                                        female_mScore+=students[i].mScore;
                                        female_eScore+=students[i].eScore;
                                        female_num++;
                                    }
                                }
                                System.out.println("男生语文均分为：" + (float)(male_cScore/male_num));
                                System.out.println("男生数学均分为：" + (float)(male_mScore/male_num));
                                System.out.println("男生英语均分为：" + (float)(male_eScore/male_num));
                                System.out.println("女生语文均分为：" + (float)(female_cScore/female_num));
                                System.out.println("女生数学均分为：" + (float)(female_mScore/female_num));
                                System.out.println("女生英语均分为：" + (float)(female_eScore/female_num));
                                break;
                            case 4:
                                third_menu = false;
                                break;
                            default:
                                System.out.println("错误：输入序号无效");
                                break;
                        }
                    }
                    break;
                case 4:
                    boolean forth_menu = true;
                    while (forth_menu){
                        System.out.println("1.语文  2.数学  3.英语   4.返回上一级");
                        System.out.println("请输入相应的查询条件序号：");
                        int e = ss.nextInt();
                        switch (e){
                            case 1:
                                Student[] search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (students[i].cScore <60){
                                        search_students[j] = students[i];
                                        j++;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 2:
                                search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (students[i].mScore <60){
                                        search_students[j] = students[i];
                                        j++;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 3:
                                search_students = new Student[students.length];
                                for (int i=0,j=0;i<students.length;i++){
                                    if (students[i].eScore <60){
                                        search_students[j] = students[i];
                                        j++;
                                    }
                                }
                                System.out.println("学号\t年龄\t性别\t班级\t语文成绩\t数学成绩\t英语成绩");
                                for (int i=0;i<search_students.length;i++){
                                    if (search_students[i].sno == 0){
                                        break;
                                    }
                                    System.out.println(search_students[i].sno + "\t" + search_students[i].age
                                            + "\t" + search_students[i].sex + "\t" + search_students[i].cno
                                            + "\t" + search_students[i].cScore + "\t" + search_students[i].mScore + "\t" + search_students[i].eScore);
                                }
                                break;
                            case 4:
                                forth_menu = false;
                                break;
                            default:
                                System.out.println("错误：输入序号无效");
                                break;
                        }
                    }
                    break;
                case 5:
                    int total_male_num = 0;
                    int total_female_num = 0;
                    for (int i=0;i<students.length;i++){
                        if (students[i].sex == '男'){
                            total_male_num++;
                        }
                        else {
                            total_female_num++;
                        }
                    }
                    System.out.println("总男女比例为：" + (float)(total_male_num/total_female_num));
                    System.out.println("请输入要查询均分的班级：");
                    int search_cno = ss.nextInt();
                    int male_num = 0;
                    int female_num = 0;
                    for (int i=0;i<students.length;i++){
                        if (search_cno == students[i].cno){
                            if (students[i].sex == '男'){
                                male_num++;
                            }
                            else {
                                female_num++;
                            }
                        }
                    }
                    System.out.println("该班男女比例为：" + (float)(male_num/female_num));
                    break;
                case 6:
                    main_menu = false;
                    break;
                default:
                    System.out.println("错误：输入序号无效");
                    break;
            }
        }
    }
}
