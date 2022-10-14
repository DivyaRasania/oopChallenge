package com.divya.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient ("Brad", 28,
                new Eye(" Left Eye", "Short sighted", "Blue", true) ,
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart ( "Heart", "Normal", 65),
                new Stomach ("Stomach", "pUD", false) ,
                new Skin("skin", "Burned", "White", 40));
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner sc = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("Choose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close the Eye.");
                        if (sc.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the eye.");
                        if (sc.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpen()) {
                        System.out.println("\t\t1. Close the Eye.");
                        if (sc.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the eye.");
                        if (sc.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (sc.nextInt() == 1) {
                        System.out.println("Enter the new Heart rate: ");
                        int newHeartRate = sc.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                    } else {
                        continue;
                    }
                    break;

                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (sc.nextInt() == 1) {
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;

                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
