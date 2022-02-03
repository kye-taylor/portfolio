package com.company;
import java.util.Scanner;
public class Main {
    public static Toster kitchenToster = new Toster();
    public static void main(String[] args) {
        controls();
    }
    public static void controls() {
        int menuchoice = 0;
        System.out.println("");
        System.out.println("The Kitchen toster power is currently set to " + kitchenToster.getOnStatus());
        System.out.println("The Kitchen toster tempreture setting is currently " + kitchenToster.getTempSetting());
        System.out.println("The Kitchen toster mode is currently set to " + kitchenToster.getTosterSettings());
        System.out.println("");
        System.out.println("What would you like to edit");
        System.out.println("1 - Edit the Power Status");
        System.out.println("2 - Edit the Tempreture Status");
        System.out.println("3 - Edit the Seleted Mode");

        Scanner number_input = new Scanner(System.in);
        menuchoice = number_input.nextInt();

        switch (menuchoice) {
            case 1:
                System.out.println("The Kitchen toster power is currently set to " + kitchenToster.getOnStatus());
                System.out.println("What would you like to?");
                System.out.println("1 - Turn On");
                System.out.println("2 - Turn Off");
                int powermenuchoice = 0;
                powermenuchoice = number_input.nextInt();
                switch (powermenuchoice) {
                    case 1:
                        kitchenToster.turnOn();
                        controls();
                        break;
                    case 2:
                        kitchenToster.turnOff();
                        controls();
                }
                break;
            case 2:
                System.out.println("The Kitchen toster tempreture is currently set to " + kitchenToster.getTempSetting());
                System.out.println("What would you like to?");
                System.out.println("1 - Turn up");
                System.out.println("2 - Turn down");
                int tempreturemenuchoice = 0;
                tempreturemenuchoice = number_input.nextInt();
                switch (tempreturemenuchoice) {
                    case 1:
                        kitchenToster.incressTempSetting();
                        controls();
                        break;
                    case 2:
                        kitchenToster.decressTempSettings();
                        controls();
                }
                break;
            case 3:
                System.out.println("The Kitchen toster mode is currently set to " + kitchenToster.getTosterSettings());
                System.out.println("What would you like to change it?");
                System.out.println("1 - Yes");
                System.out.println("2 - No");
                int modemenuchoice = 0;
                modemenuchoice = number_input.nextInt();
                switch (modemenuchoice) {
                    case 1:
                        kitchenToster.changeTosterSettings();
                        controls();
                        break;
                    case 2:
                        controls();
                }
                break;
        }
    }

    public static class Toster {
        int onStatus;
        int tempSetting;
        int tosterSettings;
        String tosterSettingName;

        Toster() {
            onStatus = 1;
            tempSetting = 3;
            tosterSettings = 1;
            tosterSettingName = "Bread";
        }

        int getOnStatus() {
            return onStatus;
        }

        int getTempSetting() {
            return tempSetting;
        }

        String getTosterSettings() {
            return tosterSettingName;
        }

        void turnOn() {
            onStatus = 1;
        }

        void turnOff() {
            onStatus = 0;
        }

        void incressTempSetting() {
            tempSetting = tempSetting + 1;
        }

        void decressTempSettings() {
            tempSetting = tempSetting - 1;
        }

        void changeTosterSettings() {
            System.out.println(" ");
            System.out.println("Please select from the following options:");
            System.out.println("1 - Bread");
            System.out.println("2 - Crumpet");
            System.out.println("3 - Waffle");
            System.out.println("4 - Bagel");
            Scanner number_input = new Scanner(System.in);
            tosterSettings = number_input.nextInt();
            switch (tosterSettings) {
                case 1:
                    tosterSettingName = "Bread";
                    break;
                case 2:
                    tosterSettingName = "Crumpet";
                    break;
                case 3:
                    tosterSettingName = "Waffle";
                    break;
                case 4:
                    tosterSettingName = "Bagel";
                    break;

            }
        }
    }
}
