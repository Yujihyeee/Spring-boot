package com.example.demo.himart.controller;

import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.himart.service.HimartService;
import com.example.demo.himart.service.HimartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

public class HimartController extends LambdaUtils{
    private final HimartService himartService;
    public HimartController() {
        himartService = new HimartServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.accept("\n[메뉴]0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시");
            switch (scanner.next()) {
                case "0": return;
                case "1":

                case "2":

                case "3":

                case "4":

                case "5":

                case "6":

            }
        }
    }

    public void PhoneMain(Scanner scanner) {
        PhoneApp app = new PhoneApp();
        PhoneApp.Phone phone = null;
        PhoneApp.CelPhone celPhone = null;
        PhoneApp.IPhone iPhone = null;
        PhoneApp.GalaxyNote galaxyNote = null;

        while (true) {
            print.accept("[메뉴] 0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    phone = app.new Phone();
                    phone.setCall("여긴 집");
                    phone.setCompany("금성");
                    phone.setKind("집전화");
                    print.accept(phone.toString());
                    break;
                case "2":
                    celPhone = app.new CelPhone();
                    celPhone.setCall("");
                    celPhone.setCompany("");
                    celPhone.setKind("");
                    celPhone.setMove("");
                    print.accept(celPhone.toString());
                    break;
                case "3":
                    iPhone = app.new IPhone();
                    iPhone.setCall("");
                    iPhone.setCompany("");
                    iPhone.setKind("");
                    iPhone.setMove("");
                    iPhone.setInternet("");
                    print.accept(iPhone.toString());
                    break;
                case "4":
                    galaxyNote = app.new GalaxyNote();
                    galaxyNote.setCall("");
                    galaxyNote.setCompany("");
                    galaxyNote.setKind("");
                    galaxyNote.setMove("");
                    galaxyNote.setInternet("");
                    galaxyNote.setPencil("");
                    print.accept(galaxyNote.toString());
                    break;
            }
        }
    }
}