package io;

import utils.NameUtil;

import java.util.Scanner;

import static utils.constants.ErrorConstant.NOT_NUMBER;

public class UserInput {

    private UserInput() {
    }

    private static final Scanner sc = new Scanner(System.in);

    public static String[] getCarNames() {
        final String text = sc.nextLine();
        try {
            final String[] names = NameUtil.split(text);
            inputNamesValidation(names);

            return names;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return getCarNames();
    }

    private static void inputNamesValidation(final String[] names) throws IllegalArgumentException {
        for (String name : names) {
            NameUtil.validation(name);
        }
    }

    public static int getCount() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(NOT_NUMBER);
        }

        return getCount();
    }
}
