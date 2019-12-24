package com.hgz.seveice;

import java.util.ArrayList;
import java.util.Scanner;

import com.beicai.ui.Ui;
import com.hgz.dao.Dao;
import com.hgz.daoimp.Daoimp;
import com.hgz.entitys.Book;

public class Seveice {
	Scanner input = new Scanner(System.in);
	Ui ui = new Ui();
	Dao da = new Daoimp();

	public void menu() {
		int x = ui.menu();
		switch (x) {
		case 1:
			look();
			break;
		case 2:
			add();
			break;
		case 3:
			del();
			break;
		case 4:
			charger();

			break;
		case 5:
			System.out.println("�������˳�");
			System.exit(0);
			break;

		default:
			System.out.println("��������");
			break;
		}
		menu();
	}

	private void charger() {
		System.out.println("��������Ҫ�޸ĵ�ͼ��id");
		int id = input.nextInt();
		System.out.println("��������Ҫ�޸ĵ�ͼ��۸�");
		int price = input.nextInt();
		boolean x = da.charger(id, price);
		if (x) {
			System.out.println("�޸ĳɹ�");
			return;
		}
		System.out.println("�޸�ʧ��");

	}

	private void del() {

		System.out.println("��������Ҫɾ����ͼ��id");
		int id = input.nextInt();
		boolean x = da.del(id);
		if (x) {
			System.out.println("ɾ���ɹ�");
			return;
		}
		System.out.println("ɾ��ʧ��");

	}

	private void add() {
		System.out.println("��������Ҫ���ӵ�ͼ������");
		String name = input.next();
		System.out.println("��������Ҫ���ӵ�ͼ������");
		String writer = input.next();
		System.out.println("��������Ҫ���ӵ�ͼ��۸�");
		int price = input.nextInt();
		Book book = new Book(0, name, writer, price);
		boolean x = da.add(book);
		if (x) {
			System.out.println("���ӳɹ�");
			return;
		}
		System.out.println("����ʧ��");

	}

	private void look() {
		System.out.println("id\tͼ������\tͼ������\tͼ��۸�");
		ArrayList<Book> x = da.findAll();
		for (Book book : x) {
			System.out.println(book);
		}
	}
}
