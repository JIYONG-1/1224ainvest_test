package com.beicai.ui;

import java.util.Scanner;

public class Ui {
	Scanner input = new Scanner(System.in);

	public int menu() {
		System.out.println("1.�鿴����ͼ��");
		System.out.println("2.����һ��ͼ��");
		System.out.println("3.ɾ��һ��ͼ��");
		System.out.println("4.�޸�ͼ��۸�");
		System.out.println("5.�˳�����");
		int choose = input.nextInt();
		return choose;
	}
}
